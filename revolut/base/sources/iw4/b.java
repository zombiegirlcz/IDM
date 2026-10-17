package iw4;

import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarCellDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreen;
import com.revolut.feature_crypto_picker.impl.ui.picker.CryptoPickerController;
import iyd.e0;
import iyd.n0;
import iyd.v;
import iyd.y;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import org.joda.time.format.DateTimeFormat;
import qlm.i0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168938a;

    public /* synthetic */ b(int i) {
        this.f168938a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f168938a) {
            case 0:
                KProperty[] kPropertyArr = CreditCardStatementFinancingSetupScreen.Z;
                return new LargeActionButtonDelegate();
            case 1:
                KProperty[] kPropertyArr2 = CreditCardStatementFinancingSetupScreen.Z;
                return new PickerDelegate();
            case 2:
                KProperty[] kPropertyArr3 = CreditCardStatementFinancingSetupScreen.Z;
                return new CellDetailsActionDelegate();
            case 3:
                KProperty[] kPropertyArr4 = CreditCardStatementFinancingSetupScreen.Z;
                return new AppTipDelegate();
            case 4:
                KProperty[] kPropertyArr5 = CreditCardStatementFinancingSetupScreen.Z;
                return new SuggestionsBarCellDelegate();
            case 5:
                KProperty[] kPropertyArr6 = CreditCardStatementFinancingSetupScreen.Z;
                return new SuggestionsBarDelegate();
            case 6:
                KProperty[] kPropertyArr7 = CreditCardStatementFinancingSetupScreen.Z;
                return new CellDetailsDelegate();
            case 7:
                Object obj2 = ixi.f.f169569a;
                return DateTimeFormat.forPattern("HH:mm");
            case 8:
                return new i0(v1.f247718a, 1);
            case 9:
                return new qlm.e(iyd.s.f169690a);
            case 10:
                return new qlm.e(iyd.p.f169684a);
            case 11:
                return new qlm.e(v.f169694a);
            case 12:
                return new qlm.e(e0.f169659a);
            case 13:
                return new qlm.e(n0.f169681a);
            case 14:
                return new qlm.e(y.f169698a);
            case 15:
                return new ihm.b();
            case 16:
                return new qlm.e(j05.y.f169981a);
            case 17:
                return new qlm.e(j05.v.f169977a);
            case 18:
                return new qlm.e(j05.a.f169946a);
            case 19:
                return new qlm.e(j05.s.f169973a);
            case 20:
                return new qlm.e(j05.p.f169969a);
            case 21:
                return j1.a("com.revolut.feature.semi_independent_activation.impl.data.model.InvitationState", j0d.b.values(), new String[]{"PENDING", "ACCEPTED"}, new Annotation[][]{null, null});
            case 22:
                return new qlm.e(j0d.i.f170004a);
            case 23:
                return j0d.b.Companion.serializer();
            case 24:
                return new qlm.e(j0d.c.f169998a);
            case 25:
                KProperty[] kPropertyArr8 = CryptoPickerController.U;
                return new ListSubheaderDelegate();
            case 26:
                KProperty[] kPropertyArr9 = CryptoPickerController.U;
                return new RowDelegate(null, null, 7);
            case 27:
                KProperty[] kPropertyArr10 = CryptoPickerController.U;
                return new FullScreenStateDelegate();
            case 28:
                return j18.f.Companion.serializer();
            default:
                return j1.a("com.revolut.feature.invest.smart_notifications.impl.data.network.models.InsightTypeDto", j18.f.values(), new String[]{"PRICE_MOVEMENT", "REVOLUT_RECOMMENDATION", "EXTERNAL_SUGGESTION", "FUNDAMENTAL_METRIC_CHANGE", "PRICE_TARGET_CHANGE", "EARNING_CALL", "UNKNOWN"}, new Annotation[][]{null, null, null, null, null, null, null});
        }
    }
}
