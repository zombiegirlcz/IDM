package fjd;

import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import com.revolut.feature.shops.api.model.ShopsFrozenOffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shops.impl.ui.home.a f135601w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ShopsContext f135602x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.shops.impl.ui.home.a aVar, ShopsContext shopsContext, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f135601w = aVar;
        this.f135602x = shopsContext;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f135601w, this.f135602x, continuation, 0);
            default:
                return new y(this.f135601w, this.f135602x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                wli.x xVar = this.f135601w.B;
                String str = ((ShopsDeeplinkOffer) this.f135602x).f87042a;
                lg0.a aVar2 = lg0.a.OPEN_BROWSER;
                Boolean bool = Boolean.FALSE;
                this.v = 1;
                Object objL1 = xVar.L1(str, aVar2, bool, this);
                return objL1 == aVar ? aVar : objL1;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wli.x xVar2 = this.f135601w.B;
                String str2 = ((ShopsFrozenOffer) this.f135602x).f87049c;
                Boolean bool2 = Boolean.FALSE;
                this.v = 1;
                Object objX1 = lg0.b.x1(xVar2, str2, null, bool2, this, 2);
                return objX1 == aVar3 ? aVar3 : objX1;
        }
    }
}
