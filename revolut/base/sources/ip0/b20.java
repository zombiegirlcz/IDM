package ip0;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b20 extends c20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f163519a;

    public b20(LayeredImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f163519a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b20) && this.f163519a.equals(((b20) obj2).f163519a);
    }

    public final int hashCode() {
        return this.f163519a.hashCode();
    }
}
