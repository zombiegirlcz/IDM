package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class eo0 implements fo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.d0 f164131a;

    public eo0(aw0.d0 imageRatio) {
        Intrinsics.checkNotNullParameter(imageRatio, "imageRatio");
        this.f164131a = imageRatio;
    }

    @Override // ip0.fo0
    public final aw0.d0 a() {
        return this.f164131a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof eo0) && Intrinsics.f(this.f164131a, ((eo0) obj2).f164131a);
    }

    public final int hashCode() {
        return this.f164131a.hashCode();
    }
}
