package t73;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class t2 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268544w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h93.f0 f268545x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Function0 f268546y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, h93.f0 f0Var, Function0 function0, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f268544w = gVar;
        this.f268545x = f0Var;
        this.f268546y = function0;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t2(this.f268544w, this.f268545x, this.f268546y, continuation, 0);
            default:
                return new t2(this.f268544w, this.f268545x, this.f268546y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t2) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    pfm.h hVarG = ((ha3.x) this.f268544w.B).G(this.f268545x.f150110a);
                    this.v = 1;
                    if (nim.a.a(hVarG, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                this.f268546y.invoke();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268544w;
                    t2 t2Var = new t2(gVar, this.f268545x, this.f268546y, null, 0);
                    this.v = 1;
                    if (gVar.p2(this, t2Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
