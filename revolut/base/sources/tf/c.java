package tf;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends HttpURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f270134a;

    public c(HttpURLConnection httpURLConnection, Timer timer, rf.d dVar) {
        super(httpURLConnection.getURL());
        this.f270134a = new e(httpURLConnection, timer, dVar);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f270134a.f270137a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f270134a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        e eVar = this.f270134a;
        rf.d dVar = eVar.f270138b;
        dVar.T(eVar.e.a());
        dVar.b();
        eVar.f270137a.disconnect();
    }

    public final boolean equals(Object obj2) {
        return this.f270134a.f270137a.equals(obj2);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f270134a.f270137a.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f270134a.f270137a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f270134a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f270134a.f270137a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f270134a.f270137a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f270134a.f270137a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f270134a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j2) {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getHeaderFieldDate(str, j2);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getHeaderFieldInt(str, i);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j2) {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getHeaderFieldLong(str, j2);
    }

    @Override // java.net.URLConnection
    public final Map getHeaderFields() {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f270134a.f270137a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f270134a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f270134a.f270137a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getLastModified();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f270134a.f();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() throws IOException {
        e eVar = this.f270134a;
        rf.d dVar = eVar.f270138b;
        try {
            return eVar.f270137a.getPermission();
        } catch (IOException e) {
            t61.a.v(eVar.e, dVar, dVar);
            throw e;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f270134a.f270137a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f270134a.f270137a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map getRequestProperties() {
        return this.f270134a.f270137a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f270134a.f270137a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f270134a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f270134a.h();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f270134a.f270137a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f270134a.f270137a.getUseCaches();
    }

    public final int hashCode() {
        return this.f270134a.f270137a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.f270134a.f270137a.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.f270134a.f270137a.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.f270134a.f270137a.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.f270134a.f270137a.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.f270134a.f270137a.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.f270134a.f270137a.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.f270134a.f270137a.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j2) {
        this.f270134a.f270137a.setIfModifiedSince(j2);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.f270134a.f270137a.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.f270134a.f270137a.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.f270134a.f270137a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        e eVar = this.f270134a;
        eVar.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            eVar.f270138b.f = str2;
        }
        eVar.f270137a.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.f270134a.f270137a.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f270134a.f270137a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f270134a.f270137a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f270134a.c(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        e eVar = this.f270134a;
        eVar.i();
        return eVar.f270137a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j2) {
        this.f270134a.f270137a.setFixedLengthStreamingMode(j2);
    }
}
