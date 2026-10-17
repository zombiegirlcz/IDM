package epc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import gim.i;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f128145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TransferSubjectId f128146x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ dj0.d f128147y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, TransferSubjectId transferSubjectId, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.f128145w = hVar;
        this.f128146x = transferSubjectId;
        this.f128147y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.f128145w, this.f128146x, this.f128147y, continuation);
        eVar.v = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((TradingAccount.Robo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        TradingAccount.Robo robo = (TradingAccount.Robo) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        h hVar = this.f128145w;
        if (i == 0) {
            o.b(obj2);
            this.v = robo;
            this.u = 1;
            objA = h.a(hVar, robo, this.f128146x, this.f128147y, this);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objA = obj2;
        }
        Clause clause = (Clause) objA;
        TextLocalisedClause textLocalisedClause = (hVar.f128153a.f221389a == null || robo == null) ? null : new TextLocalisedClause(R$string.wealth_robo_onboarding_add_money_success_status_description_offer_recurring_deposit, null, null, 14);
        u1 w1Var = hVar.f128153a.f221389a != null ? new w1(new TextLocalisedClause(R$string.wealth_robo_onboarding_add_money_add_recurring_deposit_button, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_common_got_it, null, null, 14)) : u1.b.f216225a;
        k9 k9Var = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new j0(clause, (Clause) textLocalisedClause, (StatusDialogDescriptionProgress) null, (Parcelable) null, w1Var, false, (AnalyticsProduct) com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4012);
    }
}
