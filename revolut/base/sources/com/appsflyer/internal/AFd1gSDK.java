package com.appsflyer.internal;

import ch.qos.logback.core.CoreConstants;
import com.appsflyer.AFLogger;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zsc.p;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\r\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0012\u0010\u0006\u001a\u00020\rX\u0087\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0011R \u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u000e\u0010\u0004R\u0011\u0010\u000b\u001a\u00020\u0016X\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFd1gSDK;", "", "", "values", "()Z", "", "AFInAppEventType", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", "", "p0", "valueOf", "(Ljava/net/HttpURLConnection;J)Z", "", "AFInAppEventParameterName", "[B", "Lcom/appsflyer/internal/AFe1sSDK;", "()Lcom/appsflyer/internal/AFe1sSDK;", "", "Ljava/util/Map;", "AFKeystoreWrapper", "Z", "", "I", "()Ljava/lang/String;", "e", "p1", "p2", "<init>", "([BLjava/util/Map;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AFd1gSDK {

    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    public byte[] AFInAppEventType;

    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public int valueOf;

    /* JADX INFO: renamed from: valueOf, reason: from kotlin metadata */
    private final boolean AFInAppEventParameterName;

    /* JADX INFO: renamed from: values, reason: from kotlin metadata */
    public Map<String, String> AFKeystoreWrapper;

    public AFd1gSDK(@NotNull byte[] bArr, Map<String, String> map, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = bArr;
        this.AFKeystoreWrapper = map;
        this.valueOf = i;
        this.AFInAppEventParameterName = true;
    }

    private final boolean valueOf(HttpURLConnection httpURLConnection, long j2) throws IOException {
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb6 = new StringBuilder();
        sb6.append(httpURLConnection.getRequestMethod());
        sb6.append(CoreConstants.COLON_CHAR);
        sb6.append(httpURLConnection.getURL());
        StringBuilder sb9 = new StringBuilder(sb6.toString());
        sb9.append("\n length: ");
        sb9.append(new String(this.AFInAppEventType, Charsets.UTF_8).length());
        Map<String, String> map = this.AFKeystoreWrapper;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb9.append("\n ");
                sb9.append(entry.getKey());
                sb9.append(": ");
                sb9.append(entry.getValue());
            }
        }
        StringBuilder sb10 = new StringBuilder("HTTP: [");
        sb10.append(httpURLConnection.hashCode());
        sb10.append("] ");
        sb10.append((Object) sb9);
        String strAFInAppEventType = AFInAppEventType(sb10.toString());
        if (getAFInAppEventParameterName()) {
            AFLogger.afRDLog(strAFInAppEventType);
        } else {
            AFLogger.afVerboseLog(strAFInAppEventType);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.valueOf);
        httpURLConnection.setConnectTimeout(this.valueOf);
        httpURLConnection.addRequestProperty("Content-Type", getAFInAppEventParameterName().values);
        Map<String, String> map2 = this.AFKeystoreWrapper;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.AFInAppEventType.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        String str = "";
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
        bufferedOutputStream.write(this.AFInAppEventType);
        bufferedOutputStream.close();
        InputStream inputStream = AFe1zSDK.AFInAppEventType(httpURLConnection) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
        if (inputStream != null) {
            Intrinsics.checkNotNullExpressionValue(inputStream, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
            Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
            ArrayList arrayList = new ArrayList();
            jh.d.c(bufferedReader, new jeg.i(8, arrayList));
            String strK0 = d0.k0(arrayList, null, null, null, 0, null, 63);
            bufferedReader.close();
            if (strK0 != null) {
                str = strK0;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        StringBuilder sb11 = new StringBuilder("response code:");
        sb11.append(httpURLConnection.getResponseCode());
        sb11.append(p.SPACE_CHAR);
        sb11.append(httpURLConnection.getResponseMessage());
        sb11.append("\n\tbody:");
        sb11.append(str);
        sb11.append("\n\ttook ");
        sb11.append(jCurrentTimeMillis);
        sb11.append("ms");
        String string = sb11.toString();
        StringBuilder sb12 = new StringBuilder("HTTP: [");
        sb12.append(httpURLConnection.hashCode());
        sb12.append("] ");
        sb12.append(string);
        String strAFInAppEventType2 = AFInAppEventType(sb12.toString());
        if (getAFInAppEventParameterName()) {
            AFLogger.afRDLog(strAFInAppEventType2);
        } else {
            AFLogger.afVerboseLog(strAFInAppEventType2);
        }
        return AFe1zSDK.AFInAppEventType(httpURLConnection);
    }

    /* JADX INFO: renamed from: AFInAppEventParameterName, reason: from getter */
    public boolean getAFInAppEventParameterName() {
        return this.AFInAppEventParameterName;
    }

    @NotNull
    /* JADX INFO: renamed from: AFInAppEventType */
    public abstract AFe1sSDK getAFInAppEventParameterName();

    @NotNull
    public abstract String AFInAppEventType(@NotNull String str);

    @NotNull
    public abstract String AFKeystoreWrapper();

    public final boolean values() {
        HttpURLConnection httpURLConnection;
        Throwable th10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            String strAFKeystoreWrapper = AFKeystoreWrapper();
            Intrinsics.checkNotNullParameter(strAFKeystoreWrapper, "");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(strAFKeystoreWrapper).openConnection());
            if (uRLConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnection;
            try {
                boolean zValueOf = valueOf(httpURLConnection, jCurrentTimeMillis);
                httpURLConnection.disconnect();
                return zValueOf;
            } catch (Throwable th11) {
                th10 = th11;
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sb6 = new StringBuilder("error: ");
                    sb6.append(th10);
                    sb6.append("\n\ttook ");
                    sb6.append(jCurrentTimeMillis2);
                    sb6.append("ms\n\t");
                    sb6.append(th10.getMessage());
                    String string = sb6.toString();
                    StringBuilder sb9 = new StringBuilder("HTTP: [");
                    sb9.append(httpURLConnection != null ? httpURLConnection.hashCode() : 0);
                    sb9.append("] ");
                    sb9.append(string);
                    String strAFInAppEventType = AFInAppEventType(sb9.toString());
                    if (getAFInAppEventParameterName()) {
                        AFLogger.afRDLog(strAFInAppEventType);
                    } else {
                        AFLogger.afVerboseLog(strAFInAppEventType);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    return false;
                } catch (Throwable th12) {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th12;
                }
            }
        } catch (Throwable th13) {
            httpURLConnection = null;
            th10 = th13;
        }
    }
}
