package oc9;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.qes_terms.QesTermsScreen;
import com.revolut.kompot.common.flow.permissions.PermissionsFlow;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Explanation;
import com.revolut.kompot.common.flow.permissions.PermissionsFlowContract$Permission;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ QesTermsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(QesTermsScreen qesTermsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = qesTermsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.v, continuation, 0);
            case 1:
                return new r(this.v, continuation, 1);
            default:
                return new r(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        QesTermsScreen qesTermsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qesTermsScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0 b0Var = (b0) qesTermsScreen.d();
                Continuation continuation = null;
                if (b0Var.f224135r.f78551c) {
                    yji.l.i2(b0Var, new PermissionsFlow(zhm.u.c(new PermissionsFlowContract$Permission("android.permission.ACCESS_FINE_LOCATION", new PermissionsFlowContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.qes_location_introduction_title, null, null, 14), new TextLocalisedClause(R$string.qes_location_introduction_message, null, null, 14), new TextLocalisedClause(R$string.qes_location_introduction_action, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D009", null, null, null, 30), (TextClause) null, 48), new PermissionsFlowContract$Explanation.PromptScreen(new TextLocalisedClause(R$string.qes_location_explanation_title, null, null, 14), new TextLocalisedClause(R$string.qes_location_explanation_message, null, null, 14), new TextLocalisedClause(R$string.qes_location_explanation_action, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D009", null, null, null, 30), (TextClause) null, 48), true))), null, new o9h.b(b0Var, 11), 1);
                } else {
                    b0Var.l2(new nt4.f(b0Var, continuation, 17), new yi5.b(26));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                QesTermsScreen.Companion aVar4 = QesTermsScreen.INSTANCE;
                qesTermsScreen.d3().f213609b.setExpanded(false);
                ?? r110 = qesTermsScreen.X;
                ((dli.c) r110.getValue()).h().scrollToPosition(((dli.c) r110.getValue()).w().getItemCount() - 1);
                break;
        }
        return Unit.f186387a;
    }
}
