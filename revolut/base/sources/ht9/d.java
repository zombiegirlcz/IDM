package ht9;

import android.os.Parcelable;
import bp9.f;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.navigation.BillSplitsResult;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.PaymentsGroupsBillsEditFlowContract$State;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import gim.i;
import hbg.h;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import r10.t;
import yhm.o;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b f155334w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f155334w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f155334w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.payments.groups.impl.ui_new.flow.bills_edit.b bVar = this.f155334w;
        Continuation continuation = null;
        if (i == 0) {
            o.b(obj2);
            f fVar = this.v;
            SplitMemberType splitMemberType = fVar.f17568b;
            SplitMemberType.GroupMember groupMember = splitMemberType instanceof SplitMemberType.GroupMember ? (SplitMemberType.GroupMember) splitMemberType : null;
            if (groupMember == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            BillSplitsResult billSplitsResult = (BillSplitsResult) fVar.f17567a.get(((PaymentsGroupsBillsEditFlowContract$State) bVar.A2().f98429a).f79429c);
            if (billSplitsResult == null) {
                throw new IllegalStateException("No splits for bill");
            }
            t tVar = bVar.f79434t;
            oq9.i groupBill = ((PaymentsGroupsBillsEditFlowContract$State) bVar.A2().f98429a).f79428b;
            BillType bill = ((PaymentsGroupsBillsEditFlowContract$State) bVar.A2().f98429a).f79429c;
            oq9.o owner = groupMember.f79216a;
            tVar.getClass();
            Intrinsics.checkNotNullParameter(groupBill, "groupBill");
            Intrinsics.checkNotNullParameter(bill, "bill");
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(billSplitsResult, "billSplitsResult");
            pfm.a aVar2 = new pfm.a(new ufm.i(new ufm.c(new a80.b(tVar, bill, owner, billSplitsResult, 5), 2), new ir9.a(new is6.t(tVar, groupBill, 10), 21), 0), new ir9.a(new is2.t(tVar, 11), 22), 4);
            Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
            this.u = 1;
            if (nim.a.a(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        l.a1(bVar, bVar.X1(new y0("SUCCESS_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.payments_groups_split_bill_summary_succes_split, u.c(((PaymentsGroupsBillsEditFlowContract$State) bVar.A2().f98429a).f79427a.f79286b), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new h(bVar, continuation, 24), 3);
        return Unit.f186387a;
    }
}
