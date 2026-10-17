package hde;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements vce.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f151415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lde.j f151416b;

    public f(m navigator, lde.j sharedHelpQuickActionsInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(sharedHelpQuickActionsInteractor, "sharedHelpQuickActionsInteractor");
        this.f151415a = navigator;
        this.f151416b = sharedHelpQuickActionsInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "help") && Intrinsics.f(cVar.e(2), "quick-action") && Intrinsics.f(cVar.e(3), "dispute-transaction");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof hde.d
            if (r0 == 0) goto L13
            r0 = r5
            hde.d r0 = (hde.d) r0
            int r1 = r0.f151413w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151413w = r1
            goto L18
        L13:
            hde.d r0 = new hde.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151413w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f151413w = r3
            lde.j r5 = r4.f151416b
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            boolean r0 = r5 instanceof com.revolut.kompot.common.ParcelableDestination
            if (r0 == 0) goto L44
            com.revolut.kompot.common.ParcelableDestination r5 = (com.revolut.kompot.common.ParcelableDestination) r5
            return r5
        L44:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hde.f.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof hde.e
            if (r4 == 0) goto L13
            r4 = r5
            hde.e r4 = (hde.e) r4
            int r0 = r4.f151414w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f151414w = r0
            goto L1a
        L13:
            hde.e r4 = new hde.e
            gim.c r5 = (gim.c) r5
            r4.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f151414w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            r4.f151414w = r2
            java.lang.Object r5 = r3.b(r4)
            if (r5 != r0) goto L3d
            return r0
        L3d:
            com.revolut.kompot.common.ParcelableDestination r5 = (com.revolut.kompot.common.ParcelableDestination) r5
            r4 = 0
            if (r5 == 0) goto L48
            q06.h r0 = new q06.h
            r0.<init>(r5, r4)
            return r0
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hde.f.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return w.o0(kotlin.coroutines.g.f186406a, new gvc.m(this, null, 13));
    }
}
