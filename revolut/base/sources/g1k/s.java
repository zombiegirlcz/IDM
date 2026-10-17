package g1k;

import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.WealthAllNewsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ WealthAllNewsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(WealthAllNewsScreen wealthAllNewsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = wealthAllNewsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.v, continuation, 0);
            default:
                return new s(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        WealthAllNewsScreen wealthAllNewsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) wealthAllNewsScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b bVar = (com.revolut.retail.feature.marketnews.impl.ui.wealthnews.all_news.b) wealthAllNewsScreen.e3();
                bVar.getClass();
                bVar.n2(new h(bVar, null, 0), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
