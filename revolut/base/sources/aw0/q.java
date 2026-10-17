package aw0;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieImage f10477a;

    public q(LottieImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f10477a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f10477a, ((q) obj2).f10477a);
    }

    public final int hashCode() {
        return this.f10477a.hashCode();
    }
}
