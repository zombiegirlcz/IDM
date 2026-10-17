package fg8;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.api.navigation.PartnerGivingConsentDestination;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jf0.c f134909b;

    public /* synthetic */ b(Object obj2, jf0.c cVar, int i) {
        this.f134908a = i;
        this.f134909b = cVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f134908a;
        jf0.c cVar = this.f134909b;
        switch (i) {
            case 0:
                return (String) zhm.r0.h("code", cVar.d);
            case 1:
                String str = (String) cVar.d.get("showPrompt");
                return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, new FeatureCommand(new KompotOverlayFeatureConfig(new PartnerGivingConsentDestination(new PartnerGivingConsentDestination.Configuration(str != null ? Boolean.parseBoolean(str) : false ? PartnerGivingConsentDestination.StartAction.ShowPrompt.f104101a : null)), yhi.b.POPUP, (Integer) null, 12)), 2)));
            case 2:
                IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("provide handler for ", cVar.e(2)));
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                return Boolean.FALSE;
            case 3:
                String upperCase = ((String) cVar.h().get(2)).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                return u09.v.valueOf(upperCase);
            case 4:
                od0.h hVar = od0.i.Companion;
                s8h.c cVar2 = s8h.d.Companion;
                String strE = cVar.e(3);
                cVar2.getClass();
                s8h.d dVarA = s8h.c.a(strE);
                hVar.getClass();
                return od0.h.a(dVarA);
            case 5:
                xi0.a aVar = xi0.b.Companion;
                String strE2 = cVar.e(2);
                aVar.getClass();
                return xi0.a.a(strE2);
            case 6:
                return v3a.h.d(cVar);
            default:
                return new IllegalStateException(p.a.p("InfoSheets ", cVar.f173627a, " do not has key"));
        }
    }

    public /* synthetic */ b(jf0.c cVar, int i) {
        this.f134908a = i;
        this.f134909b = cVar;
    }
}
