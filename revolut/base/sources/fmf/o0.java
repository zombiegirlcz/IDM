package fmf;

import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes8.dex */
public final class o0 implements mkd.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136406a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f136407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f136408c;
    public final Function0 d;

    public o0(efm.r visibleRecyclerItemsObservable, efm.r scrollerVisibleRecyclerItemsObservable, Function0 delegatesManagerProvider) {
        Intrinsics.checkNotNullParameter(visibleRecyclerItemsObservable, "visibleRecyclerItemsObservable");
        Intrinsics.checkNotNullParameter(scrollerVisibleRecyclerItemsObservable, "scrollerVisibleRecyclerItemsObservable");
        Intrinsics.checkNotNullParameter(delegatesManagerProvider, "delegatesManagerProvider");
        this.f136407b = visibleRecyclerItemsObservable;
        this.f136408c = scrollerVisibleRecyclerItemsObservable;
        this.d = delegatesManagerProvider;
    }

    @Override // mkd.g
    public final efm.r F1() {
        switch (this.f136406a) {
            case 0:
                return rd0.e.c((vkm.d) this.f136408c, kotlin.coroutines.g.f186406a);
            case 1:
                return ((ScrollerDelegate) this.f136408c).i;
            default:
                return (efm.r) this.f136408c;
        }
    }

    @Override // jkd.b
    public final efm.r X1() {
        switch (this.f136406a) {
            case 0:
                return rd0.e.c((z1) this.f136407b, kotlin.coroutines.g.f186406a);
            case 1:
                return (ihm.f) this.f136407b;
            default:
                return (efm.r) this.f136407b;
        }
    }

    @Override // mkd.g
    public final koi.c v0() {
        switch (this.f136406a) {
            case 0:
                return (koi.c) ((a) this.d).invoke();
            case 1:
                return (koi.c) ((jvc.d) this.d).invoke();
            default:
                return (koi.c) this.d.invoke();
        }
    }

    public o0(ihm.f visibleItemsObservable, ScrollerDelegate scrollerDelegate, jvc.d delegatesManagerProvider) {
        Intrinsics.checkNotNullParameter(visibleItemsObservable, "visibleItemsObservable");
        Intrinsics.checkNotNullParameter(scrollerDelegate, "scrollerDelegate");
        Intrinsics.checkNotNullParameter(delegatesManagerProvider, "delegatesManagerProvider");
        this.f136407b = visibleItemsObservable;
        this.f136408c = scrollerDelegate;
        this.d = delegatesManagerProvider;
    }

    public o0(z1 visibleRecyclerItemsFlow, vkm.d scrollerVisibleRecyclerItemsFlow, a delegatesManagerProvider) {
        Intrinsics.checkNotNullParameter(visibleRecyclerItemsFlow, "visibleRecyclerItemsFlow");
        Intrinsics.checkNotNullParameter(scrollerVisibleRecyclerItemsFlow, "scrollerVisibleRecyclerItemsFlow");
        Intrinsics.checkNotNullParameter(delegatesManagerProvider, "delegatesManagerProvider");
        this.f136407b = visibleRecyclerItemsFlow;
        this.f136408c = scrollerVisibleRecyclerItemsFlow;
        this.d = delegatesManagerProvider;
    }
}
