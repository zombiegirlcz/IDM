package kye;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.domain.models.topup.methods.CardMethodState;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v2 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ k3 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(k3 k3Var, Continuation continuation) {
        super(2, continuation);
        this.v = k3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        v2 v2Var = new v2(this.v, continuation);
        v2Var.u = obj2;
        return v2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v2) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        SelectedMethod selectedMethodF;
        k3 k3Var = this.v;
        cli.y yVar = k3Var.f190763d0;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Throwable error = data.getError();
        if (error != null && data.getContent() == null) {
            throw error;
        }
        if (data.getLoading() && data.getContent() == null) {
            k3Var.H2(yVar, new m0(14));
        } else {
            TopupMethod topupMethod = (TopupMethod) data.getContent();
            if (topupMethod != null) {
                if (k3Var.f190762b0 && (topupMethod instanceof TopupMethod.StoredMethod.Card)) {
                    TopupMethod.StoredMethod.Card method = (TopupMethod.StoredMethod.Card) topupMethod;
                    String str = method.f60455a;
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h hVar = k3Var.J;
                    m mVar = (m) ((vkm.j2) yVar.f22677a).getValue();
                    SelectedMethod selectedMethod = mVar.f190786s;
                    SelectedMethod.StoredMethod.Card card = selectedMethod instanceof SelectedMethod.StoredMethod.Card ? (SelectedMethod.StoredMethod.Card) selectedMethod : null;
                    boolean zF = Intrinsics.f(str, mVar.F);
                    boolean z = !Intrinsics.f(str, card != null ? card.f90903a : null);
                    if (!zF || card == null) {
                        selectedMethodF = hVar.f(method);
                    } else {
                        CardholderVerificationStatus cardholderVerificationStatus = card.k;
                        hVar.getClass();
                        Intrinsics.checkNotNullParameter(method, "method");
                        String str2 = method.f60455a;
                        TopupMethod.StoredMethod.Card.Restrictions restrictions = method.f60460j;
                        TextClause textClause = new TextClause(method.f60456b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str3 = method.f60457c;
                        selectedMethodF = new SelectedMethod.StoredMethod.Card(str2, textClause, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, hVar.b(method), method.f60458g == null && restrictions == null, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h.a(method.i), method.k == CardMethodState.EXPIRED, restrictions != null, method.f60461l, null, cardholderVerificationStatus);
                    }
                    k3Var.H2(yVar, new gae.a(selectedMethodF, z, 29));
                } else {
                    k3Var.H2(yVar, new kp0.q(k3Var, topupMethod, 26));
                }
            }
        }
        return Unit.f186387a;
    }
}
