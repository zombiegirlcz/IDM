package fci;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f133829a;

    public z(Image image) {
        this.f133829a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f133829a, ((z) obj2).f133829a);
    }

    public final int hashCode() {
        Image image = this.f133829a;
        if (image == null) {
            return 0;
        }
        return image.hashCode();
    }
}
