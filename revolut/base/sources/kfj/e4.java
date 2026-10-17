package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lkfj/e4;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "changeable", "b", "enabled", "", "c", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expiresAt", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("changeable")
    private final boolean changeable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final boolean enabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiresAt")
    private final Long expiresAt;

    public e4(boolean z, boolean z3, Long l2) {
        this.changeable = z;
        this.enabled = z3;
        this.expiresAt = l2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getChangeable() {
        return this.changeable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getExpiresAt() {
        return this.expiresAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj2;
        return this.changeable == e4Var.changeable && this.enabled == e4Var.enabled && Intrinsics.f(this.expiresAt, e4Var.expiresAt);
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.changeable) * 31, 31, this.enabled);
        Long l2 = this.expiresAt;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
