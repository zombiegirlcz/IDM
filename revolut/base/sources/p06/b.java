package p06;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.debug_tools.shakedebug.ShakeDebugApi$Toggles$ShakeToOpenDebugPanel;
import d80.f;
import d80.h;
import efm.r;
import fsi.c;
import jte.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import no.f2;
import org.jetbrains.annotations.NotNull;
import sri.m;
import te0.w;
import xoi.g;

/* JADX INFO: loaded from: classes13.dex */
public final class b extends c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f231480h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f231481j;
    public final g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gte.a featureToggleInteractor, h shakeEngine, m navigator, g debugNaviCommandProvider) {
        super(new fsi.b("SHAKE_DEBUG_DELEGATE"));
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(shakeEngine, "shakeEngine");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(debugNaviCommandProvider, "debugNaviCommandProvider");
        this.f231480h = featureToggleInteractor;
        this.i = shakeEngine;
        this.f231481j = navigator;
        this.k = debugNaviCommandProvider;
    }

    @Override // fsi.a
    public final void onStart() {
        if (((d) this.f231480h).c(ShakeDebugApi$Toggles$ShakeToOpenDebugPanel.f71629a)) {
            f sensitivity = f.SENSITIVITY_MEDIUM;
            h hVar = this.i;
            hVar.getClass();
            Intrinsics.checkNotNullParameter(sensitivity, "sensitivity");
            r rVarCreate = r.create(new ae.a(hVar, sensitivity, 6));
            Intrinsics.checkNotNullExpressionValue(rVarCreate, "create(...)");
            r rVarTake = rVarCreate.take(1L);
            Intrinsics.checkNotNullExpressionValue(rVarTake, "take(...)");
            f2 f2Var = new f2(this, 3);
            Function1 function1M = M();
            Function0 function0L = L();
            r rVarOnErrorResumeNext = rVarTake.onErrorResumeNext(new mp.r(new bo.c(new BreadcrumbException(), 26), (char) 0));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new e0f.m(6, f2Var), new e0f.m(6, function1M), new c86.f(9, function0L));
            w.j0(this.f137706c, cVarSubscribe);
            Intrinsics.h(cVarSubscribe);
        }
    }
}
