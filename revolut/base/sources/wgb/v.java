package wgb;

import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.retail.core.navigation.NaviCommand;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import wj8.c0;
import wp4.i0;
import wp5.c1;

/* JADX INFO: loaded from: classes6.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f297298w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f297299x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297298w = obj2;
        this.f297299x = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new v((com.revolut.feature.retail.salary_account.impl.salary_promotion.b) this.f297298w, (String) this.f297299x, continuation, 0);
            case 1:
                return new v((com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.contact_selection.d) this.f297298w, (zm3.l) this.f297299x, continuation, 1);
            case 2:
                return new v((wh8.b) this.f297298w, (kf8.h) this.f297299x, continuation, 2);
            case 3:
                return new v((wh8.j) this.f297298w, (String) this.f297299x, continuation, 3);
            case 4:
                return new v((com.revolut.kompot.bridge.impl.rootflow.a) this.f297298w, (aii.i) this.f297299x, continuation, 4);
            case 5:
                return new v((com.revolut.kompot.bridge.impl.rootflow.a) this.f297298w, (String) this.f297299x, continuation, 5);
            case 6:
                v vVar = new v((wi6.t) this.f297299x, continuation, 6);
                vVar.f297298w = obj2;
                return vVar;
            case 7:
                return new v((wik.g) this.f297298w, (String) this.f297299x, continuation, 7);
            case 8:
                return new v((wj3.a) this.f297298w, (NaviCommand) this.f297299x, continuation, 8);
            case 9:
                return new v((com.revolut.feature.insurance.impl.ui.cfac.claim.expense_details.b) this.f297298w, (File) this.f297299x, continuation, 9);
            case 10:
                return new v((c0) this.f297298w, (Function1) this.f297299x, continuation);
            case 11:
                return new v((Ref$ObjectRef) this.f297298w, (wka.h) this.f297299x, continuation, 11);
            case 12:
                v vVar2 = new v((wkm.g) this.f297299x, continuation, 12);
                vVar2.f297298w = obj2;
                return vVar2;
            case 13:
                v vVar3 = new v((FlowCollector) this.f297299x, continuation, 13);
                vVar3.f297298w = obj2;
                return vVar3;
            case 14:
                return new v((com.revolut.feature.payees.impl.ui.payees_overview.personal.a) this.f297298w, (km9.f) this.f297299x, continuation, 14);
            case 15:
                return new v((wo2.m) this.f297298w, (yo2.d) this.f297299x, continuation, 15);
            case 16:
                return new v((wo2.m) this.f297298w, (ArrayList) this.f297299x, continuation, 16);
            case 17:
                return new v((com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) this.f297298w, (String) this.f297299x, continuation, 17);
            case 18:
                v vVar4 = new v((wol.t) this.f297299x, continuation, 18);
                vVar4.f297298w = obj2;
                return vVar4;
            case 19:
                return new v((wol.t) this.f297298w, (String) this.f297299x, continuation, 19);
            case 20:
                v vVar5 = new v((i0) this.f297299x, continuation, 20);
                vVar5.f297298w = obj2;
                return vVar5;
            case 21:
                return new v((c1) this.f297298w, (CryptoAddress) this.f297299x, continuation, 21);
            case 22:
                return new v((c1) this.f297298w, continuation);
            case 23:
                return new v((c1) this.f297298w, (xi0.b) this.f297299x, continuation, 23);
            case 24:
                v vVar6 = new v((com.revolut.feature.wealth_discovery.impl.screener.screens.edit_screener.a) this.f297299x, continuation, 24);
                vVar6.f297298w = obj2;
                return vVar6;
            case 25:
                return new v((wrb.h) this.f297298w, (del.a) this.f297299x, continuation, 25);
            case 26:
                return new v((wt7.i) this.f297298w, (String) this.f297299x, continuation, 26);
            case 27:
                return new v((vs7.c) this.f297298w, (wt7.i) this.f297299x, continuation, 27);
            case 28:
                v vVar7 = new v((uvl.c) this.f297299x, continuation, 28);
                vVar7.f297298w = obj2;
                return vVar7;
            default:
                return new v((com.revolut.retail.feature.airport.security_fast_track.impl.ui.flows.widget.a) this.f297298w, (lui.e) this.f297299x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((v) create((fi6.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((v) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((v) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((v) create((tll.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((v) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((v) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((v) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x05ce, code lost:
    
        if (r0 == r2) goto L297;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0, types: [no3.b] */
    /* JADX WARN: Type inference failed for: r5v27, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wgb.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297299x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(c0 c0Var, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.f297298w = c0Var;
        this.f297299x = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(c1 c1Var, Continuation continuation) {
        super(2, continuation);
        this.u = 22;
        this.f297298w = c1Var;
    }
}
