package com.revolut.feature.wealth.impl.ui.extensions.disclaimers.modal_disclaimer;

import aii.q;
import android.view.View;
import ao.h;
import avk.j;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.wealth.impl.ui.extensions.disclaimers.modal_disclaimer.WealthDisclaimerBottomSheet;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import d83.i;
import dah.b;
import dah.f;
import dah.g;
import dah.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import u8h.a;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/extensions/disclaimers/modal_disclaimer/WealthDisclaimerBottomSheet;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Laii/q;", "Ldah/f;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WealthDisclaimerBottomSheet extends BaseBottomSheetRecyclerController<q, f> {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(WealthDisclaimerBottomSheet.class, "binding", "getBinding$feature_wealth_impl_release()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final g Q;
    public final h R;
    public final Object S;
    public final Object T;
    public final LargeActionButtonDelegate U;
    public final List V;
    public final j W;

    public WealthDisclaimerBottomSheet(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: dah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthDisclaimerBottomSheet f112529b;

            {
                this.f112529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WealthDisclaimerBottomSheet wealthDisclaimerBottomSheet = this.f112529b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = WealthDisclaimerBottomSheet.X;
                        phm.a aVar = (phm.a) ue0.e.j(wealthDisclaimerBottomSheet.m2()).a().get(u8h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u8h.c.class, " is not found"));
                        }
                        u8h.b bVar = ((u8h.b) ((u8h.c) aVar2.b())).f278206j;
                        g gVar = wealthDisclaimerBottomSheet.Q;
                        avk.j jVar = wealthDisclaimerBottomSheet.W;
                        gVar.getClass();
                        jVar.getClass();
                        return new u8h.a(bVar, gVar, jVar);
                    default:
                        KProperty[] kPropertyArr2 = WealthDisclaimerBottomSheet.X;
                        return (k) ((u8h.a) wealthDisclaimerBottomSheet.S.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: dah.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WealthDisclaimerBottomSheet f112529b;

            {
                this.f112529b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WealthDisclaimerBottomSheet wealthDisclaimerBottomSheet = this.f112529b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = WealthDisclaimerBottomSheet.X;
                        phm.a aVar = (phm.a) ue0.e.j(wealthDisclaimerBottomSheet.m2()).a().get(u8h.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u8h.c.class, " is not found"));
                        }
                        u8h.b bVar = ((u8h.b) ((u8h.c) aVar2.b())).f278206j;
                        g gVar = wealthDisclaimerBottomSheet.Q;
                        avk.j jVar = wealthDisclaimerBottomSheet.W;
                        gVar.getClass();
                        jVar.getClass();
                        return new u8h.a(bVar, gVar, jVar);
                    default:
                        KProperty[] kPropertyArr2 = WealthDisclaimerBottomSheet.X;
                        return (k) ((u8h.a) wealthDisclaimerBottomSheet.S.getValue()).f.get();
                }
            }
        });
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.U = largeActionButtonDelegate;
        this.V = u.c(largeActionButtonDelegate);
        this.W = new j(this, 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (k) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new i(rd0.e.b(this.U.d.f121375b), 3), new dah.e(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (k) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getV() {
        return this.V;
    }
}
