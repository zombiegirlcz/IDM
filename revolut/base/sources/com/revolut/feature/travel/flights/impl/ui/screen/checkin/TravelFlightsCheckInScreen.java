package com.revolut.feature.travel.flights.impl.ui.screen.checkin;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkin.TravelFlightsCheckInScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import f4g.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l5g.b;
import l5g.d;
import l5g.f;
import l5g.g;
import te0.w;
import tki.c;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/checkin/TravelFlightsCheckInScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ltki/c;", "Ll5g/g;", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsCheckInScreen extends ViewController<Object> implements c {
    public final TravelFlightsCheckInScreenContract$InputData K;
    public final RowDelegate L;
    public final PlainTextWarningDelegate M;
    public final FullScreenStateDelegate N;
    public final int O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public TravelFlightsCheckInScreen(TravelFlightsCheckInScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = new PlainTextWarningDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = R$layout.screen_travel_flights_checkin;
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: l5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsCheckInScreen f192256b;

            {
                this.f192256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsCheckInScreen travelFlightsCheckInScreen = this.f192256b;
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsCheckInScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsCheckInScreenContract$InputData travelFlightsCheckInScreenContract$InputData = travelFlightsCheckInScreen.K;
                        travelFlightsCheckInScreenContract$InputData.getClass();
                        return new k(bVar, travelFlightsCheckInScreenContract$InputData);
                    case 1:
                        return (f) ((k) travelFlightsCheckInScreen.P.getValue()).f132136b.get();
                    default:
                        TravelFlightsCheckInScreen travelFlightsCheckInScreen2 = this.f192256b;
                        return tki.g.a(travelFlightsCheckInScreen2, travelFlightsCheckInScreen2.R2(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), travelFlightsCheckInScreen2.L, new RowLoadingDelegate(), new ListCellDelegate(), travelFlightsCheckInScreen2.N, travelFlightsCheckInScreen2.M), R$id.travelFlightsCheckInScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: l5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsCheckInScreen f192256b;

            {
                this.f192256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsCheckInScreen travelFlightsCheckInScreen = this.f192256b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsCheckInScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsCheckInScreenContract$InputData travelFlightsCheckInScreenContract$InputData = travelFlightsCheckInScreen.K;
                        travelFlightsCheckInScreenContract$InputData.getClass();
                        return new k(bVar, travelFlightsCheckInScreenContract$InputData);
                    case 1:
                        return (f) ((k) travelFlightsCheckInScreen.P.getValue()).f132136b.get();
                    default:
                        TravelFlightsCheckInScreen travelFlightsCheckInScreen2 = this.f192256b;
                        return tki.g.a(travelFlightsCheckInScreen2, travelFlightsCheckInScreen2.R2(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), travelFlightsCheckInScreen2.L, new RowLoadingDelegate(), new ListCellDelegate(), travelFlightsCheckInScreen2.N, travelFlightsCheckInScreen2.M), R$id.travelFlightsCheckInScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: l5g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsCheckInScreen f192256b;

            {
                this.f192256b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsCheckInScreen travelFlightsCheckInScreen = this.f192256b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(travelFlightsCheckInScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        TravelFlightsCheckInScreenContract$InputData travelFlightsCheckInScreenContract$InputData = travelFlightsCheckInScreen.K;
                        travelFlightsCheckInScreenContract$InputData.getClass();
                        return new k(bVar, travelFlightsCheckInScreenContract$InputData);
                    case 1:
                        return (f) ((k) travelFlightsCheckInScreen.P.getValue()).f132136b.get();
                    default:
                        TravelFlightsCheckInScreen travelFlightsCheckInScreen2 = this.f192256b;
                        return tki.g.a(travelFlightsCheckInScreen2, travelFlightsCheckInScreen2.R2(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), travelFlightsCheckInScreen2.L, new RowLoadingDelegate(), new ListCellDelegate(), travelFlightsCheckInScreen2.N, travelFlightsCheckInScreen2.M), R$id.travelFlightsCheckInScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.L;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new b(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53226s), new l5g.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.M.s()), new l5g.c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new d(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.R.getValue();
    }
}
