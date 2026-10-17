package buf;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ManualTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ManualTransferScreen manualTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = manualTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a0 a0Var = new a0(this.v, continuation);
        a0Var.u = obj2;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a0) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarT2 = this.v.T2();
        Intrinsics.h(model);
        a1 a1Var = (a1) kVarT2;
        a1Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "NON_REVOLUT_MEMBERS_SUBHEADER_LIST_ID")) {
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.group_settle_up_non_revolut_sheet_title, null, null, 14), null, null, null, false, 30);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.group_settle_up_non_revolut_sheet_description, null, null, 14);
            k9 value = k9.Payments;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            yji.l.j2(a1Var, new ActionsBottomSheetController(new dii.a(aVar2, (aw0.i) null, new AnalyticsProduct.Retail(value), (AnalyticsContext) null, textLocalisedClause)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
        return Unit.f186387a;
    }
}
