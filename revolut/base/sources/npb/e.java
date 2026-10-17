package npb;

import bw0.m;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import djb.n;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ne0.k;
import w4l.h;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends ote.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f218182l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TopUpTarget.Savings f218183m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final k f218184n;

    public e(n savingsAccountsDetailsInteractor, TopUpTarget.Savings topUpTarget) {
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        this.f218182l = savingsAccountsDetailsInteractor;
        this.f218183m = topUpTarget;
        this.f218184n = new k(new a(this, 0), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(npb.e r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof npb.b
            if (r0 == 0) goto L13
            r0 = r5
            npb.b r0 = (npb.b) r0
            int r1 = r0.f218180w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218180w = r1
            goto L18
        L13:
            npb.b r0 = new npb.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f218180w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ne0.k r4 = r4.f218184n
            w4l.h r5 = w4l.h.f294642c
            efm.r r4 = r4.a(r5)
            nmb.v r5 = new nmb.v
            r2 = 22
            r5.<init>(r2)
            r2 = 0
            efm.r r4 = m70.a.g(r4, r2, r5, r3)
            r0.f218180w = r3
            java.lang.Object r5 = nim.a.c(r4, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: npb.e.e3(npb.e, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        yji.n.j2(this, rd0.e.b(this.f218184n.a(h.f294642c)), null, null, 7);
    }

    @Override // ote.a
    public final Set Z2() {
        return h0.f322473a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ote.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof npb.c
            if (r0 == 0) goto L13
            r0 = r5
            npb.c r0 = (npb.c) r0
            int r1 = r0.f218181w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f218181w = r1
            goto L1a
        L13:
            npb.c r0 = new npb.c
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f218181w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            npb.d r5 = new npb.d
            r2 = 0
            r5.<init>(r4, r2)
            r0.f218181w = r3
            java.lang.Object r5 = r4.Y2(r0, r5)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: npb.e.b3(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ote.a
    public final Boolean c3(m mVar) {
        return Boolean.FALSE;
    }

    @Override // ote.a
    public final boolean d3() {
        return true;
    }
}
