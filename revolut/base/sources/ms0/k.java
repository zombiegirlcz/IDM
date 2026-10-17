package ms0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f208303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f208304b;

    public k(Clause label, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f208303a = resourceImage;
        this.f208304b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f208303a, kVar.f208303a) && Intrinsics.f(this.f208304b, kVar.f208304b);
    }

    public final int hashCode() {
        Image image = this.f208303a;
        return this.f208304b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31);
    }
}
