package h32;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.confirmation.ApmConfirmationScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ApmConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ApmConfirmationScreen apmConfirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = apmConfirmationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            case 2:
                return new c(this.v, continuation, 2);
            default:
                return new c(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((np0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ApmConfirmationScreen apmConfirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE3 = apmConfirmationScreen.e3();
                kVarE3.getClass();
                Intrinsics.checkNotNullExpressionValue("k", "APM_TAG");
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.INFO, "k", "APM Confirmation Screen: closed", null, null, 16);
                kVarE3.B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE32 = apmConfirmationScreen.e3();
                kVarE32.getClass();
                Intrinsics.checkNotNullExpressionValue("k", "APM_TAG");
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.b(rd0.c.INFO, "k", "APM Confirmation Screen: confirmed", null, null, 16);
                kVarE32.l2(new i(kVarE32, null, 0), new yi5.b(26));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE33 = apmConfirmationScreen.e3();
                kVarE33.getClass();
                Intrinsics.checkNotNullExpressionValue("k", "APM_TAG");
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.b(rd0.c.INFO, "k", "APM Confirmation Screen: rejected", null, null, 16);
                kVarE33.l2(new i(kVarE33, null, 2), new yi5.b(26));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k kVarE34 = apmConfirmationScreen.e3();
                kVarE34.getClass();
                Intrinsics.checkNotNullExpressionValue("k", "APM_TAG");
                CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                rd0.d.b(rd0.c.INFO, "k", "APM Confirmation Screen: timeout", null, null, 16);
                yji.l.a1(kVarE34, kVarE34.X1(new y0(null, new z(new TextLocalisedClause(R.string.transaction_threeds_timedout, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new gqh.o(kVarE34, null, 13), 3);
                break;
        }
        return Unit.f186387a;
    }
}
