package gcc;

import com.revolut.feature.payments.transfers.personalisation.impl.data.service.TransfersPersonalisationService;
import com.revolut.feature.revolutpay.promoted_merchants.impl.data.service.RevolutPayPromotedMerchantsApiService;
import com.revolut.feature.revolutpay.promoted_merchants.models.merchants.MerchantCategoryDetails;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f142399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f142400x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f142400x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i = this.u;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Continuation continuation = (Continuation) obj4;
        switch (i) {
            case 0:
                f fVar = new f((g) this.f142400x, continuation, 0);
                fVar.f142399w = zBooleanValue;
                return fVar.invokeSuspend(Unit.f186387a);
            case 1:
                f fVar2 = new f((g) this.f142400x, continuation, 1);
                fVar2.f142399w = zBooleanValue;
                return fVar2.invokeSuspend(Unit.f186387a);
            default:
                f fVar3 = new f((k2a.d) this.f142400x, continuation, 2);
                fVar3.f142399w = zBooleanValue;
                return fVar3.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                boolean z = this.f142399w;
                Object arrayList = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    RevolutPayPromotedMerchantsApiService revolutPayPromotedMerchantsApiService = ((g) this.f142400x).f142401a;
                    this.f142399w = z;
                    this.v = 1;
                    obj2 = revolutPayPromotedMerchantsApiService.getPromotedMerchantsCategories(z, this);
                    if (obj2 != arrayList) {
                    }
                    return arrayList;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o.b(obj2);
                List<fcc.c> categories = ((fcc.d) obj2).getCategories();
                arrayList = new ArrayList(w.t(categories, 10));
                for (fcc.c cVar : categories) {
                    Intrinsics.checkNotNullParameter(cVar, "<this>");
                    arrayList.add(new MerchantCategoryDetails(cVar.getKey(), cVar.getName()));
                }
                return arrayList;
            case 1:
                boolean z3 = this.f142399w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                RevolutPayPromotedMerchantsApiService revolutPayPromotedMerchantsApiService2 = ((g) this.f142400x).f142401a;
                this.f142399w = z3;
                this.v = 1;
                Object promotedMerchantEligibility = revolutPayPromotedMerchantsApiService2.getPromotedMerchantEligibility(z3, this);
                return promotedMerchantEligibility == aVar ? aVar : promotedMerchantEligibility;
            default:
                boolean z4 = this.f142399w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    TransfersPersonalisationService transfersPersonalisationService = ((k2a.d) this.f142400x).f180450c;
                    String str = z4 ? null : "all";
                    this.f142399w = z4;
                    this.v = 1;
                    obj2 = transfersPersonalisationService.getPersonalisations(str, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return i2a.a.b((List) obj2);
        }
    }
}
