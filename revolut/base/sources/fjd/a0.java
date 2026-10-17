package fjd;

import com.revolut.feature.shops.api.model.ShopsCategory;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.home.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.feature.shops.impl.ui.home.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.v, continuation, 0);
            default:
                return new a0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        int i = this.u;
        com.revolut.feature.shops.impl.ui.home.a aVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ShopsCategory shopsCategory = ((o) ((j2) aVar.Q.f22677a).getValue()).f135583g;
                if (shopsCategory != null && (str = shopsCategory.f87040a) != null) {
                    com.revolut.feature.shops.impl.ui.home.a.K2(aVar, str, true, 4);
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ShopsCategory shopsCategory2 = ((o) ((j2) aVar.Q.f22677a).getValue()).f135583g;
                if (shopsCategory2 != null && (str2 = shopsCategory2.f87040a) != null) {
                    com.revolut.feature.shops.impl.ui.home.a.K2(aVar, str2, true, 4);
                }
                break;
        }
        return Unit.f186387a;
    }
}
