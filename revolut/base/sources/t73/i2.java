package t73;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class i2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268481w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f268481w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i2 i2Var = new i2(this.f268481w, continuation, 0);
                i2Var.v = obj2;
                return i2Var;
            case 1:
                i2 i2Var2 = new i2(this.f268481w, continuation, 1);
                i2Var2.v = obj2;
                return i2Var2;
            case 2:
                i2 i2Var3 = new i2(this.f268481w, continuation, 2);
                i2Var3.v = obj2;
                return i2Var3;
            case 3:
                i2 i2Var4 = new i2(this.f268481w, continuation, 3);
                i2Var4.v = obj2;
                return i2Var4;
            default:
                i2 i2Var5 = new i2(this.f268481w, continuation, 4);
                i2Var5.v = obj2;
                return i2Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i2) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i2) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((i2) create((s63.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((i2) create((h93.f0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i2) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268481w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.f65434h0, new t05.v(data, 16));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.f65434h0, new t05.v(data2, 17));
                break;
            case 2:
                s63.g gVar2 = (s63.g) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.f65434h0, new t5e.m(gVar, gVar2));
                break;
            case 3:
                h93.f0 f0Var = (h93.f0) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.f65434h0, new avc.o(f0Var, 20));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                gVar.H2(gVar.f65434h0, new t05.v(data3, 18));
                break;
        }
        return Unit.f186387a;
    }
}
