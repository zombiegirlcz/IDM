package yl9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pay_with_smile.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import nii.y0;
import nii.z;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                this.v.C2(e.f314669a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y0 y0Var = new y0("DIALOG_ID_TIMED_OUT", new z(new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_timeout_title, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_timeout_description, null, null, 14), new TextLocalisedClause(R$string.revolut_pay_biometric_payments_fallback_confirmation_timeout_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                k kVar = this.v;
                yji.l.a1(kVar, kVar.X1(y0Var), null, null, new j(kVar, null, 0), 3);
                break;
        }
        return Unit.f186387a;
    }
}
