package vha;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class p0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ q0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, Continuation continuation) {
        super(2, continuation);
        this.v = q0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q0 q0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.b kyc2 = q0Var.o.f.getKyc();
            this.u = 1;
            obj2 = nim.a.b(kyc2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        yji.n.P2(q0Var, ((ct6.v) q0Var.u).b(R$drawable.uikit_icn_24_cross, ngm.n.p(((yt8.c) obj2).f316662a)), ModalDestination.Style.POPUP.f98311a, null, 2);
        return Unit.f186387a;
    }
}
