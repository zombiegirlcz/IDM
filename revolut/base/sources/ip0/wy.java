package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f167068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xy f167069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f167070c;

    public wy(Clause text, xy style, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f167068a = text;
        this.f167069b = style;
        this.f167070c = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wy)) {
            return false;
        }
        wy wyVar = (wy) obj2;
        return Intrinsics.f(this.f167068a, wyVar.f167068a) && this.f167069b == wyVar.f167069b && Intrinsics.f(this.f167070c, wyVar.f167070c);
    }

    public final int hashCode() {
        int iHashCode = (this.f167069b.hashCode() + (this.f167068a.hashCode() * 31)) * 31;
        Image image = this.f167070c;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }
}
