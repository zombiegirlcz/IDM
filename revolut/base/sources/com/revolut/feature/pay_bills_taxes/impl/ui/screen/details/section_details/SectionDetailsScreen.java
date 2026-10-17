package com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details.SectionDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.details.section_details.SectionDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.f;
import ec8.c;
import eg9.b;
import eg9.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lf9.m;
import lf9.t;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/details/section_details/SectionDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Leg9/d;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SectionDetailsScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SectionDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final SectionDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public SectionDetailsScreen(SectionDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: eg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SectionDetailsScreen f125569b;

            {
                this.f125569b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SectionDetailsScreen sectionDetailsScreen = this.f125569b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SectionDetailsScreen.Q;
                        SectionDetailsScreen sectionDetailsScreen2 = this.f125569b;
                        return f.a(sectionDetailsScreen2, (e) sectionDetailsScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SectionDetailsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(sectionDetailsScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).u;
                        SectionDetailsScreenContract$InputData sectionDetailsScreenContract$InputData = sectionDetailsScreen.K;
                        sectionDetailsScreenContract$InputData.getClass();
                        return new t(mVar, sectionDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SectionDetailsScreen.Q;
                        return (e) ((t) sectionDetailsScreen.O.getValue()).f194799c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: eg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SectionDetailsScreen f125569b;

            {
                this.f125569b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SectionDetailsScreen sectionDetailsScreen = this.f125569b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SectionDetailsScreen.Q;
                        SectionDetailsScreen sectionDetailsScreen2 = this.f125569b;
                        return f.a(sectionDetailsScreen2, (e) sectionDetailsScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SectionDetailsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(sectionDetailsScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).u;
                        SectionDetailsScreenContract$InputData sectionDetailsScreenContract$InputData = sectionDetailsScreen.K;
                        sectionDetailsScreenContract$InputData.getClass();
                        return new t(mVar, sectionDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SectionDetailsScreen.Q;
                        return (e) ((t) sectionDetailsScreen.O.getValue()).f194799c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: eg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SectionDetailsScreen f125569b;

            {
                this.f125569b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SectionDetailsScreen sectionDetailsScreen = this.f125569b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SectionDetailsScreen.Q;
                        SectionDetailsScreen sectionDetailsScreen2 = this.f125569b;
                        return f.a(sectionDetailsScreen2, (e) sectionDetailsScreen2.P.getValue(), v.k(new CellDetailsDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SectionDetailsScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(sectionDetailsScreen.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).u;
                        SectionDetailsScreenContract$InputData sectionDetailsScreenContract$InputData = sectionDetailsScreen.K;
                        sectionDetailsScreenContract$InputData.getClass();
                        return new t(mVar, sectionDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SectionDetailsScreen.Q;
                        return (e) ((t) sectionDetailsScreen.O.getValue()).f194799c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (eg9.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        SectionDetailsScreenContract$InputData sectionDetailsScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(new TextClause(sectionDetailsScreenContract$InputData.f78705a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setTitle(new TextClause(sectionDetailsScreenContract$InputData.f78705a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new c(this, null, 5), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
