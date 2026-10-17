package com.revolut.feature.restricted_access.impl.ui.generic;

import aii.q;
import android.app.Activity;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.restricted_access.R$string;
import com.revolut.feature.restricted_access.impl.ui.generic.RestrictedGenericScreen;
import com.revolut.feature.restricted_access.impl.ui.generic.RestrictedGenericScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import e0b.b;
import e0b.c;
import e0b.e;
import e0b.f;
import e0b.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/restricted_access/impl/ui/generic/RestrictedGenericScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le0b/f;", "Lno/m;", "feature_restricted_access_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RestrictedGenericScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(RestrictedGenericScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RestrictedGenericScreenContract$InputData K;
    public final int L;
    public final AnalyticsProduct.Shared.FinCrime M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public RestrictedGenericScreen(RestrictedGenericScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = AnalyticsProduct.Shared.FinCrime.f;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: e0b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RestrictedGenericScreen f121546b;

            {
                this.f121546b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RestrictedGenericScreen restrictedGenericScreen = this.f121546b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RestrictedGenericScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(restrictedGenericScreen.m2()).a().get(uza.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", uza.a.class, " is not found"));
                        }
                        a0b.d dVar = ((a0b.d) aVar2.b()).f;
                        RestrictedGenericScreenContract$InputData restrictedGenericScreenContract$InputData = restrictedGenericScreen.K;
                        restrictedGenericScreenContract$InputData.getClass();
                        return new a0b.e(dVar, restrictedGenericScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RestrictedGenericScreen.R;
                        return (e) ((a0b.e) restrictedGenericScreen.O.getValue()).f312b.get();
                    default:
                        KProperty[] kPropertyArr3 = RestrictedGenericScreen.R;
                        RestrictedGenericScreen restrictedGenericScreen2 = this.f121546b;
                        return dli.f.a(restrictedGenericScreen2, (e) restrictedGenericScreen2.P.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: e0b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RestrictedGenericScreen f121546b;

            {
                this.f121546b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RestrictedGenericScreen restrictedGenericScreen = this.f121546b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RestrictedGenericScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(restrictedGenericScreen.m2()).a().get(uza.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", uza.a.class, " is not found"));
                        }
                        a0b.d dVar = ((a0b.d) aVar2.b()).f;
                        RestrictedGenericScreenContract$InputData restrictedGenericScreenContract$InputData = restrictedGenericScreen.K;
                        restrictedGenericScreenContract$InputData.getClass();
                        return new a0b.e(dVar, restrictedGenericScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RestrictedGenericScreen.R;
                        return (e) ((a0b.e) restrictedGenericScreen.O.getValue()).f312b.get();
                    default:
                        KProperty[] kPropertyArr3 = RestrictedGenericScreen.R;
                        RestrictedGenericScreen restrictedGenericScreen2 = this.f121546b;
                        return dli.f.a(restrictedGenericScreen2, (e) restrictedGenericScreen2.P.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: e0b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RestrictedGenericScreen f121546b;

            {
                this.f121546b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RestrictedGenericScreen restrictedGenericScreen = this.f121546b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RestrictedGenericScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(restrictedGenericScreen.m2()).a().get(uza.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", uza.a.class, " is not found"));
                        }
                        a0b.d dVar = ((a0b.d) aVar2.b()).f;
                        RestrictedGenericScreenContract$InputData restrictedGenericScreenContract$InputData = restrictedGenericScreen.K;
                        restrictedGenericScreenContract$InputData.getClass();
                        return new a0b.e(dVar, restrictedGenericScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = RestrictedGenericScreen.R;
                        return (e) ((a0b.e) restrictedGenericScreen.O.getValue()).f312b.get();
                    default:
                        KProperty[] kPropertyArr3 = RestrictedGenericScreen.R;
                        RestrictedGenericScreen restrictedGenericScreen2 = this.f121546b;
                        return dli.f.a(restrictedGenericScreen2, (e) restrictedGenericScreen2.P.getValue(), v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        e eVar = (e) this.P.getValue();
        Activity activity = m2();
        ((i) eVar).getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.finishAffinity();
        return true;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (a0b.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setExpanded(true);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.restricted_general_title, null, null, 14), null);
        d3().f174539b.setToolbarTitle(new TextLocalisedClause(R$string.restricted_general_title, null, null, 14));
        NavBarWithToolbar navBarWithToolbar2 = d3().f174539b;
        List listK = v.k(new TextLocalisedClause(R$string.restricted_general_second_description, null, null, 14), new TextLocalisedClause(R$string.restricted_common_action_learn_more, null, new Click(14, Integer.valueOf(R$attr.uikit_colorBlue), (Object) null, "LEARN_MORE_CLICK_ID", false), 10));
        m70.a.t(t0.f186434a);
        navBarWithToolbar2.setSecondDescriptionText(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
        d3().f174539b.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.x0()), new c(this, null, 0), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
