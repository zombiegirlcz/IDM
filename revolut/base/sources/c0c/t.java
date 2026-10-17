package c0c;

import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t implements mkd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.r f20233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScrollerDelegate f20234c;
    public final koi.c d;

    public t(efm.r visibleItemsObservable, ScrollerDelegate scrollerDelegate, koi.c delegatesManager, int i) {
        this.f20232a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(visibleItemsObservable, "visibleItemsObservable");
                Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
                Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                this.f20233b = visibleItemsObservable;
                this.f20234c = scrollerDelegate;
                this.d = delegatesManager;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(visibleItemsObservable, "visibleItemsObservable");
                Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
                Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                this.f20233b = visibleItemsObservable;
                this.f20234c = scrollerDelegate;
                this.d = delegatesManager;
                break;
            default:
                Intrinsics.checkNotNullParameter(visibleItemsObservable, "visibleItemsObservable");
                Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
                Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
                this.f20233b = visibleItemsObservable;
                this.f20234c = scrollerDelegate;
                this.d = delegatesManager;
                break;
        }
    }

    @Override // mkd.g
    public final efm.r F1() {
        switch (this.f20232a) {
        }
        return this.f20234c.i;
    }

    @Override // jkd.b
    public final efm.r X1() {
        switch (this.f20232a) {
        }
        return this.f20233b;
    }

    @Override // mkd.g
    public final koi.c v0() {
        switch (this.f20232a) {
        }
        return this.d;
    }
}
