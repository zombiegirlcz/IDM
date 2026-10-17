package hxb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\f"}, d2 = {"Lhxb/i0;", "", "", "toString", "()Ljava/lang/String;", "Lhxb/g0;", "a", "Lhxb/g0;", "()Lhxb/g0;", "fromValue", "b", "toValue", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fromValue")
    @NotNull
    private final g0 fromValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("toValue")
    @NotNull
    private final g0 toValue;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final g0 getFromValue() {
        return this.fromValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g0 getToValue() {
        return this.toValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.fromValue, i0Var.fromValue) && Intrinsics.f(this.toValue, i0Var.toValue);
    }

    public final int hashCode() {
        return this.toValue.hashCode() + (this.fromValue.hashCode() * 31);
    }
}
