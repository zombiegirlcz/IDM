package l8a;

import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationTypeDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Ll8a/t0;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "a", "Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "()Lcom/revolut/data/network/models/beneficiary/BeneficiaryIdentificationTypeDto;", "type", "b", "Ljava/lang/String;", "value", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final BeneficiaryIdentificationTypeDto type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final String value;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BeneficiaryIdentificationTypeDto getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return this.type == t0Var.type && Intrinsics.f(this.value, t0Var.value);
    }

    public final int hashCode() {
        BeneficiaryIdentificationTypeDto beneficiaryIdentificationTypeDto = this.type;
        int iHashCode = (beneficiaryIdentificationTypeDto == null ? 0 : beneficiaryIdentificationTypeDto.hashCode()) * 31;
        String str = this.value;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
