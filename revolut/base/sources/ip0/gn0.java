package ip0;

import com.revolut.core.ui_kit.delegates.TwoLogosHeaderDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class gn0 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final en0 f164453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f164454c;
    public final fn0 d;

    public gn0(String str, en0 en0Var, Image image, fn0 fn0Var) {
        this.f164452a = str;
        this.f164453b = en0Var;
        this.f164454c = image;
        this.d = fn0Var;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TwoLogosHeaderDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52866a() {
        return this.f164452a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gn0)) {
            return false;
        }
        gn0 gn0Var = (gn0) obj2;
        return Intrinsics.f(this.f164452a, gn0Var.f164452a) && this.f164453b == gn0Var.f164453b && Intrinsics.f(this.f164454c, gn0Var.f164454c) && this.d == gn0Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f164453b.hashCode() + (this.f164452a.hashCode() * 31)) * 31;
        Image image = this.f164454c;
        return this.d.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof gn0 ? (gn0) oldItem : null) == null) {
            return null;
        }
        gn0 gn0Var = (gn0) oldItem;
        return new hn0(gn0Var.d != this.d, (gn0Var.f164453b == this.f164453b && Intrinsics.f(gn0Var.f164454c, this.f164454c)) ? false : true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public gn0(String listId, Image image) {
        fn0 revolutLogoType = fn0.RETAIL;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(revolutLogoType, "revolutLogoType");
        this(listId, en0.Empty, image, revolutLogoType);
    }
}
