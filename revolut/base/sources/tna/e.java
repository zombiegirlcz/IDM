package tna;

import aw0.ka;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.profile.screens.appearance.AppearanceThemeScreen;
import com.revolut.feature.uipersonalisation.api.ChristmasThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.HalloweenThemeDeclaration;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.y;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AppearanceThemeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AppearanceThemeScreen appearanceThemeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = appearanceThemeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarH3 = this.v.T2();
        Intrinsics.h(model);
        r rVar = (r) lVarH3;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53531a;
        if (!Intrinsics.f(str, "ID_SEASONAL_STYLE_DISCLAIMER")) {
            throw new IllegalStateException(h30.l.r("Unexpected action from text ", str));
        }
        j60.a aVar2 = rVar.f272357s;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.settings_apperance_seasonal_theme_info_title, null, null, 14);
        GlobalThemeDeclaration globalThemeDeclaration = ((m) zi0.c.I(((k) rVar.t2()).f272343a)).f272346a.f94561a;
        if (globalThemeDeclaration instanceof HalloweenThemeDeclaration) {
            i = R$string.appearance_seasonal_theme_info_halloween_message;
        } else {
            if (!(globalThemeDeclaration instanceof ChristmasThemeDeclaration)) {
                throw new IllegalStateException(h30.l.r("Seasonal theme disclaimer is not supported for ", globalThemeDeclaration.getF94454a()));
            }
            i = R$string.appearance_seasonal_theme_info_christmas_message;
        }
        vjg.f fVarE2 = globalThemeDeclaration.e2();
        if (fVarE2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        LocalDateTime localDateTimeWith = ((l80.f) rVar.f272358t).f().with((TemporalAdjuster) fVarE2.f289742b);
        Intrinsics.checkNotNullExpressionValue(localDateTimeWith, "with(...)");
        rp0.t tVar = new rp0.t(textLocalisedClause, new TextLocalisedClause(i, zhm.u.c(new TimeClause(oi0.d.R(localDateTimeWith), new TimeClause.Format.DayAndMonth(ka.FULL), null, null, 12)), null, 12), null, 28);
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_BOTTOM_DIALOG_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model2, 0, R$attr.uikit_dp16, 0, 0, 13);
        aVar2.x(new y(zhm.u.c(model2), tVar, null, null, null, null, 1020));
        return Unit.f186387a;
    }
}
