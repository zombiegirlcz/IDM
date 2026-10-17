package q7b;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import q97.d2;
import q97.p;
import q97.z0;
import q9c.b0;
import qc0.j0;
import qc2.n;
import qcc.m;
import qdk.w0;
import qg7.u;
import qoc.r;
import qwf.z;
import r0a.y;
import xl2.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f242800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f242801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f242802y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f242802y = obj2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                j jVar = new j((Continuation) obj4, (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.transactions.a) this.f242802y, 0);
                jVar.f242800w = (FlowCollector) obj2;
                jVar.f242801x = obj3;
                return jVar.invokeSuspend(Unit.f186387a);
            case 1:
                j jVar2 = new j((dj0.d) this.f242802y, (Continuation) obj4, 1);
                jVar2.f242800w = (FlowCollector) obj2;
                jVar2.f242801x = (Data) obj3;
                return jVar2.invokeSuspend(Unit.f186387a);
            case 2:
                j jVar3 = new j((Continuation) obj4, (q85.h) this.f242802y, 2);
                jVar3.f242800w = (FlowCollector) obj2;
                jVar3.f242801x = obj3;
                return jVar3.invokeSuspend(Unit.f186387a);
            case 3:
                j jVar4 = new j((String) this.f242801x, (eel.c) this.f242802y, this.v, (Continuation) obj4);
                jVar4.f242800w = (Throwable) obj3;
                return jVar4.invokeSuspend(Unit.f186387a);
            case 4:
                j jVar5 = new j((Continuation) obj4, (com.revolut.feature.apm.multibanco.impl.via_verde.ui.list.a) this.f242802y, 4);
                jVar5.f242800w = (FlowCollector) obj2;
                jVar5.f242801x = obj3;
                return jVar5.invokeSuspend(Unit.f186387a);
            case 5:
                j jVar6 = new j((Continuation) obj4, (p) this.f242802y, 5);
                jVar6.f242800w = (FlowCollector) obj2;
                jVar6.f242801x = obj3;
                return jVar6.invokeSuspend(Unit.f186387a);
            case 6:
                j jVar7 = new j((Continuation) obj4, (z0) this.f242802y, 6);
                jVar7.f242800w = (FlowCollector) obj2;
                jVar7.f242801x = obj3;
                return jVar7.invokeSuspend(Unit.f186387a);
            case 7:
                j jVar8 = new j((Continuation) obj4, (d2) this.f242802y, 7);
                jVar8.f242800w = (FlowCollector) obj2;
                jVar8.f242801x = obj3;
                return jVar8.invokeSuspend(Unit.f186387a);
            case 8:
                j jVar9 = new j((Continuation) obj4, (b0) this.f242802y, 8);
                jVar9.f242800w = (FlowCollector) obj2;
                jVar9.f242801x = obj3;
                return jVar9.invokeSuspend(Unit.f186387a);
            case 9:
                j jVar10 = new j((j0) this.f242802y, (Continuation) obj4, 9);
                jVar10.f242800w = (String) obj2;
                jVar10.f242801x = (h0) obj3;
                return jVar10.invokeSuspend(Unit.f186387a);
            case 10:
                j jVar11 = new j((Continuation) obj4, (n) this.f242802y, 10);
                jVar11.f242800w = (FlowCollector) obj2;
                jVar11.f242801x = obj3;
                return jVar11.invokeSuspend(Unit.f186387a);
            case 11:
                j jVar12 = new j((Continuation) obj4, (m) this.f242802y, 11);
                jVar12.f242800w = (FlowCollector) obj2;
                jVar12.f242801x = obj3;
                return jVar12.invokeSuspend(Unit.f186387a);
            case 12:
                j jVar13 = new j((Continuation) obj4, (w0) this.f242802y, 12);
                jVar13.f242800w = (FlowCollector) obj2;
                jVar13.f242801x = obj3;
                return jVar13.invokeSuspend(Unit.f186387a);
            case 13:
                j jVar14 = new j((Continuation) obj4, (u) this.f242802y, 13);
                jVar14.f242800w = (FlowCollector) obj2;
                jVar14.f242801x = obj3;
                return jVar14.invokeSuspend(Unit.f186387a);
            case 14:
                j jVar15 = new j((Continuation) obj4, (qgf.b) this.f242802y, 14);
                jVar15.f242800w = (FlowCollector) obj2;
                jVar15.f242801x = obj3;
                return jVar15.invokeSuspend(Unit.f186387a);
            case 15:
                j jVar16 = new j((Continuation) obj4, (qh2.h) this.f242802y, 15);
                jVar16.f242800w = (FlowCollector) obj2;
                jVar16.f242801x = obj3;
                return jVar16.invokeSuspend(Unit.f186387a);
            case 16:
                j jVar17 = new j((Continuation) obj4, (qjk.e) this.f242802y, 16);
                jVar17.f242800w = (FlowCollector) obj2;
                jVar17.f242801x = obj3;
                return jVar17.invokeSuspend(Unit.f186387a);
            case 17:
                j jVar18 = new j((Continuation) obj4, (qm8.d) this.f242802y, 17);
                jVar18.f242800w = (FlowCollector) obj2;
                jVar18.f242801x = obj3;
                return jVar18.invokeSuspend(Unit.f186387a);
            case 18:
                j jVar19 = new j((Continuation) obj4, (tla.a) this.f242802y, 18);
                jVar19.f242800w = (FlowCollector) obj2;
                jVar19.f242801x = obj3;
                return jVar19.invokeSuspend(Unit.f186387a);
            case 19:
                j jVar20 = new j((Continuation) obj4, (r) this.f242802y, 19);
                jVar20.f242800w = (FlowCollector) obj2;
                jVar20.f242801x = obj3;
                return jVar20.invokeSuspend(Unit.f186387a);
            case 20:
                j jVar21 = new j((Continuation) obj4, (qqe.j) this.f242802y, 20);
                jVar21.f242800w = (FlowCollector) obj2;
                jVar21.f242801x = obj3;
                return jVar21.invokeSuspend(Unit.f186387a);
            case 21:
                j jVar22 = new j((Continuation) obj4, (qt8.d) this.f242802y, 21);
                jVar22.f242800w = (FlowCollector) obj2;
                jVar22.f242801x = obj3;
                return jVar22.invokeSuspend(Unit.f186387a);
            case 22:
                j jVar23 = new j(this.f242802y, (Continuation) obj4, 22);
                jVar23.f242800w = (FlowCollector) obj2;
                jVar23.f242801x = (Throwable) obj3;
                return jVar23.invokeSuspend(Unit.f186387a);
            case 23:
                j jVar24 = new j((Continuation) obj4, (com.revolut.feature.staking.impl.stake.v2.b) this.f242802y, 23);
                jVar24.f242800w = (FlowCollector) obj2;
                jVar24.f242801x = obj3;
                return jVar24.invokeSuspend(Unit.f186387a);
            case 24:
                j jVar25 = new j((Continuation) obj4, (z) this.f242802y, 24);
                jVar25.f242800w = (FlowCollector) obj2;
                jVar25.f242801x = obj3;
                return jVar25.invokeSuspend(Unit.f186387a);
            case 25:
                j jVar26 = new j((Continuation) obj4, (r05.e) this.f242802y, 25);
                jVar26.f242800w = (FlowCollector) obj2;
                jVar26.f242801x = obj3;
                return jVar26.invokeSuspend(Unit.f186387a);
            case 26:
                j jVar27 = new j((Continuation) obj4, (r07.h) this.f242802y, 26);
                jVar27.f242800w = (FlowCollector) obj2;
                jVar27.f242801x = obj3;
                return jVar27.invokeSuspend(Unit.f186387a);
            case 27:
                j jVar28 = new j((Continuation) obj4, (y) this.f242802y, 27);
                jVar28.f242800w = (FlowCollector) obj2;
                jVar28.f242801x = obj3;
                return jVar28.invokeSuspend(Unit.f186387a);
            case 28:
                j jVar29 = new j((Continuation) obj4, (r18.m) this.f242802y, 28);
                jVar29.f242800w = (FlowCollector) obj2;
                jVar29.f242801x = obj3;
                return jVar29.invokeSuspend(Unit.f186387a);
            default:
                j jVar30 = new j((Continuation) obj4, (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.tax_type_picker.a) this.f242802y, 29);
                jVar30.f242800w = (FlowCollector) obj2;
                jVar30.f242801x = obj3;
                return jVar30.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:320:0x08a7  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:450:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:464:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7b.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, eel.c cVar, int i, Continuation continuation) {
        super(3, continuation);
        this.u = 3;
        this.f242801x = str;
        this.f242802y = cVar;
        this.v = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Continuation continuation, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f242802y = obj2;
    }
}
