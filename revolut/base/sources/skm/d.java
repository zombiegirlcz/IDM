package skm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f263963a;

    public d(c[] cVarArr) {
        this.f263963a = cVarArr;
    }

    @Override // skm.k
    public final void a(Throwable th10) {
        b();
    }

    public final void b() {
        for (c cVar : this.f263963a) {
            r0 r0Var = cVar.f;
            if (r0Var == null) {
                Intrinsics.r("handle");
                throw null;
            }
            r0Var.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f263963a + ']';
    }
}
