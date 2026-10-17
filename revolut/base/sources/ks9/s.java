package ks9;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends yji.n implements e {

    @NotNull
    private static final m Companion = new m();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f189374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final cu9.n f189375m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r10.f f189376n;
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rp0.l0 f189377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wu9.c f189378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f189379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lv9.d f189380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k61.a f189381t;
    public final h7k.a u;
    public final z1 v;

    public s(j60.a bottomExpandableDialog, cu9.n messageActionsFactory, r10.f groupChatMessagesInteractor, c70.a clipboard, rp0.l0 popupMenuDialogDisplayer, wu9.c favoriteReactionsDelegate, ang.f userInteractor, lv9.d messageReactionsInteractor, k61.a transferInteractor, h7k.a paymentLinksActionExtension) {
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(messageActionsFactory, "messageActionsFactory");
        Intrinsics.checkNotNullParameter(groupChatMessagesInteractor, "groupChatMessagesInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(popupMenuDialogDisplayer, "popupMenuDialogDisplayer");
        Intrinsics.checkNotNullParameter(favoriteReactionsDelegate, "favoriteReactionsDelegate");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(messageReactionsInteractor, "messageReactionsInteractor");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(paymentLinksActionExtension, "paymentLinksActionExtension");
        this.f189374l = bottomExpandableDialog;
        this.f189375m = messageActionsFactory;
        this.f189376n = groupChatMessagesInteractor;
        this.o = clipboard;
        this.f189377p = popupMenuDialogDisplayer;
        this.f189378q = favoriteReactionsDelegate;
        this.f189379r = userInteractor;
        this.f189380s = messageReactionsInteractor;
        this.f189381t = transferInteractor;
        this.u = paymentLinksActionExtension;
        this.v = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(ks9.s r4, com.revolut.feature.payments.groups.api.models.PaymentGroup r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof ks9.n
            if (r0 == 0) goto L16
            r0 = r6
            ks9.n r0 = (ks9.n) r0
            int r1 = r0.f189353x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f189353x = r1
            goto L1b
        L16:
            ks9.n r0 = new ks9.n
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189353x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.payments.groups.api.models.PaymentGroup r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            yhm.o.b(r6)
            ang.f r4 = r4.f189379r
            r6 = 0
            efm.d0 r4 = r4.f(r6)
            r0.u = r5
            r0.f189353x = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            do3.n r6 = (do3.n) r6
            java.lang.String r4 = r5.f79285a
            kotlin.jvm.internal.Intrinsics.h(r6)
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = r6.f116414l
            if (r5 == 0) goto L5f
            dv9.k r6 = new dv9.k
            r6.<init>(r5, r4)
            return r6
        L5f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required value was null."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ks9.s.Z2(ks9.s, com.revolut.feature.payments.groups.api.models.PaymentGroup, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void H2() {
        rp0.l0 l0Var = this.f189377p;
        Continuation continuation = null;
        yji.n.l2(this, new kge.b(rd0.e.b(l0Var.f256113c), 20), null, new r(this, continuation, 0), 3);
        yji.n.l2(this, rd0.e.b(l0Var.d), null, new r(this, continuation, 1), 3);
    }
}
