package nxl;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedBackgroundType f220585a;

    public e(AnimatedBackgroundType backgroundType) {
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f220585a = backgroundType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f220585a, ((e) obj2).f220585a);
    }

    public final int hashCode() {
        return this.f220585a.hashCode();
    }
}
