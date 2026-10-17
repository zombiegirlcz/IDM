package n84;

import com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.CreditPostActivationWaitingFlowContract$DomainState;
import d67.s;
import d67.u;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a f213197b;

    public /* synthetic */ c(com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a aVar, int i) {
        this.f213196a = i;
        this.f213197b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f213196a;
        com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting.a aVar = this.f213197b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it8, h0Var);
                aVar.I2();
                return Boolean.TRUE;
            case 1:
                CreditPostActivationWaitingFlowContract$DomainState update = (CreditPostActivationWaitingFlowContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                qki.d dVar = aVar.f67411q;
                return CreditPostActivationWaitingFlowContract$DomainState.a((CreditPostActivationWaitingFlowContract$DomainState) ((j2) dVar.f22677a).getValue(), ((CreditPostActivationWaitingFlowContract$DomainState) ((j2) dVar.f22677a).getValue()).f67405a + 1, 0, 0, null, null, 30);
            case 2:
                u outputData = (u) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof s) {
                    aVar.I2();
                }
                return Unit.f186387a;
            default:
                return CreditPostActivationWaitingFlowContract$DomainState.a((CreditPostActivationWaitingFlowContract$DomainState) ((j2) aVar.f67411q.f22677a).getValue(), 0, 0, 0, null, null, 30);
        }
    }
}
