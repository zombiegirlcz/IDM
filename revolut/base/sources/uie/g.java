package uie;

import kotlin.jvm.internal.Intrinsics;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements e4m.e {
    public static rfe.e a() {
        f.Companion.getClass();
        rfe.f fVar = new rfe.f(pie.a.CREDIT_HUB);
        rfe.f fVar2 = new rfe.f(pie.a.FAVOURITES);
        pie.a aVar = pie.a.PERSONAL;
        v[] elements = {v.CREDIT, v.POCKETS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new rfe.e(zhm.v.k(fVar, fVar2, new rfe.f(aVar, new rfe.i(kotlin.collections.d.y0(elements)))));
    }

    @Override // phm.a
    public final Object get() {
        return a();
    }
}
