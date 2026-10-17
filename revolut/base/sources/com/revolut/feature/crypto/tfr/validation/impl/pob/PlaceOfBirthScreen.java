package com.revolut.feature.crypto.tfr.validation.impl.pob;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bn5.b;
import bn5.c;
import bn5.d;
import bn5.f;
import bn5.j;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.crypto.tfr.validation.api.R$string;
import com.revolut.feature.crypto.tfr.validation.impl.pob.PlaceOfBirthScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/pob/PlaceOfBirthScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbn5/f;", "Ldli/a;", "Lbn5/j;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlaceOfBirthScreen extends ViewController<f> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PlaceOfBirthScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final InputTextDelegate M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PlaceOfBirthScreen(PlaceOfBirthScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        this.M = new InputTextDelegate(null);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bn5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlaceOfBirthScreen f17108b;

            {
                this.f17108b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PlaceOfBirthScreen.Q;
                        PlaceOfBirthScreen placeOfBirthScreen = this.f17108b;
                        return dli.f.a(placeOfBirthScreen, (h) placeOfBirthScreen.P.getValue(), u.c(placeOfBirthScreen.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PlaceOfBirthScreen.Q;
                        return (h) ((um5.f) this.f17108b.O.getValue()).d.get();
                }
            }
        });
        this.O = w.y0(new bc1.a(this, inputData, 15));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bn5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlaceOfBirthScreen f17108b;

            {
                this.f17108b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlaceOfBirthScreen.Q;
                        PlaceOfBirthScreen placeOfBirthScreen = this.f17108b;
                        return dli.f.a(placeOfBirthScreen, (h) placeOfBirthScreen.P.getValue(), u.c(placeOfBirthScreen.M), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PlaceOfBirthScreen.Q;
                        return (h) ((um5.f) this.f17108b.O.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f17114b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (um5.f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bn5.h) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.crypto_tfr_validation_pob_toolbar_title, null, null, 14), null);
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        d3().d.setTag("PlaceOfBirthScreen_RecyclerView");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52575g.f121375b), null, new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
