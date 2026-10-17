package iw0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f168892a;

    public f(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f168892a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f168892a, ((f) obj2).f168892a);
    }

    public final int hashCode() {
        return this.f168892a.hashCode();
    }
}
