package wji;

import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransitionAnimation f298141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f298142b;

    public f(TransitionAnimation animation, d viewHolder) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f298141a = animation;
        this.f298142b = viewHolder;
    }

    public final TransitionAnimation a() {
        return this.f298141a;
    }

    public final d b() {
        return this.f298142b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f298141a, fVar.f298141a) && Intrinsics.f(this.f298142b, fVar.f298142b);
    }

    public final int hashCode() {
        return this.f298142b.hashCode() + (this.f298141a.hashCode() * 31);
    }
}
