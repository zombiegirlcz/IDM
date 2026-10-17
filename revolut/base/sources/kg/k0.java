package kg;

import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public final class k0 extends l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f183860a;

    public k0(l0 l0Var) {
        this.f183860a = l0Var;
    }

    @Override // kg.l0
    public final Object c(qg.a aVar) {
        if (aVar.A() != qg.b.NULL) {
            return this.f183860a.c(aVar);
        }
        aVar.w();
        return null;
    }

    @Override // kg.l0
    public final void d(qg.c cVar, Object obj2) throws IOException {
        if (obj2 == null) {
            cVar.m();
        } else {
            this.f183860a.d(cVar, obj2);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f183860a + "]";
    }
}
