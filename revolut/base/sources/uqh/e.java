package uqh;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListSubheaderDelegate.Model f282140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f282141b;

    public e(ListSubheaderDelegate.Model model, ArrayList rowItems) {
        Intrinsics.checkNotNullParameter(rowItems, "rowItems");
        this.f282140a = model;
        this.f282141b = rowItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f282140a, eVar.f282140a) && this.f282141b.equals(eVar.f282141b);
    }

    public final int hashCode() {
        ListSubheaderDelegate.Model model = this.f282140a;
        return this.f282141b.hashCode() + ((model == null ? 0 : model.hashCode()) * 31);
    }
}
