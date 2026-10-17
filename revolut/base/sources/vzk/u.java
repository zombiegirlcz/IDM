package vzk;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalitiesInput;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalityInput;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import grl.k9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class u extends jki.g implements m {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kye.e f293568p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f293569q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tzk.a f293570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f293571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final NationalitiesScreenContract$InputData f293572t;
    public final g u;
    public final t v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(kye.e tradingOnboardingKycInteractor, ybl.l tradingConfigInteractor, tzk.a dialogsFactory, j60.a bottomExpandableDialogControllerExtension, NationalitiesScreenContract$InputData inputData, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(tradingOnboardingKycInteractor, "tradingOnboardingKycInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(dialogsFactory, "dialogsFactory");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f293568p = tradingOnboardingKycInteractor;
        this.f293569q = tradingConfigInteractor;
        this.f293570r = dialogsFactory;
        this.f293571s = bottomExpandableDialogControllerExtension;
        this.f293572t = inputData;
        this.u = new g(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), false, false);
        this.v = new t();
    }

    public final void A2(Function1 function1) {
        List list;
        ArrayList arrayList = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_trading_onboarding_kyc_nationality_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_stocks_search, null, null, 14);
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.u;
        companion.getClass();
        AnalyticsProduct.Companion.a(k9Var);
        NationalitiesInput nationalitiesInput = (NationalitiesInput) ((g) t2()).f293548b.getContent();
        if (nationalitiesInput != null && (list = nationalitiesInput.f104193a) != null) {
            List list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(((NationalityInput) it8.next()).f104195a.f297794a);
            }
        }
        Y1(new PickerScreen(new PickerScreenContract$InputData(null, textLocalisedClause, null, null, false, textLocalisedClause2, "TradingOnboardingNationalityPickerInteractor", arrayList, null, null, null, false, null, new AnalyticsProduct.Retail(k9Var), null, 125825785)), ModalDestination.Style.POPUP.f98311a, new v1.m(8, function1));
    }

    public final boolean B2(List list) {
        if (list == null || !(!list.isEmpty())) {
            return false;
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (!y2(((NationalityInput) it8.next()).f104195a)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // yji.l
    public final void I1() {
        if (!((g) t2()).f293547a) {
            z2();
        }
        if (this.f293572t.f104204b) {
            return;
        }
        yji.l.a1(this, nim.a.v(rd0.e.n(rd0.e.b(ybl.l.c(this.f293569q, false, 3)), h0.f322473a), new vz1.h(6)), null, null, new vrl.d(this, null, 15), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.v;
    }

    public final boolean y2(wi0.b bVar) {
        if (this.f293572t.f104204b) {
            return true;
        }
        wi0.b.Companion.getClass();
        return !Intrinsics.f(bVar, wi0.b.f297770q3);
    }

    public final void z2() {
        t38.e eVarM = u0.m(this.f293572t.f104204b ? zi0.c.i(Boolean.TRUE) : nim.a.A(nim.a.v(ybl.l.d(this.f293569q), new vz1.h(4)), new vz1.h(5)), rd0.e.b(((hyk.l) this.f293568p.f190729b).e.f(Unit.f186387a, true)));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.d(c8g.a.D(rd0.e.n(eVarM, h0Var)), h0Var), null, null, new vnl.o(this, null, 20), 3);
    }
}
