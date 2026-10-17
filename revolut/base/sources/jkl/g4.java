package jkl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0015"}, d2 = {"Ljkl/g4;", "Ljkl/i4;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "remainingAttempts", "Ljkl/i;", "b", "Ljkl/i;", "()Ljkl/i;", "method", "getCode", "code", "d", "Ljava/lang/String;", "message", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g4 implements i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("remainingAttempts")
    private final Integer remainingAttempts;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("method")
    private final i method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final Integer code;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i getMethod() {
        return this.method;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getRemainingAttempts() {
        return this.remainingAttempts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj2;
        return Intrinsics.f(this.remainingAttempts, g4Var.remainingAttempts) && this.method == g4Var.method && Intrinsics.f(this.code, g4Var.code) && Intrinsics.f(this.message, g4Var.message);
    }

    public final int hashCode() {
        Integer num = this.remainingAttempts;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        i iVar = this.method;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Integer num2 = this.code;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.message;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }
}
