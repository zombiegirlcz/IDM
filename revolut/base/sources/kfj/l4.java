package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\f\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000e\u0010\b¨\u0006\u0010"}, d2 = {"Lkfj/l4;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/o4;", "a", "Lkfj/o4;", "()Lkfj/o4;", "getLocal$annotations", "()V", "local", "b", "primary", "c", "roaming", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("local")
    private final o4 local;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("primary")
    private final o4 primary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("roaming")
    private final o4 roaming;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o4 getLocal() {
        return this.local;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o4 getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final o4 getRoaming() {
        return this.roaming;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj2;
        return Intrinsics.f(this.local, l4Var.local) && Intrinsics.f(this.primary, l4Var.primary) && Intrinsics.f(this.roaming, l4Var.roaming);
    }

    public final int hashCode() {
        o4 o4Var = this.local;
        int iHashCode = (o4Var == null ? 0 : o4Var.hashCode()) * 31;
        o4 o4Var2 = this.primary;
        int iHashCode2 = (iHashCode + (o4Var2 == null ? 0 : o4Var2.hashCode())) * 31;
        o4 o4Var3 = this.roaming;
        return iHashCode2 + (o4Var3 != null ? o4Var3.hashCode() : 0);
    }
}
