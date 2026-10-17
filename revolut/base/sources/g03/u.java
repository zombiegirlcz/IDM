package g03;

import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b f139278w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139278w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f139278w, continuation, 0);
            case 1:
                return new u(this.f139278w, continuation, 1);
            case 2:
                return new u(this.f139278w, continuation, 2);
            case 3:
                return new u(this.f139278w, continuation, 3);
            case 4:
                return new u(this.f139278w, continuation, 4);
            default:
                return new u(this.f139278w, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((u) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar = this.f139278w;
                t tVar = new t(bVar, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "create_or_get_disposable_card", tVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar2 = this.f139278w;
                t tVar2 = new t(bVar2, null, 1);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar2.k, "check_legal_and_regenerate", tVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
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
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar3 = this.f139278w;
                t tVar3 = new t(bVar3, null, 3);
                this.v = 1;
                Object objB3 = pu7.a.B(bVar3.k, "create_or_get_disposable_card", tVar3, this);
                return objB3 == aVar3 ? aVar3 : objB3;
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
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar4 = this.f139278w;
                t tVar4 = new t(bVar4, null, 4);
                this.v = 1;
                Object objB4 = pu7.a.B(bVar4.k, "regenerate_card_details", tVar4, this);
                return objB4 == aVar4 ? aVar4 : objB4;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar5 = this.f139278w;
                    f03.a aVar6 = bVar5.u;
                    f0 f0Var = ((a) ((j2) bVar5.B.f22677a).getValue()).f139254b;
                    this.v = 1;
                    if (aVar6.b3(f0Var) == aVar5) {
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
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar6 = this.f139278w;
                t tVar5 = new t(bVar6, null, 6);
                this.v = 1;
                Object objB5 = pu7.a.B(bVar6.k, "hide_disposable_placeholder", tVar5, this);
                return objB5 == aVar7 ? aVar7 : objB5;
        }
    }
}
