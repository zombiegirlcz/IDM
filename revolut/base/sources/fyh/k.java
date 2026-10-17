package fyh;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.view.compose.ActivityResultRegistryKt;
import androidx.view.compose.LocalActivityResultRegistryOwner;
import androidx.view.compose.LocalOnBackPressedDispatcherOwner;
import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.breakdown.PaymentsBreakdownController;
import com.revolut.feature.apm.core.ui.impl.ui.registration.terms.scopes.ApmTermsScopeScreen;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsController;
import com.revolut.feature.credit.direct.debit.new_account.DirectDebitNewAccountScreen;
import com.revolut.feature.selfserve.sow.impl.ui.status.SowStatusFragment;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import fyk.k;
import fyk.o;
import g53.a;
import g53.b;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139010a;

    public /* synthetic */ k(int i) {
        this.f139010a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f139010a) {
            case 0:
                KProperty[] kPropertyArr = CryptoOrderDetailsController.X;
                return new ActionsDelegate();
            case 1:
                KProperty[] kPropertyArr2 = CryptoOrderDetailsController.X;
                return new FixedTabsDelegate();
            case 2:
                KProperty[] kPropertyArr3 = CryptoOrderDetailsController.X;
                return new CellDetailsActionDelegate();
            case 3:
                k.b bVar = fyk.k.Companion;
                return new qlm.e(v1.f247718a);
            case 4:
                return new qlm.e(o.f139047a);
            case 5:
                return new qlm.e(fyk.l.f139040a);
            case 6:
                return new qlm.e(v1.f247718a);
            case 7:
                return new qlm.e(v1.f247718a);
            case 8:
                return new qlm.e(o.f139047a);
            case 9:
                return new qlm.e(v1.f247718a);
            case 10:
                KProperty[] kPropertyArr4 = DirectDebitNewAccountScreen.i0;
                return new AccountCellItemDelegate();
            case 11:
                KProperty[] kPropertyArr5 = DirectDebitNewAccountScreen.i0;
                return new ListSubheaderDelegate();
            case 12:
                KProperty[] kPropertyArr6 = DirectDebitNewAccountScreen.i0;
                return new TextDelegate();
            case 13:
                KProperty[] kPropertyArr7 = DirectDebitNewAccountScreen.i0;
                return new InputChecklistDelegate();
            case 14:
                KProperty[] kPropertyArr8 = DirectDebitNewAccountScreen.i0;
                return new LargeActionButtonDelegate();
            case 15:
                return ActivityResultRegistryKt.rememberLauncherForActivityResult$lambda$0$0();
            case 16:
                return LocalActivityResultRegistryOwner.LocalComposition$lambda$0();
            case 17:
                return LocalOnBackPressedDispatcherOwner.LocalOnBackPressedDispatcherOwner$lambda$0();
            case 18:
                KProperty[] kPropertyArr9 = DisposableCardSettingsController.U;
                return new RowDelegate(null, null, 7);
            case 19:
                KProperty[] kPropertyArr10 = DisposableCardSettingsController.U;
                return new LargeActionButtonDelegate();
            case 20:
                int i = SowStatusFragment.j0;
                return new RowDelegate(null, null, 7);
            case 21:
                int i2 = SowStatusFragment.j0;
                return new ErrorDelegate();
            case 22:
                int i3 = SowStatusFragment.j0;
                return new ListSubheaderDelegate();
            case 23:
                return Boolean.valueOf(DragGestureDetectorKt.detectDragGestures$lambda$5());
            case 24:
                return new qlm.e(j19.k.Companion.serializer());
            case 25:
                int i5 = PaymentsBreakdownController.U;
                return new CellDetailsActionDelegate();
            case 26:
                return new qlm.e(g29.c.f139947a);
            case 27:
                return j1.b("com.revolut.feature.lifestyle.content_gateway.api.model.slot.ContentSource", j19.a.values());
            case 28:
                KProperty[] kPropertyArr11 = ApmTermsScopeScreen.R;
                return new LargeActionButtonDelegate();
            default:
                a.b bVar2 = g53.a.Companion;
                return new qlm.e(b.a.f140613a);
        }
    }
}
