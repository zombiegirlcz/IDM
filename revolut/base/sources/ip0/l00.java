package ip0;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00 f165098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionsView.Item f165099b;

    public l00(m00 model, ActionsView.Item item) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f165098a = model;
        this.f165099b = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l00)) {
            return false;
        }
        l00 l00Var = (l00) obj2;
        return Intrinsics.f(this.f165098a, l00Var.f165098a) && Intrinsics.f(this.f165099b, l00Var.f165099b);
    }

    public final int hashCode() {
        return this.f165099b.hashCode() + (this.f165098a.hashCode() * 31);
    }
}
