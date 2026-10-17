package com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import az.i;
import azi.b;
import azi.d;
import azi.e;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access.SchemeLoungesHowToAccessScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.scheme.how_to_access.SchemeLoungesHowToAccessScreenContract$InputData;
import cwi.s0;
import dli.a;
import dli.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/scheme/how_to_access/SchemeLoungesHowToAccessScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lazi/e;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SchemeLoungesHowToAccessScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(SchemeLoungesHowToAccessScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final SchemeLoungesHowToAccessScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public SchemeLoungesHowToAccessScreen(SchemeLoungesHowToAccessScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: azi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SchemeLoungesHowToAccessScreen f11461b;

            {
                this.f11461b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SchemeLoungesHowToAccessScreen schemeLoungesHowToAccessScreen = this.f11461b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SchemeLoungesHowToAccessScreen.R;
                        SchemeLoungesHowToAccessScreen schemeLoungesHowToAccessScreen2 = this.f11461b;
                        return dli.f.a(schemeLoungesHowToAccessScreen2, (d) schemeLoungesHowToAccessScreen2.Q.getValue(), u.c(schemeLoungesHowToAccessScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SchemeLoungesHowToAccessScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(schemeLoungesHowToAccessScreen.m2()).a().get(ovi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ovi.a.class, " is not found"));
                        }
                        cwi.h0 h0Var = ((cwi.h0) aVar2.b()).f109711y;
                        SchemeLoungesHowToAccessScreenContract$InputData schemeLoungesHowToAccessScreenContract$InputData = schemeLoungesHowToAccessScreen.K;
                        schemeLoungesHowToAccessScreenContract$InputData.getClass();
                        return new s0(h0Var, schemeLoungesHowToAccessScreen, schemeLoungesHowToAccessScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SchemeLoungesHowToAccessScreen.R;
                        return (d) ((s0) schemeLoungesHowToAccessScreen.P.getValue()).i.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: azi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SchemeLoungesHowToAccessScreen f11461b;

            {
                this.f11461b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SchemeLoungesHowToAccessScreen schemeLoungesHowToAccessScreen = this.f11461b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SchemeLoungesHowToAccessScreen.R;
                        SchemeLoungesHowToAccessScreen schemeLoungesHowToAccessScreen2 = this.f11461b;
                        return dli.f.a(schemeLoungesHowToAccessScreen2, (d) schemeLoungesHowToAccessScreen2.Q.getValue(), u.c(schemeLoungesHowToAccessScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SchemeLoungesHowToAccessScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(schemeLoungesHowToAccessScreen.m2()).a().get(ovi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ovi.a.class, " is not found"));
                        }
                        cwi.h0 h0Var = ((cwi.h0) aVar2.b()).f109711y;
                        SchemeLoungesHowToAccessScreenContract$InputData schemeLoungesHowToAccessScreenContract$InputData = schemeLoungesHowToAccessScreen.K;
                        schemeLoungesHowToAccessScreenContract$InputData.getClass();
                        return new s0(h0Var, schemeLoungesHowToAccessScreen, schemeLoungesHowToAccessScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SchemeLoungesHowToAccessScreen.R;
                        return (d) ((s0) schemeLoungesHowToAccessScreen.P.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: azi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SchemeLoungesHowToAccessScreen f11461b;

            {
                this.f11461b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SchemeLoungesHowToAccessScreen schemeLoungesHowToAccessScreen = this.f11461b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SchemeLoungesHowToAccessScreen.R;
                        SchemeLoungesHowToAccessScreen schemeLoungesHowToAccessScreen2 = this.f11461b;
                        return dli.f.a(schemeLoungesHowToAccessScreen2, (d) schemeLoungesHowToAccessScreen2.Q.getValue(), u.c(schemeLoungesHowToAccessScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = SchemeLoungesHowToAccessScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(schemeLoungesHowToAccessScreen.m2()).a().get(ovi.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ovi.a.class, " is not found"));
                        }
                        cwi.h0 h0Var = ((cwi.h0) aVar2.b()).f109711y;
                        SchemeLoungesHowToAccessScreenContract$InputData schemeLoungesHowToAccessScreenContract$InputData = schemeLoungesHowToAccessScreen.K;
                        schemeLoungesHowToAccessScreenContract$InputData.getClass();
                        return new s0(h0Var, schemeLoungesHowToAccessScreen, schemeLoungesHowToAccessScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SchemeLoungesHowToAccessScreen.R;
                        return (d) ((s0) schemeLoungesHowToAccessScreen.P.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (s0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarBottomSheet navBarBottomSheet = d3().f174546c;
        SchemeLoungesHowToAccessScreenContract$InputData schemeLoungesHowToAccessScreenContract$InputData = this.K;
        navBarBottomSheet.setHeaderModel(new lw0.a(new TextClause(schemeLoungesHowToAccessScreenContract$InputData.f99157a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30));
        LargeActionButton largeActionButton = d3().f174545b;
        largeActionButton.setLoadingButtonTag("HOW_TO_ACCESS_LOADING_BUTTON_TAG");
        largeActionButton.setText(new TextClause(schemeLoungesHowToAccessScreenContract$InputData.f99159c.f98939a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174545b.o), null, new i(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53226s), null, new avk.i(this, continuation, 11), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
