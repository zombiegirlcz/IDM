package zz9;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i, com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k0(0, this.v, continuation);
            default:
                return new k0(1, this.v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k0) create((e0a.g0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = this.v;
                e0a.b0 b0Var = dVar.f79781s;
                cli.y yVar = dVar.I;
                String textMessage = ((q) ((j2) yVar.f22677a).getValue()).d;
                zm3.a contact = ((q) ((j2) yVar.f22677a).getValue()).f326625a;
                b0Var.getClass();
                Intrinsics.checkNotNullParameter(textMessage, "textMessage");
                Intrinsics.checkNotNullParameter(contact, "contact");
                b0Var.T2(new e0a.a0(b0Var, textMessage, contact, null), new yi5.b(27));
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                this.v.H = true;
                break;
        }
        return Unit.f186387a;
    }
}
