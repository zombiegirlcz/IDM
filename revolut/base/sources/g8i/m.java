package g8i;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.core.api.schedule.ScheduleTransferInputData;
import com.revolut.feature_market_data_api.navigation.ChargeDescriptionFeatureConfig;
import com.revolut.feature_market_data_api.navigation.InterestDescriptionFeatureConfig;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreen;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import d4i.a;
import grl.k9;
import java.time.LocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoveMoneyReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(MoveMoneyReviewScreen moveMoneyReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moveMoneyReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model actionModel = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarT2 = this.v.T2();
        Intrinsics.h(actionModel);
        e0 e0Var = (e0) vVarT2;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(actionModel, "actionModel");
        vrf.h hVar = e0Var.z;
        String str = actionModel.f51781a;
        Object obj3 = actionModel.f51787l;
        if (!((xrf.b) hVar).b(obj3, str)) {
            int i = 0;
            if (str.equals("ID_TRANSFER_REVIEW_SCHEDULED_DATE") || str.equals("ID_TRANSFER_REVIEW_SCHEDULED_PERIOD")) {
                TransferScheduleData transferScheduleDataB = com.revolut.feature_move_money.api.model.c.b(((r) e0Var.t2()).f141388g);
                if (transferScheduleDataB == null) {
                    r6.b.D("Scheduling clicked, but no schedule data provided");
                } else {
                    yji.l.g2(e0Var, ((qpf.h) e0Var.f141369s).d(new ScheduleTransferInputData((TextLocalisedClause) null, transferScheduleDataB, m1l.a.SCHEDULE_REQUIRED, (TextLocalisedClause) null, (List) null, false, (AnalyticsContext) null, (LocalDate) null, (LocalDate) null, false, false, false, 8185)), null, new x(e0Var, i), 1);
                }
            } else if (obj3 instanceof d4i.a) {
                d4i.a aVar2 = (d4i.a) obj3;
                if (aVar2.equals(a.C0664a.f111322a)) {
                    Unit unit = Unit.f186387a;
                } else if (aVar2 instanceof d4i.b) {
                    e0Var.C1(u0.c(((c8i.z) e0Var.f141367q).c(((r) e0Var.t2()).f141386b, ((r) e0Var.t2()).f141387c, ((r) e0Var.t2()).d, ((r) e0Var.t2()).e == j8l.d.SELL, ((r) e0Var.t2()).f141385a.f104755g.f104731a, m6i.y.b(((r) e0Var.t2()).f141386b), ((r) e0Var.t2()).f141388g)));
                } else if (aVar2 instanceof d4i.c) {
                    c4i.a aVarB = m6i.y.b(((r) e0Var.t2()).f141386b);
                    k9 k9Var = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    e0Var.C1(u0.c(new ChargeDescriptionFeatureConfig(aVarB, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), ((d4i.c) aVar2).f111324a)));
                } else {
                    if (!(aVar2 instanceof d4i.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    e0Var.C1(u0.b(e0Var.f141370t.g(((r) e0Var.t2()).f141385a)));
                }
            } else if (obj3 instanceof k5k.g0) {
                k5k.g0 g0Var = (k5k.g0) obj3;
                if (g0Var instanceof k5k.v) {
                    c4i.a aVarB2 = m6i.y.b(((r) e0Var.t2()).f141386b);
                    k9 k9Var2 = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
                    k5k.v vVar = (k5k.v) g0Var;
                    e0Var.C1(u0.c(new InterestDescriptionFeatureConfig(aVarB2, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var2, "value", k9Var2), new InterestDescriptionFeatureConfig.Interest.EstimatedInterest(vVar.f181554a, vVar.f181555b))));
                } else if (g0Var instanceof k5k.u) {
                    c4i.a aVarB3 = m6i.y.b(((r) e0Var.t2()).f141386b);
                    k9 k9Var3 = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator3 = AnalyticsProduct.Retail.CREATOR;
                    k5k.u uVar = (k5k.u) g0Var;
                    e0Var.C1(u0.c(new InterestDescriptionFeatureConfig(aVarB3, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var3, "value", k9Var3), new InterestDescriptionFeatureConfig.Interest.DailyEstimatedInterest(uVar.f181553b, uVar.f181552a))));
                } else if (g0Var instanceof k5k.a0) {
                    c4i.a aVarB4 = m6i.y.b(((r) e0Var.t2()).f141386b);
                    k9 k9Var4 = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator4 = AnalyticsProduct.Retail.CREATOR;
                    k5k.a0 a0Var = (k5k.a0) g0Var;
                    e0Var.C1(u0.c(new InterestDescriptionFeatureConfig(aVarB4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var4, "value", k9Var4), new InterestDescriptionFeatureConfig.Interest.InterestApplies(a0Var.f181526a, a0Var.f181527b, a0Var.f181528c, a0Var.d))));
                } else {
                    int i2 = jli.h.f175850a;
                    Unit unit2 = Unit.f186387a;
                }
            }
        }
        return Unit.f186387a;
    }
}
