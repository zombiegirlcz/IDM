package ya5;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.post_termination_plan.impl.ui.repay.PostTerminationPlanManualRepaymentControllerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import y20.a1;
import y4f.o;
import y99.x;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends oki.h implements dli.b {
    public final ra5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f311943p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final za5.a f311944q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ic2.c f311945r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f311946s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ky4.e f311947t;
    public final y u;

    public l(n stateMapper, PostTerminationPlanManualRepaymentControllerContract$InputData inputData, ra5.b postTerminationPlanInteractor, w80.b amountFormatter, za5.a statusDialogMapper, ic2.c errorHandlingDialogMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(postTerminationPlanInteractor, "postTerminationPlanInteractor");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        Intrinsics.checkNotNullParameter(errorHandlingDialogMapper, "errorHandlingDialogMapper");
        this.o = postTerminationPlanInteractor;
        this.f311943p = amountFormatter;
        this.f311944q = statusDialogMapper;
        this.f311945r = errorHandlingDialogMapper;
        this.f311946s = inputData.f70674a;
        this.f311947t = new ky4.e(0);
        this.u = mra.d.b(this, new f(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(ya5.l r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof ya5.j
            if (r0 == 0) goto L13
            r0 = r7
            ya5.j r0 = (ya5.j) r0
            int r1 = r0.f311940w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311940w = r1
            goto L18
        L13:
            ya5.j r0 = new ya5.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311940w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L56
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            ra5.b r7 = r6.o
            java.lang.String r6 = r6.f311946s
            vkm.d r6 = ra5.b.b(r7, r6)
            y99.x r7 = new y99.x
            r2 = 8
            r7.<init>(r2)
            akg.n r6 = nim.a.v(r6, r7)
            xsd.a r7 = new xsd.a
            r2 = 4
            r5 = 2
            r7.<init>(r5, r2, r4)
            r0.f311940w = r3
            java.lang.Object r7 = vkm.q.y(r6, r7, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Object r6 = r7.getContent()
            com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanRepaymentInfo r6 = (com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanRepaymentInfo) r6
            if (r6 == 0) goto L63
            dj0.d r6 = r6.f70659c
            return r6
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ya5.l.I2(ya5.l, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        this.o.d.a("IDEMPOTENCY_TAG_REPAY");
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(q.Q(this.f311947t, new o(continuation, this, 9)), new x(7)), null, null, new y83.d(this, continuation, 5), 3);
        l2(new a1(this, continuation, 14), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
