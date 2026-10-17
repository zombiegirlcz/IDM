package qll;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CombinedAuthenticationUnifiedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen, Continuation continuation) {
        super(2, continuation);
        this.v = combinedAuthenticationUnifiedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.R2();
        String email = textData.f52598b.toString();
        com.revolut.sso.impl.ui.combined_authentication.unified.a aVar2 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        aVar2.I2(email);
        return Unit.f186387a;
    }
}
