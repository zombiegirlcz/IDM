package aml;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            default:
                return new i(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                this.v.C2(f.f6478a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y0 y0Var = new y0("DIALOG_ID_TIMED_OUT", new z(new TextLocalisedClause(R$string.revolut_sso_request_confirmation_timeout_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_request_confirmation_timeout_description, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_common_actions_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
                j jVar = this.v;
                yji.l.a1(jVar, jVar.X1(y0Var), null, null, new i(jVar, null, 0), 3);
                break;
        }
        return Unit.f186387a;
    }
}
