package hl7;

import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.DatePickerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.all_forms.AllFormsScreen;
import com.revolut.feature.apm.bizum.impl.ui.settings.BizumSettingsScreen;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.past.CreditCardInstalmentsScreen;
import com.revolut.feature.push_to_card.impl.ui.edit_card_owner.EditCardOwnerScreen;
import com.revolut.feature.user_declarations.shared.flows.pep.screens.document_type_selector.DocumentTypeSelectorController;
import com.revolut.feature.voluntary.offboarding.impl.ui.account_not_closing.AccountNotClosingViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.esim_install.EsimInstallBottomSheetScreen;
import java.time.Instant;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ma implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f153219a;

    public /* synthetic */ ma(int i) {
        this.f153219a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f153219a) {
            case 0:
                return new qlm.e(g4.f153117a);
            case 1:
                String[] elements = {"ID_PROVIDE_INFORMATION_CRYPTO_TFR_CANCEL_ACTION", "ID_PROVIDE_ADDITIONAL_INFORMATION_CRYPTO_TFR_CANCEL_ACTION"};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.y0(elements);
            case 2:
                KProperty[] kPropertyArr = EsimInstallBottomSheetScreen.W;
                return new RowDelegate(null, null, 7);
            case 3:
                int i = DocumentTypeSelectorController.U;
                return new RowDelegate(null, null, 7);
            case 4:
                CorporateEventsHomeScreen.a aVar = CorporateEventsHomeScreen.Companion;
                return new RowDelegate(null, null, 7);
            case 5:
                CorporateEventsHomeScreen.a aVar2 = CorporateEventsHomeScreen.Companion;
                return new TextDelegate();
            case 6:
                CorporateEventsHomeScreen.a aVar3 = CorporateEventsHomeScreen.Companion;
                return new RowLoadingDelegate();
            case 7:
                CorporateEventsHomeScreen.a aVar4 = CorporateEventsHomeScreen.Companion;
                return new HeaderLoadingDelegate();
            case 8:
                CorporateEventsHomeScreen.a aVar5 = CorporateEventsHomeScreen.Companion;
                return new ListSubheaderDelegate();
            case 9:
                CorporateEventsHomeScreen.a aVar6 = CorporateEventsHomeScreen.Companion;
                return new FullScreenStateDelegate();
            case 10:
                CorporateEventsHomeScreen.a aVar7 = CorporateEventsHomeScreen.Companion;
                return new CalendarRowDelegate();
            case 11:
                CorporateEventsHomeScreen.a aVar8 = CorporateEventsHomeScreen.Companion;
                return new CellDetailsDelegate();
            case 12:
                CorporateEventsHomeScreen.a aVar9 = CorporateEventsHomeScreen.Companion;
                return new LargeActionButtonDelegate();
            case 13:
                CorporateEventsHomeScreen.a aVar10 = CorporateEventsHomeScreen.Companion;
                return new TwinHorizontalButtonDelegate();
            case 14:
                CorporateEventsHomeScreen.a aVar11 = CorporateEventsHomeScreen.Companion;
                return new DatePickerDelegate();
            case 15:
                KProperty[] kPropertyArr2 = AllFormsScreen.Q;
                return new RowDelegate(null, null, 7);
            case 16:
                return qlm.j1.b("com.revolut.feature.salary_switch.impl.models.dto.terms.TermsRequest.AccountType", hqc.b.values());
            case 17:
                return new cte.a("cryptoReceiveXrp", 0);
            case 18:
                return new cte.a("watchlistRearrangeItems", 1);
            case 19:
                Lazy lazy = hrk.a.f154832a;
                kg.p pVar = new kg.p();
                kg.j0 j0Var = kg.j0.LONG_OR_DOUBLE;
                Objects.requireNonNull(j0Var);
                pVar.f183887m = j0Var;
                pVar.c(new he0.e(), Instant.class);
                he0.m mVarB = he0.m.b(m2l.z.class, "type");
                mVarB.c(m2l.x.class, "MONEY");
                mVarB.c(m2l.y.class, "PERCENTAGE");
                mVarB.c(m2l.w.class, "NUMBER");
                pVar.e.add(mVarB);
                return pVar.b();
            case 20:
                KProperty[] kPropertyArr3 = CreditCardInstalmentsScreen.T;
                return new RowDelegate(null, null, 7);
            case 21:
                KProperty[] kPropertyArr4 = CreditCardInstalmentsScreen.T;
                return new FullScreenStateDelegate();
            case 22:
                KProperty[] kPropertyArr5 = EditCardOwnerScreen.Q;
                return new InputTextDelegate(null);
            case 23:
                KProperty[] kPropertyArr6 = AccountNotClosingViewController.R;
                return new FullScreenStateDelegate();
            case 24:
                KProperty[] kPropertyArr7 = AccountNotClosingViewController.R;
                return new LargeActionButtonDelegate();
            case 25:
                TrendView.Companion companion = TrendView.INSTANCE;
                return com.google.android.gms.internal.mlkit_vision_face.a.c(true);
            case 26:
                TrendView.Companion companion2 = TrendView.INSTANCE;
                return Unit.f186387a;
            case 27:
                KProperty[] kPropertyArr8 = BizumSettingsScreen.f0;
                return new RowDelegate(null, null, 7);
            case 28:
                KProperty[] kPropertyArr9 = BizumSettingsScreen.f0;
                return new CellDetailsChevronDelegate();
            default:
                KProperty[] kPropertyArr10 = BizumSettingsScreen.f0;
                return new RowDelegate(null, null, 7);
        }
    }
}
