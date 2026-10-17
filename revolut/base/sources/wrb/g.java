package wrb;

import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import k4l.p;
import k4l.q0;
import kel.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.x;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f299539w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ del.a f299540x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(del.a aVar, h hVar, Continuation continuation) {
        super(1, continuation);
        this.f299540x = aVar;
        this.f299539w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f299540x, this.f299539w, continuation);
            default:
                return new g(this.f299539w, this.f299540x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                h hVar = this.f299539w;
                if (i == 0) {
                    o.b(obj2);
                    del.a aVar2 = this.f299540x;
                    InstrumentTicker instrumentTicker = aVar2.f;
                    q0 q0Var = (instrumentTicker == null || !x.a(instrumentTicker)) ? q0.MARKET_ON_OPEN : q0.DAY;
                    n nVar = aVar2.e;
                    ufm.i iVarA = hVar.f299543r.a(hVar.o.f83404b, prb.b.a(hVar.f299542q, nVar.e, bfl.g.SELL, new dfl.x(nVar.f183175c), instrumentTicker != null ? instrumentTicker.e : null, null, null, "ADVANCED_CHARTS_SELL_ALL_KEY", q0Var, null, 304));
                    this.v = 1;
                    objB = nim.a.b(iVarA, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                p pVar = (p) objB;
                Intrinsics.h(pVar);
                hVar.C2(new urb.a(pVar));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    del.a aVar4 = this.f299540x;
                    h hVar2 = this.f299539w;
                    g gVar = new g(aVar4, hVar2, (Continuation) null);
                    this.v = 1;
                    if (u0.c0(hVar2, "SELL_ALL_BUTTON_LOADING_TAG", gVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, del.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f299539w = hVar;
        this.f299540x = aVar;
    }
}
