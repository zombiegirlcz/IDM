package sd3;

import com.revolut.core.ui_kit.views.ActionsView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f261816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView.Item f261817b;

    public j(List items, ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f261816a = items;
        this.f261817b = item;
    }

    @Override // jki.n
    public final List c() {
        return this.f261816a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f261816a, jVar.f261816a) && Intrinsics.f(this.f261817b, jVar.f261817b);
    }

    public final int hashCode() {
        int iHashCode = this.f261816a.hashCode() * 31;
        ActionsView.Item item = this.f261817b;
        return iHashCode + (item == null ? 0 : item.hashCode());
    }
}
