package pkf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes8.dex */
public final class x extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f237151w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f237152x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f237153y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f237153y = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                x xVar = new x((Continuation) obj4, (z) this.f237153y, 0);
                xVar.f237151w = flowCollector;
                xVar.f237152x = obj3;
                return xVar.invokeSuspend(Unit.f186387a);
            case 1:
                x xVar2 = new x((Continuation) obj4, (d0) this.f237153y, 1);
                xVar2.f237151w = flowCollector;
                xVar2.f237152x = obj3;
                return xVar2.invokeSuspend(Unit.f186387a);
            case 2:
                x xVar3 = new x((Continuation) obj4, (p1) this.f237153y, 2);
                xVar3.f237151w = flowCollector;
                xVar3.f237152x = obj3;
                return xVar3.invokeSuspend(Unit.f186387a);
            case 3:
                x xVar4 = new x((Continuation) obj4, (y1) this.f237153y, 3);
                xVar4.f237151w = flowCollector;
                xVar4.f237152x = obj3;
                return xVar4.invokeSuspend(Unit.f186387a);
            case 4:
                x xVar5 = new x((Continuation) obj4, (v2) this.f237153y, 4);
                xVar5.f237151w = flowCollector;
                xVar5.f237152x = obj3;
                return xVar5.invokeSuspend(Unit.f186387a);
            case 5:
                x xVar6 = new x((Continuation) obj4, (pkg.j) this.f237153y, 5);
                xVar6.f237151w = flowCollector;
                xVar6.f237152x = obj3;
                return xVar6.invokeSuspend(Unit.f186387a);
            case 6:
                x xVar7 = new x((Continuation) obj4, (pnb.h) this.f237153y, 6);
                xVar7.f237151w = flowCollector;
                xVar7.f237152x = obj3;
                return xVar7.invokeSuspend(Unit.f186387a);
            case 7:
                x xVar8 = new x((Continuation) obj4, (com.revolut.feature.wealth.ui.impl.trades.b) this.f237153y, 7);
                xVar8.f237151w = flowCollector;
                xVar8.f237152x = obj3;
                return xVar8.invokeSuspend(Unit.f186387a);
            case 8:
                x xVar9 = new x((Continuation) obj4, (pnj.h) this.f237153y, 8);
                xVar9.f237151w = flowCollector;
                xVar9.f237152x = obj3;
                return xVar9.invokeSuspend(Unit.f186387a);
            case 9:
                x xVar10 = new x((Continuation) obj4, (pq7.p) this.f237153y, 9);
                xVar10.f237151w = flowCollector;
                xVar10.f237152x = obj3;
                return xVar10.invokeSuspend(Unit.f186387a);
            case 10:
                x xVar11 = new x((Continuation) obj4, (com.revolut.feature.payments.groups.impl.ui_chat.settings.d) this.f237153y, 10);
                xVar11.f237151w = flowCollector;
                xVar11.f237152x = obj3;
                return xVar11.invokeSuspend(Unit.f186387a);
            case 11:
                x xVar12 = new x((Continuation) obj4, (psl.n) this.f237153y, 11);
                xVar12.f237151w = flowCollector;
                xVar12.f237152x = obj3;
                return xVar12.invokeSuspend(Unit.f186387a);
            case 12:
                x xVar13 = new x((Continuation) obj4, (ptd.b) this.f237153y, 12);
                xVar13.f237151w = flowCollector;
                xVar13.f237152x = obj3;
                return xVar13.invokeSuspend(Unit.f186387a);
            case 13:
                x xVar14 = new x((Continuation) obj4, (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.details.b) this.f237153y, 13);
                xVar14.f237151w = flowCollector;
                xVar14.f237152x = obj3;
                return xVar14.invokeSuspend(Unit.f186387a);
            case 14:
                x xVar15 = new x((Continuation) obj4, (pvb.e) this.f237153y, 14);
                xVar15.f237151w = flowCollector;
                xVar15.f237152x = obj3;
                return xVar15.invokeSuspend(Unit.f186387a);
            case 15:
                x xVar16 = new x((Continuation) obj4, (pvk.e) this.f237153y, 15);
                xVar16.f237151w = flowCollector;
                xVar16.f237152x = obj3;
                return xVar16.invokeSuspend(Unit.f186387a);
            case 16:
                x xVar17 = new x((pw4.d) this.f237153y, (Continuation) obj4);
                xVar17.f237151w = flowCollector;
                xVar17.f237152x = (Throwable) obj3;
                return xVar17.invokeSuspend(Unit.f186387a);
            case 17:
                x xVar18 = new x((Continuation) obj4, (q03.h0) this.f237153y, 17);
                xVar18.f237151w = flowCollector;
                xVar18.f237152x = obj3;
                return xVar18.invokeSuspend(Unit.f186387a);
            case 18:
                x xVar19 = new x((Continuation) obj4, (k18.c) this.f237153y, 18);
                xVar19.f237151w = flowCollector;
                xVar19.f237152x = obj3;
                return xVar19.invokeSuspend(Unit.f186387a);
            case 19:
                x xVar20 = new x((Continuation) obj4, (vii.b) this.f237153y, 19);
                xVar20.f237151w = flowCollector;
                xVar20.f237152x = obj3;
                return xVar20.invokeSuspend(Unit.f186387a);
            case 20:
                x xVar21 = new x((Continuation) obj4, (com.revolut.feature.store.impl.ui.brand_detail.flow.c) this.f237153y, 20);
                xVar21.f237151w = flowCollector;
                xVar21.f237152x = (Object[]) obj3;
                return xVar21.invokeSuspend(Unit.f186387a);
            case 21:
                x xVar22 = new x((Continuation) obj4, (q42.j) this.f237153y, 21);
                xVar22.f237151w = flowCollector;
                xVar22.f237152x = obj3;
                return xVar22.invokeSuspend(Unit.f186387a);
            case 22:
                x xVar23 = new x((Continuation) obj4, (q4b.j) this.f237153y, 22);
                xVar23.f237151w = flowCollector;
                xVar23.f237152x = obj3;
                return xVar23.invokeSuspend(Unit.f186387a);
            case 23:
                x xVar24 = new x((Continuation) obj4, (q4h.d) this.f237153y, 23);
                xVar24.f237151w = flowCollector;
                xVar24.f237152x = obj3;
                return xVar24.invokeSuspend(Unit.f186387a);
            case 24:
                x xVar25 = new x((Continuation) obj4, (com.revolut.feature.defi.remittances.impl.ui.send.add_beneficiary.a) this.f237153y, 24);
                xVar25.f237151w = flowCollector;
                xVar25.f237152x = obj3;
                return xVar25.invokeSuspend(Unit.f186387a);
            case 25:
                x xVar26 = new x((Continuation) obj4, (q5g.h) this.f237153y, 25);
                xVar26.f237151w = flowCollector;
                xVar26.f237152x = obj3;
                return xVar26.invokeSuspend(Unit.f186387a);
            case 26:
                x xVar27 = new x((Continuation) obj4, (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) this.f237153y, 26);
                xVar27.f237151w = flowCollector;
                xVar27.f237152x = obj3;
                return xVar27.invokeSuspend(Unit.f186387a);
            case 27:
                x xVar28 = new x((Continuation) obj4, (q5h.k) this.f237153y, 27);
                xVar28.f237151w = flowCollector;
                xVar28.f237152x = obj3;
                return xVar28.invokeSuspend(Unit.f186387a);
            case 28:
                x xVar29 = new x((Continuation) obj4, (com.revolut.feature.wealth.gia.margin_trading.impl.ui.margin_minimum_requirement.a) this.f237153y, 28);
                xVar29.f237151w = flowCollector;
                xVar29.f237152x = obj3;
                return xVar29.invokeSuspend(Unit.f186387a);
            default:
                x xVar30 = new x((Continuation) obj4, (com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a) this.f237153y, 29);
                xVar30.f237151w = flowCollector;
                xVar30.f237152x = obj3;
                return xVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:479:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pkf.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(pw4.d dVar, Continuation continuation) {
        super(3, continuation);
        this.u = 16;
        this.f237153y = dVar;
    }
}
