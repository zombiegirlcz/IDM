package buf;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ManualTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(ManualTransferScreen manualTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = manualTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w(this.v, continuation, 0);
            case 1:
                return new w(this.v, continuation, 1);
            default:
                return new w(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        ManualTransferScreen manualTransferScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                manualTransferScreen.F2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a1 a1Var = (a1) manualTransferScreen.T2();
                a1Var.getClass();
                a1Var.l2(new e0(a1Var, continuation, 3), new yi5.b(26));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a1 a1Var2 = (a1) manualTransferScreen.T2();
                a1Var2.getClass();
                a1Var2.D.getClass();
                lw0.a aVar4 = new lw0.a(new TextLocalisedClause(R$string.group_bills_mark_as_paid_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.group_bills_mark_as_paid_owe_confirmation_description, null, null, 14), null, null, false, 28);
                aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.group_bills_mark_as_paid_dialog_confirm_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R.string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                k9 k9Var = k9.Payments;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                a1Var2.f2(new ActionsBottomSheetController(new dii.a(aVar4, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new b0(a1Var2, 0));
                break;
        }
        return Unit.f186387a;
    }
}
