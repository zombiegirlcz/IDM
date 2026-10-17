package n8i;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f213437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f213438b;

    public j0(ResourceImage icon, boolean z) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f213437a = icon;
        this.f213438b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f213437a.equals(j0Var.f213437a) && this.f213438b == j0Var.f213438b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213438b) + (this.f213437a.hashCode() * 31);
    }
}
