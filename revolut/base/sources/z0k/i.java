package z0k;

import com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller.InstrumentNewsController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InstrumentNewsController f318630w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(InstrumentNewsController instrumentNewsController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f318630w = instrumentNewsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f318630w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f318630w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f318630w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((i) create((rzj.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 13;
        Continuation continuation = null;
        InstrumentNewsController instrumentNewsController = this.f318630w;
        switch (i) {
            case 0:
                rzj.f newsArticle = (rzj.f) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) instrumentNewsController.d();
                oVar.getClass();
                Intrinsics.checkNotNullParameter(newsArticle, "newsArticle");
                oVar.n2(new yv1.k(oVar, newsArticle, continuation, 14), new whi.b(6));
                break;
            case 1:
                rzj.j instrument = (rzj.j) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar2 = (o) instrumentNewsController.d();
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                oVar2.n2(new yv1.k(oVar2, instrument, continuation, i2), new whi.b(6));
                break;
            default:
                rzj.j instrument2 = (rzj.j) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar3 = (o) instrumentNewsController.d();
                oVar3.getClass();
                Intrinsics.checkNotNullParameter(instrument2, "instrument");
                oVar3.n2(new yv1.k(oVar3, instrument2, continuation, i2), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
