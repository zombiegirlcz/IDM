package jec;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieImage f173265a;

    public l(LottieImage animationImage) {
        Intrinsics.checkNotNullParameter(animationImage, "animationImage");
        this.f173265a = animationImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f173265a.equals(((l) obj2).f173265a);
    }

    public final int hashCode() {
        return this.f173265a.hashCode();
    }
}
