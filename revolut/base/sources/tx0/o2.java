package tx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o2 implements q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.d0 f275217a;

    public o2() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o2) && Intrinsics.f(this.f275217a, ((o2) obj2).f275217a);
    }

    public final int hashCode() {
        return this.f275217a.hashCode();
    }

    public o2(aw0.d0 aspectRatio) {
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        this.f275217a = aspectRatio;
    }

    public /* synthetic */ o2(int i) {
        this(new aw0.d0(100, 83));
    }
}
