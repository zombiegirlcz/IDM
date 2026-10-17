package fg8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class v {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sri.m f135006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ic8.b f135007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q78.e f135008c;

    public v(sri.m navigator, ic8.b cardRequestInteractor, q78.e juniorAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(cardRequestInteractor, "cardRequestInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountDestinationResolver, "juniorAccountDestinationResolver");
        this.f135006a = navigator;
        this.f135007b = cardRequestInteractor;
        this.f135008c = juniorAccountDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, com.revolut.retail.core.navigation.FeatureCommand r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof fg8.t
            if (r0 == 0) goto L14
            r0 = r10
            fg8.t r0 = (fg8.t) r0
            int r1 = r0.f134998x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f134998x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            fg8.t r0 = new fg8.t
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f134998x
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            com.revolut.retail.core.navigation.FeatureCommand r9 = r5.u
            yhm.o.b(r10)
            goto L48
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r10)
            r5.u = r9
            r5.f134998x = r2
            q78.e r1 = r7.f135008c
            r3 = 0
            r4 = 0
            r6 = 14
            r2 = r8
            java.lang.Object r10 = u68.b.b(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L48
            return r0
        L48:
            com.revolut.retail.core.navigation.NaviCommand r10 = (com.revolut.retail.core.navigation.NaviCommand) r10
            com.revolut.retail.core.navigation.CompositeCommand r8 = com.revolut.retail.core.navigation.a.c(r10, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fg8.v.a(java.lang.String, com.revolut.retail.core.navigation.FeatureCommand, gim.c):java.lang.Object");
    }
}
