package vc2;

import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f287631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Alias f287632x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(u uVar, Alias alias, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f287631w = uVar;
        this.f287632x = alias;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f287631w, this.f287632x, continuation, 0);
            default:
                return new q(this.f287631w, this.f287632x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        tji.l lVarB;
        switch (this.u) {
            case 0:
                u uVar = this.f287631w;
                v02.c cVar = uVar.f287642s;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Alias alias = this.f287632x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    tw9.h hVar = new tw9.h(uVar, alias, null, 29);
                    this.v = 1;
                    obj2 = uVar.p2(this, hVar);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                zz1.e eVar = (zz1.e) obj2;
                int i2 = eVar == null ? -1 : p.f287630a[eVar.ordinal()];
                if (i2 == -1) {
                    lVarB = ((j12.d) cVar).b();
                } else if (i2 == 1) {
                    lVarB = ((j12.d) cVar).a(alias.f61878a);
                } else if (i2 == 2 || i2 == 3) {
                    lVarB = ((j12.d) cVar).d(ApmQvik.f61823c.e());
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lVarB = ((j12.d) cVar).b();
                }
                return uVar.X1(lVarB);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    u uVar2 = this.f287631w;
                    com.revolut.feature.apm.core.ui.api.navigation.a aVar3 = uVar2.f287639p;
                    Alias alias2 = this.f287632x;
                    RegisterAlias$Alias registerAlias$Alias = new RegisterAlias$Alias(alias2.f61878a, alias2.f61879b);
                    o oVar = new o(uVar2, alias2, 1);
                    this.v = 1;
                    if (aVar3.s0(registerAlias$Alias, ApmAliasRegistrationMode.Add.f62240b, oVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
