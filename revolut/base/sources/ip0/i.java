package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f164612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f164613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f164614c;

    public i(Clause title, Image image, Image image2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f164612a = title;
        this.f164613b = image;
        this.f164614c = image2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f164612a, iVar.f164612a) && Intrinsics.f(this.f164613b, iVar.f164613b) && Intrinsics.f(this.f164614c, iVar.f164614c);
    }

    public final int hashCode() {
        int iHashCode = this.f164612a.hashCode() * 31;
        Image image = this.f164613b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f164614c;
        return iHashCode2 + (image2 != null ? image2.hashCode() : 0);
    }

    public /* synthetic */ i(Clause clause, ResourceImage resourceImage, int i) {
        this(clause, (Image) null, (i & 4) != 0 ? null : resourceImage);
    }
}
