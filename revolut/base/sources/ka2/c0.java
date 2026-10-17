package ka2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.i7;
import tof.k7;
import tof.u9;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 implements e12.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.b f182392a;

    public c0(whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f182392a = transactionsContentProvider;
    }

    @Override // e12.f
    public final vkm.d a() {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new k7(f5j.r.PAYID_ALIAS), new u9(false)};
        cVar.getClass();
        return rd0.e.b(whf.b.a(this.f182392a, te0.w.h(i7.c.a(i7VarArr)), null, null, null, 14));
    }

    @Override // e12.f
    public final Flow b() {
        return zi0.c.i(f0.f322471a);
    }
}
