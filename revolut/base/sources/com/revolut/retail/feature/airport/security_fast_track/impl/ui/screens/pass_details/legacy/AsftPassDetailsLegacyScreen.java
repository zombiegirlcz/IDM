package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.AsftPassDetailsLegacyScreenContract$InputData;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.legacy.a;
import dli.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lti.m;
import njj.n;
import nui.f;
import nui.g;
import nui.i;
import nui.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/legacy/AsftPassDetailsLegacyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/legacy/a;", "Ldli/a;", "Lnui/j;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftPassDetailsLegacyScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AsftPassDetailsLegacyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final AsftPassDetailsLegacyScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public AsftPassDetailsLegacyScreen(AsftPassDetailsLegacyScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, nui.b.f);
        this.N = w.y0(new ns1.a(19));
        this.O = w.y0(new ns1.a(20));
        this.P = w.y0(new ns1.a(21));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: nui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassDetailsLegacyScreen f219311b;

            {
                this.f219311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen = this.f219311b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftPassDetailsLegacyScreen.T;
                        AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen2 = this.f219311b;
                        return dli.f.a(asftPassDetailsLegacyScreen2, asftPassDetailsLegacyScreen2.R2(), v.k(new EsimLoadingDelegate(), new EsimDelegate(), new ToDoItemDelegate(), (FullScreenStateDelegate) asftPassDetailsLegacyScreen2.N.getValue(), (CellDetailsChevronDelegate) asftPassDetailsLegacyScreen2.P.getValue(), new CellDetailsLoadingDelegate(), new ScrollerDelegate(v.k(new QRCodeLoadingDelegate(), (QRCodeDelegate) asftPassDetailsLegacyScreen2.O.getValue(), new CounterTextDelegate()), false)), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftPassDetailsLegacyScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(asftPassDetailsLegacyScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftPassDetailsLegacyScreenContract$InputData asftPassDetailsLegacyScreenContract$InputData = asftPassDetailsLegacyScreen.K;
                        asftPassDetailsLegacyScreenContract$InputData.getClass();
                        return new m(gVar, asftPassDetailsLegacyScreen, asftPassDetailsLegacyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftPassDetailsLegacyScreen.T;
                        return (i) ((m) asftPassDetailsLegacyScreen.R.getValue()).f199932h.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: nui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassDetailsLegacyScreen f219311b;

            {
                this.f219311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen = this.f219311b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftPassDetailsLegacyScreen.T;
                        AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen2 = this.f219311b;
                        return dli.f.a(asftPassDetailsLegacyScreen2, asftPassDetailsLegacyScreen2.R2(), v.k(new EsimLoadingDelegate(), new EsimDelegate(), new ToDoItemDelegate(), (FullScreenStateDelegate) asftPassDetailsLegacyScreen2.N.getValue(), (CellDetailsChevronDelegate) asftPassDetailsLegacyScreen2.P.getValue(), new CellDetailsLoadingDelegate(), new ScrollerDelegate(v.k(new QRCodeLoadingDelegate(), (QRCodeDelegate) asftPassDetailsLegacyScreen2.O.getValue(), new CounterTextDelegate()), false)), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftPassDetailsLegacyScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(asftPassDetailsLegacyScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftPassDetailsLegacyScreenContract$InputData asftPassDetailsLegacyScreenContract$InputData = asftPassDetailsLegacyScreen.K;
                        asftPassDetailsLegacyScreenContract$InputData.getClass();
                        return new m(gVar, asftPassDetailsLegacyScreen, asftPassDetailsLegacyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftPassDetailsLegacyScreen.T;
                        return (i) ((m) asftPassDetailsLegacyScreen.R.getValue()).f199932h.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: nui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassDetailsLegacyScreen f219311b;

            {
                this.f219311b = this;
            }

            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen = this.f219311b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftPassDetailsLegacyScreen.T;
                        AsftPassDetailsLegacyScreen asftPassDetailsLegacyScreen2 = this.f219311b;
                        return dli.f.a(asftPassDetailsLegacyScreen2, asftPassDetailsLegacyScreen2.R2(), v.k(new EsimLoadingDelegate(), new EsimDelegate(), new ToDoItemDelegate(), (FullScreenStateDelegate) asftPassDetailsLegacyScreen2.N.getValue(), (CellDetailsChevronDelegate) asftPassDetailsLegacyScreen2.P.getValue(), new CellDetailsLoadingDelegate(), new ScrollerDelegate(v.k(new QRCodeLoadingDelegate(), (QRCodeDelegate) asftPassDetailsLegacyScreen2.O.getValue(), new CounterTextDelegate()), false)), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftPassDetailsLegacyScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(asftPassDetailsLegacyScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftPassDetailsLegacyScreenContract$InputData asftPassDetailsLegacyScreenContract$InputData = asftPassDetailsLegacyScreen.K;
                        asftPassDetailsLegacyScreenContract$InputData.getClass();
                        return new m(gVar, asftPassDetailsLegacyScreen, asftPassDetailsLegacyScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftPassDetailsLegacyScreen.T;
                        return (i) ((m) asftPassDetailsLegacyScreen.R.getValue()).f199932h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((j) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!this.K.f98856b) {
            return super.F2();
        }
        b bVar = (b) R2();
        if (bVar.o.f98856b) {
            bVar.C2(a.C0601a.f98859a);
            return true;
        }
        bVar.B2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.asft_pass_details_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "ID_FAQ", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new nui.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new nui.e(this, continuation, 1), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), new f(this, null), 3);
        ViewController.P2(this, new n(rd0.e.b(((QRCodeDelegate) this.O.getValue()).u()), 13), new g(this, continuation, 0), 3);
        ViewController.P2(this, new n(rd0.e.b(((CellDetailsChevronDelegate) this.P.getValue()).f51821c), 14), new g(this, continuation, 1), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
