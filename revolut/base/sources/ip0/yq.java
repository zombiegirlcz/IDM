package ip0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yq extends zq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f167345b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq(List points) {
        super(ou0.e.OFFSET);
        Intrinsics.checkNotNullParameter(points, "points");
        this.f167345b = points;
    }

    @Override // ip0.zq
    public final List a() {
        return this.f167345b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof yq) && Intrinsics.f(this.f167345b, ((yq) obj2).f167345b);
    }

    public final int hashCode() {
        return this.f167345b.hashCode();
    }
}
