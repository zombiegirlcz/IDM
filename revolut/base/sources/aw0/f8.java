package aw0;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedBackgroundType f10311a;

    public f8(AnimatedBackgroundType animatedBackgroundType) {
        this.f10311a = animatedBackgroundType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f8) && Intrinsics.f(this.f10311a, ((f8) obj2).f10311a);
    }

    public final int hashCode() {
        AnimatedBackgroundType animatedBackgroundType = this.f10311a;
        if (animatedBackgroundType == null) {
            return 0;
        }
        return animatedBackgroundType.hashCode();
    }
}
