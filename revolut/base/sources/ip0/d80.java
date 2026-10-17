package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d80 implements l80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f163856a;

    public d80(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f163856a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d80) && this.f163856a.equals(((d80) obj2).f163856a);
    }

    public final int hashCode() {
        return this.f163856a.hashCode();
    }
}
