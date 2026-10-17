package aw0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f10517a;

    public s(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f10517a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f10517a, ((s) obj2).f10517a);
    }

    public final int hashCode() {
        return this.f10517a.hashCode();
    }
}
