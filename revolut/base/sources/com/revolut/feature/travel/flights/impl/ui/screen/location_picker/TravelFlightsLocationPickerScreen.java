package com.revolut.feature.travel.flights.impl.ui.screen.location_picker;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.FormsActionButton;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.location_picker.TravelFlightsLocationPickerScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import f4g.t;
import fp0.l;
import h35.c;
import hwi.l0;
import i5b.d;
import i6g.b;
import i6g.g;
import i6g.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rx0.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/location_picker/TravelFlightsLocationPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Li6g/g;", "Ldli/a;", "Li6g/i;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsLocationPickerScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelFlightsLocationPickerScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsLocationPickerBinding;", 0))};
    public final h K;
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final l N;
    public final int O;
    public final boolean P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TravelFlightsLocationPickerScreen() {
        this(0);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int iS = kli.a.s(R$attr.uikit_colorGroupedBackground, m2());
        int iCompositeColors = ColorUtils.compositeColors(kli.a.s(R$attr.uikit_colorSearchBackground, m2()), iS);
        int iCompositeColors2 = ColorUtils.compositeColors(kli.a.s(R$attr.uikit_colorGreyTone10, m2()), iS);
        InputText inputText = d3().f21275c;
        inputText.setPlaceholder(new TextLocalisedClause(R$string.travel_flights_destination_search_search_bar_placeholder, null, null, 14), j.OnFocus);
        inputText.setPrefixIconImage(new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        inputText.setSingleLine(true);
        view.postDelayed(this.N, 300L);
        ViewCompat.setOnApplyWindowInsetsListener(d3().f21274b, new c(13));
        FormsActionButton formsActionButton = d3().f21274b;
        formsActionButton.setBackgroundTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[0]}, new int[]{iCompositeColors2, iCompositeColors2, iCompositeColors}));
        formsActionButton.setImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246));
        formsActionButton.setContentDescription(m2().getString(com.revolut.revolut.feature_fourthline_impl.R.string.common_action_close));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Z2() {
        D2().removeCallbacks(this.N);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        D2().removeCallbacks(this.N);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f21274b.f58987s), new l0(this, continuation, 20), 3);
        ViewController.P2(this, vkm.q.q(new d(rd0.e.b(d3().f21275c.s()), 8)), new i13.d(this, continuation, 18), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new i6g.d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new i6g.e(this, null), 3);
    }

    public final c4g.j d3() {
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c4g.j) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i6g.h R2() {
        return (i6g.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.P);
    }

    public TravelFlightsLocationPickerScreen(int i) {
        TravelFlightsLocationPickerScreenContract$InputData inputData = TravelFlightsLocationPickerScreenContract$InputData.f93353a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, b.f);
        this.L = new RowDelegate(null, null, 7);
        this.M = new FullScreenStateDelegate();
        this.N = new l(this, 9);
        this.O = R$layout.screen_travel_flights_location_picker;
        this.P = true;
        final int i2 = 0;
        this.Q = w.y0(new Function0(this) { // from class: i6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsLocationPickerScreen f158993b;

            {
                this.f158993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen = this.f158993b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsLocationPickerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsLocationPickerScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        t tVar = new t();
                        tVar.f132193a = e4m.b.b(new f4g.g(bVar));
                        return tVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsLocationPickerScreen.T;
                        return (h) ((t) travelFlightsLocationPickerScreen.Q.getValue()).f132193a.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsLocationPickerScreen.T;
                        TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen2 = this.f158993b;
                        return dli.f.a(travelFlightsLocationPickerScreen2, travelFlightsLocationPickerScreen2.R2(), v.k(travelFlightsLocationPickerScreen2.L, travelFlightsLocationPickerScreen2.M, new RowLoadingDelegate()), R$id.travelFlightsLocationPicker_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 1;
        this.R = w.y0(new Function0(this) { // from class: i6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsLocationPickerScreen f158993b;

            {
                this.f158993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen = this.f158993b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsLocationPickerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsLocationPickerScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        t tVar = new t();
                        tVar.f132193a = e4m.b.b(new f4g.g(bVar));
                        return tVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsLocationPickerScreen.T;
                        return (h) ((t) travelFlightsLocationPickerScreen.Q.getValue()).f132193a.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsLocationPickerScreen.T;
                        TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen2 = this.f158993b;
                        return dli.f.a(travelFlightsLocationPickerScreen2, travelFlightsLocationPickerScreen2.R2(), v.k(travelFlightsLocationPickerScreen2.L, travelFlightsLocationPickerScreen2.M, new RowLoadingDelegate()), R$id.travelFlightsLocationPicker_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 2;
        this.S = w.y0(new Function0(this) { // from class: i6g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsLocationPickerScreen f158993b;

            {
                this.f158993b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen = this.f158993b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsLocationPickerScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsLocationPickerScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        t tVar = new t();
                        tVar.f132193a = e4m.b.b(new f4g.g(bVar));
                        return tVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsLocationPickerScreen.T;
                        return (h) ((t) travelFlightsLocationPickerScreen.Q.getValue()).f132193a.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsLocationPickerScreen.T;
                        TravelFlightsLocationPickerScreen travelFlightsLocationPickerScreen2 = this.f158993b;
                        return dli.f.a(travelFlightsLocationPickerScreen2, travelFlightsLocationPickerScreen2.R2(), v.k(travelFlightsLocationPickerScreen2.L, travelFlightsLocationPickerScreen2.M, new RowLoadingDelegate()), R$id.travelFlightsLocationPicker_recyclerView, null, null, null, 56);
                }
            }
        });
    }
}
