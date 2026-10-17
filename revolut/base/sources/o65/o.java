package o65;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanUnavailableFeatures;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mle.x;
import nii.y0;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends yji.n implements e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l35.b f222518l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y45.i f222519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n65.a f222520n;
    public final vki.a o;

    public o(l35.b loanInteractor, y45.i loanProductInteractor, n65.a loanChangeRepaymentDayDialogMapper) {
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanChangeRepaymentDayDialogMapper, "loanChangeRepaymentDayDialogMapper");
        this.f222518l = loanInteractor;
        this.f222519m = loanProductInteractor;
        this.f222520n = loanChangeRepaymentDayDialogMapper;
        this.o = pyd.c.a(this, new d(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(o65.o r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof o65.g
            if (r0 == 0) goto L13
            r0 = r6
            o65.g r0 = (o65.g) r0
            int r1 = r0.f222506w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f222506w = r1
            goto L18
        L13:
            o65.g r0 = new o65.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f222506w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            y45.i r4 = r4.f222519m
            efm.r r4 = y45.i.c(r4, r5)
            o4a.a r5 = new o4a.a
            r6 = 5
            r5.<init>(r6)
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r5, r3)
            zhm.h0 r5 = zhm.h0.f322473a
            efm.r r4 = ue0.e.q(r4, r5)
            r0.f222506w = r3
            java.lang.Object r6 = nim.a.c(r4, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o65.o.Z2(o65.o, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0081, code lost:
    
        if (pu7.a.B(r11.e, "loanOverdueRepayment", new mh1.d(r11, r7, r8, r9, 22), r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(o65.o r11, java.lang.String r12, dj0.d r13, gim.c r14) throws com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$NotEnoughFundsException {
        /*
            boolean r0 = r14 instanceof o65.i
            if (r0 == 0) goto L13
            r0 = r14
            o65.i r0 = (o65.i) r0
            int r1 = r0.f222511y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f222511y = r1
            goto L18
        L13:
            o65.i r0 = new o65.i
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f222509w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f222511y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)
            goto L84
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            dj0.d r13 = r0.v
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
        L3a:
            r7 = r12
            r8 = r13
            goto L63
        L3d:
            yhm.o.b(r14)
            l35.b r14 = r11.f222518l
            efm.r r14 = l35.b.a(r14, r12)
            o4a.a r2 = new o4a.a
            r5 = 4
            r2.<init>(r5)
            efm.r r14 = m70.a.g(r14, r9, r2, r4)
            zhm.h0 r2 = zhm.h0.f322473a
            efm.r r14 = ue0.e.q(r14, r2)
            r0.u = r12
            r0.v = r13
            r0.f222511y = r4
            java.lang.Object r14 = nim.a.c(r14, r0)
            if (r14 != r1) goto L3a
            goto L83
        L63:
            dj0.d r14 = (dj0.d) r14
            int r12 = r14.compareTo(r8)
            if (r12 <= 0) goto L87
            r0.u = r9
            r0.v = r9
            r0.f222511y = r3
            mh1.d r5 = new mh1.d
            r10 = 22
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            nki.a r11 = r6.e
            java.lang.String r12 = "loanOverdueRepayment"
            java.lang.Object r11 = pu7.a.B(r11, r12, r5, r0)
            if (r11 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        L87:
            com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$NotEnoughFundsException r11 = new com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayFlowContract$NotEnoughFundsException
            dj0.d r12 = pyd.c.H(r8, r14)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o65.o.b3(o65.o, java.lang.String, dj0.d, gim.c):java.lang.Object");
    }

    public static Object e3(o oVar, y0 y0Var, Function1 function1, gim.c cVar, int i) {
        if ((i & 1) != 0) {
            function1 = new k(1, null);
        }
        return q.x(new x((rv6.e) oVar.L2(y0Var), function1, new l(1, null), 3), cVar);
    }

    public final void c3(boolean z) {
        LoanUnavailableFeatures loanUnavailableFeatures;
        if (z) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Loan change repayment day unavailable");
        LoanDetails loanDetails = ((d) ((j2) this.o.f22677a).getValue()).f222504a;
        Pair[] elements = {new Pair("loanState", String.valueOf(loanDetails != null ? loanDetails.f70144a.i : null)), new Pair("unavailabilityReason", String.valueOf((loanDetails == null || (loanUnavailableFeatures = loanDetails.f70151m) == null) ? null : loanUnavailableFeatures.d)), new Pair("repaymentDay", String.valueOf(loanDetails != null ? Integer.valueOf(loanDetails.f70146c) : null))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.WARNING, "LoanChangeRepaymentDayFlowExtension", null, illegalStateException, setY0);
        throw illegalStateException;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(java.lang.String r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o65.o.d3(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}
