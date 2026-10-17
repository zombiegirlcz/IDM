package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert;

import aah.h;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.kompot.common.ModalDestination;
import cp5.d;
import efm.c0;
import efm.r;
import ifd.e;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import jki.g;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l2d.n;
import mgd.f;
import org.jetbrains.annotations.NotNull;
import rp0.g1;
import rp0.k1;
import u80.t;
import ufm.i;
import wf0.f0;
import wp5.y;
import y65.l;
import y7k.g0;
import ye1.m;
import yed.d0;
import yed.k0;
import yed.o;
import yed.o0;
import yed.q;
import yed.x;
import yed.z;
import z2d.c;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends g implements q {

    @NotNull
    public static final x Companion = new x();
    public final o A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SharedCreateAlertScreenContract$InputData f86745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final efd.a f86746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f86747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i90.b f86748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f86749t;
    public final o0 u;
    public final h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f86750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g1 f86751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ped.a f86752y;
    public final List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p stateMapper, SharedCreateAlertScreenContract$InputData inputData, efd.a alertsInteractor, c assetTypesInteractor, i90.b uuidGenerator, e counterpartAssetsProvider, o0 simpleSelectorProvider, h wealthDisclaimersControllerModelExtension, t ratesMoneyUtils, g1 shotDialogDisplayer, ped.a alertsDialogFactory) {
        o oVar;
        mgd.e eVar;
        mgd.b bVar;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(alertsInteractor, "alertsInteractor");
        Intrinsics.checkNotNullParameter(assetTypesInteractor, "assetTypesInteractor");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(counterpartAssetsProvider, "counterpartAssetsProvider");
        Intrinsics.checkNotNullParameter(simpleSelectorProvider, "simpleSelectorProvider");
        Intrinsics.checkNotNullParameter(wealthDisclaimersControllerModelExtension, "wealthDisclaimersControllerModelExtension");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(alertsDialogFactory, "alertsDialogFactory");
        this.f86745p = inputData;
        this.f86746q = alertsInteractor;
        this.f86747r = assetTypesInteractor;
        this.f86748s = uuidGenerator;
        this.f86749t = counterpartAssetsProvider;
        this.u = simpleSelectorProvider;
        this.v = wealthDisclaimersControllerModelExtension;
        this.f86750w = ratesMoneyUtils;
        this.f86751x = shotDialogDisplayer;
        this.f86752y = alertsDialogFactory;
        this.z = v.k(new FavouritesAssetDetails("GBP", "GBP", "GBP", new FavouritesAssetTypeKey("FIAT"), false), new FavouritesAssetDetails("USD", "USD", "USD", new FavouritesAssetTypeKey("FIAT"), false));
        if (inputData instanceof SharedCreateAlertScreenContract$InputData.Create) {
            String strU = y.u(uuidGenerator, "toString(...)");
            SharedCreateAlertScreenContract$InputData.Create create = (SharedCreateAlertScreenContract$InputData.Create) inputData;
            FavouritesAssetDetails favouritesAssetDetails = create.f86739a;
            oVar = new o(strU, favouritesAssetDetails, create.f86741c, "", z2(favouritesAssetDetails.d), null, B2() ? (f) ((n) alertsInteractor).f191787a.d.v0(f.TARGET_PRICE, "PREFERRED_ALERT_TYPE_KEY", f.class) : f.TARGET_PRICE, null, null, null, null, true, 916768);
        } else {
            if (!(inputData instanceof SharedCreateAlertScreenContract$InputData.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            AlertItem alertItem = ((SharedCreateAlertScreenContract$InputData.Edit) inputData).f86742a;
            String f86876a = alertItem.getF86876a();
            FavouritesAssetDetails f86877b = alertItem.getF86877b();
            String f86878c = alertItem.getF86878c();
            String string = alertItem.getD().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            BigDecimal d = alertItem.getD();
            boolean zZ2 = z2(alertItem.getF86877b().d);
            f i = alertItem.getI();
            String f = alertItem.getF();
            AlertItem.TargetPrice targetPrice = alertItem instanceof AlertItem.TargetPrice ? (AlertItem.TargetPrice) alertItem : null;
            mgd.b bVar2 = (targetPrice == null || (bVar = targetPrice.i) == null) ? mgd.b.ONE_TIME : bVar;
            AlertItem.Volatility volatility = alertItem instanceof AlertItem.Volatility ? (AlertItem.Volatility) alertItem : null;
            oVar = new o(f86876a, f86877b, f86878c, string, zZ2, d, i, bVar2, f, alertItem, (volatility == null || (eVar = volatility.f86879g) == null) ? mgd.e.ONE_DAY : eVar, false, 808992);
        }
        this.A = oVar;
    }

    public static final akg.n y2(b bVar, FavouritesAssetDetails favouritesAssetDetails, String str) {
        efd.a aVar = bVar.f86746q;
        FavouritesAssetTypeKey assetTypeKey = favouritesAssetDetails.d;
        String assetId = favouritesAssetDetails.f86863a;
        n nVar = (n) aVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        u3d.b bVar2 = (u3d.b) nVar.f191788b.get(assetTypeKey);
        if (bVar2 != null) {
            return nim.a.v(nim.a.A(nim.a.v(rd0.e.b(bVar2.i(u.c(assetId))), new k7c.n(assetId, 26)), new m(5)), new g0(bVar, favouritesAssetDetails, str));
        }
        throw new IllegalStateException(j6.a.q("Interactor not found for typeKey=", assetTypeKey.f86866a));
    }

    public final int A2() {
        Integer num;
        Data data = ((o) t2()).f312886s;
        if (data != null && (num = (Integer) data.getContent()) != null) {
            return num.intValue();
        }
        FavouritesAssetDetails favouritesAssetDetails = ((o) t2()).f312875b;
        xi0.a aVar = xi0.b.Companion;
        String str = favouritesAssetDetails.f86863a;
        aVar.getClass();
        return Math.max(d.p(xi0.a.a(str)), 10);
    }

    public final boolean B2() {
        return r6.b.B(xi0.b.Companion, this.f86745p.getF86739a().f86863a);
    }

    public final void C2() {
        if (((o) t2()).f312878h) {
            SharedFavouritesCounterpartChooserScreen sharedFavouritesCounterpartChooserScreen = new SharedFavouritesCounterpartChooserScreen(new SharedFavouritesCounterpartChooserScreenContract$InputData(new TextLocalisedClause(R$string.rates_ui_shared_alerts_create_alert_counterpart_chooser_title, null, null, 14), u.c(((o) t2()).f312875b.f86863a), true, ((o) t2()).f312876c));
            Y1(sharedFavouritesCounterpartChooserScreen, ModalDestination.Style.POPUP.f98311a, new g0(sharedFavouritesCounterpartChooserScreen, this, 21));
        }
    }

    public final void D2() {
        BigDecimal bigDecimal;
        String str = ((o) t2()).f312876c;
        if (str == null || (bigDecimal = ((o) t2()).e) == null) {
            return;
        }
        l2(new l(this, str, bigDecimal, null, 8), new yed.v(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E2() {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b.E2():void");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        int i = 12;
        int i2 = 3;
        yji.l.b1(this, vkm.q.Q(vkm.q.q(new wyd.f(q2(), this, 25)), new f0(continuation, this, ((o) t2()).f312875b.d, i)), null, new d0(i2, this, continuation), 3);
        int i3 = 0;
        int i5 = 2;
        if (B2()) {
            yji.l.b1(this, vkm.q.Q(vkm.q.q(new y5j.e(q2(), i)), new z(i5, this, continuation)), null, new d0(i3, this, continuation), 3);
        }
        yji.l.b1(this, rd0.e.b(((k1) this.f86751x).d), null, new k0(this, null), 3);
        yji.l.b1(this, vkm.q.Q(vkm.q.q(new y5j.e(q2(), 13)), new z(i2, this, continuation)), null, new d0(i5, this, continuation), 3);
        FavouritesAssetTypeKey favouritesAssetTypeKey = ((o) t2()).f312875b.d;
        y1d.b.Companion.getClass();
        int i6 = 4;
        yji.l.b1(this, Intrinsics.f(favouritesAssetTypeKey, y1d.a.e) ? new q87.q(nim.a.v(this.v.f2828l.w0(), new m(i6)), 19) : new go.g(yed.l.f312868a, 2), null, new d0(1, this, continuation), 3);
        if (((o) t2()).f312876c != null) {
            return;
        }
        for (FavouritesAssetDetails favouritesAssetDetails : this.z) {
            if (!Intrinsics.f(favouritesAssetDetails.f86863a, this.f86745p.getF86739a().f86863a)) {
                String str = favouritesAssetDetails.f86863a;
                int i21 = 7;
                i iVar = new i(new i(((m3d.f) this.f86749t).e.x(AccountId.Personal.f51414a), new ya6.f(new m(i21), 15), 1), new ya6.f(new g0(this, str, 20), 16), 1);
                ufm.b bVarM = efm.d0.m(str);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c0 c0Var = hfm.c.f152030a;
                m70.a.p(c0Var);
                List listK = v.k(iVar, bVarM.j(1000L, c0Var));
                mfm.f.b(listK, "sources is null");
                r rVarOnErrorReturn = new rfm.l(null, listK, 3).x().onErrorReturn(new ya6.f(new y9d.c(str, i21), 17));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorReturn, "onErrorReturn(...)");
                yji.l.b1(this, rd0.e.b(rVarOnErrorReturn), null, new d0(i6, this, continuation), 3);
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.A;
    }

    public final boolean z2(FavouritesAssetTypeKey assetTypeKey) {
        c cVar = this.f86747r;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(assetTypeKey, "assetTypeKey");
        Object obj2 = cVar.f319059a.get(assetTypeKey);
        if (obj2 != null) {
            return ((u3d.b) obj2).g0() == lgd.a.MIXED;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
