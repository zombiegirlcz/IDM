package d5a;

import efm.r;
import koi.c;
import kotlin.jvm.internal.Intrinsics;
import mkd.g;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f111403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f111404c;
    public final c d;

    public a(r visibleRecyclerItemsObservable, r scrollerVisibleRecyclerItemsObservable, c delegatesManager, int i) {
        this.f111402a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(visibleRecyclerItemsObservable, "visibleRecyclerItemsObservable");
                Intrinsics.checkNotNullParameter(scrollerVisibleRecyclerItemsObservable, "scrollerVisibleRecyclerItemsObservable");
                Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                this.f111403b = visibleRecyclerItemsObservable;
                this.f111404c = scrollerVisibleRecyclerItemsObservable;
                this.d = delegatesManager;
                break;
            default:
                Intrinsics.checkNotNullParameter(visibleRecyclerItemsObservable, "visibleRecyclerItemsObservable");
                Intrinsics.checkNotNullParameter(scrollerVisibleRecyclerItemsObservable, "scrollerVisibleRecyclerItemsObservable");
                Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                this.f111403b = visibleRecyclerItemsObservable;
                this.f111404c = scrollerVisibleRecyclerItemsObservable;
                this.d = delegatesManager;
                break;
        }
    }

    @Override // mkd.g
    public final r F1() {
        switch (this.f111402a) {
        }
        return this.f111404c;
    }

    @Override // jkd.b
    public final r X1() {
        switch (this.f111402a) {
        }
        return this.f111403b;
    }

    @Override // mkd.g
    public final c v0() {
        switch (this.f111402a) {
        }
        return this.d;
    }
}
