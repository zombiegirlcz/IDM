package r21;

import com.revolut.data.network.models.beneficiary.BeneficiaryPdaDto;
import com.revolut.data.network.models.beneficiary.mapper.BeneficiaryResponseMapperKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g extends q implements Function1 {
    public static final g f = new g();

    public g() {
        super(1, BeneficiaryResponseMapperKt.class, "toDomain", "toDomain(Lcom/revolut/data/network/models/beneficiary/BeneficiaryPdaDto;)Lcom/revolut/domain/models/beneficiary/BeneficiaryPdaStatus;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BeneficiaryPdaDto p0 = (BeneficiaryPdaDto) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return BeneficiaryResponseMapperKt.toDomain(p0);
    }
}
