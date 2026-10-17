package com.revolut.feature.apm.iris.impl.ui.settings;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.iris.api.R$string;
import com.revolut.feature.apm.iris.impl.ui.settings.IrisSettingsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ot1.p;
import p0l.d;
import p62.b;
import p62.c;
import p62.f;
import p62.i;
import te0.w;
import vc.s;
import xki.e;
import z52.r;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/iris/impl/ui/settings/IrisSettingsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lp62/i;", "feature_apm_iris_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IrisSettingsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(IrisSettingsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final h P;
    public final Object Q;
    public final Object R;

    public IrisSettingsScreen(IrisSettingsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new p0l.a(17));
        this.L = w.y0(new p0l.a(18));
        this.M = w.y0(new p0l.a(19));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: p62.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisSettingsScreen f233203b;

            {
                this.f233203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = IrisSettingsScreen.S;
                        IrisSettingsScreen irisSettingsScreen = this.f233203b;
                        return dli.f.a(irisSettingsScreen, irisSettingsScreen.d(), v.k((CellDetailsChevronDelegate) irisSettingsScreen.K.getValue(), (FullScreenStateDelegate) irisSettingsScreen.L.getValue(), (RowDelegate) irisSettingsScreen.M.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = IrisSettingsScreen.S;
                        return (h) ((z52.r) this.f233203b.Q.getValue()).d.get();
                }
            }
        });
        this.O = R$layout.screen_recycler_navbar;
        this.P = s.t(this, b.f);
        this.Q = w.y0(new p(this, inputData, 18));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: p62.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IrisSettingsScreen f233203b;

            {
                this.f233203b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IrisSettingsScreen.S;
                        IrisSettingsScreen irisSettingsScreen = this.f233203b;
                        return dli.f.a(irisSettingsScreen, irisSettingsScreen.d(), v.k((CellDetailsChevronDelegate) irisSettingsScreen.K.getValue(), (FullScreenStateDelegate) irisSettingsScreen.L.getValue(), (RowDelegate) irisSettingsScreen.M.getValue(), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = IrisSettingsScreen.S;
                        return (h) ((z52.r) this.f233203b.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.iris_settings_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.iris_settings_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new d(this, null, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsChevronDelegate) this.K.getValue()).f51821c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.L.getValue()).f52371h.f121375b), null, new p62.d(this, null), 3);
        ?? r56 = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53218h), null, new p62.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) r56.getValue()).f53220l), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final p62.h d() {
        return (p62.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
