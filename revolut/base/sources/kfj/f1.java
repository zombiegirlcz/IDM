package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lkfj/f1;", "", "", "toString", "()Ljava/lang/String;", "Lkfj/c1;", "a", "Lkfj/c1;", "()Lkfj/c1;", "pac", "Lkfj/g2;", "b", "Lkfj/g2;", "()Lkfj/g2;", "stac", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pac")
    private final c1 pac;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("stac")
    private final g2 stac;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c1 getPac() {
        return this.pac;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g2 getStac() {
        return this.stac;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj2;
        return Intrinsics.f(this.pac, f1Var.pac) && Intrinsics.f(this.stac, f1Var.stac);
    }

    public final int hashCode() {
        c1 c1Var = this.pac;
        int iHashCode = (c1Var == null ? 0 : c1Var.hashCode()) * 31;
        g2 g2Var = this.stac;
        return iHashCode + (g2Var != null ? g2Var.hashCode() : 0);
    }
}
