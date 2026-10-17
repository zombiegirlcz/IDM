package jc6;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f172719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f172720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f172721c;

    public m(List items, UrlImage urlImage, aw0.e actionFooter) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        this.f172719a = items;
        this.f172720b = urlImage;
        this.f172721c = actionFooter;
    }

    @Override // jki.n
    public final List c() {
        return this.f172719a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f172719a, mVar.f172719a) && Intrinsics.f(this.f172720b, mVar.f172720b) && this.f172721c.equals(mVar.f172721c);
    }

    public final int hashCode() {
        int iHashCode = this.f172719a.hashCode() * 31;
        Image image = this.f172720b;
        return this.f172721c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
    }
}
