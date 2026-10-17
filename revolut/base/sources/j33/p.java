package j33;

import cli.y;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.k0;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b f170952w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f170952w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f170952w, continuation, 0);
            case 1:
                return new p(this.f170952w, continuation, 1);
            default:
                return new p(this.f170952w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b bVar = this.f170952w;
                    com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.a aVar2 = new com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.a(bVar, null);
                    this.v = 1;
                    if (u0.b0(bVar.X(), "CHANGE_CARD_HOLDER_NAME_BUTTON_TAG", aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b bVar2 = this.f170952w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z43.a aVar4 = bVar2.o;
                    this.v = 1;
                    obj2 = ((n53.b) aVar4).a(this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar2.H2(bVar2.f65200r, new be3.l(2, (Image) obj2));
                return Unit.f186387a;
            default:
                com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b bVar3 = this.f170952w;
                y yVar = bVar3.f65200r;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(800L, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        bVar3.H2(yVar, new j1.e(18));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                bVar3.H2(yVar, new j1.e(17));
                this.v = 2;
                if (k0.b(1000L, this) == aVar5) {
                    return aVar5;
                }
                bVar3.H2(yVar, new j1.e(18));
                return Unit.f186387a;
        }
    }
}
