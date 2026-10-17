package ylm;

import java.io.IOException;
import java.net.SocketException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import okhttp3.RequestBody;
import okhttp3.Response;
import ulm.j1;
import ulm.m0;

/* JADX INFO: loaded from: classes13.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f314770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f314771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f314772c;
    public final zlm.f d;
    public boolean e;
    public boolean f;

    public j(q call, m0 eventListener, k finder, zlm.f codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f314770a = call;
        this.f314771b = eventListener;
        this.f314772c = finder;
        this.d = codec;
    }

    public static IOException a(j jVar, long j2, boolean z, IOException iOException, int i) {
        boolean z3;
        boolean z4;
        q qVar = jVar.f314770a;
        boolean z6 = true;
        boolean z11 = false;
        boolean z12 = (i & 4) == 0;
        boolean z29 = (i & 8) == 0;
        m0 m0Var = jVar.f314771b;
        if (iOException != null) {
            jVar.f(iOException);
        }
        if (z29) {
            if (iOException != null) {
                m0Var.requestFailed(qVar, iOException);
            } else {
                m0Var.requestBodyEnd(qVar, j2);
            }
        }
        if (z12) {
            if (iOException != null) {
                m0Var.responseFailed(qVar, iOException);
            } else {
                m0Var.responseBodyEnd(qVar, j2);
            }
        }
        if (!z29 || z) {
            z3 = true;
            z6 = false;
        } else {
            z3 = true;
        }
        if (!z12 || z) {
            z4 = false;
        } else {
            z4 = false;
            z11 = z3;
        }
        return qVar.g(jVar, z6, z11, (z12 && z) ? z3 : z4, (z29 && z) ? z3 : z4, iOException);
    }

    public final h b(j1 request, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        this.e = z;
        RequestBody requestBody = request.d;
        Intrinsics.h(requestBody);
        long jContentLength = requestBody.contentLength();
        this.f314771b.requestBodyStart(this.f314770a);
        return new h(this, this.d.e(request, jContentLength), jContentLength, false);
    }

    public final s c() {
        zlm.d dVarJ = this.d.j();
        s sVar = dVarJ instanceof s ? (s) dVarJ : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("no connection for CONNECT tunnels");
    }

    public final zlm.i d(Response response) throws IOException {
        j jVar;
        String strF;
        long jG;
        zlm.f fVar = this.d;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            strF = response.f("Content-Type", null);
            jG = fVar.g(response);
            jVar = this;
        } catch (IOException e) {
            e = e;
            jVar = this;
        }
        try {
            return new zlm.i(strF, jG, u1.c(new i(jVar, fVar.d(response), jG, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            jVar.f314771b.responseFailed(jVar.f314770a, iOException);
            f(iOException);
            throw iOException;
        }
    }

    public final Response.a e(boolean z) throws IOException {
        try {
            Response.a aVarC = this.d.c(z);
            if (aVarC != null) {
                Intrinsics.checkNotNullParameter(this, "exchange");
                aVarC.f226107n = this;
            }
            return aVarC;
        } catch (IOException e) {
            this.f314771b.responseFailed(this.f314770a, e);
            f(e);
            throw e;
        }
    }

    public final void f(IOException iOException) {
        this.f = true;
        this.d.j().c(this.f314770a, iOException);
    }

    public final ufm.d g() throws SocketException {
        q qVar = this.f314770a;
        if (qVar.k) {
            throw new IllegalStateException("Check failed.");
        }
        qVar.k = true;
        qVar.f.k();
        synchronized (qVar) {
            if (qVar.f314791s == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (qVar.o || qVar.f314788p) {
                throw new IllegalStateException("Check failed.");
            }
            if (qVar.f314786m) {
                throw new IllegalStateException("Check failed.");
            }
            if (!qVar.f314787n) {
                throw new IllegalStateException("Check failed.");
            }
            qVar.f314787n = false;
            qVar.o = true;
            qVar.f314788p = true;
            Unit unit = Unit.f186387a;
        }
        zlm.d dVarJ = this.d.j();
        Intrinsics.i(dVarJ, "null cannot be cast to non-null type okhttp3.internal.connection.RealConnection");
        s sVar = (s) dVarJ;
        sVar.e.setSoTimeout(0);
        sVar.b();
        return new ufm.d(this);
    }
}
