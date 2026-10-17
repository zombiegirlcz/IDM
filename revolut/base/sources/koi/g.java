package koi;

import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f186372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f186373b;

    public g(ArrayList oldList, List newList) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.f186372a = oldList;
        this.f186373b = newList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i2) {
        Object obj2 = this.f186372a.get(i);
        if (obj2 != null) {
            return obj2.equals(this.f186373b.get(i2));
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i2) {
        Object obj2 = this.f186372a.get(i);
        Object obj3 = this.f186373b.get(i2);
        return ((obj2 instanceof j) && (obj3 instanceof j)) ? Intrinsics.f(((j) obj2).getF53816a(), ((j) obj3).getF53816a()) : Intrinsics.f(obj2, obj3);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final Object getChangePayload(int i, int i2) {
        Object obj2 = this.f186372a.get(i);
        Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Any");
        Object obj3 = this.f186373b.get(i2);
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Any");
        if (obj3 instanceof j) {
            return ((j) obj3).z(obj2);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f186373b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f186372a.size();
    }
}
