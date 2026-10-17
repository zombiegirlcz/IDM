package yai;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature_retail_user_declarations.email.screen.EmailScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EmailScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EmailScreen emailScreen, Continuation continuation) {
        super(2, continuation);
        this.v = emailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String email = textData.f52598b.toString();
        com.revolut.feature_retail_user_declarations.email.screen.a aVar2 = (com.revolut.feature_retail_user_declarations.email.screen.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        aVar2.H2(aVar2.f97593w, new y9d.c(email, 4));
        return Unit.f186387a;
    }
}
