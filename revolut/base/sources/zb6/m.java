package zb6;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f320812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f320813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f320814c;

    public m(boolean z, UrlImage urlImage, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f320812a = z;
        this.f320813b = urlImage;
        this.f320814c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f320814c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f320812a == mVar.f320812a && Intrinsics.f(this.f320813b, mVar.f320813b) && Intrinsics.f(this.f320814c, mVar.f320814c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f320812a) * 31;
        Image image = this.f320813b;
        return this.f320814c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
    }
}
