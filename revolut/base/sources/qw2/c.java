package qw2;

import com.revolut.feature.card_add_to_googlepay.impl.verification.otp.card_security.GooglePayCardSecurityController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import qw2.l;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ GooglePayCardSecurityController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(GooglePayCardSecurityController googlePayCardSecurityController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = googlePayCardSecurityController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        GooglePayCardSecurityController googlePayCardSecurityController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((i) ((j) googlePayCardSecurityController.O.getValue())).C2(l.c.f249757a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) ((j) googlePayCardSecurityController.O.getValue());
                iVar.getClass();
                iVar.n2(new g(iVar, null, 0), new whi.b(6));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) ((j) googlePayCardSecurityController.O.getValue());
                iVar2.getClass();
                iVar2.n2(new g(iVar2, null, 1), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
