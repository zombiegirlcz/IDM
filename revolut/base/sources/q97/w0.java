package q97;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w0 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oih.j f243811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xoj.a f243812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tzg.m f243813c;
    public final ybl.l d;

    public w0(t97.c productCellProvider, oih.j wealthStocksAccountCommandProvider, xoj.a featuresInteractor, tzg.m wealthAccountsInteractor, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(wealthStocksAccountCommandProvider, "wealthStocksAccountCommandProvider");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.f243811a = wealthStocksAccountCommandProvider;
        this.f243812b = featuresInteractor;
        this.f243813c = wealthAccountsInteractor;
        this.d = tradingConfigInteractor;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10 == t97.d.STOCKS_JOINT_GIA;
    }

    @Override // p97.c
    public final efm.r b() {
        efm.r rVarSwitchMap = ((cpj.b) this.f243812b).l(yoj.c.WEALTH_TRADING).switchMap(new j0(new q56.o(this, 17), 19));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        p97.b bVar = productCell.f234280a;
        t97.d dVar = t97.d.STOCKS_JOINT_GIA;
        o97.e eVar = o97.e.f223096a;
        if (bVar != dVar) {
            ufm.b bVarM = efm.d0.m(eVar);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        Object obj2 = productCell.f234283g;
        if (!(obj2 instanceof WealthAccount.Securities)) {
            obj2 = null;
        }
        WealthAccount.Securities securities = (WealthAccount.Securities) obj2;
        if (securities != null) {
            ufm.i iVarA = oih.j.a(this.f243811a, null, securities, 1);
            u0 u0Var = u0.f;
            return new ufm.i(iVarA, new q2j.k(5), 1);
        }
        ufm.b bVarM2 = efm.d0.m(eVar);
        Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
        return bVarM2;
    }
}
