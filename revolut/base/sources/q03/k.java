package q03;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b f241085w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f241085w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(0, this.f241085w, continuation);
            case 1:
                return new k(1, this.f241085w, continuation);
            case 2:
                return new k(2, this.f241085w, continuation);
            case 3:
                return new k(3, this.f241085w, continuation);
            case 4:
                return new k(4, this.f241085w, continuation);
            default:
                return new k(5, this.f241085w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = this.f241085w;
                j jVar = new j(1, bVar, null);
                this.v = 1;
                Object objP2 = bVar.p2(this, jVar);
                return objP2 == aVar ? aVar : objP2;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar2 = this.f241085w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    jhi.b bVarE = ((h0) bVar2.f64912s).e();
                    this.v = 1;
                    obj2 = vkm.q.x(bVarE, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                h93.f0 f0Var = (h93.f0) obj2;
                if (f0Var.N() && !f0Var.x()) {
                    bVar2.n2(new k(0, bVar2, null), new whi.b(6));
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar3 = this.f241085w;
                t tVar = new t(bVar3, null);
                this.v = 1;
                Object objP22 = bVar3.p2(this, tVar);
                return objP22 == aVar3 ? aVar3 : objP22;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar4 = this.f241085w;
                z zVar = new z(bVar4, null);
                this.v = 1;
                Object objB = pu7.a.B(bVar4.k, "replace_mcy_card", zVar, this);
                return objB == aVar4 ? aVar4 : objB;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar5 = this.f241085w;
                    com.revolut.feature.card_management.impl.ui.kompot.settings.a aVar6 = new com.revolut.feature.card_management.impl.ui.kompot.settings.a(bVar5, null);
                    this.v = 1;
                    if (bVar5.p2(this, aVar6) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar6 = this.f241085w;
                j jVar2 = new j(3, bVar6, null);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar6.k, "terminate_mcy_card", jVar2, this);
                return objB2 == aVar7 ? aVar7 : objB2;
        }
    }
}
