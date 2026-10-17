package ip0;

import com.revolut.core.ui_kit.delegates.HomeScreenPreviewLoadingDelegate;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class co implements koi.j, tw0.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f163767a;

    public co(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f163767a = listId;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new HomeScreenPreviewLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52127a() {
        return this.f163767a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof co) && Intrinsics.f(this.f163767a, ((co) obj2).f163767a);
    }

    public final int hashCode() {
        return this.f163767a.hashCode();
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return Unit.f186387a;
    }
}
