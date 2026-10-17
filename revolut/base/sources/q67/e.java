package q67;

import cli.o;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f242522a;

    public e(UrlImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f242522a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f242522a.equals(((e) obj2).f242522a);
    }

    public final int hashCode() {
        return this.f242522a.hashCode();
    }
}
