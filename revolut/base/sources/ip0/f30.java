package ip0;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f30 implements m30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionsView.Item f164188a;

    public f30(ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f164188a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f30) && Intrinsics.f(this.f164188a, ((f30) obj2).f164188a);
    }

    public final int hashCode() {
        return this.f164188a.hashCode();
    }
}
