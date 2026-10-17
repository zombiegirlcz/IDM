package com.revolut.feature.card_screen.impl.kompot.physical_card_replacement_dialog.screen;

import android.view.View;
import cli.k;
import com.revolut.feature.card_screen.impl.kompot.physical_card_replacement_dialog.screen.PhysicalCardReplacementDialogContract$InputData;
import com.revolut.feature.card_screen.impl.kompot.physical_card_replacement_dialog.screen.PhysicalCardReplacementDialogScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import gul.n;
import h83.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o73.i;
import pki.b;
import te0.w;
import xki.e;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/physical_card_replacement_dialog/screen/PhysicalCardReplacementDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lh83/a;", "Lcli/k;", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhysicalCardReplacementDialogScreen extends BaseBottomSheetRecyclerController<a, k> {
    public static final /* synthetic */ int U = 0;
    public final PhysicalCardReplacementDialogContract$InputData Q;
    public final Object R;
    public final Object S;
    public final f0 T;

    public PhysicalCardReplacementDialogScreen(PhysicalCardReplacementDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: h83.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhysicalCardReplacementDialogScreen f149942b;

            {
                this.f149942b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PhysicalCardReplacementDialogScreen physicalCardReplacementDialogScreen = this.f149942b;
                switch (i2) {
                    case 0:
                        int i3 = PhysicalCardReplacementDialogScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(physicalCardReplacementDialogScreen.m2()).a().get(l73.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l73.a.class, " is not found"));
                        }
                        o73.e eVar = ((o73.e) aVar2.b()).L;
                        PhysicalCardReplacementDialogContract$InputData physicalCardReplacementDialogContract$InputData = physicalCardReplacementDialogScreen.Q;
                        physicalCardReplacementDialogContract$InputData.getClass();
                        return new i(eVar, physicalCardReplacementDialogContract$InputData);
                    default:
                        int i5 = PhysicalCardReplacementDialogScreen.U;
                        return (e) ((i) physicalCardReplacementDialogScreen.R.getValue()).f222696b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: h83.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhysicalCardReplacementDialogScreen f149942b;

            {
                this.f149942b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PhysicalCardReplacementDialogScreen physicalCardReplacementDialogScreen = this.f149942b;
                switch (i22) {
                    case 0:
                        int i3 = PhysicalCardReplacementDialogScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(physicalCardReplacementDialogScreen.m2()).a().get(l73.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l73.a.class, " is not found"));
                        }
                        o73.e eVar = ((o73.e) aVar2.b()).L;
                        PhysicalCardReplacementDialogContract$InputData physicalCardReplacementDialogContract$InputData = physicalCardReplacementDialogScreen.Q;
                        physicalCardReplacementDialogContract$InputData.getClass();
                        return new i(eVar, physicalCardReplacementDialogContract$InputData);
                    default:
                        int i5 = PhysicalCardReplacementDialogScreen.U;
                        return (e) ((i) physicalCardReplacementDialogScreen.R.getValue()).f222696b.get();
                }
            }
        });
        this.T = f0.f322471a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (h83.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new h23.b(e3(), 10), new n(this, null, 23), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (h83.e) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3 */
    public final List getU() {
        return this.T;
    }
}
