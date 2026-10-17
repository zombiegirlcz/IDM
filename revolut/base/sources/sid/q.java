package sid;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lsid/q;", "", "", "toString", "()Ljava/lang/String;", "Lsid/o;", "a", "Lsid/o;", "b", "()Lsid/o;", "topLeft", "bottomRight", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("topLeft")
    @NotNull
    private final o topLeft;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("bottomRight")
    @NotNull
    private final o bottomRight;

    public q(o topLeft, o bottomRight) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o getBottomRight() {
        return this.bottomRight;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o getTopLeft() {
        return this.topLeft;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.topLeft, qVar.topLeft) && Intrinsics.f(this.bottomRight, qVar.bottomRight);
    }

    public final int hashCode() {
        return this.bottomRight.hashCode() + (this.topLeft.hashCode() * 31);
    }
}
