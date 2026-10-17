package z10;

import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.j;
import mmm.k0;
import okhttp3.RequestBody;
import ulm.b1;
import ulm.k1;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends RequestBody {
    public final k1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z1.c f318705j;

    public a(k1 delegate, z1.c onProgress) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onProgress, "onProgress");
        this.i = delegate;
        this.f318705j = onProgress;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.i.f281101j.length();
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.i.i;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        k1 k1Var = this.i;
        long jContentLength = k1Var.contentLength();
        z1.c cVar = this.f318705j;
        if (jContentLength == 0) {
            k1Var.writeTo(sink);
            cVar.invoke(Float.valueOf(1.0f));
        } else {
            k0 k0VarB = u1.b(new ek0.b(sink, jContentLength, cVar));
            k1Var.writeTo(k0VarB);
            k0VarB.flush();
        }
    }
}
