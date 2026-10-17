package ikf;

import akf.t1;
import akf.u1;
import akf.v1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transactions.impl.R$string;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$SendToPayerData;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.SendToPayerEligibility$State;
import java.util.List;
import klf.j1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oim.n;
import tof.a3;
import tof.r1;
import tof.t3;
import tof.w6;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements n {
    public int u;
    public /* synthetic */ t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ a3 f161956w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ j1 f161957x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f161958y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(4, continuation);
        this.f161958y = jVar;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        i iVar = new i(this.f161958y, (Continuation) obj5);
        iVar.v = (t3) obj2;
        iVar.f161956w = (a3) obj3;
        iVar.f161957x = (j1) obj4;
        return iVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        t3 t3Var = this.v;
        a3 a3Var = this.f161956w;
        j1 j1Var = this.f161957x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.f161958y;
        ActionsView.Item item = null;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.c cVar = jVar.f161961n;
            w6 w6Var = a3Var.f272602n0;
            r1 r1Var = t3Var != null ? t3Var.q0 : null;
            String str = t3Var != null ? t3Var.p0 : null;
            this.v = null;
            this.f161956w = a3Var;
            this.f161957x = null;
            this.u = 1;
            objB = cVar.b(w6Var, r1Var, str, j1Var, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objB = obj2;
        }
        SendToPayerEligibility$State sendToPayerEligibilityState = (SendToPayerEligibility$State) objB;
        com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.topup.a aVar2 = jVar.o;
        String str2 = a3Var.F0;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(sendToPayerEligibilityState, "sendToPayerEligibilityState");
        if (!Intrinsics.f(sendToPayerEligibilityState, SendToPayerEligibility$State.Disabled.f92099a)) {
            if (!(sendToPayerEligibilityState instanceof SendToPayerEligibility$State.Enabled)) {
                throw new NoWhenBranchMatchedException();
            }
            u1 u1Var = v1.Companion;
            t1 t1Var = t1.SEND_TO_PAYER;
            u1Var.getClass();
            item = new ActionsView.Item(u1.a(t1Var), mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_actions_send, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_send, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, new SendToPayerEligibility$SendToPayerData((SendToPayerEligibility$State.Enabled) sendToPayerEligibilityState, str2), null, 24476);
        }
        return v.l(item);
    }
}
