package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a20 extends c20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f163371a;

    public a20(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f163371a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a20) && Intrinsics.f(this.f163371a, ((a20) obj2).f163371a);
    }

    public final int hashCode() {
        return this.f163371a.hashCode();
    }
}
