package uc4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.credit.application.plugins.api.models.config.KontomatikPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.KontomatikPopupScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.popup.KontomatikPopupScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ KontomatikPopupScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(KontomatikPopupScreen kontomatikPopupScreen, Continuation continuation) {
        super(2, continuation);
        this.v = kontomatikPopupScreen;
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

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ju3.e eVar;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar2 = (e) this.v.Q.getValue();
        Intrinsics.h(model);
        i iVar = (i) eVar2;
        KontomatikPopupScreenContract$InputData kontomatikPopupScreenContract$InputData = iVar.f278986q;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (!Intrinsics.f(str, "ID_BUTTON_PRIMARY")) {
            if (Intrinsics.f(str, "ID_BUTTON_SECONDARY")) {
                KontomatikPopupScreenConfig.Button button = kontomatikPopupScreenContract$InputData.f67816a.d;
                if (button == null || (eVar = button.f66365b) == null) {
                    eVar = ju3.e.CLOSE_SCREEN;
                }
            }
            return Unit.f186387a;
        }
        eVar = kontomatikPopupScreenContract$InputData.f67816a.f66363c.f66365b;
        iVar.v2(new b(eVar));
        return Unit.f186387a;
    }
}
