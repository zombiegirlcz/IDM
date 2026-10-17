package yfe;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a1 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f313240a;

    public a1(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f313240a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a1) && Intrinsics.f(this.f313240a, ((a1) obj2).f313240a);
    }

    public final int hashCode() {
        return this.f313240a.hashCode();
    }
}
