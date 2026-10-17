package mtj;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.lifestyle.core.impl.network.LifestyleHomeService;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import dej.d4;
import i29.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import n8a.b0;
import n8a.x;
import nfj.a0;
import nfj.d0;
import nfj.e0;
import nfj.e1;
import nfj.m1;
import nfj.q0;
import nfj.s2;
import nfj.u;
import nfj.u0;
import nfj.w2;
import nfj.y;
import nfj.y0;
import nfj.z0;
import t7h.s;
import w19.g;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f208882w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f208883x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f208883x = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r0 == r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r0 == r11) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        if (r0 == r11) goto L30;
     */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f208883x
            o0b.e r0 = (o0b.e) r0
            java.lang.Object r1 = r14.f208882w
            r10 = r1
            o0b.a r10 = (o0b.a) r10
            fim.a r11 = fim.a.COROUTINE_SUSPENDED
            int r1 = r14.v
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L30
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            yhm.o.b(r15)
            r0 = r15
            goto L5e
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L25:
            yhm.o.b(r15)
            r0 = r15
            goto L88
        L2a:
            yhm.o.b(r15)
            r0 = r15
            goto Lb4
        L30:
            yhm.o.b(r15)
            c1b.l r1 = r10.f
            int[] r5 = o0b.d.f221192a
            int r1 = r1.ordinal()
            r1 = r5[r1]
            if (r1 == r4) goto L91
            if (r1 == r3) goto L6d
            if (r1 != r2) goto L67
            com.revolut.feature.retail.advanced_charts.impl.data.AdvancedChartsService r0 = r0.f221193a
            java.lang.String r1 = r10.d
            long r3 = r10.f221186a
            r6 = r3
            long r4 = r10.f221187b
            r12 = r6
            java.lang.String r6 = r10.e
            int r7 = r10.f221188c
            r14.f208882w = r10
            r14.v = r2
            r8 = r14
            r2 = r12
            java.lang.Object r0 = r0.getRevolutXSymbolChartHistory(r1, r2, r4, r6, r7, r8)
            if (r0 != r11) goto L5e
            goto Lb3
        L5e:
            p0b.a r0 = (p0b.a) r0
            java.lang.String r1 = r10.d
            c1b.g r0 = vc.o.t(r0, r1)
            return r0
        L67:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L6d:
            com.revolut.feature.retail.advanced_charts.impl.data.AdvancedChartsService r0 = r0.f221193a
            java.lang.String r1 = r10.d
            long r4 = r10.f221186a
            r6 = r4
            long r4 = r10.f221187b
            r12 = r6
            java.lang.String r6 = r10.e
            int r7 = r10.f221188c
            r14.f208882w = r10
            r14.v = r3
            r8 = r14
            r2 = r12
            java.lang.Object r0 = r0.getCryptoSymbolChartHistory(r1, r2, r4, r6, r7, r8)
            if (r0 != r11) goto L88
            goto Lb3
        L88:
            p0b.a r0 = (p0b.a) r0
            java.lang.String r1 = r10.d
            c1b.g r0 = vc.o.t(r0, r1)
            return r0
        L91:
            com.revolut.feature.retail.advanced_charts.impl.data.AdvancedChartsService r0 = r0.f221193a
            java.lang.String r1 = r10.d
            long r2 = r10.f221186a
            long r5 = r10.f221187b
            r12 = r5
            java.lang.String r6 = r10.e
            int r7 = r10.f221188c
            w0b.d r5 = r10.f221189g
            java.lang.Object r9 = w0b.e.f293681a
            java.lang.String r5 = le.u1.g(r5, r9)
            r14.f208882w = r10
            r14.v = r4
            r9 = r14
            r8 = r5
            r4 = r12
            java.lang.Object r0 = r0.getStocksChartHistory(r1, r2, r4, r6, r7, r8, r9)
            if (r0 != r11) goto Lb4
        Lb3:
            return r11
        Lb4:
            p0b.a r0 = (p0b.a) r0
            java.lang.String r1 = r10.d
            c1b.g r0 = vc.o.t(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mtj.k.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r1 == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (r1 == r3) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mtj.k.c(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj2) {
        String str = (String) this.f208882w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            LifestyleHomeService lifestyleHomeService = ((o29.d) this.f208883x).f221551a;
            this.f208882w = null;
            this.v = 1;
            obj2 = lifestyleHomeService.getOnboardingInfo(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        i29.b bVar = (i29.b) obj2;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar instanceof b.C0906b) {
            b.C0906b c0906b = (b.C0906b) bVar;
            return new w19.h(new w19.f(c0906b.f157901a, c0906b.f157902b, c0906b.f157903c, c0906b.d, c0906b.e));
        }
        if (bVar instanceof b.c) {
            return g.b.f293810b;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Object o(Object obj2) {
        o29.i iVar = (o29.i) this.f208882w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            LifestyleHomeService lifestyleHomeService = ((o29.m) this.f208883x).f221567a;
            String str = iVar.f221559b;
            String str2 = iVar.f221558a;
            this.f208882w = null;
            this.v = 1;
            obj2 = lifestyleHomeService.getSavingsBottomSheet(str, str2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        j29.l lVar = (j29.l) obj2;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        String str3 = lVar.f170757a;
        String str4 = lVar.f170758b;
        RevPointsTextWithLinks revPointsTextWithLinksA = qvb.b.a(lVar.f170759c);
        j29.k kVar = lVar.d;
        y19.c cVar = kVar != null ? new y19.c(kVar.f170755a, kVar.f170756b) : null;
        List<j29.h> list = lVar.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (j29.h hVar : list) {
            arrayList.add(new y19.b(hVar.f170752a, hVar.f170753b));
        }
        return new y19.d(str3, str4, revPointsTextWithLinksA, cVar, arrayList);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                k kVar = new k((q) this.f208883x, (Continuation) obj4, 0);
                kVar.f208882w = (d0j.l) obj3;
                return kVar.invokeSuspend(Unit.f186387a);
            case 1:
                k kVar2 = new k((lal.a) this.f208883x, (Continuation) obj4, 1);
                kVar2.f208882w = (t7h.d) obj3;
                return kVar2.invokeSuspend(Unit.f186387a);
            case 2:
                k kVar3 = new k((n7h.b) this.f208883x, (Continuation) obj4, 2);
                kVar3.f208882w = (s) obj3;
                return kVar3.invokeSuspend(Unit.f186387a);
            case 3:
                k kVar4 = new k((n7h.e) this.f208883x, (Continuation) obj4, 3);
                kVar4.f208882w = (t7h.o) obj3;
                return kVar4.invokeSuspend(Unit.f186387a);
            case 4:
                k kVar5 = new k((n8a.o) this.f208883x, (Continuation) obj4, 4);
                kVar5.f208882w = (AccountId) obj3;
                return kVar5.invokeSuspend(Unit.f186387a);
            case 5:
                k kVar6 = new k((x) this.f208883x, (Continuation) obj4, 5);
                kVar6.f208882w = (String) obj3;
                return kVar6.invokeSuspend(Unit.f186387a);
            case 6:
                k kVar7 = new k((b0) this.f208883x, (Continuation) obj4, 6);
                kVar7.f208882w = (l8a.j) obj3;
                return kVar7.invokeSuspend(Unit.f186387a);
            case 7:
                k kVar8 = new k((neh.b) this.f208883x, (Continuation) obj4, 7);
                kVar8.f208882w = (teh.c) obj3;
                return kVar8.invokeSuspend(Unit.f186387a);
            case 8:
                k kVar9 = new k((neh.b) this.f208883x, (Continuation) obj4, 8);
                kVar9.f208882w = (String) obj3;
                return kVar9.invokeSuspend(Unit.f186387a);
            case 9:
                k kVar10 = new k((nf5.d) this.f208883x, (Continuation) obj4, 9);
                kVar10.f208882w = (List) obj3;
                return kVar10.invokeSuspend(Unit.f186387a);
            case 10:
                k kVar11 = new k((nfj.p) this.f208883x, (Continuation) obj4, 10);
                kVar11.f208882w = (nfj.n) obj3;
                return kVar11.invokeSuspend(Unit.f186387a);
            case 11:
                k kVar12 = new k((u) this.f208883x, (Continuation) obj4, 11);
                kVar12.f208882w = (List) obj3;
                return kVar12.invokeSuspend(Unit.f186387a);
            case 12:
                k kVar13 = new k((y) this.f208883x, (Continuation) obj4, 12);
                kVar13.f208882w = (String) obj3;
                return kVar13.invokeSuspend(Unit.f186387a);
            case 13:
                k kVar14 = new k((nfj.b0) this.f208883x, (Continuation) obj4, 13);
                kVar14.f208882w = (a0) obj3;
                return kVar14.invokeSuspend(Unit.f186387a);
            case 14:
                k kVar15 = new k((e0) this.f208883x, (Continuation) obj4, 14);
                kVar15.f208882w = (d0) obj3;
                return kVar15.invokeSuspend(Unit.f186387a);
            case 15:
                k kVar16 = new k((u0) this.f208883x, (Continuation) obj4, 15);
                kVar16.f208882w = (q0) obj3;
                return kVar16.invokeSuspend(Unit.f186387a);
            case 16:
                k kVar17 = new k((z0) this.f208883x, (Continuation) obj4, 16);
                kVar17.f208882w = (y0) obj3;
                return kVar17.invokeSuspend(Unit.f186387a);
            case 17:
                k kVar18 = new k((m1) this.f208883x, (Continuation) obj4, 17);
                kVar18.f208882w = (dej.m) obj3;
                return kVar18.invokeSuspend(Unit.f186387a);
            case 18:
                k kVar19 = new k((m1) this.f208883x, (Continuation) obj4, 18);
                kVar19.f208882w = (e1) obj3;
                return kVar19.invokeSuspend(Unit.f186387a);
            case 19:
                k kVar20 = new k((s2) this.f208883x, (Continuation) obj4, 19);
                kVar20.f208882w = (String) obj3;
                return kVar20.invokeSuspend(Unit.f186387a);
            case 20:
                k kVar21 = new k((w2) this.f208883x, (Continuation) obj4, 20);
                kVar21.f208882w = (d4) obj3;
                return kVar21.invokeSuspend(Unit.f186387a);
            case 21:
                k kVar22 = new k((nxb.e) this.f208883x, (Continuation) obj4, 21);
                kVar22.f208882w = (String) obj3;
                return kVar22.invokeSuspend(Unit.f186387a);
            case 22:
                k kVar23 = new k((nyd.k) this.f208883x, (Continuation) obj4, 22);
                kVar23.f208882w = (nyd.e) obj3;
                return kVar23.invokeSuspend(Unit.f186387a);
            case 23:
                String str = ((gyd.d) obj3).f147844a;
                k kVar24 = new k((nyd.k) this.f208883x, (Continuation) obj4, 23);
                kVar24.f208882w = str;
                return kVar24.invokeSuspend(Unit.f186387a);
            case 24:
                k kVar25 = new k((nyd.k) this.f208883x, (Continuation) obj4, 24);
                kVar25.f208882w = (nyd.f) obj3;
                return kVar25.invokeSuspend(Unit.f186387a);
            case 25:
                k kVar26 = new k((o0b.e) this.f208883x, (Continuation) obj4, 25);
                kVar26.f208882w = (o0b.a) obj3;
                return kVar26.invokeSuspend(Unit.f186387a);
            case 26:
                k kVar27 = new k((o24.e) this.f208883x, (Continuation) obj4, 26);
                kVar27.f208882w = (o24.a) obj3;
                return kVar27.invokeSuspend(Unit.f186387a);
            case 27:
                k kVar28 = new k((o29.d) this.f208883x, (Continuation) obj4, 27);
                kVar28.f208882w = (String) obj3;
                return kVar28.invokeSuspend(Unit.f186387a);
            case 28:
                k kVar29 = new k((o29.m) this.f208883x, (Continuation) obj4, 28);
                kVar29.f208882w = (o29.i) obj3;
                return kVar29.invokeSuspend(Unit.f186387a);
            default:
                k kVar30 = new k((o29.m) this.f208883x, (Continuation) obj4, 29);
                kVar30.f208882w = (o29.j) obj3;
                return kVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Type inference failed for: r1v22, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 3234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mtj.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
