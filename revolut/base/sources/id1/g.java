package id1;

import com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f160389w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160389w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f160389w, continuation, 0);
            case 1:
                return new g(this.f160389w, continuation, 1);
            case 2:
                return new g(this.f160389w, continuation, 2);
            default:
                return new g(this.f160389w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                CatalogueDataProviderImpl catalogueDataProviderImpl = this.f160389w.f160404c;
                this.v = 1;
                Object categories = catalogueDataProviderImpl.f84763a.getCategories(this);
                return categories == aVar ? aVar : categories;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CatalogueDataProviderImpl catalogueDataProviderImpl2 = this.f160389w.f160404c;
                this.v = 1;
                Object products = catalogueDataProviderImpl2.f84763a.getProducts(this);
                return products == aVar2 ? aVar2 : products;
            case 2:
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
                CatalogueDataProviderImpl catalogueDataProviderImpl3 = this.f160389w.f160404c;
                this.v = 1;
                Object taxRatesSettings = catalogueDataProviderImpl3.f84763a.getTaxRatesSettings(this);
                return taxRatesSettings == aVar3 ? aVar3 : taxRatesSettings;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                CatalogueDataProviderImpl catalogueDataProviderImpl4 = this.f160389w.f160404c;
                this.v = 1;
                Object taxRates = catalogueDataProviderImpl4.f84763a.getTaxRates(this);
                return taxRates == aVar4 ? aVar4 : taxRates;
        }
    }
}
