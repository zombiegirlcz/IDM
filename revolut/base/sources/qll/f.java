package qll;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreen;
import com.revolut.sso.impl.ui.combined_authentication.unified.CombinedAuthenticationUnifiedScreenContract$ModalStep;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CombinedAuthenticationUnifiedScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = combinedAuthenticationUnifiedScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CombinedAuthenticationUnifiedScreen combinedAuthenticationUnifiedScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.sso.impl.ui.combined_authentication.unified.a aVar2 = (com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.e3();
                aVar2.H2(aVar2.D, new d0(aVar2, 1));
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oki.h.v2(((com.revolut.sso.impl.ui.combined_authentication.unified.a) combinedAuthenticationUnifiedScreen.e3()).E, CombinedAuthenticationUnifiedScreenContract$ModalStep.CountryPicker.f106433a, ModalDestination.Style.POPUP.f98311a);
                break;
        }
        return Unit.f186387a;
    }
}
