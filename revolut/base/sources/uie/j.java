package uie;

import b9.w2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f280396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uq3.b f280397b;

    public j(uq3.b bVar, l lVar) {
        this.f280396a = lVar;
        this.f280397b = bVar;
    }

    public final w2 a() {
        vie.g defaultAccountResolver = new vie.g();
        l lVar = this.f280396a;
        vie.a accountVisibilityFilter = new vie.a(lVar.a());
        vie.f analyticsScreenNameProvider = new vie.f();
        rfe.e productSpacesSelectionPolicy = g.a();
        up3.b bVarI = this.f280397b.i();
        vc.s.j(bVarI);
        vie.e showSwitchingButtonPolicy = new vie.e(bVarI);
        vfg.p tabNoContentLeftHandler = new vfg.p(lVar.b());
        f.Companion.getClass();
        Intrinsics.checkNotNullParameter(defaultAccountResolver, "defaultAccountResolver");
        Intrinsics.checkNotNullParameter(accountVisibilityFilter, "accountVisibilityFilter");
        Intrinsics.checkNotNullParameter(analyticsScreenNameProvider, "analyticsScreenNameProvider");
        Intrinsics.checkNotNullParameter(productSpacesSelectionPolicy, "productSpacesSelectionPolicy");
        Intrinsics.checkNotNullParameter(showSwitchingButtonPolicy, "showSwitchingButtonPolicy");
        Intrinsics.checkNotNullParameter(tabNoContentLeftHandler, "tabNoContentLeftHandler");
        return new w2(defaultAccountResolver, accountVisibilityFilter, analyticsScreenNameProvider, productSpacesSelectionPolicy, showSwitchingButtonPolicy, tabNoContentLeftHandler);
    }
}
