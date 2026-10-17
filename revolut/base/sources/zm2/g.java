package zm2;

import cli.o;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f323327a;

    public g(UrlImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f323327a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f323327a.equals(((g) obj2).f323327a);
    }

    public final int hashCode() {
        return this.f323327a.hashCode();
    }
}
