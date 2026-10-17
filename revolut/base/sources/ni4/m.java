package ni4;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorPopupScreenConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.m;
import rp0.t;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ n u;
    public final /* synthetic */ SpousalConsentInitiatorPopupScreenConfig v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, SpousalConsentInitiatorPopupScreenConfig spousalConsentInitiatorPopupScreenConfig, Continuation continuation) {
        super(2, continuation);
        this.u = nVar;
        this.v = spousalConsentInitiatorPopupScreenConfig;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j60.a aVar2 = this.u.f215649r;
        m.b bVar = rp0.m.Companion;
        SpousalConsentInitiatorPopupScreenConfig spousalConsentInitiatorPopupScreenConfig = this.v;
        LargeActionButtonDelegate.Model model = null;
        t tVar = new t(spousalConsentInitiatorPopupScreenConfig.f66402a, spousalConsentInitiatorPopupScreenConfig.f66403b, null, 28);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_BUTTON_PRIMARY", LargeActionButton.ButtonStyle.f58725a, null, spousalConsentInitiatorPopupScreenConfig.f66404c.f66410a, false, null, null, null, null, 1000);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        SpousalConsentInitiatorPopupScreenConfig.Button button = spousalConsentInitiatorPopupScreenConfig.d;
        yp0.b.l(model2, i, button == null ? i : R$attr.uikit_dp0, i2, i2, null, false, 48);
        if (button != null) {
            LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ID_BUTTON_SECONDARY", LargeActionButton.ButtonStyle.f58726b, null, button.f66410a, false, null, null, null, null, 1000);
            int i3 = R$attr.uikit_dp16;
            yp0.b.l(model3, i3, R$attr.uikit_dp24, i3, i3, null, false, 48);
            model = model3;
        }
        LargeActionButtonDelegate.Model[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        aVar2.x(dy4.b.b(bVar, kotlin.collections.d.L(elements), tVar, null, null, null, null, 1020));
        return Unit.f186387a;
    }
}
