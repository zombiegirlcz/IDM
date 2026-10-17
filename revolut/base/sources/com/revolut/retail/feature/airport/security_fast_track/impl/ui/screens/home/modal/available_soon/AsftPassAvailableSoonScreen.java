package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon.AsftPassAvailableSoonScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.modal.available_soon.AsftPassAvailableSoonScreenContract$InputData;
import dli.a;
import jui.b;
import jui.c;
import jui.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lti.g;
import lti.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/home/modal/available_soon/AsftPassAvailableSoonScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljui/c;", "Ldli/a;", "Ljui/d;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftPassAvailableSoonScreen extends ViewController<c> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AsftPassAvailableSoonScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final AsftPassAvailableSoonScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public AsftPassAvailableSoonScreen(AsftPassAvailableSoonScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassAvailableSoonScreen f178662b;

            {
                this.f178662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftPassAvailableSoonScreen asftPassAvailableSoonScreen = this.f178662b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftPassAvailableSoonScreen.Q;
                        AsftPassAvailableSoonScreen asftPassAvailableSoonScreen2 = this.f178662b;
                        return dli.f.a(asftPassAvailableSoonScreen2, (e) asftPassAvailableSoonScreen2.P.getValue(), v.k(new CellDetailsStandaloneNoteDelegate(), new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftPassAvailableSoonScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(asftPassAvailableSoonScreen.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).o;
                        AsftPassAvailableSoonScreenContract$InputData asftPassAvailableSoonScreenContract$InputData = asftPassAvailableSoonScreen.K;
                        asftPassAvailableSoonScreenContract$InputData.getClass();
                        return new j(gVar, asftPassAvailableSoonScreen, asftPassAvailableSoonScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftPassAvailableSoonScreen.Q;
                        return (e) ((j) asftPassAvailableSoonScreen.O.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: jui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassAvailableSoonScreen f178662b;

            {
                this.f178662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftPassAvailableSoonScreen asftPassAvailableSoonScreen = this.f178662b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftPassAvailableSoonScreen.Q;
                        AsftPassAvailableSoonScreen asftPassAvailableSoonScreen2 = this.f178662b;
                        return dli.f.a(asftPassAvailableSoonScreen2, (e) asftPassAvailableSoonScreen2.P.getValue(), v.k(new CellDetailsStandaloneNoteDelegate(), new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftPassAvailableSoonScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(asftPassAvailableSoonScreen.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).o;
                        AsftPassAvailableSoonScreenContract$InputData asftPassAvailableSoonScreenContract$InputData = asftPassAvailableSoonScreen.K;
                        asftPassAvailableSoonScreenContract$InputData.getClass();
                        return new j(gVar, asftPassAvailableSoonScreen, asftPassAvailableSoonScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftPassAvailableSoonScreen.Q;
                        return (e) ((j) asftPassAvailableSoonScreen.O.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: jui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassAvailableSoonScreen f178662b;

            {
                this.f178662b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftPassAvailableSoonScreen asftPassAvailableSoonScreen = this.f178662b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftPassAvailableSoonScreen.Q;
                        AsftPassAvailableSoonScreen asftPassAvailableSoonScreen2 = this.f178662b;
                        return dli.f.a(asftPassAvailableSoonScreen2, (e) asftPassAvailableSoonScreen2.P.getValue(), v.k(new CellDetailsStandaloneNoteDelegate(), new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftPassAvailableSoonScreen.Q;
                        phm.a aVar = (phm.a) ue0.e.j(asftPassAvailableSoonScreen.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        g gVar = ((g) aVar2.b()).o;
                        AsftPassAvailableSoonScreenContract$InputData asftPassAvailableSoonScreenContract$InputData = asftPassAvailableSoonScreen.K;
                        asftPassAvailableSoonScreenContract$InputData.getClass();
                        return new j(gVar, asftPassAvailableSoonScreen, asftPassAvailableSoonScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftPassAvailableSoonScreen.Q;
                        return (e) ((j) asftPassAvailableSoonScreen.O.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jui.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.asft_home_available_soon_title, null, null, 14), new TextLocalisedClause(R$string.asft_home_available_soon_subtitle, null, null, 14), null, null, false, 28));
        d3().f174545b.setText(new TextLocalisedClause(R$string.asft_pass_details_manage_booking, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new jkc.g(this, null, 18), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
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
