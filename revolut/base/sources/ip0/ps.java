package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f165861a;

    public ps(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f165861a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ps) && Intrinsics.f(this.f165861a, ((ps) obj2).f165861a);
    }

    public final int hashCode() {
        return this.f165861a.hashCode();
    }
}
