package tf;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import xf.f0;
import xf.z;

/* JADX INFO: loaded from: classes17.dex */
public final class e {
    public static final qf.a f = qf.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f270137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf.d f270138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f270139c = -1;
    public long d = -1;
    public final Timer e;

    public e(HttpURLConnection httpURLConnection, Timer timer, rf.d dVar) {
        this.f270137a = httpURLConnection;
        this.f270138b = dVar;
        this.e = timer;
        dVar.W(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j2 = this.f270139c;
        rf.d dVar = this.f270138b;
        Timer timer = this.e;
        if (j2 == -1) {
            timer.c();
            long j3 = timer.f49592a;
            this.f270139c = j3;
            dVar.j(j3);
        }
        try {
            this.f270137a.connect();
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    public final Object b() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f270137a;
        int responseCode = httpURLConnection.getResponseCode();
        rf.d dVar = this.f270138b;
        dVar.d(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                dVar.z(httpURLConnection.getContentType());
                return new a((InputStream) content, dVar, timer);
            }
            dVar.z(httpURLConnection.getContentType());
            dVar.J(httpURLConnection.getContentLength());
            dVar.T(timer.a());
            dVar.b();
            return content;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    public final Object c(Class[] clsArr) throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f270137a;
        int responseCode = httpURLConnection.getResponseCode();
        rf.d dVar = this.f270138b;
        dVar.d(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                dVar.z(httpURLConnection.getContentType());
                return new a((InputStream) content, dVar, timer);
            }
            dVar.z(httpURLConnection.getContentType());
            dVar.J(httpURLConnection.getContentLength());
            dVar.T(timer.a());
            dVar.b();
            return content;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.f270137a;
        rf.d dVar = this.f270138b;
        i();
        try {
            dVar.d(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        return errorStream != null ? new a(errorStream, dVar, this.e) : errorStream;
    }

    public final InputStream e() throws IOException {
        Timer timer = this.e;
        i();
        HttpURLConnection httpURLConnection = this.f270137a;
        int responseCode = httpURLConnection.getResponseCode();
        rf.d dVar = this.f270138b;
        dVar.d(responseCode);
        dVar.z(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            return inputStream != null ? new a(inputStream, dVar, timer) : inputStream;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    public final boolean equals(Object obj2) {
        return this.f270137a.equals(obj2);
    }

    public final OutputStream f() throws IOException {
        Timer timer = this.e;
        rf.d dVar = this.f270138b;
        try {
            OutputStream outputStream = this.f270137a.getOutputStream();
            return outputStream != null ? new b(outputStream, dVar, timer) : outputStream;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    public final int g() throws IOException {
        i();
        long j2 = this.d;
        Timer timer = this.e;
        rf.d dVar = this.f270138b;
        if (j2 == -1) {
            long jA = timer.a();
            this.d = jA;
            z zVar = dVar.d;
            zVar.c();
            ((f0) zVar.f49761b).setTimeToResponseInitiatedUs(jA);
        }
        try {
            int responseCode = this.f270137a.getResponseCode();
            dVar.d(responseCode);
            return responseCode;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    public final String h() throws IOException {
        HttpURLConnection httpURLConnection = this.f270137a;
        i();
        long j2 = this.d;
        Timer timer = this.e;
        rf.d dVar = this.f270138b;
        if (j2 == -1) {
            long jA = timer.a();
            this.d = jA;
            z zVar = dVar.d;
            zVar.c();
            ((f0) zVar.f49761b).setTimeToResponseInitiatedUs(jA);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            dVar.d(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            t61.a.v(timer, dVar, dVar);
            throw e;
        }
    }

    public final int hashCode() {
        return this.f270137a.hashCode();
    }

    public final void i() {
        long j2 = this.f270139c;
        rf.d dVar = this.f270138b;
        if (j2 == -1) {
            Timer timer = this.e;
            timer.c();
            long j3 = timer.f49592a;
            this.f270139c = j3;
            dVar.j(j3);
        }
        HttpURLConnection httpURLConnection = this.f270137a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            dVar.c(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            dVar.c("POST");
        } else {
            dVar.c("GET");
        }
    }

    public final String toString() {
        return this.f270137a.toString();
    }
}
