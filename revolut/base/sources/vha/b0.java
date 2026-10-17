package vha;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.pro.accounts.impl.ProAccountsProductMapper$SubtitleAction$CashbackAction;
import com.revolut.feature.pro.accounts.impl.ProAccountsProductMapper$SubtitleAction$PendingAmountAction;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class b0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f289355w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(q0 q0Var, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.v = q0Var;
        this.f289355w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b0(this.v, this.f289355w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objZ;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q0 q0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s sVar = q0Var.o;
            sVar.getClass();
            w4l.j loadingStrategy = w4l.j.f294644c;
            Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
            jhi.b bVarG = mo3.a.g(((et6.g) sVar.f289431h).d(loadingStrategy), null, null, 3);
            this.u = 1;
            objZ = vkm.q.z(bVarG, this);
            if (objZ == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objZ = obj2;
        }
        FreelancerAccountOnboardingState freelancerAccountOnboardingState = (FreelancerAccountOnboardingState) objZ;
        if (pd.b.k(freelancerAccountOnboardingState != null ? Boolean.valueOf(freelancerAccountOnboardingState instanceof FreelancerAccountOnboardingState.Pending) : null)) {
            q0Var.V2(new p0(q0Var, null), new yi5.b(29));
            return Unit.f186387a;
        }
        Object obj3 = this.f289355w;
        if (obj3 instanceof ProAccountsProductMapper$SubtitleAction$PendingAmountAction) {
            ((ct6.t) q0Var.f289416m).getClass();
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.freelancer_pending_amount_explainer_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_pending_amount_explainer_subtitle, null, null, 14), null, null, false, 28);
            aw0.h hVar = new aw0.h(false, new n6(new TextLocalisedClause(R$string.freelancer_pending_amount_explainer_action_see_payments, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), new n6(new TextLocalisedClause(R$string.freelancer_pending_amount_explainer_action_learn_more, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1016), null, null, null, 121);
            k9 k9Var = k9.Freelancer;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            q0Var.N2(new ActionsBottomSheetController(new dii.a(aVar2, hVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new t(q0Var, 0));
        } else if (obj3 instanceof ProAccountsProductMapper$SubtitleAction$CashbackAction) {
            q0Var.A2(new FreelancerBizFeatureConfig.Cashback(com.revolut.feature.freelancer.api.navigation.a.DETAILS));
        }
        return Unit.f186387a;
    }
}
