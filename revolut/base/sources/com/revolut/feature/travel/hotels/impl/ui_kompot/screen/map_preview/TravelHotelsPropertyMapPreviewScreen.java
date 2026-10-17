package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import c9g.r;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.feature.travel.hotels.impl.R$layout;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.map_preview.TravelHotelsPropertyMapPreviewScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.b0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.t9;
import ofm.h;
import vc.s;
import vcg.b;
import vcg.d;
import vcg.e;
import vcg.f;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/hotels/impl/ui_kompot/screen/map_preview/TravelHotelsPropertyMapPreviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lvcg/e;", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelHotelsPropertyMapPreviewScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TravelHotelsPropertyMapPreviewScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/hotels/impl/databinding/ScreenTravelHotelsPropertyMapPreviewBinding;", 0))};
    public final int K;
    public h L;
    public boolean M;
    public e N;
    public final ao.h O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TravelHotelsPropertyMapPreviewScreen(TravelHotelsPropertyMapPreviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_travel_hotels_property_map_preview;
        this.O = s.t(this, b.f);
        final int i = 0;
        this.P = te0.w.y0(new Function0(this) { // from class: vcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyMapPreviewScreen f287690b;

            {
                this.f287690b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelHotelsPropertyMapPreviewScreen travelHotelsPropertyMapPreviewScreen = this.f287690b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyMapPreviewScreen.S;
                        return n14.e.a(travelHotelsPropertyMapPreviewScreen, (f) travelHotelsPropertyMapPreviewScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyMapPreviewScreen.S;
                        return (f) ((b0) travelHotelsPropertyMapPreviewScreen.Q.getValue()).f141600c.get();
                }
            }
        });
        this.Q = te0.w.y0(new v0c.b(this, inputData, 25));
        final int i2 = 1;
        this.R = te0.w.y0(new Function0(this) { // from class: vcg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelHotelsPropertyMapPreviewScreen f287690b;

            {
                this.f287690b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelHotelsPropertyMapPreviewScreen travelHotelsPropertyMapPreviewScreen = this.f287690b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelHotelsPropertyMapPreviewScreen.S;
                        return n14.e.a(travelHotelsPropertyMapPreviewScreen, (f) travelHotelsPropertyMapPreviewScreen.R.getValue());
                    default:
                        KProperty[] kPropertyArr2 = TravelHotelsPropertyMapPreviewScreen.S;
                        return (f) ((b0) travelHotelsPropertyMapPreviewScreen.Q.getValue()).f141600c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d dVar = qVar instanceof d ? (d) qVar : null;
        if (this.M) {
            e3(uiState, dVar);
        } else {
            this.N = uiState;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (b0) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f22425c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        h hVar = this.L;
        if (hVar != null) {
            lfm.d.a(hVar);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (!this.M) {
            MapView travelHotelsPropertyMapPreviewScreenMap = d3().f22424b;
            Intrinsics.checkNotNullExpressionValue(travelHotelsPropertyMapPreviewScreenMap, "travelHotelsPropertyMapPreviewScreenMap");
            pfm.h hVarL0 = travelHotelsPropertyMapPreviewScreenMap.l0();
            h hVar = new h(new ty7.b(this, 12));
            hVarL0.d(hVar);
            this.L = hVar;
        }
        a.g2(this, rd0.e.b(d3().f22425c.f59211b), null, new uwe.f(this, null, 18), 3);
    }

    public final r d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (r) value;
    }

    public final void e3(e eVar, d dVar) {
        ah0.a aVar;
        if ((dVar == null || dVar.f287692a) && (aVar = eVar.f287694a) != null) {
            MapView travelHotelsPropertyMapPreviewScreenMap = d3().f22424b;
            Intrinsics.checkNotNullExpressionValue(travelHotelsPropertyMapPreviewScreenMap, "travelHotelsPropertyMapPreviewScreenMap");
            travelHotelsPropertyMapPreviewScreenMap.g0(aVar, 13.0f, true);
        }
        if (dVar == null || dVar.f287693b) {
            MapView travelHotelsPropertyMapPreviewScreenMap2 = d3().f22424b;
            Intrinsics.checkNotNullExpressionValue(travelHotelsPropertyMapPreviewScreenMap2, "travelHotelsPropertyMapPreviewScreenMap");
            travelHotelsPropertyMapPreviewScreenMap2.setMarkers(new t9(v.l(eVar.f287695b), false));
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
