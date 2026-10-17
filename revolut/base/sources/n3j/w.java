package n3j;

import chc.f0;
import com.revolut.feature.rewards.impl.data.network.services.RentAndBillsService;
import com.revolut.feature.support.impl.transfer_tracker.domain.model.TransferArrivalRequest;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nfj.m1;
import nfj.s2;
import nfj.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f212162w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f212163x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d dVar, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.u = 3;
        this.f212162w = dVar;
        this.f212163x = (gim.i) function1;
    }

    private final Object b(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            RentAndBillsService rentAndBillsService = ((nhc.i) this.f212162w).f215412a;
            f0 f0Var = new f0((List) this.f212163x);
            this.v = 1;
            if (rentAndBillsService.unlinkLinkedPayments(f0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r1v6, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f212162w, this.f212163x, continuation, 0);
            case 1:
                return new w((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f212162w, (s4j.d) this.f212163x, continuation, 1);
            case 2:
                return new w((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f212162w, (String) this.f212163x, continuation, 2);
            case 3:
                return new w((com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.d) this.f212162w, continuation, (Function1) this.f212163x);
            case 4:
                return new w((n4d.m) this.f212162w, (List) this.f212163x, continuation, 4);
            case 5:
                return new w((com.revolut.feature.credit.application.plugins.impl.ui.autopay.loan.flow.a) this.f212162w, (it3.e) this.f212163x, continuation, 5);
            case 6:
                w wVar = new w((n5c.e) this.f212162w, continuation, 6);
                wVar.f212163x = obj2;
                return wVar;
            case 7:
                return new w((com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.post_activation.b) this.f212162w, (e6b.c) this.f212163x, continuation, 7);
            case 8:
                w wVar2 = new w((n6i.j) this.f212162w, continuation, 8);
                wVar2.f212163x = obj2;
                return wVar2;
            case 9:
                return new w((com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages.a) this.f212162w, (String) this.f212163x, continuation, 9);
            case 10:
                return new w((n7i.s) this.f212162w, (io3.d) this.f212163x, continuation, 10);
            case 11:
                return new w((n8a.o) this.f212162w, (String) this.f212163x, continuation, 11);
            case 12:
                return new w((Function1) this.f212162w, (n8a.b0) this.f212163x, continuation);
            case 13:
                return new w((n8a.f0) this.f212162w, (List) this.f212163x, continuation, 13);
            case 14:
                return new w((n8a.f0) this.f212162w, (String) this.f212163x, continuation, 14);
            case 15:
                return new w((com.revolut.feature_move_money.impl.topup.a) this.f212162w, (nyh.b) this.f212163x, continuation, 15);
            case 16:
                return new w((com.revolut.feature_move_money.impl.topup.a) this.f212162w, (j1j.d) this.f212163x, continuation, 16);
            case 17:
                return new w((jid.z) this.f212162w, (PeerToPeerTransferData) this.f212163x, continuation, 17);
            case 18:
                return new w((com.revolut.shared.feature.suspicious_transaction.impl.flow.a) this.f212162w, (SuspiciousTransactionFlowContract$Step) this.f212163x, continuation, 18);
            case 19:
                return new w((com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.a) this.f212162w, (com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document.a) this.f212163x, continuation, 19);
            case 20:
                return new w((nde.d) this.f212162w, (TransferArrivalRequest) this.f212163x, continuation, 20);
            case 21:
                return new w(this.f212163x, false, continuation, 21);
            case 22:
                return new w((nfj.v) this.f212162w, (dej.y) this.f212163x, continuation, 22);
            case 23:
                return new w((u0) this.f212162w, (String) this.f212163x, continuation, 23);
            case 24:
                return new w(this.f212163x, false, continuation, 24);
            case 25:
                return new w((m1) this.f212162w, (String) this.f212163x, continuation, 25);
            case 26:
                return new w(this.f212163x, false, continuation, 26);
            case 27:
                return new w((s2) this.f212162w, (String) this.f212163x, continuation, 27);
            case 28:
                return new w((nhc.i) this.f212162w, (List) this.f212163x, continuation, 28);
            default:
                return new w((kge.d) this.f212162w, (String) this.f212163x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0ac6  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:658:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v63, types: [kg.o] */
    /* JADX WARN: Type inference failed for: r2v69, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v141 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v113 */
    /* JADX WARN: Type inference failed for: r4v114 */
    /* JADX WARN: Type inference failed for: r4v115 */
    /* JADX WARN: Type inference failed for: r4v39, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v50, types: [retrofit2.HttpException] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3j.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f212162w = obj2;
        this.f212163x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f212162w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, boolean z, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f212163x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(Function1 function1, n8a.b0 b0Var, Continuation continuation) {
        super(2, continuation);
        this.u = 12;
        this.f212162w = (gim.i) function1;
        this.f212163x = b0Var;
    }
}
