package hib;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.retail.salary_account.impl.work_email.input.WorkEmailInputController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ WorkEmailInputController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(WorkEmailInputController workEmailInputController, Continuation continuation) {
        super(2, continuation);
        this.v = workEmailInputController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f fVarE3 = this.v.R2();
        String email = textData.f52598b.toString();
        q qVar = (q) fVarE3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        qVar.H2(qVar.u, new a31.i(email, qVar.f152590p.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", email), 5));
        return Unit.f186387a;
    }
}
