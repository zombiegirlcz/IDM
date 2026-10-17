package id1;

import com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f160398w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f160399x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f160400y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, String str, String str2, String str3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160398w = nVar;
        this.f160399x = str;
        this.f160400y = str2;
        this.z = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f160398w, this.f160399x, this.f160400y, this.z, continuation, 0);
            default:
                return new l(this.f160398w, this.f160399x, this.f160400y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                CatalogueDataProviderImpl catalogueDataProviderImpl = this.f160398w.f160404c;
                String name = this.f160400y;
                Intrinsics.checkNotNullParameter(name, "name");
                String color = this.z;
                Intrinsics.checkNotNullParameter(color, "color");
                zc1.j jVar = new zc1.j(name, a0.d.x("color", color));
                this.v = 1;
                Object objUpdateCategory = catalogueDataProviderImpl.f84763a.updateCategory(this.f160399x, jVar, this);
                return objUpdateCategory == aVar ? aVar : objUpdateCategory;
            default:
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
                CatalogueDataProviderImpl catalogueDataProviderImpl2 = this.f160398w.f160404c;
                BigDecimal bigDecimal = new BigDecimal(this.z);
                String str = this.f160400y;
                zc1.l lVar = new zc1.l(str, str, bigDecimal);
                this.v = 1;
                Object objUpdateTaxRate = catalogueDataProviderImpl2.f84763a.updateTaxRate(this.f160399x, lVar, this);
                return objUpdateTaxRate == aVar2 ? aVar2 : objUpdateTaxRate;
        }
    }
}
