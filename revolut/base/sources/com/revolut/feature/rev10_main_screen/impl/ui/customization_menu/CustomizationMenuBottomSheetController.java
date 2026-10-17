package com.revolut.feature.rev10_main_screen.impl.ui.customization_menu;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev10_main_screen.impl.ui.customization_menu.CustomizationMenuBottomSheetController;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import grl.k9;
import grl.od;
import grl.q6;
import grl.w2;
import grl.x0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m2b.r;
import mtb.a;
import no.m;
import pki.b;
import qtb.h;
import qtb.i;
import qtb.j;
import te0.w;
import vkm.q;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/rev10_main_screen/impl/ui/customization_menu/CustomizationMenuBottomSheetController;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lqtb/j;", "Lqtb/h;", "Lno/m;", "<init>", "()V", "feature_rev10_main_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomizationMenuBottomSheetController extends BaseBottomSheetRecyclerController<j, h> implements m {
    public static final /* synthetic */ int V = 0;
    public final RowDelegate Q;
    public final AnalyticsProduct.Shared R;
    public final Object S;
    public final Object T;
    public final List U;

    public CustomizationMenuBottomSheetController() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Q = rowDelegate;
        this.R = new AnalyticsProduct.Shared(k9.Tab, x0.Tab, q6.Tab, w2.Tab, od.Terminal);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: qtb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomizationMenuBottomSheetController f249063b;

            {
                this.f249063b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomizationMenuBottomSheetController customizationMenuBottomSheetController = this.f249063b;
                switch (i2) {
                    case 0:
                        int i3 = CustomizationMenuBottomSheetController.V;
                        qji.b bVarU2 = customizationMenuBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev10_main_screen.impl.ui.customization_menu.di.CustomizationMenuInjector");
                        mtb.b bVar = (mtb.b) bVarU2;
                        mtb.d dVar = bVar.f208791b;
                        mtb.b bVar2 = bVar.f208792c;
                        mtb.a aVar = new mtb.a();
                        aVar.f208789a = e4m.b.b(new r(dVar, bVar2, 20));
                        return aVar;
                    default:
                        int i5 = CustomizationMenuBottomSheetController.V;
                        return (i) ((mtb.a) customizationMenuBottomSheetController.S.getValue()).f208789a.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: qtb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomizationMenuBottomSheetController f249063b;

            {
                this.f249063b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomizationMenuBottomSheetController customizationMenuBottomSheetController = this.f249063b;
                switch (i22) {
                    case 0:
                        int i3 = CustomizationMenuBottomSheetController.V;
                        qji.b bVarU2 = customizationMenuBottomSheetController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.rev10_main_screen.impl.ui.customization_menu.di.CustomizationMenuInjector");
                        mtb.b bVar = (mtb.b) bVarU2;
                        mtb.d dVar = bVar.f208791b;
                        mtb.b bVar2 = bVar.f208792c;
                        mtb.a aVar = new mtb.a();
                        aVar.f208789a = e4m.b.b(new r(dVar, bVar2, 20));
                        return aVar;
                    default:
                        int i5 = CustomizationMenuBottomSheetController.V;
                        return (i) ((mtb.a) customizationMenuBottomSheetController.S.getValue()).f208789a.get();
                }
            }
        });
        this.U = u.c(rowDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (i) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        RowDelegate rowDelegate = this.Q;
        ViewController.P2(this, q.J(rd0.e.b(rowDelegate.f53218h), rd0.e.b(rowDelegate.f53225r)), new qtb.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (i) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.U;
    }
}
