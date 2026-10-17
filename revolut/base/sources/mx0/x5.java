package mx0;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class x5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f210105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210106b;

    public x5(UrlImage image, int i) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f210105a = image;
        this.f210106b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj2;
        return this.f210105a.equals(x5Var.f210105a) && this.f210106b == x5Var.f210106b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f210106b) + (this.f210105a.hashCode() * 31);
    }
}
