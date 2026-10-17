package androidx.media3.exoplayer.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Build;
import android.os.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSourceInputStream;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.StatsDataSource;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.MediaDrmCallback;
import androidx.media3.exoplayer.source.LoadEventInfo;
import com.google.common.io.ByteStreams;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public abstract class DrmUtil {
    public static MediaDrmCallback.Response executePost(DataSource dataSource, String str, byte[] bArr, Map<String, String> map) throws Throwable {
        DataSpec dataSpec;
        DataSourceInputStream dataSourceInputStream;
        StatsDataSource statsDataSource = new StatsDataSource(dataSource);
        DataSpec dataSpecBuild = new DataSpec.Builder().setUri(str).setHttpRequestHeaders(map).setHttpMethod(2).setHttpBody(bArr).setFlags(1).build();
        int i = 0;
        DataSpec dataSpecBuild2 = dataSpecBuild;
        while (true) {
            try {
                DataSourceInputStream dataSourceInputStream2 = new DataSourceInputStream(statsDataSource, dataSpecBuild2);
                try {
                    try {
                        dataSpec = dataSpecBuild;
                        dataSourceInputStream = dataSourceInputStream2;
                        try {
                            MediaDrmCallback.Response responseBuild = new MediaDrmCallback.Response.Builder(ByteStreams.toByteArray(dataSourceInputStream2)).setLoadEventInfo(new LoadEventInfo(-1L, dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getLastResponseHeaders(), SystemClock.elapsedRealtime(), 0L, r0.length)).build();
                            Util.closeQuietly(dataSourceInputStream);
                            return responseBuild;
                        } catch (HttpDataSource$InvalidResponseCodeException e) {
                            e = e;
                            try {
                                String redirectUrl = getRedirectUrl(e, i);
                                if (redirectUrl == null) {
                                    throw e;
                                }
                                i++;
                                dataSpecBuild2 = dataSpecBuild2.buildUpon().setUri(redirectUrl).build();
                                try {
                                    Util.closeQuietly(dataSourceInputStream);
                                    dataSpecBuild = dataSpec;
                                } catch (Exception e2) {
                                    e = e2;
                                    throw new MediaDrmCallbackException(dataSpec, statsDataSource.getLastOpenedUri(), statsDataSource.getResponseHeaders(), statsDataSource.getBytesRead(), e);
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                Util.closeQuietly(dataSourceInputStream);
                                throw th;
                            }
                        }
                    } catch (HttpDataSource$InvalidResponseCodeException e4) {
                        e = e4;
                        dataSpec = dataSpecBuild;
                        dataSourceInputStream = dataSourceInputStream2;
                    } catch (Throwable th11) {
                        th = th11;
                        dataSourceInputStream = dataSourceInputStream2;
                        Util.closeQuietly(dataSourceInputStream);
                        throw th;
                    }
                } catch (HttpDataSource$InvalidResponseCodeException e5) {
                    e = e5;
                    dataSourceInputStream = dataSourceInputStream2;
                    dataSpec = dataSpecBuild;
                } catch (Throwable th12) {
                    th = th12;
                    dataSourceInputStream = dataSourceInputStream2;
                }
                dataSpecBuild = dataSpec;
            } catch (Exception e6) {
                e = e6;
                dataSpec = dataSpecBuild;
            }
        }
    }

    public static int getErrorCodeForMediaDrmException(Throwable th10, int i) {
        if (th10 instanceof MediaDrm.MediaDrmStateException) {
            return Util.getErrorCodeForMediaDrmErrorCode(Util.getErrorCodeFromPlatformDiagnosticsInfo(((MediaDrm.MediaDrmStateException) th10).getDiagnosticInfo()));
        }
        if (th10 instanceof MediaDrmResetException) {
            return 6006;
        }
        if ((th10 instanceof NotProvisionedException) || isFailureToConstructNotProvisionedException(th10)) {
            return 6002;
        }
        if (th10 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th10 instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (th10 instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (th10 instanceof KeysExpiredException) {
            return 6008;
        }
        if (i == 1) {
            return 6006;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    private static String getRedirectUrl(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = httpDataSource$InvalidResponseCodeException.responseCode;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = httpDataSource$InvalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static boolean isFailureToConstructNotProvisionedException(Throwable th10) {
        return Build.VERSION.SDK_INT == 34 && (th10 instanceof NoSuchMethodError) && th10.getMessage() != null && th10.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean isFailureToConstructResourceBusyException(Throwable th10) {
        return Build.VERSION.SDK_INT == 34 && (th10 instanceof NoSuchMethodError) && th10.getMessage() != null && th10.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }
}
