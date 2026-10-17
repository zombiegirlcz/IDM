package aj0;

import adk.i1;
import al5.a;
import androidx.room.TriggerBasedInvalidationTracker;
import bka.n0;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreen;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.accounts_au.accounts_selection_au.accounts_selection_au.AccountsSelectionAuScreen;
import com.revolut.feature.insurance.impl.ui.cfac.claim.other_reason.CFACInsuranceOtherReasonScreen;
import com.revolut.feature.retail.savings.impl.core.calculator.presentation.SavingsCalculatorScreen;
import com.revolut.feature.shops.impl.ui.combined_search.ShopsCombinedSearchScreen;
import com.revolut.feature.slot_manager.api.model.SlotIconAsset;
import com.revolut.sso.impl.ui.consent.common.consent_screen.ConsentScreen;
import ip0.pb0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5370a;

    public /* synthetic */ o(int i) {
        this.f5370a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f5370a) {
            case 0:
                return new qlm.e(d0.Companion.serializer());
            case 1:
                return new qlm.e(v1.f247718a);
            case 2:
                return new qlm.e(g0.f5353a);
            case 3:
                KProperty[] kPropertyArr = AccountsSelectionAuScreen.U;
                return new CellDetailsChevronDelegate();
            case 4:
                KProperty[] kPropertyArr2 = AccountsSelectionAuScreen.U;
                return new RowDelegate(null, null, 7);
            case 5:
                ShopsCombinedSearchScreen.a aVar = ShopsCombinedSearchScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 6:
                ShopsCombinedSearchScreen.a aVar2 = ShopsCombinedSearchScreen.Companion;
                return new ListSubheaderDelegate();
            case 7:
                ShopsCombinedSearchScreen.a aVar3 = ShopsCombinedSearchScreen.Companion;
                return new RewardsGridDelegate();
            case 8:
                ShopsCombinedSearchScreen.a aVar4 = ShopsCombinedSearchScreen.Companion;
                return new NotificationCentreItemDelegate();
            case 9:
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < 3; i++) {
                    pb0 pb0Var = new pb0(a0.d.n("ACCOUNTS_LOADING_PREFIX_LIST_ID_", i));
                    yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(pb0Var);
                }
                return arrayList;
            case 10:
                lmm.e eVar = new lmm.e(new a0.b(12));
                lmm.b bVar = lmm.b.BODY;
                Intrinsics.checkNotNullParameter(bVar, "<set-?>");
                eVar.d = bVar;
                return eVar;
            case 11:
                return new xj0.b(new a0.b(11), 3);
            case 12:
                return new xj0.m();
            case 13:
                KProperty[] kPropertyArr3 = CFACInsuranceOtherReasonScreen.f75090b0;
                return new InputTextDelegate(null);
            case 14:
                return new qlm.e(n0.Companion.serializer());
            case 15:
                return new qlm.e(aka.e.f5750a);
            case 16:
                return new qlm.e(v1.f247718a);
            case 17:
                v1 v1Var = v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
            case 18:
                SlotIconAsset.Symbol.Companion bVar2 = SlotIconAsset.Symbol.INSTANCE;
                return j1.b("com.revolut.feature.slot_manager.api.model.SlotIconAsset.Tint", akd.b.values());
            case 19:
                return new qlm.e(akd.d.f5785a);
            case 20:
                v1 v1Var2 = v1.f247718a;
                return new qlm.h0(v1Var2, v1Var2, 1);
            case 21:
                v1 v1Var3 = v1.f247718a;
                return new qlm.h0(v1Var3, v1Var3, 1);
            case 22:
                return j1.a("com.revolut.feature.slot_manager.api.model.SlotPromoBanner.Style.Theme", akd.p.values(), new String[]{null, null}, new Annotation[][]{new Annotation[]{new i1(new String[]{"DARK", "dark"}, 1)}, new Annotation[]{new i1(new String[]{"LIGHT", "light"}, 1)}});
            case 23:
                return Unit.f186387a;
            case 24:
                a.b bVar3 = al5.a.Companion;
                return new qlm.e(v1.f247718a);
            case 25:
                KProperty[] kPropertyArr4 = SavingsCalculatorScreen.R;
                return new InputSliderDelegate();
            case 26:
                KProperty[] kPropertyArr5 = ConsentScreen.R;
                return new ErrorDelegate();
            case 27:
                return Boolean.valueOf(TriggerBasedInvalidationTracker.onAllowRefresh$lambda$0());
            case 28:
                return Unit.f186387a;
            default:
                KProperty[] kPropertyArr6 = CancellationCheckoutScreen.V;
                return new FullScreenStateDelegate();
        }
    }
}
