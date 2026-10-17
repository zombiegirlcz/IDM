package ewh;

import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pcd.s f130276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LayeredImage f130277b;

    public n(pcd.s vault, LayeredImage image) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f130276a = vault;
        this.f130277b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f130276a, nVar.f130276a) && this.f130277b.equals(nVar.f130277b);
    }

    public final int hashCode() {
        return this.f130277b.hashCode() + (this.f130276a.hashCode() * 31);
    }
}
