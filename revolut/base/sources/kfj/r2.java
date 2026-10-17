package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lkfj/r2;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/p2;", "a", "Lkfj/p2;", "()Lkfj/p2;", "authorization", "Lkfj/r1;", "b", "Lkfj/r1;", "()Lkfj/r1;", "resend", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("authorization")
    @NotNull
    private final p2 authorization;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("resend")
    private final r1 resend;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p2 getAuthorization() {
        return this.authorization;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r1 getResend() {
        return this.resend;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.authorization, r2Var.authorization) && Intrinsics.f(this.resend, r2Var.resend);
    }

    public final int hashCode() {
        int iHashCode = this.authorization.hashCode() * 31;
        r1 r1Var = this.resend;
        return iHashCode + (r1Var == null ? 0 : r1Var.hashCode());
    }
}
