package do2;

import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (n1Var instanceof l1) {
            q qVar = this.v;
            FormState formState = ((g) ((j2) qVar.f116393s.f22677a).getValue()).f116375b;
            FormData.INSTANCE.getClass();
            qVar.C2(new h(formState, FormData.e));
        }
        return Unit.f186387a;
    }
}
