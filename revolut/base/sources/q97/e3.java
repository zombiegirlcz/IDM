package q97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e3 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t97.c f243682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tzg.m f243683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oih.k f243684c;
    public final jla.h d;
    public final xoj.a e;

    public e3(t97.c productCellProvider, tzg.m wealthAccountsInteractor, oih.k wealthTaxAdvantageAccountCommandProvider, jla.h productCatalogueInteractor, xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthTaxAdvantageAccountCommandProvider, "wealthTaxAdvantageAccountCommandProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f243682a = productCellProvider;
        this.f243683b = wealthAccountsInteractor;
        this.f243684c = wealthTaxAdvantageAccountCommandProvider;
        this.d = productCatalogueInteractor;
        this.e = featuresInteractor;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.STOCKS_TAA_JISA;
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarSwitchMap = ((cpj.b) this.e).l(yoj.c.WEALTH_TRADING).switchMap(new h2(9, new y2(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        efm.d0 d0VarFirstOrError = rd0.e.c(new pkg.e(mo3.a.g(tzg.m.c(this.f243683b, null, null, 3), null, new q2(4), 1), this, 18), kotlin.coroutines.g.f186406a).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
