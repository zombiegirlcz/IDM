package kkf;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p7 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.z2 f184888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a9e.d f184889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d9e.a f184890n;

    public p7(klf.z2 subscriptionDataSource, a9e.d subscriptionsItemMapper, d9e.a raisedSubscriptionsExtension) {
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(raisedSubscriptionsExtension, "raisedSubscriptionsExtension");
        this.f184888l = subscriptionDataSource;
        this.f184889m = subscriptionsItemMapper;
        this.f184890n = raisedSubscriptionsExtension;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z = false;
        if (Intrinsics.f(str, "SUGGESTED_SUBSCRIPTION_LIST_ID")) {
            com.revolut.core.ui_kit.delegates.t tVar = obj2 instanceof com.revolut.core.ui_kit.delegates.t ? (com.revolut.core.ui_kit.delegates.t) obj2 : null;
            if (tVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "parcel needs to be ActionWidgetDelegateClickData type: "));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            } else {
                this.f184890n.Z2(tVar);
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
