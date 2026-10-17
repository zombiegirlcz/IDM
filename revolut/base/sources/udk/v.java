package udk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f279273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f279274b;

    public v(u revealState, AnimatedBackgroundType animatedBackgroundType) {
        Intrinsics.checkNotNullParameter(revealState, "revealState");
        this.f279273a = revealState;
        this.f279274b = animatedBackgroundType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f279273a, vVar.f279273a) && Intrinsics.f(this.f279274b, vVar.f279274b);
    }

    public final int hashCode() {
        int iHashCode = this.f279273a.hashCode() * 31;
        AnimatedBackgroundType animatedBackgroundType = this.f279274b;
        return iHashCode + (animatedBackgroundType == null ? 0 : animatedBackgroundType.hashCode());
    }
}
