package wx7;

import a08.f0;
import a08.g0;
import akl.s;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.add.step.selection.PetTypeSelectionFragment;
import efm.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.o0;
import t1i.n;
import te0.w;
import twl.o;
import wrj.p;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xpi.g f300779j;
    public final iqi.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nx7.b f300780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nx7.c f300781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final xx7.c f300782n;

    public j(xpi.g navBar, iqi.h nextButtonView, nx7.b presentationModel, nx7.c router, xx7.c uiBuilder) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(nextButtonView, "nextButtonView");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(uiBuilder, "uiBuilder");
        this.f300779j = navBar;
        this.k = nextButtonView;
        this.f300780l = presentationModel;
        this.f300781m = router;
        this.f300782n = uiBuilder;
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // pri.a
    public final void N(rri.a aVar) {
        c view = (c) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pets_onboarding_pet_type_selection_title, null, null, 14);
        xpi.c cVar = (xpi.c) this.f300779j;
        cVar.n0(textLocalisedClause);
        cVar.p0(textLocalisedClause);
        cVar.l0(false);
        cVar.e0(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((iqi.b) this.k).setVisible(false);
        r map = ((ProductSelectionDelegate) ((PetTypeSelectionFragment) view).g0.getValue()).p().filter(new g0(4, g.f300776a)).map(new f0(2, h.f300777a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        pfm.a aVar2 = new pfm.a(w.D(map, new f(this, 0)), new o0(23, new p(new BreadcrumbException(), 3)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
        n nVar = new n(15, i.f300778a);
        s sVar = this.i;
        ofm.h hVarW = aVar2.w(new o(6, sVar), nVar);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        ifm.b bVar = this.f239031a;
        w.j0(bVar, hVarW);
        r map2 = ((nx7.n) this.f300780l).f220459b.g0().map(new wsg.k(new f(this, 1), 26));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        r rVarA = o70.a.a(map2);
        wma.e eVar = new wma.e(1, view, c.class, "setItems", "setItems(Ljava/util/List;)V", 0, 3);
        Function0 function0J = J();
        r rVarOnErrorResumeNext = rVarA.onErrorResumeNext(new o0(23, new p(new BreadcrumbException(), 2)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o(6, eVar), new o(6, sVar), new n(15, function0J));
        w.j0(bVar, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
    }
}
