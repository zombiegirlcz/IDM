package fo9;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionsView.Item f136850a;

    public n(ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f136850a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f136850a, ((n) obj2).f136850a);
    }

    public final int hashCode() {
        return this.f136850a.hashCode();
    }
}
