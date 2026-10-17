package py0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f240641a;

    public b(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f240641a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f240641a, ((b) obj2).f240641a);
    }

    public final int hashCode() {
        return this.f240641a.hashCode();
    }
}
