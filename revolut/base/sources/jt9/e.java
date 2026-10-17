package jt9;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlowContract$State;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import pfm.h;
import yhm.o;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ bp9.f f178436w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b bVar, bp9.f fVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f178436w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f178436w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ryc.a aVar2 = bVar.f79447t;
            PaymentGroup paymentGroup = ((PaymentsGroupsBillsSelectionFlowContract$State) bVar.A2().f98429a).f79439a;
            bp9.f fVar = this.f178436w;
            SplitMemberType splitMemberType = fVar.f17568b;
            Intrinsics.i(splitMemberType, "null cannot be cast to non-null type com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType.GroupMember");
            h hVarA = aVar2.a(paymentGroup, ((SplitMemberType.GroupMember) splitMemberType).f79216a, fVar.f17567a);
            this.u = 1;
            if (nim.a.a(hVarA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        PaymentGroup paymentGroup2 = ((PaymentsGroupsBillsSelectionFlowContract$State) bVar.A2().f98429a).f79439a;
        l.a1(bVar, bVar.X1(new y0("SUCCESS_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.payments_groups_split_bill_summary_succes_split, u.c(paymentGroup2.f79286b), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new f(bVar, paymentGroup2, null), 3);
        return Unit.f186387a;
    }
}
