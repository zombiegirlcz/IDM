package lu0;

import androidx.recyclerview.widget.DiffUtil;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f200003b;

    public p(List oldList, List newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.f200002a = oldList;
        this.f200003b = newList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i2) {
        return Intrinsics.f(this.f200002a.get(i), this.f200003b.get(i2));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i2) {
        return Intrinsics.f(((com.revolut.core.ui_kit.internal.views.reactionskeyboard.a) this.f200002a.get(i)).f57502a, ((com.revolut.core.ui_kit.internal.views.reactionskeyboard.a) this.f200003b.get(i2)).f57502a);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final Object getChangePayload(int i, int i2) {
        return null;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f200003b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f200002a.size();
    }
}
