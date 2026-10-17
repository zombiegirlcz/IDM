package ip0;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m6 implements p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TagViewData f165321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f165322b;

    public m6(TagViewData badge, Clause label) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f165321a = badge;
        this.f165322b = label;
    }

    @Override // ip0.p6
    public final TagViewData X() {
        return this.f165321a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj2;
        return this.f165321a.equals(m6Var.f165321a) && this.f165322b.equals(m6Var.f165322b);
    }

    public final int hashCode() {
        return this.f165322b.hashCode() + (this.f165321a.hashCode() * 31);
    }
}
