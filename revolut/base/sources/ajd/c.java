package ajd;

import com.revolut.feature.shops.impl.ui.combined_search.ShopsCombinedSearchScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ShopsCombinedSearchScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ShopsCombinedSearchScreen shopsCombinedSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = shopsCombinedSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ShopsCombinedSearchScreen shopsCombinedSearchScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) shopsCombinedSearchScreen.T2();
                String str = sVar.f5558x;
                if (str != null && !d0.W(str)) {
                    sVar.n2(new ad4.c(sVar, str, null, 18), new whi.b(6));
                }
                sVar.u2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar2 = (s) shopsCombinedSearchScreen.T2();
                String str2 = sVar2.f5558x;
                if (str2 != null && !d0.W(str2)) {
                    sVar2.n2(new ad4.c(sVar2, str2, null, 18), new whi.b(6));
                }
                sVar2.u2();
                break;
        }
        return Unit.f186387a;
    }
}
