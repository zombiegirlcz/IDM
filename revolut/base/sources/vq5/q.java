package vq5;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function1 {
    public com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a f291334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ wi0.b f291335x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar, wi0.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f291334w = aVar;
        this.f291335x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.f291334w, this.f291335x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a aVar3 = this.f291334w;
            mre.c cVar = aVar3.v;
            TermsScope.INSTANCE.getClass();
            ufm.i iVarC = ((rre.d) cVar).c(TermsScope.o, this.f291335x);
            this.u = aVar3;
            this.v = 1;
            Object objB = nim.a.b(iVarC, this);
            if (objB == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return aVar.C1(u0.b((NaviCommand) obj2));
    }
}
