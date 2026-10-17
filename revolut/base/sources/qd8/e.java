package qd8;

import com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose;
import com.revolut.feature.incentive_reward.impl.model.IncentiveRewardDetailsParams;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.SplitBillLinkAction;
import com.revolut.feature.tab.accounts.models.NonProductAccountFilter;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import gim.i;
import hwe.k;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qg7.v;
import qh2.h;
import qh4.b0;
import r15.n;
import rbj.l;
import rhe.m;
import skm.h0;
import ulm.j1;
import v94.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f244887w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f244888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f244889y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244887w = obj2;
        this.f244888x = obj3;
        this.f244889y = obj4;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e((f) this.f244889y, continuation, 0);
                eVar.f244888x = obj2;
                return eVar;
            case 1:
                return new e((com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a) this.f244888x, (h0) this.f244889y, continuation, 1);
            case 2:
                e eVar2 = new e(this.f244887w, this.f244889y, false, continuation, 2);
                eVar2.f244888x = obj2;
                return eVar2;
            case 3:
                return new e((qf7.i) this.f244887w, (IncentiveRewardDetailsParams) this.f244888x, (Map) this.f244889y, continuation, 3);
            case 4:
                e eVar3 = new e((h) this.f244889y, continuation, 4);
                eVar3.f244888x = obj2;
                return eVar3;
            case 5:
                return new e((b0) this.f244887w, (String) this.f244888x, (qce.a) this.f244889y, continuation, 5);
            case 6:
                return new e((b0) this.f244887w, (String) this.f244888x, (v) this.f244889y, continuation, 6);
            case 7:
                return new e((ql9.d) this.f244887w, (String) this.f244888x, (nl9.a) this.f244889y, continuation, 7);
            case 8:
                e eVar4 = new e(this.f244887w, this.f244889y, false, continuation, 8);
                eVar4.f244888x = obj2;
                return eVar4;
            case 9:
                return new e((qql.b) this.f244887w, (j1) this.f244888x, (pql.a) this.f244889y, continuation, 9);
            case 10:
                return new e((com.revolut.feature.transfer_reasons.impl.flow.a) this.f244887w, (ttf.d) this.f244888x, (TransferReasonsValues) this.f244889y, continuation, 10);
            case 11:
                e eVar5 = new e(this.f244887w, this.f244889y, false, continuation, 11);
                eVar5.f244888x = obj2;
                return eVar5;
            case 12:
                return new e((com.revolut.feature.staking.impl.stake.v2.b) this.f244887w, (g1j.b) this.f244888x, (xi0.b) this.f244889y, continuation, 12);
            case 13:
                return new e((xi0.b) this.f244887w, (com.revolut.feature.staking.impl.stake.v2.b) this.f244888x, (xi0.b) this.f244889y, continuation, 13);
            case 14:
                return new e((com.revolut.feature.staking.impl.stake.v2.b) this.f244887w, (String) this.f244888x, (dj0.d) this.f244889y, continuation, 14);
            case 15:
                return new e((com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f244887w, (String) this.f244888x, (xi0.b) this.f244889y, continuation, 15);
            case 16:
                return new e((com.revolut.feature.topup_screen.impl.flows.checkout.flow.e) this.f244887w, (k) this.f244888x, (TopUpTarget) this.f244889y, continuation, 16);
            case 17:
                return new e((qz1.c) this.f244888x, (String) this.f244889y, continuation, 17);
            case 18:
                return new e((n) this.f244887w, (ty0.a) this.f244888x, (String) this.f244889y, continuation, 18);
            case 19:
                return new e((r1a.d) this.f244887w, (SplitBillLinkAction) this.f244888x, (s1a.d) this.f244889y, continuation, 19);
            case 20:
                return new e((r21.h) this.f244887w, (String) this.f244888x, (BeneficiarySpecialPurpose) this.f244889y, continuation, 20);
            case 21:
                return new e((String) this.f244887w, (r25.b) this.f244888x, (Function1) this.f244889y, continuation);
            case 22:
                e eVar6 = new e(this.f244887w, this.f244889y, false, continuation, 22);
                eVar6.f244888x = obj2;
                return eVar6;
            case 23:
                e eVar7 = new e(this.f244887w, this.f244889y, false, continuation, 23);
                eVar7.f244888x = obj2;
                return eVar7;
            case 24:
                e eVar8 = new e(this.f244887w, this.f244889y, false, continuation, 24);
                eVar8.f244888x = obj2;
                return eVar8;
            case 25:
                e eVar9 = new e((l) this.f244889y, continuation, 25);
                eVar9.f244888x = obj2;
                return eVar9;
            case 26:
                return new e((com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow.a) this.f244887w, (yki.l) this.f244888x, (j) this.f244889y, continuation, 26);
            case 27:
                return new e((rga.i) this.f244887w, (String) this.f244889y, this.f244888x, continuation);
            case 28:
                return new e((m) this.f244887w, (NonProductAccountFilter) this.f244888x, (Set) this.f244889y, continuation, 28);
            default:
                return new e((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.f244888x, (pi3.h) this.f244889y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0934 A[LOOP:2: B:497:0x092e->B:499:0x0934, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:588:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v19, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v78, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r2v81, types: [f5j.a, java.lang.Object] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qd8.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244888x = obj2;
        this.f244889y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244887w = obj2;
        this.f244889y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244889y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, r25.b bVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 21;
        this.f244887w = str;
        this.f244888x = bVar;
        this.f244889y = (i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rga.i iVar, String str, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 27;
        this.f244887w = iVar;
        this.f244889y = str;
        this.f244888x = obj2;
    }
}
