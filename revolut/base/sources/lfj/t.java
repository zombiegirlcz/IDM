package lfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Llfj/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRefundToken", "refundToken", "b", "getReason", "reason", "c", "getReasonDescription", "reasonDescription", "d", "getCancellationMode", "cancellationMode", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("refundToken")
    @NotNull
    private final String refundToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    private final String reason;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("reasonDescription")
    private final String reasonDescription;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cancellationMode")
    private final String cancellationMode;

    public t(String refundToken, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(refundToken, "refundToken");
        this.refundToken = refundToken;
        this.reason = str;
        this.reasonDescription = str2;
        this.cancellationMode = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.refundToken, tVar.refundToken) && Intrinsics.f(this.reason, tVar.reason) && Intrinsics.f(this.reasonDescription, tVar.reasonDescription) && Intrinsics.f(this.cancellationMode, tVar.cancellationMode);
    }

    public final int hashCode() {
        int iHashCode = this.refundToken.hashCode() * 31;
        String str = this.reason;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reasonDescription;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cancellationMode;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
