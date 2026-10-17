package xnl;

import com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import ft3.d1;
import ft3.j1;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;
import m2f.o;
import v20.s0;
import xpk.m;
import xq3.j;
import xr3.g0;
import xr3.k;
import xr3.n;
import xsh.r;
import xsi.p;
import y20.b1;
import y20.q;
import y20.t;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f307518w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f307519x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307518w = obj2;
        this.f307519x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((com.revolut.sso.impl.ui.passcode.change_flow.a) this.f307518w, (znl.c) this.f307519x, continuation, 0);
            case 1:
                return new f((com.revolut.feature.retail.savings.impl.ui.details.a) this.f307518w, (String) this.f307519x, continuation, 1);
            case 2:
                return new f((String) this.f307518w, (m) this.f307519x, continuation, 2);
            case 3:
                return new f((j) this.f307518w, (d1) this.f307519x, continuation, 3);
            case 4:
                return new f((com.revolut.feature.credit.card.impl.ui.description.a) this.f307518w, (ty0.a) this.f307519x, continuation, 4);
            case 5:
                return new f((k) this.f307518w, (j1) this.f307519x, continuation, 5);
            case 6:
                return new f((sq3.a) this.f307518w, (n) this.f307519x, continuation, 6);
            case 7:
                return new f((g0) this.f307518w, (j1) this.f307519x, continuation, 7);
            case 8:
                return new f((xrg.d) this.f307518w, (File) this.f307519x, continuation, 8);
            case 9:
                return new f((xrg.d) this.f307518w, (oo0.g) this.f307519x, continuation, 9);
            case 10:
                return new f((r) this.f307518w, (String) this.f307519x, continuation, 10);
            case 11:
                f fVar = new f((p) this.f307519x, continuation, 11);
                fVar.f307518w = obj2;
                return fVar;
            case 12:
                return new f((xta.d) this.f307519x, continuation, 12);
            case 13:
                return new f((com.revolut.feature.rev_points.buying.impl.ui.flow.a) this.f307518w, (dj0.d) this.f307519x, continuation, 13);
            case 14:
                f fVar2 = new f((fti.b) this.f307519x, continuation, 14);
                fVar2.f307518w = obj2;
                return fVar2;
            case 15:
                f fVar3 = new f((xvi.g) this.f307519x, continuation, 15);
                fVar3.f307518w = obj2;
                return fVar3;
            case 16:
                return new f((xvj.e) this.f307518w, (String) this.f307519x, continuation, 16);
            case 17:
                return new f((xxh.e) this.f307518w, (xxh.c) this.f307519x, continuation, 17);
            case 18:
                return new f((com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.a) this.f307518w, (Map) this.f307519x, continuation, 18);
            case 19:
                return new f((xy9.e) this.f307518w, (SendFromClipboardType) this.f307519x, continuation, 19);
            case 20:
                return new f((com.revolut.feature.selfserve.sot.impl.ui.flow.e) this.f307518w, (IncomeSource) this.f307519x, continuation, 20);
            case 21:
                return new f((com.revolut.feature.card_management.impl.ui.change_pin.b) this.f307518w, (String) this.f307519x, continuation, 21);
            case 22:
                return new f((com.revolut.feature.statements.impl.ui.custom_statement.screen.b) this.f307518w, (xi0.b) this.f307519x, continuation, 22);
            case 23:
                return new f((com.revolut.feature.rev_points.impl.ui.trophy_room.flow.a) this.f307518w, (String) this.f307519x, continuation, 23);
            case 24:
                f fVar4 = new f((com.revolut.feature.freelancer.impl.ui.sales.new_sale.a) this.f307519x, continuation, 24);
                fVar4.f307518w = obj2;
                return fVar4;
            case 25:
                return new f((com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.c) this.f307518w, (o) this.f307519x, continuation, 25);
            case 26:
                return new f((v60.g) this.f307518w, (ArrayList) this.f307519x, continuation, 26);
            case 27:
                return new f((v60.g) this.f307518w, (s0) this.f307519x, continuation, 27);
            case 28:
                f fVar5 = new f((b1) this.f307519x, continuation, 28);
                fVar5.f307518w = obj2;
                return fVar5;
            default:
                return new f((b1) this.f307518w, (t) this.f307519x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((rp0.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f) create((y17.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x065b, code lost:
    
        if (vkm.q.x(r1, r32) == r2) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (r0 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r0 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:499:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v32, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v142 */
    /* JADX WARN: Type inference failed for: r1v143 */
    /* JADX WARN: Type inference failed for: r1v55, types: [int] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xnl.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307519x = obj2;
    }
}
