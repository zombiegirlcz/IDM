package mq4;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ x u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, Continuation continuation) {
        super(2, continuation);
        this.u = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVar = this.u;
        if (xVar.v.f69168c == com.revolut.feature.credit.card.api.navigation.a.ADD_MONEY) {
            xVar.B2();
        } else if (((g) ((j2) xVar.f207882w.f22677a).getValue()).d != null) {
            xVar.C2(zl4.d.f323181a);
        }
        return Unit.f186387a;
    }
}
