package com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection;

import android.view.View;
import btf.c;
import btf.d;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection.AdditionalInfoDropdownSelectionScreen;
import com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection.AdditionalInfoDropdownSelectionScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nsf.o;
import nsf.p;
import pki.b;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/additional_info/dropdown_selection/AdditionalInfoDropdownSelectionScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lbtf/d;", "Lbtf/c;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalInfoDropdownSelectionScreen extends BaseBottomSheetRecyclerController<d, c> {
    public static final /* synthetic */ int V = 0;
    public final AdditionalInfoDropdownSelectionScreenContract$InputData Q;
    public final SelectableDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public AdditionalInfoDropdownSelectionScreen(AdditionalInfoDropdownSelectionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        SelectableDelegate selectableDelegate = new SelectableDelegate(rowDelegate);
        this.R = selectableDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: btf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInfoDropdownSelectionScreen f18569b;

            {
                this.f18569b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AdditionalInfoDropdownSelectionScreen additionalInfoDropdownSelectionScreen = this.f18569b;
                switch (i2) {
                    case 0:
                        int i3 = AdditionalInfoDropdownSelectionScreen.V;
                        qji.b bVarU2 = additionalInfoDropdownSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection.di.AdditionalInfoDropdownSelectionScreenInjector");
                        o oVar = (o) ((ctf.a) bVarU2).b().mo3808a(additionalInfoDropdownSelectionScreen);
                        AdditionalInfoDropdownSelectionScreenContract$InputData additionalInfoDropdownSelectionScreenContract$InputData = additionalInfoDropdownSelectionScreen.Q;
                        switch (oVar.f218841a) {
                            case 0:
                                additionalInfoDropdownSelectionScreenContract$InputData.getClass();
                                oVar.d = additionalInfoDropdownSelectionScreenContract$InputData;
                                break;
                            default:
                                additionalInfoDropdownSelectionScreenContract$InputData.getClass();
                                oVar.d = additionalInfoDropdownSelectionScreenContract$InputData;
                                break;
                        }
                        return (p) oVar.mo3783build();
                    default:
                        int i5 = AdditionalInfoDropdownSelectionScreen.V;
                        p pVar = (p) additionalInfoDropdownSelectionScreen.S.getValue();
                        switch (pVar.f218844a) {
                            case 0:
                                return (e) pVar.f218846c.get();
                            default:
                                return (e) pVar.f218846c.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: btf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AdditionalInfoDropdownSelectionScreen f18569b;

            {
                this.f18569b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AdditionalInfoDropdownSelectionScreen additionalInfoDropdownSelectionScreen = this.f18569b;
                switch (i22) {
                    case 0:
                        int i3 = AdditionalInfoDropdownSelectionScreen.V;
                        qji.b bVarU2 = additionalInfoDropdownSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transfer_reasons.impl.ui.additional_info.dropdown_selection.di.AdditionalInfoDropdownSelectionScreenInjector");
                        o oVar = (o) ((ctf.a) bVarU2).b().mo3808a(additionalInfoDropdownSelectionScreen);
                        AdditionalInfoDropdownSelectionScreenContract$InputData additionalInfoDropdownSelectionScreenContract$InputData = additionalInfoDropdownSelectionScreen.Q;
                        switch (oVar.f218841a) {
                            case 0:
                                additionalInfoDropdownSelectionScreenContract$InputData.getClass();
                                oVar.d = additionalInfoDropdownSelectionScreenContract$InputData;
                                break;
                            default:
                                additionalInfoDropdownSelectionScreenContract$InputData.getClass();
                                oVar.d = additionalInfoDropdownSelectionScreenContract$InputData;
                                break;
                        }
                        return (p) oVar.mo3783build();
                    default:
                        int i5 = AdditionalInfoDropdownSelectionScreen.V;
                        p pVar = (p) additionalInfoDropdownSelectionScreen.S.getValue();
                        switch (pVar.f218844a) {
                            case 0:
                                return (e) pVar.f218846c.get();
                            default:
                                return (e) pVar.f218846c.get();
                        }
                }
            }
        });
        this.U = v.k(rowDelegate, selectableDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b e3() {
        return (btf.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.r()), new btf.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (btf.e) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
