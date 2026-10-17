package com.revolut.feature.retail.reverywhere.impl.web_app;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereShimmeringState;
import com.revolut.kompot.common.R$string;
import j75.i;
import jfb.g0;
import jfb.k0;
import jfb.n0;
import jfb.o0;
import jfb.v0;
import jfb.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements n {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f82944a;

    public e(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f82944a = featureToggleInteractor;
    }

    public static k0 a(String str) {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model(str, new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), null, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, true, 0, 0, 31696);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new k0(u.c(model));
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        n0 n0Var = (n0) iii.c.f(domainState.d, new je5.n(this, 17), new v0(this), new i(7, domainState, this));
        g0 g0Var = domainState.f82930c;
        cjl.c cVar = domainState.f82929b;
        cjl.d dVar = cVar instanceof cjl.d ? (cjl.d) cVar : null;
        return new o0(n0Var, g0Var, ((jte.d) this.f82944a).c(ReverywhereApi$Toggles$ReverywhereShimmeringState.f82884c) && domainState.f82931g, dVar != null ? dVar.f24709a : null);
    }
}
