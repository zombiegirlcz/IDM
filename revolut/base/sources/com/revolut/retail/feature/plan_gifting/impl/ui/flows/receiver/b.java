package com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.a;
import egk.e;
import gim.i;
import kbk.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import org.joda.time.Period;
import yhm.o;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        j0 j0Var;
        a aVar = (a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean zF = Intrinsics.f(aVar, a.C0627a.f102470a);
        d dVar = this.v;
        if (zF) {
            d.J2(dVar, aVar);
        } else {
            if (!(aVar instanceof zbk.d)) {
                throw new NoWhenBranchMatchedException();
            }
            zbk.d dVar2 = (zbk.d) aVar;
            ick.b bVar = dVar.f102473p;
            f giftClaimingResult = dVar2.f320956a;
            PricingPlanSubscription giftedSubscription = dVar2.f320957b;
            e eVar = bVar.f160294a;
            Intrinsics.checkNotNullParameter(giftedSubscription, "giftedSubscription");
            Intrinsics.checkNotNullParameter(giftClaimingResult, "giftClaimingResult");
            Continuation continuation = null;
            if (giftClaimingResult.f182622a == null) {
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.plan_gifting_claiming_dialog_success_title, u.c(e.a(eVar, giftedSubscription.f81129a)), null, 12);
                Period period = giftedSubscription.d;
                j0Var = new j0((Clause) textLocalisedClause, (Clause) new TextLocalisedClause(Intrinsics.f(period, jli.e.f175845h) ? R$string.plan_gifting_claiming_dialog_success_subtitle_monthly : Intrinsics.f(period, jli.e.f175842b) ? R$string.plan_gifting_claiming_dialog_success_subtitle_annual : R$string.plan_gifting_claiming_dialog_success_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            } else {
                Clause clauseA = e.a(eVar, giftedSubscription.f81129a);
                j0Var = new j0((Clause) new TextLocalisedClause(R$string.plan_gifting_claiming_dialog_success_title, u.c(clauseA), null, 12), (Clause) new TextLocalisedClause(R$string.plan_gifting_claiming_dialog_success_after_expiration_subtitle, u.c(clauseA), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
            }
            l.a1(dVar, dVar.X1(new y0(null, j0Var, false, 5)), null, null, new yy6.f(dVar, aVar, continuation, 27), 3);
        }
        return Unit.f186387a;
    }
}
