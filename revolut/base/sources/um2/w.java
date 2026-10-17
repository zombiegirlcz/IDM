package um2;

import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ThemeInfo;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.uipersonalisation.api.models.ColorThemeOption;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ThemeCustomisationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ThemeCustomisationController themeCustomisationController, Continuation continuation) {
        super(2, continuation);
        this.v = themeCustomisationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(this.v, continuation);
        wVar.u = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((IconSelectorDelegate.SelectableIconModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IconSelectorDelegate.SelectableIconModel model = (IconSelectorDelegate.SelectableIconModel) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) bVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52505l;
        int i = 26;
        Continuation continuation = null;
        if (obj3 instanceof xjg.m) {
            bVar.l2(new u2i.g(bVar, (xjg.m) obj3, continuation, i), new yi5.b(26));
        } else if (obj3 instanceof GlobalThemeDeclaration) {
            bVar.l2(new u2i.g(bVar, (GlobalThemeDeclaration) obj3, continuation, 27), new yi5.b(26));
        } else if (obj3 instanceof ColorThemeOption) {
            ColorThemeOption colorThemeOption = (ColorThemeOption) obj3;
            ThemeCustomisationContract$ThemeInfo themeCustomisationContract$ThemeInfo = (ThemeCustomisationContract$ThemeInfo) ((a) ((j2) bVar.B.f22677a).getValue()).f281178b.getContent();
            if (themeCustomisationContract$ThemeInfo == null) {
                throw new IllegalStateException("theme info is unavailable");
            }
            if (colorThemeOption.f94566c != xjg.k.PREMIUM || themeCustomisationContract$ThemeInfo.d) {
                bVar.l2(new u2i.g(bVar, colorThemeOption, continuation, 25), new yi5.b(26));
            } else {
                bVar.f63791s.getClass();
                hha.u.Companion.getClass();
                bVar.C1(new BridgeDestination(new FeatureCommand(new PricingPlanFeatureConfig.DashboardByAnyFeature(hha.u.V, zhm.v.k(hha.u.u, hha.u.f152362t, hha.u.f152361s, hha.u.f152360r), xfa.b.APP_THEME))));
            }
        }
        return Unit.f186387a;
    }
}
