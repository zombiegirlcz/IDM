package o29;

import com.revolut.trading.orders.data.network.services.TradingOrdersService;
import com.revolut.trading.orders.domain.models.InvestOrdersParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import pfk.p0;
import pfk.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f221563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f221564x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f221564x = obj2;
    }

    private final Object b(Object obj2) {
        prl.e eVar = (prl.e) this.f221564x;
        prl.c cVar = (prl.c) this.f221563w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.i iVar = new ufm.i(te0.w.n0(((TradingOrdersService) eVar.f239325b).getInvestOrderByCompoundId(cVar.f239323a), (b80.c) eVar.f239326c), new po9.w(24, new pqg.v(7)), 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            this.f221563w = null;
            this.v = 1;
            obj2 = nim.a.b(iVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                l lVar = new l((m) this.f221564x, (Continuation) obj4, 0);
                lVar.f221563w = (String) obj3;
                return lVar.invokeSuspend(Unit.f186387a);
            case 1:
                l lVar2 = new l((z) this.f221564x, (Continuation) obj4, 1);
                lVar2.f221563w = (y) obj3;
                return lVar2.invokeSuspend(Unit.f186387a);
            case 2:
                l lVar3 = new l((o36.b) this.f221564x, (Continuation) obj4, 2);
                lVar3.f221563w = (xi0.b) obj3;
                return lVar3.invokeSuspend(Unit.f186387a);
            case 3:
                l lVar4 = new l((o36.g) this.f221564x, (Continuation) obj4, 3);
                lVar4.f221563w = (n36.l) obj3;
                return lVar4.invokeSuspend(Unit.f186387a);
            case 4:
                l lVar5 = new l((o6e.a) this.f221564x, (Continuation) obj4, 4);
                lVar5.f221563w = (String) obj3;
                return lVar5.invokeSuspend(Unit.f186387a);
            case 5:
                l lVar6 = new l((oc0.f) this.f221564x, (Continuation) obj4, 5);
                lVar6.f221563w = (oc0.a) obj3;
                return lVar6.invokeSuspend(Unit.f186387a);
            case 6:
                l lVar7 = new l((oc0.f) this.f221564x, (Continuation) obj4, 6);
                lVar7.f221563w = (oc0.b) obj3;
                return lVar7.invokeSuspend(Unit.f186387a);
            case 7:
                l lVar8 = new l((oc0.k) this.f221564x, (Continuation) obj4, 7);
                lVar8.f221563w = (oc0.j) obj3;
                return lVar8.invokeSuspend(Unit.f186387a);
            case 8:
                l lVar9 = new l((oc0.m) this.f221564x, (Continuation) obj4, 8);
                lVar9.f221563w = (String) obj3;
                return lVar9.invokeSuspend(Unit.f186387a);
            case 9:
                l lVar10 = new l((of6.b) this.f221564x, (Continuation) obj4, 9);
                lVar10.f221563w = (String) obj3;
                return lVar10.invokeSuspend(Unit.f186387a);
            case 10:
                l lVar11 = new l((hd.r) this.f221564x, (Continuation) obj4, 10);
                lVar11.f221563w = (String) obj3;
                return lVar11.invokeSuspend(Unit.f186387a);
            case 11:
                l lVar12 = new l((or7.c) this.f221564x, (Continuation) obj4, 11);
                lVar12.f221563w = (String) obj3;
                return lVar12.invokeSuspend(Unit.f186387a);
            case 12:
                l lVar13 = new l((p24.v) this.f221564x, (Continuation) obj4, 12);
                lVar13.f221563w = (p24.w) obj3;
                return lVar13.invokeSuspend(Unit.f186387a);
            case 13:
                l lVar14 = new l((p24.v) this.f221564x, (Continuation) obj4, 13);
                lVar14.f221563w = (p24.x) obj3;
                return lVar14.invokeSuspend(Unit.f186387a);
            case 14:
                l lVar15 = new l((p5f.b) this.f221564x, (Continuation) obj4, 14);
                lVar15.f221563w = (String) obj3;
                return lVar15.invokeSuspend(Unit.f186387a);
            case 15:
                l lVar16 = new l((p5f.e) this.f221564x, (Continuation) obj4, 15);
                lVar16.f221563w = (p5f.f) obj3;
                return lVar16.invokeSuspend(Unit.f186387a);
            case 16:
                l lVar17 = new l((pfk.e) this.f221564x, (Continuation) obj4, 16);
                lVar17.f221563w = (pfk.b) obj3;
                return lVar17.invokeSuspend(Unit.f186387a);
            case 17:
                l lVar18 = new l((pfk.s) this.f221564x, (Continuation) obj4, 17);
                lVar18.f221563w = (pfk.i) obj3;
                return lVar18.invokeSuspend(Unit.f186387a);
            case 18:
                l lVar19 = new l((pfk.s) this.f221564x, (Continuation) obj4, 18);
                lVar19.f221563w = (pfk.j) obj3;
                return lVar19.invokeSuspend(Unit.f186387a);
            case 19:
                l lVar20 = new l((pfk.s) this.f221564x, (Continuation) obj4, 19);
                lVar20.f221563w = (pfk.l) obj3;
                return lVar20.invokeSuspend(Unit.f186387a);
            case 20:
                l lVar21 = new l((pfk.s) this.f221564x, (Continuation) obj4, 20);
                lVar21.f221563w = (String) obj3;
                return lVar21.invokeSuspend(Unit.f186387a);
            case 21:
                return new l((p0) this.f221564x, (Continuation) obj4, 21).invokeSuspend(Unit.f186387a);
            case 22:
                l lVar22 = new l((p0) this.f221564x, (Continuation) obj4, 22);
                lVar22.f221563w = (v0) obj3;
                return lVar22.invokeSuspend(Unit.f186387a);
            case 23:
                l lVar23 = new l((phc.j) this.f221564x, (Continuation) obj4, 23);
                lVar23.f221563w = (cgc.o) obj3;
                return lVar23.invokeSuspend(Unit.f186387a);
            case 24:
                l lVar24 = new l((phl.j) this.f221564x, (Continuation) obj4, 24);
                lVar24.f221563w = (phl.k) obj3;
                return lVar24.invokeSuspend(Unit.f186387a);
            case 25:
                l lVar25 = new l((plc.b) this.f221564x, (Continuation) obj4, 25);
                lVar25.f221563w = (String) obj3;
                return lVar25.invokeSuspend(Unit.f186387a);
            case 26:
                l lVar26 = new l((frk.b) this.f221564x, (Continuation) obj4, 26);
                lVar26.f221563w = (String) obj3;
                return lVar26.invokeSuspend(Unit.f186387a);
            case 27:
                l lVar27 = new l((plc.f) this.f221564x, (Continuation) obj4, 27);
                lVar27.f221563w = (String) obj3;
                return lVar27.invokeSuspend(Unit.f186387a);
            case 28:
                l lVar28 = new l((prl.e) this.f221564x, (Continuation) obj4, 28);
                lVar28.f221563w = (prl.c) obj3;
                return lVar28.invokeSuspend(Unit.f186387a);
            default:
                l lVar29 = new l((prl.f) this.f221564x, (Continuation) obj4, 29);
                lVar29.f221563w = (InvestOrdersParams) obj3;
                return lVar29.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:174:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x040b  */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.revolut.feature.lifestyle.core.api.model.savings.LifestyleSavingsSummary$SavingsHighlight$Cta] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v15, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v4, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o29.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
