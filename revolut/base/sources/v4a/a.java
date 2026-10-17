package v4a;

import androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner;
import com.google.gson.reflect.TypeToken;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.feature.apm.qvik.impl.ui.settings.QvikSettingsScreen;
import com.revolut.feature.credit.loan.impl.ui.selector.module.CreditSelectorActivity;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultEntityGsonHolder;
import com.revolut.feature_retail_user_declarations.transaction_countries.frequency_picker.TransactionFrequencyController;
import ip0.pb0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kg.p;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qlm.d1;
import vbk.e;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285993a;

    public /* synthetic */ a(int i) {
        this.f285993a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f285993a) {
            case 0:
                KProperty[] kPropertyArr = RecipientSelectionScreen.f80137h0;
                return new ActionsDelegate();
            case 1:
                KProperty[] kPropertyArr2 = RecipientSelectionScreen.f80137h0;
                return new RewardsGridDelegate();
            case 2:
                KProperty[] kPropertyArr3 = RecipientSelectionScreen.f80137h0;
                return new RowDelegate(null, null, 7);
            case 3:
                return LocalNavigationEventDispatcherOwner.LocalNavigationEventDispatcherOwner$lambda$0();
            case 4:
                return new AccountCellItemDelegate();
            case 5:
                return new qlm.e(v7g.g.f286641a);
            case 6:
                return new qlm.e(v7g.a.f286633a);
            case 7:
                return new qlm.e(v7g.l.f286646a);
            case 8:
                int i = CreditSelectorActivity.f70605v0;
                return new RowDelegate(null, null, 7);
            case 9:
                ArrayList arrayList = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList.add(new pb0(a0.d.n("INSTRUMENT_SELECTION_LOADING_PREFIX_LIST_ID_", i2)));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 10:
                return new PromptContentDelegate();
            case 11:
                return new PromptMarketingContentDelegate();
            case 12:
                KProperty[] kPropertyArr4 = PixAreaScreen.Z;
                return new RowsWidgetDelegate();
            case 13:
                KProperty[] kPropertyArr5 = PixAreaScreen.Z;
                return new ActionsDelegate();
            case 14:
                KProperty[] kPropertyArr6 = PixAreaScreen.Z;
                return new HeaderDelegate();
            case 15:
                KProperty[] kPropertyArr7 = PixAreaScreen.Z;
                return new FullScreenStateDelegate();
            case 16:
                KProperty[] kPropertyArr8 = PixAreaScreen.Z;
                return new RowDelegate(null, null, 7);
            case 17:
                KProperty[] kPropertyArr9 = PixAreaScreen.Z;
                return new ReferralContactDelegate();
            case 18:
                KProperty[] kPropertyArr10 = PixAreaScreen.Z;
                return new ListSubheaderDelegate();
            case 19:
                KProperty[] kPropertyArr11 = PixAreaScreen.Z;
                return new ContactsWidgetDelegate();
            case 20:
                return new qlm.e(vaj.d.f287306a);
            case 21:
                return new qlm.e(vaj.g.f287310a);
            case 22:
                return new qlm.e(vaj.a.f287302a);
            case 23:
                e.Companion bVar = vbk.e.INSTANCE;
                return new qlm.e(e.c.a.f287549a);
            case 24:
                e.Companion bVar2 = vbk.e.INSTANCE;
                return new qlm.e(e.d.a.f287552a);
            case 25:
                KProperty[] kPropertyArr12 = QvikSettingsScreen.S;
                return new RowDelegate(null, null, 7);
            case 26:
                KProperty[] kPropertyArr13 = QvikSettingsScreen.S;
                return new FullScreenStateDelegate();
            case 27:
                int i3 = TransactionFrequencyController.V;
                return new SingleChoiceDelegate();
            case 28:
                Lazy lazy = VaultEntityGsonHolder.f86691a;
                p pVar = new p();
                Type type = new TypeToken<String>() { // from class: com.revolut.feature.shared.vaults.domain.impl.data.database.models.VaultEntityGsonHolder$gson_delegate$lambda$0$$inlined$gsonTypeToken$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                pVar.c(new he0.k(), type);
                return pVar.b();
            default:
                return new d1("PAYMENTS_MIGRATION", ve7.h.INSTANCE, new Annotation[]{new hi9.g(26)});
        }
    }
}
