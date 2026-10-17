package mxl;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieImage f210259a;

    public a(LottieImage lottieImage) {
        Intrinsics.checkNotNullParameter(lottieImage, "lottieImage");
        this.f210259a = lottieImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f210259a, ((a) obj2).f210259a);
    }

    public final int hashCode() {
        return this.f210259a.hashCode();
    }
}
