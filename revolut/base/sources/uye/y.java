package uye;

import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.topup_dialogs.CardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish;
import com.revolut.feature.topup_screen.api.topup_dialogs.CardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;

/* JADX INFO: loaded from: classes8.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i f284329w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ xi0.b f284330x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, xi0.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f284329w = iVar;
        this.f284330x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                y yVar = new y(this.f284329w, this.f284330x, continuation, 0);
                yVar.v = obj2;
                return yVar;
            default:
                y yVar2 = new y(this.f284329w, this.f284330x, continuation, 1);
                yVar2.v = obj2;
                return yVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n1 n1Var = (n1) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(n1Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        xi0.b bVar = this.f284330x;
        com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.f284329w;
        switch (i) {
            case 0:
                wj0.a aVar = iVar.L;
                n1 n1Var = (n1) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Parcelable parcelableA = n1Var.a().a();
                if (Intrinsics.f(parcelableA, CardPaymentsTopUpDialogs$TopUpErrorDialogPayloadFinish.f90552a)) {
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i.I2(iVar, bVar);
                } else if (Intrinsics.f(parcelableA, CardPaymentsTopUpDialogs$TopUpRollingLimitErrorPayload.f90553a)) {
                    aVar.a("TOPUP_IDEMPOTENCY_TAG");
                    if (n1Var instanceof j1) {
                        iVar.T2("question.card-deposit-limits-and-fees");
                    } else if (n1Var instanceof l1) {
                        iVar.P2(bVar);
                    }
                } else {
                    aVar.a("TOPUP_IDEMPOTENCY_TAG");
                }
                return Unit.f186387a;
            default:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof k1) {
                    com.revolut.feature.topup_screen.impl.flows.topup.flow.i.I2(iVar, bVar);
                } else {
                    if (!(n1Var2 instanceof j1) && !(n1Var2 instanceof l1) && !(n1Var2 instanceof m1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected result ".concat(n1Var2.getClass().getSimpleName()));
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
