package j82;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes20.dex */
public final class s extends oki.h implements k {

    @NotNull
    public static final m Companion = new m();
    public final PendingPaymentConfirmationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zq.a f172100p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f172101q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z1 f172102r;

    public s(PendingPaymentConfirmationScreenContract$InputData inputData, zq.a interactor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f172100p = interactor;
        this.f172101q = mra.d.b(this, new i(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f172102r = z1VarB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(j82.s r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof j82.n
            if (r0 == 0) goto L13
            r0 = r5
            j82.n r0 = (j82.n) r0
            int r1 = r0.f172096w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172096w = r1
            goto L18
        L13:
            j82.n r0 = new j82.n
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172096w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            zq.a r5 = r4.f172100p
            r0.f172096w = r3
            java.lang.Object r5 = r5.f324336c
            l72.f r5 = (l72.f) r5
            a72.f r5 = r5.f192509a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.util.List r5 = (java.util.List) r5
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L4c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            r2 = r1
            h02.c r2 = (h02.c) r2
            java.lang.String r2 = r2.f148180a
            com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreenContract$InputData r3 = r4.o
            java.lang.String r3 = r3.f62621a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r3)
            if (r2 == 0) goto L4c
            goto L67
        L66:
            r1 = 0
        L67:
            h02.c r1 = (h02.c) r1
            if (r1 != 0) goto L72
            java.lang.Object r4 = zhm.d0.b0(r5)
            h02.c r4 = (h02.c) r4
            return r4
        L72:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j82.s.I2(j82.s, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Intrinsics.checkNotNullExpressionValue("s", "MB_TAG");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "s", j6.a.q("MB PendingPayment: create: ", this.o.f62621a), null, null, 16);
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.H(new p(this, continuation, 1), this.f172102r), null, null, new q(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f172101q;
    }
}
