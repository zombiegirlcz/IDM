package euf;

import a0.d;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.impl.ui.more.BrebMoreScreen;
import com.revolut.feature.card_add_to_googlepay.impl.AddCardToGooglePayActivity;
import com.revolut.feature.credit.card.impl.ui.statement_financing.details.CreditCardStatementFinancingDetailsScreen;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.tax_rates.AddTaxRateScreen;
import com.revolut.feature.kyc.shared.web_kyc.view.WebPortalLoadingView;
import com.revolut.feature.selfserve.sow.impl.ui.question.SowQuestionFragment;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.time_slot_picker.AsftTimeSlotPickerScreen;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreen;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.SelectFreeStocksScreen;
import f1a.j;
import f2e.d;
import f2e.e5;
import f2e.h;
import ip0.s7;
import j19.k;
import java.util.ArrayList;
import koi.c;
import koi.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.e;
import qlm.i0;
import qlm.v1;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129559a;

    public /* synthetic */ a(int i) {
        this.f129559a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = false;
        int i = 7;
        c cVar = null;
        switch (this.f129559a) {
            case 0:
                return h5k.a.e();
            case 1:
                LayeredImage.Companion companion = LayeredImage.INSTANCE;
                int i2 = R$drawable.uikit_icn_24_people;
                int i3 = R$attr.uikit_colorPopoverBackground;
                return LayeredImage.Companion.f(companion, i2, R$attr.uikit_colorStatusInactive, i3, Integer.valueOf(i3), 3.0f, 3.0f, null, 64);
            case 2:
                ArrayList arrayList = new ArrayList(2);
                for (int i5 = 0; i5 < 2; i5++) {
                    arrayList.add(new s7(d.n("list-id-order-settings-loading-item-", i5), 0, 0, 0, 0, false, null, 126));
                }
                int i6 = R$attr.uikit_dp16;
                yp0.b.k(arrayList, i6, i6, 0, 0, 28);
                return arrayList;
            case 3:
                int i21 = R$drawable.uikit_icn_16_info_outline;
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
                Float fValueOf = Float.valueOf(12.0f);
                return new ImageClause(i21, numValueOf, fValueOf, fValueOf, 16);
            case 4:
                KProperty[] kPropertyArr = AsftTimeSlotPickerScreen.R;
                return new PickerDelegate();
            case 5:
                KProperty[] kPropertyArr2 = AsftTimeSlotPickerScreen.R;
                return new FullScreenStateDelegate();
            case 6:
                KProperty[] kPropertyArr3 = BrebMoreScreen.T;
                return new PlainTextWarningDelegate();
            case 7:
                KProperty[] kPropertyArr4 = BrebMoreScreen.T;
                return new RowDelegate(null, null, 7);
            case 8:
                KProperty[] kPropertyArr5 = AddCardToGooglePayActivity.f64445v0;
                return new PromptMarketingContentDelegate();
            case 9:
                return new PromptMarketingContentDelegate();
            case 10:
                KProperty[] kPropertyArr6 = CreditCardStatementFinancingDetailsScreen.W;
                return new ListSubheaderDelegate();
            case 11:
                KProperty[] kPropertyArr7 = CreditCardStatementFinancingDetailsScreen.W;
                return new RowDelegate(null, null, 7);
            case 12:
                KProperty[] kPropertyArr8 = CreditCardStatementFinancingDetailsScreen.W;
                return new FullScreenStateDelegate();
            case 13:
                KProperty[] kPropertyArr9 = CreditCardStatementFinancingDetailsScreen.W;
                return new CellDetailsDelegate();
            case 14:
                KProperty[] kPropertyArr10 = AddTaxRateScreen.f73767b0;
                return new InputTextDelegate(null);
            case 15:
                WebPortalLoadingView.Companion companion2 = WebPortalLoadingView.INSTANCE;
                return new h(cVar, z, z, i);
            case 16:
                KProperty[] kPropertyArr11 = JuniorUpgradeScreen.f101760a0;
                return v.k(new ListSubheaderDelegate(), new PlainTextDelegate(), new RowDelegate(null, null, 7));
            case 17:
                return r0.g();
            case 18:
                KProperty[] kPropertyArr12 = SelectFreeStocksScreen.Q;
                return new FullScreenStateDelegate();
            case 19:
                int i22 = SowQuestionFragment.f85967h0;
                return new InputTextDelegate(null);
            case 20:
                int i32 = SowQuestionFragment.f85967h0;
                return new InputChecklistDelegate();
            case 21:
                return Unit.f186387a;
            case 22:
                return new e(k.Companion.serializer());
            case 23:
                return new e(j.f131210a);
            case 24:
                return SaveableStateHolderKt.rememberSaveableStateHolder$lambda$0$0();
            case 25:
                return SaveableStateRegistryKt.LocalSaveableStateRegistry$lambda$0();
            case 26:
                return new i0(v1.f247718a, 1);
            case 27:
                d.b bVar = f2e.d.Companion;
                return new e(v1.f247718a);
            case 28:
                h.Companion bVar2 = f2e.h.INSTANCE;
                return new e(v1.f247718a);
            default:
                h.Companion bVar3 = f2e.h.INSTANCE;
                return new e(e5.f131577a);
        }
    }
}
