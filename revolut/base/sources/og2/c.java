package og2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.confirmation.ConfirmationScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ConfirmationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(ConfirmationScreen confirmationScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = confirmationScreen;
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
        ConfirmationScreen confirmationScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                confirmationScreen.e3().B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE3 = confirmationScreen.e3();
                mVarE3.getClass();
                mVarE3.l2(new l(mVarE3, null, 0), new yi5.b(26));
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE32 = confirmationScreen.e3();
                mVarE32.getClass();
                mVarE32.l2(new l(mVarE32, null, 1), new yi5.b(26));
                break;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarE33 = confirmationScreen.e3();
                mVarE33.getClass();
                yji.l.a1(mVarE33, mVarE33.X1(new y0(null, new z(new TextLocalisedClause(R.string.transaction_threeds_timedout, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, new ocb.d(mVarE33, null, 3), 3);
                break;
        }
        return Unit.f186387a;
    }
}
