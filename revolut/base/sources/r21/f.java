package r21;

import com.revolut.data.database.models.beneficiary.mapper.BeneficiaryEntityMapperKt;
import com.revolut.data.network.models.beneficiary.BeneficiaryConfirmationResponseDto;
import com.revolut.data.network.models.beneficiary.BeneficiaryDto;
import com.revolut.data.network.models.beneficiary.mapper.BeneficiaryResponseMapperKt;
import com.revolut.data.network.services.BeneficiaryService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f251035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f251036x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251035w = hVar;
        this.f251036x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f251035w, this.f251036x, continuation, 0);
            default:
                return new f(this.f251035w, this.f251036x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                h hVar = this.f251035w;
                v11.b bVar = hVar.f251038b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    String str = this.f251036x;
                    f5j.a aVarB = bVar.b(str);
                    if (aVarB != null) {
                        return aVarB;
                    }
                    BeneficiaryService beneficiaryService = hVar.f251037a;
                    this.v = 1;
                    obj2 = beneficiaryService.getBeneficiary(str, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                f5j.a domain$default = BeneficiaryEntityMapperKt.toDomain$default((BeneficiaryDto) obj2, 0, 0L, null, 7, null);
                bVar.d(domain$default);
                return domain$default;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    BeneficiaryService beneficiaryService2 = this.f251035w.f251037a;
                    this.v = 1;
                    obj2 = beneficiaryService2.getBeneficiaryCop(this.f251036x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return BeneficiaryResponseMapperKt.toDomain((BeneficiaryConfirmationResponseDto) obj2);
        }
    }
}
