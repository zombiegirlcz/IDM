package ms2;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.blue_prompt.BluePromptBackgroundType;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ks0.n;
import ms0.j0;
import qfm.e1;
import qfm.j1;
import qfm.p0;
import sri.m;
import te0.w;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends pri.c implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ks2.a f208628h;
    public final h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tri.c f208629j;
    public final m k;

    public k(ks2.a state, h presentationModel, tri.c backButtonView, m navigator) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(backButtonView, "backButtonView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f208628h = state;
        this.i = presentationModel;
        this.f208629j = backButtonView;
        this.k = navigator;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        this.i.init();
        BluePromptActivity view2 = (BluePromptActivity) view;
        int i = 24;
        r map = view2.b1().f53054h.f121375b.map(new j0(new mqg.b(i), 16));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r map2 = map.map(new j0(new i(this, 1), 21));
        int i2 = 22;
        r map3 = view2.b1().i.f121375b.map(new j0(new mqg.b(i2), 14));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        r map4 = map3.map(new j0(new i(this, 2), i2));
        int i3 = 23;
        r map5 = view2.b1().r().map(new j0(new mqg.b(i3), 15));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        r map6 = map5.map(new j0(new i(this, 3), i3));
        r map7 = view2.b1().p().map(new j0(new i(this, 4), i));
        Intrinsics.checkNotNullParameter(view2, "view");
        r map8 = view2.b1().q().map(new j0(new mqg.b(25), 17));
        Intrinsics.checkNotNullExpressionValue(map8, "map(...)");
        r map9 = r.merge(map8, this.f208629j.f273801b).map(new j0(new i(this, 0), 20));
        Intrinsics.checkNotNullExpressionValue(map9, "map(...)");
        r rVarMergeArray = r.mergeArray(map2, map4, map6, map7, map9);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        p0 p0VarE = w.E(rVarMergeArray, new mqg.b(26));
        mm7.h hVar = new mm7.h(1, this.k, m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 17);
        Function1 function1K = K();
        Function0 function0J = J();
        j1 j1Var = new j1(p0VarE, new n(new j(new BreadcrumbException(), 0)), 1);
        Intrinsics.checkNotNullExpressionValue(j1Var, "onErrorResumeNext(...)");
        w.j0(this.f239031a, j1Var.m(new m3l.d(1, hVar), new m3l.d(1, function1K), new j7a.j(10, function0J), e1.INSTANCE));
        ks2.d dVar = (ks2.d) this.f208628h;
        view2.d1(new ks2.c((Clause) dVar.N0().get(), (Clause) dVar.B0().get(), (Clause) ((od0.i) dVar.C0().get()).f224257a, (BluePromptContent) dVar.A0().get(), (ResourceImage) ((od0.i) dVar.z0().get()).f224257a, (ks2.e) dVar.x0().get(), (Clause) ((od0.i) dVar.H0().get()).f224257a, (Clause) ((od0.i) dVar.L0().get()).f224257a, (Image) ((od0.i) dVar.G0().get()).f224257a, (Image) ((od0.i) dVar.K0().get()).f224257a, (LargeActionButton.ButtonStyle) dVar.M0().get(), (AnalyticsContext) ((od0.i) dVar.F0().get()).f224257a, (AnalyticsContext) ((od0.i) dVar.J0().get()).f224257a, (BluePromptBackgroundType) ((od0.i) dVar.w0().get()).f224257a, 577553));
    }
}
