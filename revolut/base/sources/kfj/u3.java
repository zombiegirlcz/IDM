package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkfj/u3;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "activationDate", "b", "allowanceBytes", "", "c", "Z", "()Z", "allowanceBytesUnlimited", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("activationDate")
    private final Long activationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceBytes")
    private final Long allowanceBytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowanceBytesUnlimited")
    private final boolean allowanceBytesUnlimited;

    public u3(Long l2, Long l3, boolean z) {
        this.activationDate = l2;
        this.allowanceBytes = l3;
        this.allowanceBytesUnlimited = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getActivationDate() {
        return this.activationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getAllowanceBytes() {
        return this.allowanceBytes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAllowanceBytesUnlimited() {
        return this.allowanceBytesUnlimited;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) obj2;
        return Intrinsics.f(this.activationDate, u3Var.activationDate) && Intrinsics.f(this.allowanceBytes, u3Var.allowanceBytes) && this.allowanceBytesUnlimited == u3Var.allowanceBytesUnlimited;
    }

    public final int hashCode() {
        Long l2 = this.activationDate;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.allowanceBytes;
        return Boolean.hashCode(this.allowanceBytesUnlimited) + ((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31);
    }
}
