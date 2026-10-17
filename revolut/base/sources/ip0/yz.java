package ip0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yz extends zz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f167367a;

    public yz(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f167367a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof yz) && this.f167367a.equals(((yz) obj2).f167367a);
    }

    public final int hashCode() {
        return this.f167367a.hashCode();
    }
}
