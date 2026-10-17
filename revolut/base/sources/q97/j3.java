package q97;

import com.revolut.feature.subaccount.api.CreateSubaccountScreenDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j3 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f243717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.g f243718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g48.r0 f243719c;

    public j3(t97.c productCellProvider, g6e.d subaccountInteractor, g6e.g subaccountsNavigationProvider, g48.r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(subaccountsNavigationProvider, "subaccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f243717a = subaccountInteractor;
        this.f243718b = subaccountsNavigationProvider;
        this.f243719c = jointAccountsInteractor;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.SUBACCOUNTS || id10 == t97.d.JOINT_SUBACCOUNTS;
    }

    @Override // p97.c
    public final efm.r b() {
        n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return rd0.e.c(new pkg.e(zh9.u0.m(this.f243719c.e(kotlin.collections.d.y0(elements), w4l.h.f294642c), ((s6e.z) this.f243717a).g()), this, 19), kotlin.coroutines.g.f186406a);
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        p97.b bVar = productCell.f234280a;
        if (bVar == t97.d.SUBACCOUNTS) {
            ufm.b bVarM = efm.d0.m(new o97.d(new CreateSubaccountScreenDestination(null)));
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (bVar == t97.d.JOINT_SUBACCOUNTS) {
            return te0.w.o0(skm.p0.f264003c, new pwb.p(this, null, 23));
        }
        throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
    }
}
