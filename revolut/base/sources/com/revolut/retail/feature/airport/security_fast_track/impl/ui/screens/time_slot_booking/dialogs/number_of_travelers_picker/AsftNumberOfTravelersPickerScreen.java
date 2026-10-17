package com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.time_slot_booking.dialogs.number_of_travelers_picker.AsftNumberOfTravelersPickerScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import cpi.b;
import cvi.c;
import cvi.d;
import cvi.g;
import cvi.k;
import dli.a;
import h30.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lti.i;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airport/security_fast_track/impl/ui/screens/time_slot_booking/dialogs/number_of_travelers_picker/AsftNumberOfTravelersPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcvi/g;", "Ldli/a;", "Lcvi/h;", "feature_retail_airport_security_fast_track_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsftNumberOfTravelersPickerScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AsftNumberOfTravelersPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AsftNumberOfTravelersPickerScreen(AsftNumberOfTravelersPickerScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.L = s.t(this, c.f);
        this.M = w.y0(new b(19));
        this.N = w.y0(new b(20));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: cvi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftNumberOfTravelersPickerScreen f109462b;

            {
                this.f109462b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = AsftNumberOfTravelersPickerScreen.R;
                        AsftNumberOfTravelersPickerScreen asftNumberOfTravelersPickerScreen = this.f109462b;
                        return dli.f.a(asftNumberOfTravelersPickerScreen, asftNumberOfTravelersPickerScreen.R2(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new FullScreenStateDelegate(), (CellIncrementDelegate) asftNumberOfTravelersPickerScreen.M.getValue(), (FullScreenStateDelegate) asftNumberOfTravelersPickerScreen.N.getValue(), new PlainTextDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = AsftNumberOfTravelersPickerScreen.R;
                        return (k) ((lti.i) this.f109462b.P.getValue()).f.get();
                }
            }
        });
        this.P = w.y0(new cvi.b(this, inputData, i));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: cvi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AsftNumberOfTravelersPickerScreen f109462b;

            {
                this.f109462b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AsftNumberOfTravelersPickerScreen.R;
                        AsftNumberOfTravelersPickerScreen asftNumberOfTravelersPickerScreen = this.f109462b;
                        return dli.f.a(asftNumberOfTravelersPickerScreen, asftNumberOfTravelersPickerScreen.R2(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), new RowDelegate(null, null, 7), new FullScreenStateDelegate(), (CellIncrementDelegate) asftNumberOfTravelersPickerScreen.M.getValue(), (FullScreenStateDelegate) asftNumberOfTravelersPickerScreen.N.getValue(), new PlainTextDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = AsftNumberOfTravelersPickerScreen.R;
                        return (k) ((lti.i) this.f109462b.P.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        cvi.h uiState = (cvi.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174546c.setHeaderModel(uiState.f109472c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        l.A(R.string.common_action_confirm, null, null, 14, d3().f174545b);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174545b.o), null, new d(this, continuation, 0), 3);
        ?? r62 = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellIncrementDelegate) r62.getValue()).d), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellIncrementDelegate) r62.getValue()).f51948c), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new cvi.e(this, null), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
