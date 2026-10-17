package kkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k9 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.b3 f184799l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184800m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ynf.l f184801n;
    public final lg0.b o;

    public k9(klf.b3 warrantDataSource, klf.m1 juniorDataSource, ynf.l warrantWidgetMapper, lg0.b deeplinkHandler) {
        Intrinsics.checkNotNullParameter(warrantDataSource, "warrantDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(warrantWidgetMapper, "warrantWidgetMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f184799l = warrantDataSource;
        this.f184800m = juniorDataSource;
        this.f184801n = warrantWidgetMapper;
        this.o = deeplinkHandler;
    }

    public final cmf.p Z2() {
        return new cmf.p(vkm.q.Q(this.f184800m.a(), new m5(null, this, 9)), new z5(14), zhm.u.c(this), "Warrant");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "ID_WARRANT_BANNER")) {
            return Boolean.FALSE;
        }
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.ActionWidgetDelegateClickData");
        Object obj3 = ((com.revolut.core.ui_kit.delegates.t) obj2).f54722b.f51596l;
        Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
        kb7.c cVar = new kb7.c(this, (String) obj3, null, 15);
        skm.p0 p0Var = skm.p0.f264001a;
        return skm.e0.J(elm.f.f127540b, cVar, continuation);
    }
}
