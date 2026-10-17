package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CenteredContentTileDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PassCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.AsftPassDetailsScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.AsftPassDetailsScreenContract$InputData;
import dli.a;
import jii.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kr.h2;
import kui.b;
import kui.c;
import kui.d;
import kui.f;
import kui.g;
import lti.n;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/AsftPassDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkui/f;", "Ldli/a;", "Lkui/g;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftPassDetailsScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AsftPassDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0))};
    public final AsftPassDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public AsftPassDetailsScreen(AsftPassDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_basic_navbar;
        this.M = s.t(this, b.f);
        this.N = w.y0(new h2(24));
        this.O = w.y0(new h2(25));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: kui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassDetailsScreen f189817b;

            {
                this.f189817b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AsftPassDetailsScreen asftPassDetailsScreen = this.f189817b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftPassDetailsScreen.S;
                        AsftPassDetailsScreen asftPassDetailsScreen2 = this.f189817b;
                        return dli.f.a(asftPassDetailsScreen2, asftPassDetailsScreen2.R2(), v.k((FullScreenStateDelegate) asftPassDetailsScreen2.N.getValue(), new PassCardLoadingDelegate(), new CenteredContentTileDelegate(), (ScrollerDelegate) asftPassDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftPassDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(asftPassDetailsScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftPassDetailsScreenContract$InputData asftPassDetailsScreenContract$InputData = asftPassDetailsScreen.K;
                        asftPassDetailsScreenContract$InputData.getClass();
                        return new n(gVar, asftPassDetailsScreen, asftPassDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftPassDetailsScreen.S;
                        return (h) ((n) asftPassDetailsScreen.Q.getValue()).f199937h.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: kui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassDetailsScreen f189817b;

            {
                this.f189817b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AsftPassDetailsScreen asftPassDetailsScreen = this.f189817b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftPassDetailsScreen.S;
                        AsftPassDetailsScreen asftPassDetailsScreen2 = this.f189817b;
                        return dli.f.a(asftPassDetailsScreen2, asftPassDetailsScreen2.R2(), v.k((FullScreenStateDelegate) asftPassDetailsScreen2.N.getValue(), new PassCardLoadingDelegate(), new CenteredContentTileDelegate(), (ScrollerDelegate) asftPassDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftPassDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(asftPassDetailsScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftPassDetailsScreenContract$InputData asftPassDetailsScreenContract$InputData = asftPassDetailsScreen.K;
                        asftPassDetailsScreenContract$InputData.getClass();
                        return new n(gVar, asftPassDetailsScreen, asftPassDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftPassDetailsScreen.S;
                        return (h) ((n) asftPassDetailsScreen.Q.getValue()).f199937h.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: kui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftPassDetailsScreen f189817b;

            {
                this.f189817b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AsftPassDetailsScreen asftPassDetailsScreen = this.f189817b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AsftPassDetailsScreen.S;
                        AsftPassDetailsScreen asftPassDetailsScreen2 = this.f189817b;
                        return dli.f.a(asftPassDetailsScreen2, asftPassDetailsScreen2.R2(), v.k((FullScreenStateDelegate) asftPassDetailsScreen2.N.getValue(), new PassCardLoadingDelegate(), new CenteredContentTileDelegate(), (ScrollerDelegate) asftPassDetailsScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AsftPassDetailsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(asftPassDetailsScreen.m2()).a().get(lti.g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", lti.g.class, " is not found"));
                        }
                        lti.g gVar = ((lti.g) aVar2.b()).o;
                        AsftPassDetailsScreenContract$InputData asftPassDetailsScreenContract$InputData = asftPassDetailsScreen.K;
                        asftPassDetailsScreenContract$InputData.getClass();
                        return new n(gVar, asftPassDetailsScreen, asftPassDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AsftPassDetailsScreen.S;
                        return (h) ((n) asftPassDetailsScreen.Q.getValue()).f199937h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174530b.setMenuItems(uiState.f189823a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(kli.a.s(R$attr.uikit_colorGroupedBackground, context));
        BasicNavBar basicNavBar = d3().f174530b;
        basicNavBar.setTitle(new TextLocalisedClause(R$string.asft_pass_details_title, null, null, 14));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174530b.f59211b), null, new ko2.b(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174530b.f59210a.f57403b), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ScrollerDelegate) this.O.getValue()).q()), null, new c(this, continuation, 1), 3);
    }

    public final j d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final kui.h R2() {
        return (kui.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
