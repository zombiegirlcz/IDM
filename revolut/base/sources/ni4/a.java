package ni4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.popup.SpousalConsentInitiatorPopupScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SpousalConsentInitiatorPopupScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SpousalConsentInitiatorPopupScreen spousalConsentInitiatorPopupScreen, Continuation continuation) {
        super(2, continuation);
        this.v = spousalConsentInitiatorPopupScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        e eVar = (e) this.v.P.getValue();
        Intrinsics.h(model);
        n nVar = (n) eVar;
        nVar.getClass();
        j60.a aVar2 = nVar.f215649r;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "ID_BUTTON_PRIMARY")) {
            nVar.f215652w = new f(nVar, 0);
            j60.a.v(aVar2, false, null, 3);
        } else if (Intrinsics.f(str, "ID_BUTTON_SECONDARY")) {
            nVar.f215652w = new f(nVar, 1);
            j60.a.v(aVar2, false, null, 3);
        }
        return Unit.f186387a;
    }
}
