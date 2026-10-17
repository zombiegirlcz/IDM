package g0f;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.data.network.models.topup.McyBookTransactionRequest;
import com.revolut.data.network.models.topup.McyBookTransferResultDto;
import com.revolut.data.network.models.topup.McyTransferReviewDtoMappingKt;
import com.revolut.feature.topup_screen.impl.R$string;
import e0f.v0;
import efm.d0;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.y0;
import te0.w;
import tof.l1;
import yhm.o;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.mcy.b f139484w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j71.c f139485x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f139486y;
    public final /* synthetic */ wi0.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.feature.topup_screen.impl.mcy.b bVar, j71.c cVar, boolean z, wi0.b bVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f139484w = bVar;
        this.f139485x = cVar;
        this.f139486y = z;
        this.z = bVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f139484w, this.f139485x, this.f139486y, this.z, continuation, 0);
            default:
                return new k(this.f139484w, this.f139485x, this.f139486y, this.z, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        switch (this.u) {
            case 0:
                j71.c cVar = this.f139485x;
                dj0.d targetAmount = cVar.f171832a;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.topup_screen.impl.mcy.b bVar = this.f139484w;
                if (i == 0) {
                    o.b(obj2);
                    vte.a aVar2 = bVar.f91076p;
                    l1 rate = cVar.f171834c;
                    v0 v0Var = (v0) aVar2;
                    v0Var.getClass();
                    Intrinsics.checkNotNullParameter(rate, "rate");
                    Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
                    wi0.b visitCountryCode = this.z;
                    Intrinsics.checkNotNullParameter(visitCountryCode, "visitCountryCode");
                    e31.j jVar = (e31.j) v0Var.f121695c;
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(rate, "rate");
                    Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
                    Intrinsics.checkNotNullParameter(visitCountryCode, "visitCountryCode");
                    d0<McyBookTransferResultDto> d0VarBookTransfer = jVar.f122181b.bookTransfer(new McyBookTransactionRequest(McyTransferReviewDtoMappingKt.toDto(rate), mo3.a.p(targetAmount), v.l(this.f139486y ? "TCS_THRESHOLD_EXCEEDED" : null), visitCountryCode.f297794a), new wj0.b("IDEMPOTENCY_TAG_BOOK_MULTI_CURRENCY_TRANSFER"));
                    e31.e eVar = new e31.e(1, new e1d.h(8));
                    d0VarBookTransfer.getClass();
                    ufm.i iVar = new ufm.i(d0VarBookTransfer, eVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.n nVarI0 = w.i0(iVar);
                    this.v = 1;
                    objB = nim.a.b(nVarI0, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objB = obj2;
                }
                j71.b bVar2 = (j71.b) objB;
                pye.a aVar3 = bVar.f91078r;
                Instant expiryTime = bVar2.f171830b;
                dj0.d exchangedAmountWithCharges = bVar2.f171831c;
                aVar3.getClass();
                Intrinsics.checkNotNullParameter(expiryTime, "expiryTime");
                Intrinsics.checkNotNullParameter(exchangedAmountWithCharges, "exchangedAmountWithCharges");
                Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
                TimeClause timeClause = new TimeClause(expiryTime.toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, null, 12);
                return yji.l.a1(bVar, bVar.X1(new y0("ID_DIALOG_WAITING_FOR_FUNDS", new g0(new TextLocalisedClause(R$string.topup_mcy_bank_transfer_waiting_for_funds_title, v.k(new MoneyClause(targetAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(exchangedAmountWithCharges, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), new TextLocalisedClause(R$string.topup_mcy_bank_transfer_waiting_for_funds_subtitle, u.c(timeClause), null, 12), null, null, null, null, null, null, false, null, false, null, 16380), false, 4)), null, null, new j(bVar, bVar2, null), 3);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.topup_screen.impl.mcy.b bVar3 = this.f139484w;
                k kVar = new k(bVar3, this.f139485x, this.f139486y, this.z, null, 0);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar3.k, "MCY_ACCOUNT_DETAILS", kVar, this);
                return objB2 == aVar4 ? aVar4 : objB2;
        }
    }
}
