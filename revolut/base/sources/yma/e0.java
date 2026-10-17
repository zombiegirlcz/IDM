package yma;

import com.revolut.core.ui_kit_resources.R$anim;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements b, o3l.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f314903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t70.g f314904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v60.e f314905c;
    public final o3l.e d;
    public final e80.i e;
    public final qd0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c90.c f314906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g3l.a f314907h;
    public final v60.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pfm.a f314908j;

    public e0(p presentationModel, t70.g localization, v60.e serverErrorsProvider, o3l.e operationStatusRouter, e80.i spannableBuilder, qd0.b languageProvider, c90.c uiResources, g3l.a statusDialogDispatcher) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(localization, "localization");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(operationStatusRouter, "operationStatusRouter");
        Intrinsics.checkNotNullParameter(spannableBuilder, "spannableBuilder");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        Intrinsics.checkNotNullParameter(statusDialogDispatcher, "statusDialogDispatcher");
        this.f314903a = presentationModel;
        this.f314904b = localization;
        this.f314905c = serverErrorsProvider;
        this.d = operationStatusRouter;
        this.e = spannableBuilder;
        this.f = languageProvider;
        this.f314906g = uiResources;
        this.f314907h = statusDialogDispatcher;
        this.i = new v60.i();
        efm.k kVarFirstElement = presentationModel.j3().firstElement();
        r rVar = new r(new b0(this, 1), 4);
        kVarFirstElement.getClass();
        pfm.a aVar = new pfm.a(kVarFirstElement, rVar, 3);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        this.f314908j = aVar;
    }

    public static efm.r e(boolean z) {
        o3l.h.Companion.getClass();
        FragmentNavigateCommand fragmentNavigateCommand = new FragmentNavigateCommand(o3l.c.f221851b, null, true, 2042);
        if (z) {
            Intrinsics.checkNotNullParameter(fragmentNavigateCommand, "<this>");
            int i = R$anim.uikit_fade_in_center;
            int i2 = R$anim.uikit_fade_out_center;
            fragmentNavigateCommand = FragmentNavigateCommand.a(fragmentNavigateCommand, i, i2, i, i2, 1087);
        }
        efm.r rVarJust = efm.r.just(fragmentNavigateCommand);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }

    @Override // o3l.e
    public final efm.b a() {
        return this.d.a();
    }

    @Override // g3l.d
    public final efm.d0 b(k3l.j result) {
        Intrinsics.checkNotNullParameter(result, "result");
        String f104385a = result.a().getF104385a();
        if (Intrinsics.f(f104385a, "successViewRepresentation") || Intrinsics.f(f104385a, "errorViewRepresentation")) {
            f0 f0VarF = new pfm.h(new c0(this, 5), 2).f(efm.d0.m(Boolean.TRUE));
            Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
            return f0VarF;
        }
        ufm.b bVarM = efm.d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // o3l.e
    public final efm.b c(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        return this.d.c(clickData);
    }

    @Override // o3l.e
    public final efm.b d() {
        return this.d.d();
    }

    public final void f(NaviCommand naviCommand) {
        this.i.onNext(naviCommand);
    }
}
