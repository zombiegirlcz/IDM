package yy0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f317755a;

    public j(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f317755a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f317755a, ((j) obj2).f317755a);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription */
    public final Clause getD() {
        return null;
    }

    @Override // yy0.l
    public final Image getImage() {
        return this.f317755a;
    }

    public final int hashCode() {
        return this.f317755a.hashCode();
    }
}
