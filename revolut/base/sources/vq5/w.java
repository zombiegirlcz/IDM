package vq5;

import com.revolut.chat.domain.model.TranscriptDateRange;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import w38.w0;
import wf6.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f291342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f291343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f291344y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f291342w = obj2;
        this.f291343x = obj3;
        this.f291344y = obj4;
    }

    private final Object b(Object obj2) {
        sri.m mVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            wf6.z zVar = (wf6.z) this.f291343x;
            sri.m mVar2 = zVar.f297019a;
            e0 e0Var = zVar.f297020b;
            String str = ((jf0.c) this.f291344y).f173627a;
            this.f291342w = mVar2;
            this.v = 1;
            obj2 = e0Var.a(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
            mVar = mVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar = (sri.m) this.f291342w;
            yhm.o.b(obj2);
        }
        mVar.c((NaviCommand) obj2);
        return Boolean.TRUE;
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar = (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) this.f291342w;
        wc2.b bVar2 = new wc2.b((String) this.f291343x, bVar, (String) this.f291344y, (Continuation) null, 1);
        this.v = 1;
        Object objB = pu7.a.B(bVar.k, "HANDLE_URL_TASK_NAME", bVar2, this);
        return objB == aVar ? aVar : objB;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w((com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.f291342w, (TermsScope) this.f291343x, (wi0.b) this.f291344y, continuation, 0);
            case 1:
                return new w((vrb.l) this.f291342w, (kel.n) this.f291343x, (dj0.d) this.f291344y, continuation, 1);
            case 2:
                w wVar = new w((vrb.l) this.f291343x, (vrb.a) this.f291344y, continuation, 2);
                wVar.f291342w = obj2;
                return wVar;
            case 3:
                w wVar2 = new w((vrl.r) this.f291343x, (String) this.f291344y, continuation, 3);
                wVar2.f291342w = obj2;
                return wVar2;
            case 4:
                return new w((vsj.q) this.f291342w, (String) this.f291343x, (usj.c) this.f291344y, continuation, 4);
            case 5:
                return new w((vsj.q) this.f291342w, (String) this.f291343x, (vzi.a) this.f291344y, continuation, 5);
            case 6:
                return new w((vsj.q) this.f291342w, (String) this.f291343x, (vzi.g) this.f291344y, continuation, 6);
            case 7:
                return new w((vsj.q) this.f291342w, (String) this.f291343x, (usj.e0) this.f291344y, continuation, 7);
            case 8:
                return new w((com.revolut.feature.insurance_embedded.impl.ui.flow.embedded.a) this.f291342w, (String) this.f291343x, (dl7.a) this.f291344y, continuation, 8);
            case 9:
                w wVar3 = new w((Ref$ObjectRef) this.f291343x, (ProducerScope) this.f291344y, continuation, 9);
                wVar3.f291342w = obj2;
                return wVar3;
            case 10:
                return new w((com.revolut.feature.security_hub.impl.ui.street_mode.set_trusted_location.d) this.f291343x, (LocationDomain) this.f291344y, continuation, 10);
            case 11:
                return new w((vz1.a) this.f291342w, (String) this.f291343x, (f02.b) this.f291344y, continuation, 11);
            case 12:
                return new w((vz1.g) this.f291342w, (String) this.f291343x, (j02.f) this.f291344y, continuation, 12);
            case 13:
                return new w((vz1.g) this.f291342w, (String) this.f291343x, (j02.o) this.f291344y, continuation, 13);
            case 14:
                return new w((vz1.g) this.f291342w, (String) this.f291343x, (j02.r) this.f291344y, continuation, 14);
            case 15:
                return new w((w24.a) this.f291343x, (String) this.f291344y, continuation, 15);
            case 16:
                w wVar4 = new w((w0) this.f291344y, continuation, 16);
                wVar4.f291343x = obj2;
                return wVar4;
            case 17:
                return new w((com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.f291343x, (jq9.t) this.f291344y, continuation, 17);
            case 18:
                w wVar5 = new w((vvh.e) this.f291343x, continuation, (com.revolut.feature.joint.impl.ui.deeplink.a) this.f291344y);
                wVar5.f291342w = obj2;
                return wVar5;
            case 19:
                return new w((w50.o) this.f291342w, (TranscriptIdentifier) this.f291343x, (TranscriptDateRange) this.f291344y, continuation, 19);
            case 20:
                w wVar6 = new w((w54.d) this.f291344y, continuation, 20);
                wVar6.f291343x = obj2;
                return wVar6;
            case 21:
                return new w((com.revolut.feature.credit.loan.impl.ui.direct_debit_selection.a) this.f291342w, (String) this.f291343x, (String) this.f291344y, continuation, 21);
            case 22:
                return new w((w7k.b) this.f291342w, (TransferLinkDetails) this.f291343x, (tyl.a) this.f291344y, continuation, 22);
            case 23:
                w wVar7 = new w((wa7.m) this.f291343x, (String) this.f291344y, continuation, 23);
                wVar7.f291342w = obj2;
                return wVar7;
            case 24:
                return new w((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) this.f291342w, (afi.a) this.f291343x, (ecg.j) this.f291344y, continuation, 24);
            case 25:
                return new w((wbk.h) this.f291342w, (String) this.f291343x, (String) this.f291344y, continuation, 25);
            case 26:
                return new w((jf0.c) this.f291343x, (wf6.s) this.f291344y, continuation, 26);
            case 27:
                return new w((wf6.z) this.f291343x, (jf0.c) this.f291344y, continuation, 27);
            case 28:
                return new w((com.revolut.feature.retail.salary_account.impl.salary_promotion.b) this.f291342w, (String) this.f291343x, (String) this.f291344y, continuation, 28);
            default:
                return new w((wh3.i) this.f291342w, (CheckoutParams) this.f291343x, (ael.s) this.f291344y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0101, code lost:
    
        if (r0 == r2) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:598:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:604:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:609:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v82 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vq5.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f291343x = obj2;
        this.f291344y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f291344y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(vvh.e eVar, Continuation continuation, com.revolut.feature.joint.impl.ui.deeplink.a aVar) {
        super(2, continuation);
        this.u = 18;
        this.f291343x = eVar;
        this.f291344y = aVar;
    }
}
