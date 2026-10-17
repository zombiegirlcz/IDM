package fee;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l extends oki.h implements dli.b {
    public final InboundTransactionListScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sde.b f134600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f134601q;

    public l(n stateMapper, InboundTransactionListScreenContract$InputData inputData, sde.b inboundTransactionListInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inboundTransactionListInteractor, "inboundTransactionListInteractor");
        this.o = inputData;
        this.f134600p = inboundTransactionListInteractor;
        this.f134601q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(fee.l r5, gim.c r6) {
        /*
            cli.y r0 = r5.f134601q
            boolean r1 = r6 instanceof fee.j
            if (r1 == 0) goto L15
            r1 = r6
            fee.j r1 = (fee.j) r1
            int r2 = r1.f134598w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f134598w = r2
            goto L1a
        L15:
            fee.j r1 = new fee.j
            r1.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f134598w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L4e
        L29:
            r6 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            fe9.f r6 = new fe9.f
            r3 = 3
            r6.<init>(r3)
            r5.H2(r0, r6)
            sde.b r6 = r5.f134600p     // Catch: java.lang.Throwable -> L29
            com.revolut.feature.support.impl.transfer_tracker.ui.inbound_transaction_list.InboundTransactionListScreenContract$InputData r3 = r5.o     // Catch: java.lang.Throwable -> L29
            java.util.List r3 = r3.f89409a     // Catch: java.lang.Throwable -> L29
            r1.f134598w = r4     // Catch: java.lang.Throwable -> L29
            java.io.Serializable r6 = r6.a(r3, r1)     // Catch: java.lang.Throwable -> L29
            if (r6 != r2) goto L4e
            return r2
        L4e:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> L29
            do2.o r1 = new do2.o     // Catch: java.lang.Throwable -> L29
            r2 = 21
            r1.<init>(r6, r2)     // Catch: java.lang.Throwable -> L29
            r5.H2(r0, r1)     // Catch: java.lang.Throwable -> L29
            goto L6f
        L5b:
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            r3 = 0
            rd0.d.a(r2, r3, r3, r6, r1)
            ab4.q r1 = new ab4.q
            r2 = 11
            r1.<init>(r6, r2)
            r5.H2(r0, r1)
        L6f:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fee.l.I2(fee.l, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null, 0), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f134601q;
    }
}
