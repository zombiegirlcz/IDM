package pf2;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te0.w;
import tof.i7;
import tof.ta;
import tof.u9;
import tof.x1;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class q implements e12.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.b f235425a;

    public q(whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f235425a = transactionsContentProvider;
    }

    @Override // e12.f
    public final vkm.d a() {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new ta(x1.UPI), new u9(false)};
        cVar.getClass();
        return rd0.e.b(whf.b.a(this.f235425a, w.h(i7.c.a(i7VarArr)), null, null, null, 14));
    }

    @Override // e12.f
    public final Flow b() {
        return zi0.c.i(f0.f322471a);
    }
}
