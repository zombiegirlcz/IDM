package vb4;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.data.model.Data;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import sgm.f0;
import tof.a3;
import tof.i7;
import tof.o7;
import tof.q7;
import tof.y6;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class s extends oki.h implements m {
    public final sb4.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f0 f287418p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f287419q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j2 f287420r;

    public s(sb4.c financialEvidenceFlowInteractor, f0 transactionsSearchEngine, t stateMapper) {
        Intrinsics.checkNotNullParameter(financialEvidenceFlowInteractor, "financialEvidenceFlowInteractor");
        Intrinsics.checkNotNullParameter(transactionsSearchEngine, "transactionsSearchEngine");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = financialEvidenceFlowInteractor;
        this.f287418p = transactionsSearchEngine;
        this.f287419q = mra.d.b(this, new g(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        m70.a.c(t0.f186434a);
        this.f287420r = vkm.q.c("");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(vb4.s r4, whf.p r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof vb4.r
            if (r0 == 0) goto L13
            r0 = r7
            vb4.r r0 = (vb4.r) r0
            int r1 = r0.f287417x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f287417x = r1
            goto L18
        L13:
            vb4.r r0 = new vb4.r
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f287417x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            whf.p r5 = r0.u
            yhm.o.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r7)
            sgm.f0 r4 = r4.f287418p
            java.util.List r7 = r5.f297646a
            r0.u = r5
            r0.f287417x = r3
            java.io.Serializable r7 = r4.a(r0, r6, r7)
            if (r7 != r1) goto L43
            return r1
        L43:
            java.util.List r7 = (java.util.List) r7
            whf.p r4 = whf.p.a(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vb4.s.I2(vb4.s, whf.p, java.lang.String, gim.c):java.io.Serializable");
    }

    public final void J2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof j)) {
            if (event instanceof h) {
                l2(new uxe.l(this, null, 14), new yi5.b(26));
                return;
            } else {
                if (!(event instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.f287420r.setValue(((i) event).f287407a);
                return;
            }
        }
        SelectableDelegate.Model model = ((j) event).f287408a;
        Object obj2 = ((RowDelegate.Model) model.f53305b).u;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.transactions.models.Transaction");
        String str = ((a3) obj2).f272581b;
        int i = o.f287413a[model.f53306c.ordinal()];
        y yVar = this.f287419q;
        if (i == 1 || i == 2) {
            H2(yVar, new vb2.r(str, 1));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new vb2.r(str, 2));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        sb4.c cVar = this.o;
        hx3.g gVar = (hx3.g) cVar.f261499a;
        gVar.getClass();
        i7.c cVar2 = i7.Companion;
        y6[] y6VarArr = {y6.TRANSFER};
        cVar2.getClass();
        q7 q7VarA = i7.c.a(i7.c.d(y6VarArr), new o7());
        whf.b bVar = gVar.d;
        efm.r rVarJust = efm.r.just(q7VarA);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        akg.n nVarI = u0.i(rd0.e.b(whf.b.a(bVar, rVarJust, null, null, null, 14)), ((hx3.g) cVar.f261499a).b(cVar.c()), new tnb.k(this.f287420r, 19));
        Continuation continuation = null;
        yji.l.b1(this, nim.a.u(new sxe.g(this, continuation, 16), nVarI), null, new v44.e(this, continuation, 17), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f287419q;
    }
}
