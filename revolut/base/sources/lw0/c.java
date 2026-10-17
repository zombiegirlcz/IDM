package lw0;

import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlyphImage f200391a;

    public c(GlyphImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f200391a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f200391a, ((c) obj2).f200391a);
    }

    public final int hashCode() {
        return this.f200391a.hashCode();
    }
}
