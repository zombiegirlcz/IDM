package v1d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f285293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayeredImage f285294b;

    public f(TextLocalisedClause title, LayeredImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f285293a = title;
        this.f285294b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f285293a.equals(fVar.f285293a) && this.f285294b.equals(fVar.f285294b);
    }

    public final int hashCode() {
        return this.f285294b.hashCode() + (this.f285293a.hashCode() * 31);
    }
}
