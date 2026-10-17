package yke;

import com.revolut.feature.tab.invest.api.declaration.InvestSettingsDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import te0.w;
import ufm.i;
import yh6.y;
import yjj.j;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements jke.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f314607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f314608b;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f314607a = navigator;
        this.f314608b = w.y0(new y(18));
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return wp5.y.D(cVar, "deeplink", 1, "trading") && Intrinsics.f(cVar.e(2), "portfolio-settings");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        InvestSettingsDestination investSettingsDestination = new InvestSettingsDestination(hke.a.ALL_SETTINGS);
        if (!Intrinsics.f(cVar.e(2), "portfolio-settings")) {
            investSettingsDestination = null;
        }
        if (investSettingsDestination != null) {
            return new q06.h(investSettingsDestination, null);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        InvestSettingsDestination investSettingsDestination = new InvestSettingsDestination(hke.a.ALL_SETTINGS);
        if (!Intrinsics.f(deeplink.e(2), "portfolio-settings")) {
            investSettingsDestination = null;
        }
        if (investSettingsDestination == null) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        NaviCommand[] elements = {z ? (NaviCommand) this.f314608b.getValue() : null, u0.f(investSettingsDestination)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        i iVar = new i(new ufm.c(new wf6.w(this, new CompositeCommand(kotlin.collections.d.L(elements)), 4), 2), new yj2.a(19, new j(3)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return ue0.e.F(iVar, Boolean.TRUE);
    }
}
