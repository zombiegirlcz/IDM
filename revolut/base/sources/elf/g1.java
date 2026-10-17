package elf;

import com.revolut.feature.credit.loan.api.models.LoanRepaymentTerms;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.sso.impl.domain.models.Challenge;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k50.j4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes8.dex */
public final class g1 extends gim.i implements Function1 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f127330w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f127331x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f127332y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(aii.r rVar, yji.l lVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.A = rVar;
        this.B = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g1((n1) this.B, continuation);
            case 1:
                return new g1((com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d) this.f127332y, (String) this.f127330w, (Boolean) this.z, (Map) this.A, (Map) this.B, (String) this.f127331x, continuation);
            case 2:
                return new g1((CoroutineScope) this.f127331x, (grc.k) this.A, (bqc.a) this.B, continuation, 2);
            case 3:
                return new g1((r10.d) this.A, (String) this.f127331x, (List) this.B, continuation);
            case 4:
                return new g1((CoroutineScope) this.f127332y, (com.revolut.feature.three_ds_verification.impl.ui.sceen.d) this.z, (dj0.d) this.f127330w, (AccountWrapper) this.f127331x, (AccountWrapper) this.A, (Function0) this.B, continuation);
            case 5:
                return new g1((j4) this.z, (Instant) this.f127330w, (v20.n) this.f127331x, (Instant) this.A, (UUID) this.B, continuation);
            case 6:
                return new g1((GroupChatItem) this.f127331x, (ks9.v) this.A, (PaymentGroup) this.B, continuation, 6);
            case 7:
                return new g1((com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b) this.f127332y, (LoanDetails) this.z, (LoanRepaymentTerms) this.f127331x, (dj0.d) this.A, (q35.g0) this.B, (String) this.f127330w, continuation);
            case 8:
                return new g1((igk.d0) this.A, (com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a) this.B, continuation, 8);
            case 9:
                return new g1((com.revolut.feature.topup_screen.impl.screens.card_details.b) this.f127332y, (CardDetails) this.z, (yte.a) this.f127331x, (Boolean) this.A, (t61.j) this.B, continuation);
            case 10:
                return new g1((d2k.m) this.A, (com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c) this.B, continuation, 10);
            default:
                return new g1((zpl.g) this.f127332y, (String) this.f127330w, (String) this.f127331x, (Challenge) this.z, (okl.b1) this.A, (okl.s) this.B, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01df  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.revolut.feature.credit.loan.impl.ui.rev10.repaymentaccountpicker.b bVar, LoanDetails loanDetails, LoanRepaymentTerms loanRepaymentTerms, dj0.d dVar, q35.g0 g0Var, String str, Continuation continuation) {
        super(1, continuation);
        this.u = 7;
        this.f127332y = bVar;
        this.z = loanDetails;
        this.f127331x = loanRepaymentTerms;
        this.A = dVar;
        this.B = g0Var;
        this.f127330w = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.revolut.feature.external_accounts.impl.ui.brazil.payment_confirmation.d dVar, String str, Boolean bool, Map map, Map map2, String str2, Continuation continuation) {
        super(1, continuation);
        this.u = 1;
        this.f127332y = dVar;
        this.f127330w = str;
        this.z = bool;
        this.A = map;
        this.B = map2;
        this.f127331x = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.revolut.feature.topup_screen.impl.screens.card_details.b bVar, CardDetails cardDetails, yte.a aVar, Boolean bool, t61.j jVar, Continuation continuation) {
        super(1, continuation);
        this.u = 9;
        this.f127332y = bVar;
        this.z = cardDetails;
        this.f127331x = aVar;
        this.A = bool;
        this.B = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(n1 n1Var, Continuation continuation) {
        super(1, continuation);
        this.u = 0;
        this.B = n1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f127331x = obj2;
        this.A = obj3;
        this.B = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(j4 j4Var, Instant instant, v20.n nVar, Instant instant2, UUID uuid, Continuation continuation) {
        super(1, continuation);
        this.u = 5;
        this.z = j4Var;
        this.f127330w = instant;
        this.f127331x = nVar;
        this.A = instant2;
        this.B = uuid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(CoroutineScope coroutineScope, com.revolut.feature.three_ds_verification.impl.ui.sceen.d dVar, dj0.d dVar2, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, Function0 function0, Continuation continuation) {
        super(1, continuation);
        this.u = 4;
        this.f127332y = coroutineScope;
        this.z = dVar;
        this.f127330w = dVar2;
        this.f127331x = accountWrapper;
        this.A = accountWrapper2;
        this.B = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(r10.d dVar, String str, List list, Continuation continuation) {
        super(1, continuation);
        this.u = 3;
        this.A = dVar;
        this.f127331x = str;
        this.B = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(zpl.g gVar, String str, String str2, Challenge challenge, okl.b1 b1Var, okl.s sVar, Continuation continuation) {
        super(1, continuation);
        this.u = 11;
        this.f127332y = gVar;
        this.f127330w = str;
        this.f127331x = str2;
        this.z = challenge;
        this.A = b1Var;
        this.B = sVar;
    }
}
