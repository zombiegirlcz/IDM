package dr2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.common.ui.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import nii.y0;
import nii.z;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ m v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = mVar;
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
                return ((j) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y0 y0Var = new y0("ERROR_DIALOG_ID", new z(new TextLocalisedClause(R$string.general_error_common, null, null, 14), null, new TextLocalisedClause(R$string.common_action_ok, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 4);
                m mVar = this.v;
                yji.l.a1(mVar, mVar.X1(y0Var), null, null, new j(mVar, null, 1), 3);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                this.v.B2();
                break;
        }
        return Unit.f186387a;
    }
}
