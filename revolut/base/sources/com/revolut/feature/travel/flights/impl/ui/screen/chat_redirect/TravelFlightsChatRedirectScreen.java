package com.revolut.feature.travel.flights.impl.ui.screen.chat_redirect;

import aii.q;
import android.content.Context;
import android.view.View;
import cii.a;
import cii.b;
import cli.a0;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.flights.impl.ui.screen.chat_redirect.TravelFlightsChatRedirectScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.chat_redirect.TravelFlightsChatRedirectScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.i;
import j5g.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/chat_redirect/TravelFlightsChatRedirectScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Laii/q;", "Lcli/w;", "Lcii/b;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsChatRedirectScreen extends BaseBottomSheetController<q> implements w {
    public static final /* synthetic */ int R = 0;
    public final TravelFlightsChatRedirectScreenContract$InputData N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public TravelFlightsChatRedirectScreen(TravelFlightsChatRedirectScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: j5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsChatRedirectScreen f171629b;

            {
                this.f171629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsChatRedirectScreen travelFlightsChatRedirectScreen = this.f171629b;
                switch (i2) {
                    case 0:
                        int i3 = TravelFlightsChatRedirectScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsChatRedirectScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsChatRedirectScreenContract$InputData travelFlightsChatRedirectScreenContract$InputData = travelFlightsChatRedirectScreen.N;
                        travelFlightsChatRedirectScreenContract$InputData.getClass();
                        return new i(bVar, travelFlightsChatRedirectScreenContract$InputData);
                    case 1:
                        int i5 = TravelFlightsChatRedirectScreen.R;
                        return (d) ((i) travelFlightsChatRedirectScreen.O.getValue()).f132126b.get();
                    default:
                        int i6 = TravelFlightsChatRedirectScreen.R;
                        return n14.e.a(travelFlightsChatRedirectScreen, (d) travelFlightsChatRedirectScreen.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: j5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsChatRedirectScreen f171629b;

            {
                this.f171629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsChatRedirectScreen travelFlightsChatRedirectScreen = this.f171629b;
                switch (i22) {
                    case 0:
                        int i3 = TravelFlightsChatRedirectScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsChatRedirectScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsChatRedirectScreenContract$InputData travelFlightsChatRedirectScreenContract$InputData = travelFlightsChatRedirectScreen.N;
                        travelFlightsChatRedirectScreenContract$InputData.getClass();
                        return new i(bVar, travelFlightsChatRedirectScreenContract$InputData);
                    case 1:
                        int i5 = TravelFlightsChatRedirectScreen.R;
                        return (d) ((i) travelFlightsChatRedirectScreen.O.getValue()).f132126b.get();
                    default:
                        int i6 = TravelFlightsChatRedirectScreen.R;
                        return n14.e.a(travelFlightsChatRedirectScreen, (d) travelFlightsChatRedirectScreen.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: j5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsChatRedirectScreen f171629b;

            {
                this.f171629b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsChatRedirectScreen travelFlightsChatRedirectScreen = this.f171629b;
                switch (i22) {
                    case 0:
                        int i32 = TravelFlightsChatRedirectScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsChatRedirectScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsChatRedirectScreenContract$InputData travelFlightsChatRedirectScreenContract$InputData = travelFlightsChatRedirectScreen.N;
                        travelFlightsChatRedirectScreenContract$InputData.getClass();
                        return new i(bVar, travelFlightsChatRedirectScreenContract$InputData);
                    case 1:
                        int i5 = TravelFlightsChatRedirectScreen.R;
                        return (d) ((i) travelFlightsChatRedirectScreen.O.getValue()).f132126b.get();
                    default:
                        int i6 = TravelFlightsChatRedirectScreen.R;
                        return n14.e.a(travelFlightsChatRedirectScreen, (d) travelFlightsChatRedirectScreen.P.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(new a(uiState.f24554b, uiState.f24555c));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController, com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.Y2(view);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(kli.a.s(R$attr.uikit_colorElevatedGroupedBackground, context));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new j2c.b(this, null, 6), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }
}
