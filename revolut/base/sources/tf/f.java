package tf;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes17.dex */
public final class f implements ResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResponseHandler f270140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Timer f270141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rf.d f270142c;

    public f(ResponseHandler responseHandler, Timer timer, rf.d dVar) {
        this.f270140a = responseHandler;
        this.f270141b = timer;
        this.f270142c = dVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.f270142c.T(this.f270141b.a());
        this.f270142c.d(httpResponse.getStatusLine().getStatusCode());
        Long lA = g.a(httpResponse);
        if (lA != null) {
            this.f270142c.J(lA.longValue());
        }
        String strB = g.b(httpResponse);
        if (strB != null) {
            this.f270142c.z(strB);
        }
        this.f270142c.b();
        return this.f270140a.handleResponse(httpResponse);
    }
}
