package sy;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f266549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f266550b;

    public n(TagViewData tagViewData, List menuItems) {
        Intrinsics.checkNotNullParameter(tagViewData, "tagViewData");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f266549a = tagViewData;
        this.f266550b = menuItems;
    }

    @Override // sy.p
    public final List a() {
        return this.f266550b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f266549a, nVar.f266549a) && Intrinsics.f(this.f266550b, nVar.f266550b);
    }

    public final int hashCode() {
        return this.f266550b.hashCode() + (this.f266549a.hashCode() * 31);
    }
}
