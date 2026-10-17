package sx2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_design.impl.card_design.carousel.e f266333w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i, com.revolut.feature.card_design.impl.card_design.carousel.e eVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f266333w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(0, this.f266333w, continuation);
            case 1:
                return new t(1, this.f266333w, continuation);
            default:
                return new t(2, this.f266333w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                com.revolut.feature.card_design.impl.card_design.carousel.e eVar = this.f266333w;
                s sVar = new s(eVar, null);
                this.v = 1;
                Object objB0 = zh9.u0.b0(eVar.X(), "CARD_DESIGN_NEXT_BUTTON_TAG", sVar, this);
                return objB0 == aVar ? aVar : objB0;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    pfm.r rVarB = ((n53.b) this.f266333w.B).b();
                    this.v = 1;
                    if (nim.a.a(rVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
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
                com.revolut.feature.card_design.impl.card_design.carousel.e eVar2 = this.f266333w;
                su4.n nVar = new su4.n(eVar2, null, 2);
                this.v = 1;
                Object objB02 = zh9.u0.b0(eVar2.X(), "CARD_DESIGN_NEXT_BUTTON_TAG", nVar, this);
                return objB02 == aVar3 ? aVar3 : objB02;
        }
    }
}
