package aw1;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Alias f10660w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Alias alias, Continuation continuation) {
        super(1, continuation);
        this.v = qVar;
        this.f10660w = alias;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f10660w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            q qVar = this.v;
            com.revolut.feature.apm.core.ui.api.navigation.a aVar2 = qVar.f10662q;
            Alias alias = this.f10660w;
            RegisterAlias$Alias registerAlias$Alias = new RegisterAlias$Alias(alias.f61878a, alias.f61879b);
            ApmAliasRegistrationMode.Add add2 = ApmAliasRegistrationMode.Add.f62240b;
            auj.o oVar = new auj.o(qVar, 10);
            this.u = 1;
            if (aVar2.s0(registerAlias$Alias, add2, oVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
