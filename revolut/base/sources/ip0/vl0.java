package ip0;

import com.revolut.core.ui_kit.delegates.TransferAmountPageLoadingDelegate;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class vl0 implements koi.j, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f166847a;

    public vl0(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f166847a = listId;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new TransferAmountPageLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52127a() {
        return this.f166847a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof vl0) && Intrinsics.f(this.f166847a, ((vl0) obj2).f166847a);
    }

    public final int hashCode() {
        return this.f166847a.hashCode();
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return Unit.f186387a;
    }
}
