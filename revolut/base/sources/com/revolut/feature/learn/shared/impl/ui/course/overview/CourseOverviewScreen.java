package com.revolut.feature.learn.shared.impl.ui.course.overview;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NewsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.learn.shared.impl.R$id;
import com.revolut.feature.learn.shared.impl.R$layout;
import com.revolut.feature.learn.shared.impl.ui.course.overview.c;
import com.revolut.feature.learn.shared.impl.ui.course.overview.d;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import exe.j;
import hwi.l0;
import i09.i;
import i09.l;
import i09.m;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ms0.s4;
import myj.g;
import te0.w;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Li09/m;", "Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CourseOverviewScreen extends BaseRecyclerViewScreen<m, CourseOverviewScreenContract$InputData, q> implements no.m {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f77977d0 = {o0.f186429a.j(new h0(CourseOverviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/learn/shared/impl/databinding/ScreenCourseOverviewBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final LargeActionButtonDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final NewsDelegate f77978a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final FullScreenStateDelegate f77979b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseOverviewScreen(CourseOverviewScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_course_overview;
        this.V = R$id.courseOverview_recyclerView;
        this.W = s.t(this, i09.f.f);
        this.X = w.y0(new hl6.b(this, inputData, 27));
        this.Y = w.y0(new hq1.f(this, 15));
        this.Z = new LargeActionButtonDelegate();
        NewsDelegate newsDelegate = new NewsDelegate();
        this.f77978a0 = newsDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f77979b0 = fullScreenStateDelegate;
        this.c0 = v.k(newsDelegate, new NewsLoadingDelegate(), fullScreenStateDelegate, new VaultsProgressDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getT() {
        dz8.f fVar = (dz8.f) ((f09.c) this.X.getValue()).f131047b.f131058a.f220914j.get();
        s.j(fVar);
        return ((g) fVar).d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f09.c) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ScreenContentRecyclerView courseOverviewRecyclerView = h3().f110329c;
        Intrinsics.checkNotNullExpressionValue(courseOverviewRecyclerView, "courseOverviewRecyclerView");
        knm.b.y(kli.a.w(R$attr.uikit_dp4, m2()), courseOverviewRecyclerView);
        h3().f110328b.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        NavBarWithBigTile navBarWithBigTile = h3().f110328b;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59357t), null, new l0(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile.f59360y.N.f56412a), null, new a(this, null), 3);
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, new hsl.c(rd0.e.b(this.f77979b0.f52371h.f121375b), 15), null, new hp4.e(i2, T2(), l.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$Event;)V", i, 6), 3);
        j60.a aVar = (j60.a) ((f09.c) this.X.getValue()).e.get();
        LargeActionButtonDelegate largeActionButtonDelegate = this.Z;
        aVar.d(u.c(largeActionButtonDelegate));
        com.revolut.kompot.navigable.a.g2(this, new hsl.c(rd0.e.b(largeActionButtonDelegate.d.f121375b), 13), null, new hp4.e(i2, T2(), l.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$Event;)V", i, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, new j(new hsl.c(rd0.e.b(this.f77978a0.p()), 14), 20), null, new hp4.e(i2, T2(), l.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/course/overview/CourseOverviewScreenContract$Event;)V", i, 5), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(m uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d dVar = uiState.f157332b;
        NavBarWithBigTile navBarWithBigTile = h3().f110328b;
        if (!(dVar instanceof i09.j)) {
            if (!dVar.equals(d.a.f77999a)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        i09.j jVar = (i09.j) dVar;
        Clause clause = jVar.d;
        c cVar = jVar.e;
        TextClause textClause = jVar.f157327a;
        navBarWithBigTile.setToolbarTitle(textClause);
        navBarWithBigTile.setTitle(textClause);
        navBarWithBigTile.setDescription(jVar.f157328b);
        navBarWithBigTile.setSocialProofLabel(clause != null ? new s4(v.l(jVar.f157329c), clause, 0, 12) : null);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setMenuItems(jVar.f157330g);
        navBarWithBigTile.setBackgroundImage(jVar.f);
        Context context = navBarWithBigTile.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorWhite_20, context);
        Context context2 = navBarWithBigTile.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        navBarWithBigTile.setLineProgressIndicatorColors(iS, kli.a.s(R$attr.uikit_colorWhite, context2));
        if (cVar.equals(c.a.f77997a)) {
            navBarWithBigTile.setLineProgressIndicatorVisible(false);
            return;
        }
        if (cVar instanceof i) {
            navBarWithBigTile.setLineProgressIndicatorVisible(true);
            navBarWithBigTile.setLineProgressIndicatorPercentage(((i) cVar).f157326a);
        } else {
            if (!cVar.equals(c.b.f77998a)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setLineProgressIndicatorVisible(true);
            navBarWithBigTile.setLineProgressIndicatorPercentage(3);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final d09.a h3() {
        ViewBinding value = this.W.getValue(this, f77977d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d09.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.FALSE;
    }
}
