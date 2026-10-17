package os2;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.internal.views.ProgressAnimation;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.blue_prompt.BluePromptBackgroundType;
import com.revolut.feature.blue_prompt.BluePromptContent;
import com.revolut.feature.blue_prompt.BluePromptProgressAnimation;
import cqi.j;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od0.i;
import om4.m1;
import oma.n;
import qfm.e1;
import qfm.j1;
import rp0.n0;
import rp0.p0;
import rp0.q0;
import rp0.r0;
import rp0.s0;
import rp0.t0;
import rp0.u0;
import sri.m;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends pri.b implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ks2.a f229225h;
    public final cqi.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f229226j;

    public h(ks2.a state, cqi.h promptView, m navigator) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(promptView, "promptView");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f229225h = state;
        this.i = promptView;
        this.f229226j = navigator;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        s0 t0Var;
        KProperty[] kPropertyArr;
        Clause clause;
        ProgressAnimation progressAnimation;
        s0 s0Var;
        q0 q0Var;
        d view = (d) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        j jVar = (j) this.i;
        r map = jVar.i.d().map(new or2.e(new f(this, 0), 7));
        p0 p0Var = jVar.i;
        r map2 = p0Var.f().map(new or2.e(new f(this, 1), 8));
        r map3 = p0Var.c().map(new or2.e(new f(this, 2), 9));
        r rVarB = p0Var.b();
        r map4 = p0Var.f256147a.g().map(new rof.e(17, new n0(1)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        r rVarMerge = r.merge(v.k(map, map2, map3, r.merge(rVarB, map4).map(new or2.e(new f(this, 3), 10))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        qfm.p0 p0VarE = w.E(rVarMerge, new f(this, 4));
        m1 m1Var = new m1(1, this.f229226j, m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 5);
        Function1 function1K = K();
        Function0 function0J = J();
        j1 j1Var = new j1(p0VarE, new g(new n(new BreadcrumbException(), 8)), 1);
        Intrinsics.checkNotNullExpressionValue(j1Var, "onErrorResumeNext(...)");
        w.j0(this.f239031a, j1Var.m(new lhi.b(16, m1Var), new lhi.b(16, function1K), new j7a.j(29, function0J), e1.INSTANCE));
        ks2.d dVar = (ks2.d) this.f229225h;
        Clause clause2 = (Clause) dVar.N0().get();
        Clause clause3 = (Clause) dVar.B0().get();
        Clause clause4 = (Clause) ((i) dVar.C0().get()).f224257a;
        te0.n nVar = dVar.f189112h;
        KProperty[] kPropertyArr2 = ks2.d.f189108y;
        Clause clause5 = (Clause) ((i) nVar.getValue(dVar, kPropertyArr2[6]).get()).f224257a;
        BluePromptContent bluePromptContent = (BluePromptContent) dVar.A0().get();
        Intrinsics.checkNotNullParameter(bluePromptContent, "<this>");
        if (bluePromptContent.equals(BluePromptContent.NoContent.f64283a)) {
            s0Var = s0.a.f256164a;
            kPropertyArr = kPropertyArr2;
            clause = clause2;
        } else {
            if (bluePromptContent instanceof BluePromptContent.MediaContent) {
                t0Var = new r0(((BluePromptContent.MediaContent) bluePromptContent).f64282a);
                kPropertyArr = kPropertyArr2;
                clause = clause2;
            } else {
                if (!(bluePromptContent instanceof BluePromptContent.ProgressContent)) {
                    throw new NoWhenBranchMatchedException();
                }
                BluePromptContent.ProgressContent progressContent = (BluePromptContent.ProgressContent) bluePromptContent;
                int i = progressContent.f64284a;
                int i2 = R$attr.uikit_colorActionPhotoHeaderText;
                int i3 = R$attr.uikit_colorGreyTone50_20;
                BluePromptProgressAnimation bluePromptProgressAnimation = progressContent.d;
                if (bluePromptProgressAnimation != null) {
                    Intrinsics.checkNotNullParameter(bluePromptProgressAnimation, "<this>");
                    kPropertyArr = kPropertyArr2;
                    clause = clause2;
                    progressAnimation = new ProgressAnimation(bluePromptProgressAnimation.f64287a, true);
                } else {
                    kPropertyArr = kPropertyArr2;
                    clause = clause2;
                    progressAnimation = null;
                }
                t0Var = new t0(new ProgressStyle(i, 100, i2, i2, i3, 8.0f, 8.0f, progressAnimation, 512), progressContent.f64285b, progressContent.f64286c);
            }
            s0Var = t0Var;
        }
        Clause clause6 = (Clause) ((i) dVar.H0().get()).f224257a;
        Clause clause7 = (Clause) ((i) dVar.L0().get()).f224257a;
        AnalyticsContext analyticsContext = (AnalyticsContext) ((i) dVar.F0().get()).f224257a;
        AnalyticsContext analyticsContext2 = (AnalyticsContext) ((i) dVar.J0().get()).f224257a;
        ResourceImage resourceImage = (ResourceImage) ((i) dVar.z0().get()).f224257a;
        ks2.e eVar = (ks2.e) dVar.x0().get();
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        int i5 = ks2.b.f189095a[eVar.ordinal()];
        if (i5 == 1) {
            q0Var = q0.VERTICAL;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            q0Var = q0.HORIZONTAL;
        }
        q0 q0Var2 = q0Var;
        Clause clause8 = clause;
        s0 s0Var2 = s0Var;
        u0 model = new u0(clause8, clause3, clause4, s0Var2, clause5, resourceImage, null, q0Var2, clause6, clause7, analyticsContext, analyticsContext2, (Image) ((i) dVar.G0().get()).f224257a, (Image) ((i) dVar.K0().get()).f224257a, (LargeActionButton.ButtonStyle) dVar.f189116n.getValue(dVar, kPropertyArr[12]).get(), (LargeActionButton.ButtonStyle) dVar.M0().get(), null, com.revolut.feature.blue_prompt.a.a((BluePromptBackgroundType) ((i) dVar.w0().get()).f224257a), null, 32375104);
        Intrinsics.checkNotNullParameter(model, "model");
        p0Var.g(model);
    }
}
