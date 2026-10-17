package rna;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.profile.api.navigation.KompotProfileFeatureConfig;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.profile.impl.ui.profile.screens.app_settings.AppSettingsController;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rna.f;
import rp0.t;
import rp0.y;
import t70.v;
import yhm.m;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AppSettingsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AppSettingsController appSettingsController, Continuation continuation) {
        super(2, continuation);
        this.v = appSettingsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        v vVar;
        int i;
        int i2;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.O.getValue();
        Intrinsics.h(model);
        i iVar = (i) eVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        int iHashCode = str.hashCode();
        if (iHashCode != 699800309) {
            if (iHashCode != 748075516) {
                if (iHashCode == 879551907 && str.equals("THEME_SWITCHER_ID")) {
                    iVar.C2(f.a.f255537a);
                }
            } else if (str.equals("ID_LANGUAGE")) {
                jl0.a aVar2 = iVar.f255543r;
                if (aVar2 != null) {
                    ue0.c cVar = aVar2.f175583a.f135878a;
                    Type type = l21.d.e;
                    Intrinsics.checkNotNullExpressionValue(type, "<get-BOOLEAN_TYPE>(...)");
                    Boolean bool = (Boolean) cVar.T2("locale.REQUIRE_CHECK_LANGUAGE_KEY", type);
                    vVar = bool != null ? bool.booleanValue() : false ? v.RESTRICTED : aVar2.f175584b.a(33) ? v.SYSTEM_AND_PER_APP : v.SYSTEM;
                } else {
                    vVar = null;
                }
                if (vVar == null) {
                    try {
                        m.Companion companion = m.INSTANCE;
                        throw new IllegalStateException("updateLocaleInteractor is null");
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        Throwable thA = m.a(o.a(th10));
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                        vVar = v.SYSTEM;
                    }
                }
                v vVar2 = vVar;
                int i3 = h.f255540a[vVar2.ordinal()];
                if (i3 == 1) {
                    i = R$string.profileHome_settings_language_dialog_subtitle_restricted;
                    i2 = R$string.profileHome_settings_language_dialog_action_got_it;
                } else if (i3 == 2) {
                    i = R$string.profileHome_settings_language_dialog_subtitle_system;
                    i2 = R$string.profileHome_settings_language_dialog_action_go_to_settings;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R$string.profileHome_settings_language_dialog_subtitle_per_app;
                    i2 = R$string.profileHome_settings_language_dialog_action_go_to_settings;
                }
                t tVar = new t(new TextLocalisedClause(R$string.profileHome_settings_language_dialog_title, null, null, 14), new TextLocalisedClause(i, null, null, 14), null, 28);
                List listC = u.c(new LargeActionButtonDelegate.Model("ID_LANGUAGE_DIALOG_ACTION_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(i2, null, null, 14), false, null, null, vVar2, null, 744));
                int i5 = R$attr.uikit_dp16;
                yp0.b.k(listC, i5, i5, 0, 0, 28);
                iVar.f255541p.x(new y(listC, tVar, null, null, null, null, 1020));
            }
        } else if (str.equals("ID_INTERFACE")) {
            iVar.C1(KompotProfileFeatureConfig.AppInterfaceDestination.f81327a);
        }
        return Unit.f186387a;
    }
}
