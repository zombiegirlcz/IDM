package cbk;

import c84.y;
import com.revolut.feature.apm.core.models.quotes.ApmQuoteDirection;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends j {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tak.d f22883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ebk.b f22884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x02.a f22885n;
    public final a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vo9.a f22886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x02.d f22887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f22888r;

    public o(tak.d extension, ebk.b validator, x02.a pocketInteractor, a quoteInteractor, vo9.a pocketMapper, x02.d quoteRouter) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(pocketInteractor, "pocketInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(quoteRouter, "quoteRouter");
        this.f22883l = extension;
        this.f22884m = validator;
        this.f22885n = pocketInteractor;
        this.o = quoteInteractor;
        this.f22886p = pocketMapper;
        this.f22887q = quoteRouter;
        this.f22888r = q.c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d3(cbk.o r4, sak.c r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof cbk.n
            if (r0 == 0) goto L16
            r0 = r6
            cbk.n r0 = (cbk.n) r0
            int r1 = r0.f22882x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f22882x = r1
            goto L1b
        L16:
            cbk.n r0 = new cbk.n
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f22882x
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            cbk.o r5 = r0.u
            yhm.o.b(r6)
            goto L4b
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            yhm.o.b(r6)
            x02.d r6 = r4.f22887q
            sak.a r5 = r5.f261441b
            x02.c r2 = x02.c.CORAL
            r0.u = r4
            r0.f22882x = r3
            q12.l r6 = (q12.l) r6
            java.lang.Object r6 = r6.a(r5, r2, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r5 = r4
        L4b:
            dki.p r6 = (dki.p) r6
            c69.v r0 = new c69.v
            r1 = 20
            r0.<init>(r4, r1)
            r4 = 0
            yji.n.Q2(r5, r6, r4, r0, r3)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: cbk.o.d3(cbk.o, sak.c, gim.c):java.lang.Object");
    }

    @Override // cbk.i
    public final Flow Z2(PendingPaymentContract$InputData pendingPaymentContract$InputData) {
        PendingPaymentContract$InputData.Apm inputData = (PendingPaymentContract$InputData.Apm) pendingPaymentContract$InputData;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return c6d.b.i(new t38.e(this.f22883l.q(inputData.f102400a), 24, this.f22888r, new k(this, null)), new c7e.i(this, inputData, 7));
    }

    @Override // cbk.i
    public final void b3(sak.c paymentData) {
        ApmPaymentMethod apmPaymentMethod;
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        sak.b bVar = paymentData.f261442c;
        sak.a aVar = paymentData.f261441b;
        ApmQuote apmQuote = bVar != null ? bVar.f261437a : null;
        if (apmQuote == null) {
            IllegalStateException illegalStateException = new IllegalStateException("FX clicked without APM Quote");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        dj0.d dVar = aVar.f261436b;
        sak.f fVar = paymentData.f261440a.f261450j;
        if (fVar instanceof sak.d) {
            apmPaymentMethod = ((sak.d) fVar).f261443a;
        } else {
            if (!(fVar instanceof sak.e)) {
                throw new NoWhenBranchMatchedException();
            }
            apmPaymentMethod = ApmPaymentMethod.BLIK_P2P.f62165a;
        }
        A2(((q12.l) this.f22887q).d(dVar, aVar.f261435a, new ApmQuoteDirection.Outgoing(apmPaymentMethod), apmQuote));
    }

    @Override // cbk.i
    public final void c3(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        V2(new y(this, paymentData, null, 7), new yi5.b(29));
    }
}
