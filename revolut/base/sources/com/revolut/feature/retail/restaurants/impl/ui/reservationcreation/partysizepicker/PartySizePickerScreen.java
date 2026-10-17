package com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.partysizepicker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.restaurants.impl.R$string;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.partysizepicker.PartySizePickerContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.partysizepicker.PartySizePickerScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m75.i;
import m9d.y0;
import meb.b;
import meb.c;
import meb.e;
import meb.g;
import te0.w;
import vc.s;
import vdb.d;
import vdb.j;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/restaurants/impl/ui/reservationcreation/partysizepicker/PartySizePickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmeb/b;", "Ldli/a;", "Lmeb/c;", "feature_retail_restaurants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PartySizePickerScreen extends ViewController<b> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PartySizePickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final PartySizePickerContract$InputData K;
    public final int L;
    public final h M;
    public final PickerDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public PartySizePickerScreen(PartySizePickerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        this.M = s.t(this, e.f);
        this.N = new PickerDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: meb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PartySizePickerScreen f204644b;

            {
                this.f204644b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PartySizePickerScreen partySizePickerScreen = this.f204644b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PartySizePickerScreen.R;
                        PartySizePickerScreen partySizePickerScreen2 = this.f204644b;
                        return dli.f.a(partySizePickerScreen2, (g) partySizePickerScreen2.Q.getValue(), u.c(partySizePickerScreen2.N), partySizePickerScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PartySizePickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(partySizePickerScreen.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).i;
                        PartySizePickerContract$InputData partySizePickerContract$InputData = partySizePickerScreen.K;
                        partySizePickerContract$InputData.getClass();
                        return new vdb.d(jVar, partySizePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PartySizePickerScreen.R;
                        return (g) ((vdb.d) partySizePickerScreen.P.getValue()).f287843b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: meb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PartySizePickerScreen f204644b;

            {
                this.f204644b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PartySizePickerScreen partySizePickerScreen = this.f204644b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PartySizePickerScreen.R;
                        PartySizePickerScreen partySizePickerScreen2 = this.f204644b;
                        return dli.f.a(partySizePickerScreen2, (g) partySizePickerScreen2.Q.getValue(), u.c(partySizePickerScreen2.N), partySizePickerScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PartySizePickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(partySizePickerScreen.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).i;
                        PartySizePickerContract$InputData partySizePickerContract$InputData = partySizePickerScreen.K;
                        partySizePickerContract$InputData.getClass();
                        return new vdb.d(jVar, partySizePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PartySizePickerScreen.R;
                        return (g) ((vdb.d) partySizePickerScreen.P.getValue()).f287843b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: meb.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PartySizePickerScreen f204644b;

            {
                this.f204644b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PartySizePickerScreen partySizePickerScreen = this.f204644b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PartySizePickerScreen.R;
                        PartySizePickerScreen partySizePickerScreen2 = this.f204644b;
                        return dli.f.a(partySizePickerScreen2, (g) partySizePickerScreen2.Q.getValue(), u.c(partySizePickerScreen2.N), partySizePickerScreen2.d3().d.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PartySizePickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(partySizePickerScreen.m2()).a().get(j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", j.class, " is not found"));
                        }
                        j jVar = ((j) aVar2.b()).i;
                        PartySizePickerContract$InputData partySizePickerContract$InputData = partySizePickerScreen.K;
                        partySizePickerContract$InputData.getClass();
                        return new vdb.d(jVar, partySizePickerContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PartySizePickerScreen.R;
                        return (g) ((vdb.d) partySizePickerScreen.P.getValue()).f287843b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.retail_restaurants_confirm_reservation_cells_party_size_title, null, null, 14), null, null, null, false, 30));
        d3().f174545b.setText(new TextLocalisedClause(R$string.retail_restaurants_reservation_details_actions_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.f52922c), new i(this, null, 19), 3);
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new y0(this, null, 9), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getF0() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
