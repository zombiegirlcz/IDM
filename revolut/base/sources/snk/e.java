package snk;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student_email_validation.StudentEmailValidationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StudentEmailValidationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StudentEmailValidationScreen studentEmailValidationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = studentEmailValidationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        String email = textData.f52598b.toString();
        r rVar = (r) kVarE3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        rVar.H2(rVar.f264654w, new sef.j(email, 5));
        rVar.f264655x.k(email);
        return Unit.f186387a;
    }
}
