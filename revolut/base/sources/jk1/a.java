package jk1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0005\u0010\f¨\u0006\u0010"}, d2 = {"Ljk1/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "paymentCode", "", "J", "getCodeValidityStartTime", "()J", "codeValidityStartTime", "c", "codeExpiryTime", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("paymentCode")
    @NotNull
    private final String paymentCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("codeValidityStartTime")
    private final long codeValidityStartTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("codeExpiryTime")
    private final long codeExpiryTime;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCodeExpiryTime() {
        return this.codeExpiryTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPaymentCode() {
        return this.paymentCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.paymentCode, aVar.paymentCode) && this.codeValidityStartTime == aVar.codeValidityStartTime && this.codeExpiryTime == aVar.codeExpiryTime;
    }

    public final int hashCode() {
        return Long.hashCode(this.codeExpiryTime) + a0.d.c(this.paymentCode.hashCode() * 31, 31, this.codeValidityStartTime);
    }
}
