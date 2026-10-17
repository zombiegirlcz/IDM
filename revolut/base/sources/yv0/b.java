package yv0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f317063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f317064b;

    public b(ResourceImage image, boolean z) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f317063a = image;
        this.f317064b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f317063a, bVar.f317063a) && this.f317064b == bVar.f317064b;
    }

    @Override // yv0.d
    public final Image getImage() {
        return this.f317063a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f317064b) + (this.f317063a.hashCode() * 31);
    }
}
