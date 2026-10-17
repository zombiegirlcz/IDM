package o9h;

import com.revolut.core.ui_kit.delegates.MultiTargetFanChartDelegate;
import com.revolut.retail.feature.cryptocommoditydetails.api.ui.delegates.PriceTargetsWidgetContract$Parcel$SeeAllParcel;
import efm.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rd3.m;
import rdj.j;
import te0.w;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f223284c = 0;
    public final Object d;
    public final Object e;
    public final Object f;

    public f(e footerDisclosureDelegate, en.c navigationDelegate, n0h.a view) {
        Intrinsics.checkNotNullParameter(footerDisclosureDelegate, "footerDisclosureDelegate");
        Intrinsics.checkNotNullParameter(navigationDelegate, "navigationDelegate");
        Intrinsics.checkNotNullParameter(view, "view");
        this.d = footerDisclosureDelegate;
        this.e = navigationDelegate;
        this.f = view;
    }

    @Override // yji.d
    public final void M() {
        switch (this.f223284c) {
            case 0:
                ((en.c) this.e).onResume();
                ((e) this.d).C((n0h.a) this.f);
                break;
            default:
                final j jVar = (j) ((pcj.f) this.d);
                final int i = 1;
                r rVarC = w.D(w.a0(jVar.f253474a.w0(), new m(11)), new Function1() { // from class: rdj.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i) {
                            case 0:
                                pfm.h hVar = new pfm.h(new phc.d((MultiTargetFanChartDelegate.a) obj2, jVar, 27), 2);
                                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                                return hVar;
                            default:
                                PriceTargetsWidgetContract$Parcel$SeeAllParcel parcel = (PriceTargetsWidgetContract$Parcel$SeeAllParcel) obj2;
                                Intrinsics.checkNotNullParameter(parcel, "parcel");
                                return jVar.f253476c.e3(parcel.f100143a, parcel.f100144b, parcel.f100145c);
                        }
                    }
                }).C();
                Intrinsics.checkNotNullExpressionValue(rVarC, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC), null, 7);
                r rVarDistinctUntilChanged = jVar.f253474a.s1().startWith(MultiTargetFanChartDelegate.a.C0413a.f52779a).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                final int i2 = 0;
                r rVarC2 = ue0.e.r(w.D(rVarDistinctUntilChanged, new Function1() { // from class: rdj.i
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                pfm.h hVar = new pfm.h(new phc.d((MultiTargetFanChartDelegate.a) obj2, jVar, 27), 2);
                                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                                return hVar;
                            default:
                                PriceTargetsWidgetContract$Parcel$SeeAllParcel parcel = (PriceTargetsWidgetContract$Parcel$SeeAllParcel) obj2;
                                Intrinsics.checkNotNullParameter(parcel, "parcel");
                                return jVar.f253476c.e3(parcel.f100143a, parcel.f100144b, parcel.f100145c);
                        }
                    }
                }), h0.f322473a).C();
                Intrinsics.checkNotNullExpressionValue(rVarC2, "toObservable(...)");
                yji.d.H(this, rd0.e.b(rVarC2), null, 7);
                int i3 = 12;
                yji.d.H(this, rd0.e.b(w.a0(jVar.f253474a.Y0(), new m(i3))), new t9h.b(this, null, i3), 3);
                r map = jVar.f253474a.a1().filter(new rbf.c(new m(13), 19)).map(new rbf.c(new m(14), 20));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                yji.d.H(this, rd0.e.b(map), new t05.m(this, null, 22), 3);
                break;
        }
    }

    @Override // yji.d
    public void N() {
        switch (this.f223284c) {
            case 0:
                ((e) this.d).l();
                ((en.c) this.e).onPause();
                break;
        }
    }

    public f(pcj.f viewDelegate, pcj.a controllerModelExtension, j60.a bottomExpandableDialogControllerExtension, rdj.a priceTargetsDialogFactory) {
        Intrinsics.checkNotNullParameter(viewDelegate, "viewDelegate");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(priceTargetsDialogFactory, "priceTargetsDialogFactory");
        this.d = viewDelegate;
        this.e = controllerModelExtension;
        this.f = bottomExpandableDialogControllerExtension;
    }
}
