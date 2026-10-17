package ip0;

import com.revolut.core.ui_kit.delegates.SwipeableCardLoadingItemDelegate;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xi0 implements koi.j, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167177a;

    public xi0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f167177a = listId;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new SwipeableCardLoadingItemDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52127a() {
        return this.f167177a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof xi0) && Intrinsics.f(this.f167177a, ((xi0) obj2).f167177a);
    }

    public final int hashCode() {
        return this.f167177a.hashCode();
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof xi0) {
            return Unit.f186387a;
        }
        super.z(oldItem);
        return null;
    }
}
