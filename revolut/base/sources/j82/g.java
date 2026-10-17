package j82;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.multibanco.impl.ui.pending.confirmation.PendingPaymentConfirmationScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import j82.j;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PendingPaymentConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = pendingPaymentConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            case 2:
                return new g(this.v, continuation, 2);
            default:
                return new g(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((np0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        PendingPaymentConfirmationScreen pendingPaymentConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar = (s) pendingPaymentConfirmationScreen.R2();
                sVar.getClass();
                Intrinsics.checkNotNullExpressionValue("s", "MB_TAG");
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.INFO, "s", "MB PendingPayment: closed", null, null, 16);
                sVar.C2(j.b.f172092a);
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar2 = (s) pendingPaymentConfirmationScreen.R2();
                sVar2.getClass();
                Intrinsics.checkNotNullExpressionValue("s", "MB_TAG");
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.INFO, "s", "MB PendingPayment: confirmed", null, null, 16);
                sVar2.l2(new p(sVar2, continuation, i2), new yi5.b(26));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar3 = (s) pendingPaymentConfirmationScreen.R2();
                sVar3.getClass();
                Intrinsics.checkNotNullExpressionValue("s", "MB_TAG");
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.b(rd0.c.INFO, "s", "MB PendingPayment: rejected", null, null, 16);
                sVar3.l2(new p(sVar3, continuation, 2), new yi5.b(26));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                s sVar4 = (s) pendingPaymentConfirmationScreen.R2();
                sVar4.getClass();
                Intrinsics.checkNotNullExpressionValue("s", "MB_TAG");
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.b(rd0.c.INFO, "s", "MB PendingPayment: timeout", null, null, 16);
                yji.l.a1(sVar4, sVar4.X1(new y0(null, new z(new TextLocalisedClause(R.string.transaction_threeds_timedout, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new j2c.b(sVar4, continuation, 9), 3);
                break;
        }
        return Unit.f186387a;
    }
}
