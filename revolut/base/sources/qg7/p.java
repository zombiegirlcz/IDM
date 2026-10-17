package qg7;

import ba6.b0;
import ba6.g0;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.FinancialEvidenceFlowContract$Step;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.pricingplans.models.PricingPlanOffer;
import com.revolut.feature.shared.savings.models.account.SavingsAccountCreate;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import ft3.h1;
import java.io.File;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import okhttp3.MultipartBody$Part;
import qp5.c0;
import r7i.a0;
import s6e.z;
import sa6.j0;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f245683w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f245684x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f245685y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f245685y = obj2;
        this.f245683w = obj3;
        this.f245684x = obj4;
        this.z = obj5;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p((u) this.f245685y, (String) this.f245683w, (String) this.f245684x, (Function1) this.z, continuation);
            case 1:
                return new p((qj8.j) this.f245685y, (String) this.f245683w, (ij8.d) this.z, (String) this.f245684x, continuation, 1);
            case 2:
                return new p((qj8.j) this.f245685y, (String) this.f245683w, (ij8.c) this.z, (String) this.f245684x, continuation, 2);
            case 3:
                return new p((BackgroundKey) this.f245685y, (com.revolut.feature.backgroundpicker.impl.flow.a) this.f245684x, (String) this.f245683w, (NavBarWithContainerBackground) this.z, continuation, 3);
            case 4:
                return new p((c0) this.f245683w, (xi0.b) this.f245684x, (CryptoAddress) this.z, continuation, 4);
            case 5:
                return new p((File) this.f245685y, (qt8.o) this.f245684x, (String) this.f245683w, (av.a) this.z, continuation, 5);
            case 6:
                return new p(6, (qt8.o) this.f245685y, (String) this.f245683w, (MultipartBody$Part) this.f245684x, (nq.n) this.z, continuation);
            case 7:
                return new p(7, (qt8.o) this.f245685y, (String) this.f245683w, (MultipartBody$Part) this.f245684x, (nq.r) this.z, continuation);
            case 8:
                return new p((io3.d) this.f245683w, (com.revolut.feature.staking.impl.stake.v2.b) this.f245684x, (dj0.d) this.z, continuation, 8);
            case 9:
                return new p(9, (r34.b) this.f245685y, (h1) this.f245683w, (cv3.u) this.f245684x, (cv3.u) this.z, continuation);
            case 10:
                int i = 10;
                p pVar = new p(i, (r78.c) this.f245684x, (io3.d) this.z, (String) this.f245683w, continuation);
                pVar.f245685y = obj2;
                return pVar;
            case 11:
                return new p(11, (a0) this.f245685y, (pcd.s) this.f245683w, (AccountWrapper) this.f245684x, (x5i.d) this.z, continuation);
            case 12:
                return new p(12, (com.revolut.feature.credit.application.plugins.impl.ui.direct_debit.a) this.f245685y, (String) this.f245683w, (String) this.f245684x, (bk4.f) this.z, continuation);
            case 13:
                return new p((rg3.o) this.f245684x, (Function1) this.z, continuation, 13);
            case 14:
                return new p(14, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.f245685y, (hha.d) this.f245683w, (hha.i) this.f245684x, (PricingPlanOffer) this.z, continuation);
            case 15:
                int i2 = 15;
                p pVar2 = new p(i2, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.f245684x, (hha.i) this.z, (String) this.f245683w, continuation);
                pVar2.f245685y = obj2;
                return pVar2;
            case 16:
                return new p(16, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_change.b) this.f245685y, (CheckoutOrder) this.f245683w, (hha.d) this.f245684x, (hha.i) this.z, continuation);
            case 17:
                return new p(17, (com.revolut.feature.bank_account_switching.impl.ui.switch_out.a) this.f245685y, (String) this.f245683w, (mn2.a) this.f245684x, (LocalDate) this.z, continuation);
            case 18:
                return new p((FlowCollector) this.f245685y, (rqd.k) this.f245684x, (String) this.f245683w, (Ref$BooleanRef) this.z, continuation, 18);
            case 19:
                p pVar3 = new p((rs2.n) this.f245684x, (Data) this.z, continuation, 19);
                pVar3.f245683w = obj2;
                return pVar3;
            case 20:
                return new p((s24.a) this.z, (String) this.f245683w, (String) this.f245684x, continuation);
            case 21:
                return new p((s34.b) this.f245685y, (h1) this.f245684x, (String) this.f245683w, (xy3.s) this.z, continuation, 21);
            case 22:
                p pVar4 = new p((z) this.z, (String) this.f245683w, continuation);
                pVar4.f245684x = obj2;
                return pVar4;
            case 23:
                int i3 = 23;
                p pVar5 = new p(i3, (s8a.c) this.f245684x, (AccountId) this.z, (String) this.f245683w, continuation);
                pVar5.f245685y = obj2;
                return pVar5;
            case 24:
                return new p(24, (j0) this.f245685y, (ba6.u) this.f245683w, (g0) this.f245684x, (b0) this.z, continuation);
            case 25:
                return new p(25, (com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) this.f245685y, (FinancialEvidenceFlowContract$Step) this.f245683w, (yki.l) this.f245684x, (tb4.m) this.z, continuation);
            case 26:
                return new p((sbd.h) this.f245684x, (SavingsAccountCreate) this.z, (String) this.f245683w, continuation);
            case 27:
                return new p((se1.i) this.f245685y, (dj0.d) this.f245684x, (String) this.f245683w, (TaxRate) this.z, continuation, 27);
            case 28:
                return new p((com.revolut.feature.credit.card.impl.ui.repay_with_review.payment_review.a) this.f245685y, (String) this.f245683w, (su4.h) this.z, (String) this.f245684x, continuation, 28);
            default:
                return new p(29, (suf.h) this.f245685y, (wi0.b) this.f245683w, (Double) this.f245684x, (Double) this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:269:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:492:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v159, types: [fim.a] */
    /* JADX WARN: Type inference failed for: r0v160, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v161, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r12v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v162 */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v110 */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qg7.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f245684x = obj2;
        this.f245683w = str;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245683w = obj2;
        this.f245684x = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, String str, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245685y = obj2;
        this.f245684x = obj3;
        this.f245683w = str;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245684x = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj2, String str, Object obj3, String str2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f245685y = obj2;
        this.f245683w = str;
        this.z = obj3;
        this.f245684x = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(u uVar, String str, String str2, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f245685y = uVar;
        this.f245683w = str;
        this.f245684x = str2;
        this.z = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s24.a aVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 20;
        this.z = aVar;
        this.f245683w = str;
        this.f245684x = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 22;
        this.z = zVar;
        this.f245683w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(sbd.h hVar, SavingsAccountCreate savingsAccountCreate, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 26;
        this.f245684x = hVar;
        this.z = savingsAccountCreate;
        this.f245683w = str;
    }
}
