package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lnx4/y2;", "Lnx4/m0;", "", "toString", "()Ljava/lang/String;", "Lnx4/i1;", "a", "Lnx4/i1;", "()Lnx4/i1;", "left", "b", "right", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y2 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("left")
    @NotNull
    private final i1 left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("right")
    @NotNull
    private final i1 right;

    public y2(i1 left, i1 right) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        this.left = left;
        this.right = right;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i1 getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i1 getRight() {
        return this.right;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj2;
        return Intrinsics.f(this.left, y2Var.left) && Intrinsics.f(this.right, y2Var.right);
    }

    public final int hashCode() {
        return this.right.hashCode() + (this.left.hashCode() * 31);
    }
}
