package qwe;

import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.topup_dialogs.CardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish;
import com.revolut.feature.topup_screen.api.topup_dialogs.CardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.checkout.flow.e f249905w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f249906x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar, xi0.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249905w = eVar;
        this.f249906x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f249905w, this.f249906x, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f249905w, this.f249906x, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish cardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish = CardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish.f90552a;
        xi0.b bVar = this.f249906x;
        CardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload cardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload = CardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload.f90553a;
        com.revolut.feature.topup_screen.impl.flows.checkout.flow.e eVar = this.f249905w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Parcelable parcelableA = n1Var.a().a();
                if (Intrinsics.f(parcelableA, cardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish)) {
                    oki.h.D2(eVar.M);
                } else if (Intrinsics.f(parcelableA, cardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload)) {
                    com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.L2(eVar, n1Var, bVar);
                } else {
                    eVar.C.a("TOPUP_IDEMPOTENCY_TAG");
                }
                break;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Parcelable parcelableA2 = n1Var2.a().a();
                if (Intrinsics.f(parcelableA2, cardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload)) {
                    com.revolut.feature.topup_screen.impl.flows.checkout.flow.e.L2(eVar, n1Var2, bVar);
                } else if (Intrinsics.f(parcelableA2, cardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish)) {
                    IllegalStateException illegalStateException = new IllegalStateException("Finish payload not expected in regular checkout flow");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    eVar.C.a("TOPUP_IDEMPOTENCY_TAG");
                }
                break;
        }
        return Unit.f186387a;
    }
}
