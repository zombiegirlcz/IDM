package kkf;

import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class v2 extends yji.n implements elf.s0 {

    @NotNull
    public static final u2 Companion = new u2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yjf.c f184978m;

    public v2(klf.h0 commonDataSource, yjf.c linkedOrderItemsProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(linkedOrderItemsProvider, "linkedOrderItemsProvider");
        this.f184977l = commonDataSource;
        this.f184978m = linkedOrderItemsProvider;
    }

    public final cmf.p Z2() {
        return new cmf.p(vkm.q.Q(this.f184977l.d(), new jy6.l((Continuation) null, this, 20)), new chc.c0(23), zhm.u.c(this), "LinkedOrder");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (obj2 instanceof KompotDestination) {
            A2((aii.u) obj2);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
