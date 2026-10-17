package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.base.Preconditions;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import grl.b4;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes.dex */
public final class FileDataSource extends BaseDataSource {
    private long bytesRemaining;
    private RandomAccessFile file;
    private boolean opened;

    /* JADX INFO: renamed from: uri, reason: collision with root package name */
    private Uri f7468uri;

    public static final class Factory implements DataSource.Factory {
        private TransferListener listener;

        @Override // androidx.media3.datasource.DataSource.Factory
        public FileDataSource createDataSource() {
            FileDataSource fileDataSource = new FileDataSource();
            TransferListener transferListener = this.listener;
            if (transferListener != null) {
                fileDataSource.addTransferListener(transferListener);
            }
            return fileDataSource;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static class FileDataSourceException extends DataSourceException {
        public FileDataSourceException(Throwable th10, int i) {
            super(th10, i);
        }

        public FileDataSourceException(String str, Throwable th10, int i) {
            super(str, th10, i);
        }
    }

    public FileDataSource() {
        super(false);
    }

    private static RandomAccessFile openLocalFile(Uri uri2) throws FileDataSourceException {
        try {
            return new RandomAccessFile((String) Preconditions.checkNotNull(uri2.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri2.getQuery()) && TextUtils.isEmpty(uri2.getFragment())) {
                throw new FileDataSourceException(e, ((e.getCause() instanceof ErrnoException) && ((ErrnoException) e.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path = uri2.getPath();
            String query = uri2.getQuery();
            String fragment = uri2.getFragment();
            StringBuilder sbM = v0.a.m("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path, ",query=", query, ",fragment=");
            sbM.append(fragment);
            throw new FileDataSourceException(sbM.toString(), e, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e2) {
            throw new FileDataSourceException(e2, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSourceException(e4, b4.EXPIRED_OR_INVALID_KEY_VALUE);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() throws FileDataSourceException {
        this.f7468uri = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.file;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, b4.EXPIRED_OR_INVALID_KEY_VALUE);
            }
        } finally {
            this.file = null;
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public Uri getUri() {
        return this.f7468uri;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws FileDataSourceException {
        Uri uri2 = dataSpec.f7466uri;
        this.f7468uri = uri2;
        transferInitializing(dataSpec);
        RandomAccessFile randomAccessFileOpenLocalFile = openLocalFile(uri2);
        this.file = randomAccessFileOpenLocalFile;
        try {
            randomAccessFileOpenLocalFile.seek(dataSpec.position);
            long length = dataSpec.length;
            if (length == -1) {
                length = this.file.length() - dataSpec.position;
            }
            this.bytesRemaining = length;
            if (length < 0) {
                throw new FileDataSourceException(null, null, YearClass.CLASS_2008);
            }
            this.opened = true;
            transferStarted(dataSpec);
            return this.bytesRemaining;
        } catch (IOException e) {
            throw new FileDataSourceException(e, b4.EXPIRED_OR_INVALID_KEY_VALUE);
        }
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        if (this.bytesRemaining == 0) {
            return -1;
        }
        try {
            int i3 = ((RandomAccessFile) Util.castNonNull(this.file)).read(bArr, i, (int) Math.min(this.bytesRemaining, i2));
            if (i3 > 0) {
                this.bytesRemaining -= (long) i3;
                bytesTransferred(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new FileDataSourceException(e, b4.EXPIRED_OR_INVALID_KEY_VALUE);
        }
    }
}
