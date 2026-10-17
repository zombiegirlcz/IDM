package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k90 implements e90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f164979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f164980c;

    public k90(Clause label, Image image, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f164978a = listId;
        this.f164979b = image;
        this.f164980c = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k90)) {
            return false;
        }
        k90 k90Var = (k90) obj2;
        return Intrinsics.f(this.f164978a, k90Var.f164978a) && Intrinsics.f(this.f164979b, k90Var.f164979b) && this.f164980c.equals(k90Var.f164980c);
    }

    public final int hashCode() {
        int iHashCode = this.f164978a.hashCode() * 31;
        Image image = this.f164979b;
        return p.a.b((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f164980c);
    }
}
