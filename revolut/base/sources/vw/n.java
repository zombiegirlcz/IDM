package vw;

import kotlin.jvm.internal.Intrinsics;
import le.u1;
import okhttp3.RequestBody;
import ulm.b1;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends RequestBody {
    public final /* synthetic */ b1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f292607j;

    public n(b1 b1Var, o oVar) {
        this.i = b1Var;
        this.f292607j = oVar;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f292607j.d();
    }

    @Override // okhttp3.RequestBody
    public final b1 contentType() {
        return this.i;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(mmm.j sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        mmm.e eVarR = u1.r(this.f292607j.h());
        try {
            sink.R8(eVarR);
            eVarR.close();
        } finally {
        }
    }
}
