package vd4;

import com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.password_input.PasswordInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vd4.f;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ PasswordInputScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(PasswordInputScreen passwordInputScreen, Continuation continuation) {
        super(2, continuation);
        this.u = passwordInputScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.c3(f.a.f287780a);
        return Unit.f186387a;
    }
}
