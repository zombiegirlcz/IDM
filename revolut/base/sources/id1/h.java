package id1;

import com.revolut.feature.revpro.lite_pos.impl.data.repository.CatalogueDataProviderImpl;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f160390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f160391x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f160392y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(n nVar, String str, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160390w = nVar;
        this.f160391x = str;
        this.f160392y = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f160390w, this.f160391x, this.f160392y, continuation, 0);
            default:
                return new h(this.f160390w, this.f160391x, this.f160392y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                CatalogueDataProviderImpl catalogueDataProviderImpl = this.f160390w.f160404c;
                String name = this.f160391x;
                Intrinsics.checkNotNullParameter(name, "name");
                String color = this.f160392y;
                Intrinsics.checkNotNullParameter(color, "color");
                zc1.j jVar = new zc1.j(name, a0.d.x("color", color));
                this.v = 1;
                Object objCreateCategory = catalogueDataProviderImpl.f84763a.createCategory(jVar, this);
                return objCreateCategory == aVar ? aVar : objCreateCategory;
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
                CatalogueDataProviderImpl catalogueDataProviderImpl2 = this.f160390w.f160404c;
                BigDecimal bigDecimal = new BigDecimal(this.f160392y);
                String str = this.f160391x;
                zc1.l lVar = new zc1.l(str, str, bigDecimal);
                this.v = 1;
                Object objCreateTaxRate = catalogueDataProviderImpl2.f84763a.createTaxRate(lVar, this);
                return objCreateTaxRate == aVar2 ? aVar2 : objCreateTaxRate;
        }
    }
}
