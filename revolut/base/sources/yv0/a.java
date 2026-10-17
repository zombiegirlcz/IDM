package yv0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitmapImage f317062a;

    public a(BitmapImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f317062a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f317062a, ((a) obj2).f317062a);
    }

    @Override // yv0.d
    public final Image getImage() {
        return this.f317062a;
    }

    public final int hashCode() {
        return this.f317062a.hashCode();
    }
}
