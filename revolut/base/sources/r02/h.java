package r02;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lr02/h;", "", "", "toString", "()Ljava/lang/String;", "Lt02/b;", "a", "Lt02/b;", "getMerchant", "()Lt02/b;", "merchant", "b", "Ljava/lang/String;", "getBeneficiaryId", "beneficiaryId", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("merchant")
    private final t02.b merchant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("beneficiaryId")
    private final String beneficiaryId;

    public h() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.merchant, hVar.merchant) && Intrinsics.f(this.beneficiaryId, hVar.beneficiaryId);
    }

    public final int hashCode() {
        t02.b bVar = this.merchant;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.beneficiaryId;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public h(t02.b bVar, String str) {
        this.merchant = bVar;
        this.beneficiaryId = str;
    }
}
