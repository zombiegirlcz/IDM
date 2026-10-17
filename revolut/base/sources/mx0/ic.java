package mx0;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ic extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f209761b;

    public ic(List oldList, List newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.f209760a = oldList;
        this.f209761b = newList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i2) {
        List list = this.f209760a;
        Object obj2 = list.get(i);
        List list2 = this.f209761b;
        if (!Intrinsics.f(obj2, list2.get(i2))) {
            return false;
        }
        ((com.revolut.core.ui_kit.views.q) list.get(i)).getClass();
        ((com.revolut.core.ui_kit.views.q) list2.get(i2)).getClass();
        return true;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i2) {
        return Intrinsics.f(((com.revolut.core.ui_kit.views.q) this.f209760a.get(i)).f59614a, ((com.revolut.core.ui_kit.views.q) this.f209761b.get(i2)).f59614a);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final Object getChangePayload(int i, int i2) {
        return null;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f209761b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f209760a.size();
    }
}
