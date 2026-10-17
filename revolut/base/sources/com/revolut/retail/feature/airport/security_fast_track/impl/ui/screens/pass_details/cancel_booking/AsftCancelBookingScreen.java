package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.pass_details.cancel_booking.AsftCancelBookingScreen;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lkf.f0;
import lti.c;
import lui.b;
import lui.d;
import lui.g;
import lui.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/pass_details/cancel_booking/AsftCancelBookingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llui/g;", "Ldli/a;", "Llui/i;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftCancelBookingScreen extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AsftCancelBookingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AsftCancelBookingScreen(AsftCancelBookingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_bottomsheet;
        this.L = s.t(this, b.f);
        this.M = w.y0(new f0(26));
        this.N = w.y0(new f0(27));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: lui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftCancelBookingScreen f200242b;

            {
                this.f200242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AsftCancelBookingScreen.R;
                        AsftCancelBookingScreen asftCancelBookingScreen = this.f200242b;
                        return dli.f.a(asftCancelBookingScreen, (h) asftCancelBookingScreen.Q.getValue(), v.k(new CellDetailsDelegate(), (CellDetailsActionDelegate) asftCancelBookingScreen.M.getValue(), (TwinHorizontalButtonDelegate) asftCancelBookingScreen.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = AsftCancelBookingScreen.R;
                        return (h) ((lti.c) this.f200242b.P.getValue()).f.get();
                }
            }
        });
        this.P = w.y0(new ltf.b(this, inputData, 4));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: lui.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftCancelBookingScreen f200242b;

            {
                this.f200242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftCancelBookingScreen.R;
                        AsftCancelBookingScreen asftCancelBookingScreen = this.f200242b;
                        return dli.f.a(asftCancelBookingScreen, (h) asftCancelBookingScreen.Q.getValue(), v.k(new CellDetailsDelegate(), (CellDetailsActionDelegate) asftCancelBookingScreen.M.getValue(), (TwinHorizontalButtonDelegate) asftCancelBookingScreen.N.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = AsftCancelBookingScreen.R;
                        return (h) ((lti.c) this.f200242b.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.asft_cancel_booking_title, null, null, 14), uiState.f200247a, null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (lui.h) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((CellDetailsActionDelegate) this.M.getValue()).d), new lui.c(this, null), 3);
        ?? r62 = this.N;
        ViewController.P2(this, rd0.e.b(((TwinHorizontalButtonDelegate) r62.getValue()).f53572c.f121375b), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(((TwinHorizontalButtonDelegate) r62.getValue()).d.f121375b), new d(this, null, 1), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
