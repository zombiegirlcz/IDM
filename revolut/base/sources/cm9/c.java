package cm9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_with_smile.impl.R$string;
import com.revolut.feature.pay_with_smile.impl.ui.settings.PayWithSmileSettingsScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import rp0.l0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ PayWithSmileSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(PayWithSmileSettingsScreen payWithSmileSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = payWithSmileSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PayWithSmileSettingsScreen payWithSmileSettingsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.pay_with_smile.impl.ui.settings.a) payWithSmileSettingsScreen.R2()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0.f(((com.revolut.feature.pay_with_smile.impl.ui.settings.a) payWithSmileSettingsScreen.R2()).f78983p, "MORE_MENU_ID", zi0.c.d(u.c(new PopupMenuItem.Cell("MORE_MENU_OPT_OUT", new TextLocalisedClause(R$string.revolut_pay_pay_with_smile_settings_menu_opt_out, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_heart_broken, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, null, null, "MORE_MENU_OPT_OUT", null, 760))), null, mw0.m.f209296a, 4);
                break;
        }
        return Unit.f186387a;
    }
}
