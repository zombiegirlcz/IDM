package e93;

import com.revolut.core.ui_kit_core.displayers.image.models.BitmapImage;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitmapImage f123861b;

    public f0(String imageId, BitmapImage image) {
        Intrinsics.checkNotNullParameter(imageId, "imageId");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f123860a = imageId;
        this.f123861b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f123860a, f0Var.f123860a) && Intrinsics.f(this.f123861b, f0Var.f123861b);
    }

    public final int hashCode() {
        return this.f123861b.hashCode() + (this.f123860a.hashCode() * 31);
    }
}
