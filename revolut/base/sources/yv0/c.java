package yv0;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f317065a;

    public c(UrlImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f317065a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f317065a, ((c) obj2).f317065a);
    }

    @Override // yv0.d
    public final Image getImage() {
        return this.f317065a;
    }

    public final int hashCode() {
        return this.f317065a.hashCode();
    }
}
