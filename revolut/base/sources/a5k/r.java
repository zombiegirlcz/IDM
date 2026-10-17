package a5k;

import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int u = 0;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f1480w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f1481x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f1482y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, r4k.m mVar, f5j.a aVar, AccountId accountId, BankTransferData bankTransferData, boolean z, Continuation continuation) {
        super(1, continuation);
        this.f1481x = tVar;
        this.f1482y = mVar;
        this.z = aVar;
        this.A = accountId;
        this.B = bankTransferData;
        this.f1480w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r((t) this.f1481x, (r4k.m) this.f1482y, (f5j.a) this.z, (AccountId) this.A, (BankTransferData) this.B, this.f1480w, continuation);
            default:
                return new r((s63.g) this.z, (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) this.A, (h93.f0) this.B, this.f1480w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5k.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s63.g gVar, com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2, h93.f0 f0Var, boolean z, Continuation continuation) {
        super(1, continuation);
        this.z = gVar;
        this.A = gVar2;
        this.B = f0Var;
        this.f1480w = z;
    }
}
