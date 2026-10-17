package pti;

import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f239731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f239732x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f239732x = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                d dVar = new d((e) this.f239732x, (Continuation) obj4, 0);
                dVar.f239731w = (String) obj3;
                return dVar.invokeSuspend(Unit.f186387a);
            case 1:
                d dVar2 = new d((u) this.f239732x, (Continuation) obj4, 1);
                dVar2.f239731w = (String) obj3;
                return dVar2.invokeSuspend(Unit.f186387a);
            case 2:
                d dVar3 = new d((z) this.f239732x, (Continuation) obj4, 2);
                dVar3.f239731w = (String) obj3;
                return dVar3.invokeSuspend(Unit.f186387a);
            case 3:
                d dVar4 = new d((qac.b) this.f239732x, (Continuation) obj4, 3);
                dVar4.f239731w = (String) obj3;
                return dVar4.invokeSuspend(Unit.f186387a);
            case 4:
                d dVar5 = new d((qac.i) this.f239732x, (Continuation) obj4, 4);
                dVar5.f239731w = (wbc.b) obj3;
                return dVar5.invokeSuspend(Unit.f186387a);
            case 5:
                d dVar6 = new d((qac.i) this.f239732x, (Continuation) obj4, 5);
                dVar6.f239731w = (String) obj3;
                return dVar6.invokeSuspend(Unit.f186387a);
            case 6:
                d dVar7 = new d((qf7.i) this.f239732x, (Continuation) obj4, 6);
                dVar7.f239731w = (IncentiveRewardDetailsParams) obj3;
                return dVar7.invokeSuspend(Unit.f186387a);
            case 7:
                d dVar8 = new d((qf7.i) this.f239732x, (Continuation) obj4, 7);
                dVar8.f239731w = (Map) obj3;
                return dVar8.invokeSuspend(Unit.f186387a);
            case 8:
                d dVar9 = new d((qhc.b) this.f239732x, (Continuation) obj4, 8);
                dVar9.f239731w = (String) obj3;
                return dVar9.invokeSuspend(Unit.f186387a);
            case 9:
                d dVar10 = new d((qj8.j) this.f239732x, (Continuation) obj4, 9);
                dVar10.f239731w = (qj8.a) obj3;
                return dVar10.invokeSuspend(Unit.f186387a);
            case 10:
                d dVar11 = new d((qj8.l) this.f239732x, (Continuation) obj4, 10);
                dVar11.f239731w = (String) obj3;
                return dVar11.invokeSuspend(Unit.f186387a);
            case 11:
                d dVar12 = new d((qse.i) this.f239732x, (Continuation) obj4, 11);
                dVar12.f239731w = (Pair) obj3;
                return dVar12.invokeSuspend(Unit.f186387a);
            case 12:
                d dVar13 = new d((r24.d) this.f239732x, (Continuation) obj4, 12);
                dVar13.f239731w = (String) obj3;
                return dVar13.invokeSuspend(Unit.f186387a);
            case 13:
                return new d((r5c.b) this.f239732x, (Continuation) obj4, 13).invokeSuspend(Unit.f186387a);
            case 14:
                d dVar14 = new d((rp1.j) this.f239732x, (Continuation) obj4, 14);
                dVar14.f239731w = (xo1.d) obj3;
                return dVar14.invokeSuspend(Unit.f186387a);
            case 15:
                d dVar15 = new d((rs2.n) this.f239732x, (Continuation) obj4, 15);
                dVar15.f239731w = (String) obj3;
                return dVar15.invokeSuspend(Unit.f186387a);
            case 16:
                d dVar16 = new d((s5f.b) this.f239732x, (Continuation) obj4, 16);
                dVar16.f239731w = (String) obj3;
                return dVar16.invokeSuspend(Unit.f186387a);
            case 17:
                d dVar17 = new d((com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a) this.f239732x, (Continuation) obj4, 17);
                dVar17.f239731w = (FlowCollector) obj2;
                return dVar17.invokeSuspend(Unit.f186387a);
            case 18:
                d dVar18 = new d((sbd.h) this.f239732x, (Continuation) obj4, 18);
                dVar18.f239731w = (sbd.d) obj3;
                return dVar18.invokeSuspend(Unit.f186387a);
            case 19:
                d dVar19 = new d((sbd.h) this.f239732x, (Continuation) obj4, 19);
                dVar19.f239731w = (String) obj3;
                return dVar19.invokeSuspend(Unit.f186387a);
            case 20:
                d dVar20 = new d((k18.c) this.f239732x, (Continuation) obj4, 20);
                dVar20.f239731w = (scl.d) obj3;
                return dVar20.invokeSuspend(Unit.f186387a);
            case 21:
                d dVar21 = new d((scl.j) this.f239732x, (Continuation) obj4, 21);
                dVar21.f239731w = (UUID) obj3;
                return dVar21.invokeSuspend(Unit.f186387a);
            case 22:
                d dVar22 = new d((sje.h) this.f239732x, (Continuation) obj4, 22);
                dVar22.f239731w = (FlowCollector) obj2;
                return dVar22.invokeSuspend(Unit.f186387a);
            case 23:
                d dVar23 = new d((sne.g) this.f239732x, (Continuation) obj4, 23);
                dVar23.f239731w = (sne.d) obj3;
                return dVar23.invokeSuspend(Unit.f186387a);
            case 24:
                return new d((swg.f) this.f239732x, (Continuation) obj4, 24).invokeSuspend(Unit.f186387a);
            case 25:
                d dVar24 = new d((t95.e) this.f239732x, (Continuation) obj4, 25);
                dVar24.f239731w = (t95.d) obj3;
                return dVar24.invokeSuspend(Unit.f186387a);
            case 26:
                d dVar25 = new d((tff.d) this.f239732x, (Continuation) obj4, 26);
                dVar25.f239731w = (String) obj3;
                return dVar25.invokeSuspend(Unit.f186387a);
            case 27:
                d dVar26 = new d((tff.d) this.f239732x, (Continuation) obj4, 27);
                dVar26.f239731w = (rff.a) obj3;
                return dVar26.invokeSuspend(Unit.f186387a);
            case 28:
                d dVar27 = new d((th6.h) this.f239732x, (Continuation) obj4, 28);
                dVar27.f239731w = (String) obj3;
                return dVar27.invokeSuspend(Unit.f186387a);
            default:
                d dVar28 = new d((th6.m) this.f239732x, (Continuation) obj4, 29);
                dVar28.f239731w = (th6.a) obj3;
                return dVar28.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:537:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v21, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v63, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 2954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pti.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
