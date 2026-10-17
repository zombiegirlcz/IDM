package xj0;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.RequestBody;
import okhttp3.Response;
import ulm.b1;
import ulm.i1;
import ulm.j1;
import ulm.y0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: loaded from: classes19.dex */
    public static final class a extends RequestBody {
        public final RequestBody i;

        public a() {
            this(null);
        }

        @Override // okhttp3.RequestBody
        public final long contentLength() {
            RequestBody requestBody = this.i;
            return requestBody != null ? requestBody.contentLength() : super.contentLength();
        }

        @Override // okhttp3.RequestBody
        public final b1 contentType() {
            RequestBody requestBody = this.i;
            if (requestBody != null) {
                return requestBody.contentType();
            }
            return null;
        }

        @Override // okhttp3.RequestBody
        public final boolean isOneShot() {
            return true;
        }

        @Override // okhttp3.RequestBody
        public final void writeTo(mmm.j sink) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            RequestBody requestBody = this.i;
            if (requestBody != null) {
                requestBody.writeTo(sink);
            }
        }

        public a(RequestBody requestBody) {
            this.i = requestBody;
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(y0 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        zlm.h hVar = (zlm.h) chain;
        j1 j1Var = hVar.e;
        if (nim.a.B(j1Var.f281096b)) {
            a aVar = new a(j1Var.d);
            i1 i1VarB = j1Var.b();
            i1VarB.c(j1Var.f281096b, aVar);
            j1Var = new j1(i1VarB);
        }
        return hVar.b(j1Var);
    }
}
