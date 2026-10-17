package ad4;

import a9d.p;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$State;
import efm.r;
import ft3.h1;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d f3266w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f3266w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f3266w, continuation, 0);
            case 1:
                return new d(this.f3266w, continuation, 1);
            case 2:
                return new d(this.f3266w, continuation, 2);
            case 3:
                return new d(this.f3266w, continuation, 3);
            case 4:
                return new d(this.f3266w, continuation, 4);
            default:
                return new d(this.f3266w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d dVar = this.f3266w;
                lx3.b bVar = dVar.f67841q;
                h1 h1VarF = w0.F(dVar.f67840p.f67826a);
                this.v = 1;
                Object objA = bVar.a(h1VarF, this);
                return objA == aVar ? aVar : objA;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d dVar2 = this.f3266w;
                d dVar3 = new d(dVar2, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(dVar2.k, "confirm accounts and go next plugin", dVar3, this);
                return objB == aVar2 ? aVar2 : objB;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d dVar4 = this.f3266w;
                lx3.b bVar2 = dVar4.f67841q;
                h1 h1VarF2 = w0.F(dVar4.f67840p.f67826a);
                this.v = 1;
                Object objB2 = bVar2.b(h1VarF2, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                r rVarG = m70.a.g(this.f3266w.f67842r.a(), null, new p(13), 1);
                this.v = 1;
                Object objC = nim.a.c(rVarG, this);
                return objC == aVar4 ? aVar4 : objC;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d dVar5 = this.f3266w;
                d dVar6 = new d(dVar5, null, 3);
                this.v = 1;
                Object objB3 = pu7.a.B(dVar5.k, "get accounts info", dVar6, this);
                return objB3 == aVar5 ? aVar5 : objB3;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.d dVar7 = this.f3266w;
                bd4.b bVar3 = dVar7.f67843s;
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = dVar7.f67840p.f67826a;
                av3.f fVar = ((CreditLinkedAccountsV2FlowContract$State) ((j2) dVar7.v.f22677a).getValue()).f67827a;
                if (fVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                this.v = 1;
                Object objA2 = bVar3.a(creditApplicationPluginFlowContract$Configuration, fVar, this);
                return objA2 == aVar6 ? aVar6 : objA2;
        }
    }
}
