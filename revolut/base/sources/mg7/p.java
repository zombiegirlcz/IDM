package mg7;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f205180b;

    public p(ResourceImage resourceImage, List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f205179a = menuItems;
        this.f205180b = resourceImage;
    }

    @Override // mg7.q
    public final Image a() {
        return this.f205180b;
    }

    @Override // mg7.q
    public final List b() {
        return this.f205179a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f205179a, pVar.f205179a) && Intrinsics.f(this.f205180b, pVar.f205180b);
    }

    public final int hashCode() {
        int iHashCode = this.f205179a.hashCode() * 31;
        Image image = this.f205180b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }
}
