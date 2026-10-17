package com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_field;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_field.DropdownFieldSelectionScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf9.v;
import mg9.c;
import mg9.d;
import mg9.e;
import mg9.f;
import pki.b;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/fields/dropdown_field/DropdownFieldSelectionScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lmg9/e;", "Lmg9/c;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DropdownFieldSelectionScreen extends BaseBottomSheetRecyclerController<e, c> {
    public static final /* synthetic */ int V = 0;
    public final d Q;
    public final RowDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public DropdownFieldSelectionScreen(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: mg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DropdownFieldSelectionScreen f205194b;

            {
                this.f205194b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DropdownFieldSelectionScreen dropdownFieldSelectionScreen = this.f205194b;
                switch (i2) {
                    case 0:
                        int i3 = DropdownFieldSelectionScreen.V;
                        lf9.w wVar = (lf9.w) dropdownFieldSelectionScreen.T.getValue();
                        switch (wVar.f194808a) {
                            case 0:
                                return (f) wVar.d.get();
                            case 1:
                                return (f) wVar.d.get();
                            default:
                                return (f) wVar.d.get();
                        }
                    default:
                        int i5 = DropdownFieldSelectionScreen.V;
                        qji.b bVarU2 = dropdownFieldSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_field.di.DropdownFieldSelectionScreenInjector");
                        v vVar = (v) ((ng9.a) bVarU2).b().mo3808a(dropdownFieldSelectionScreen);
                        d dVar = dropdownFieldSelectionScreen.Q;
                        switch (vVar.f194805a) {
                            case 0:
                                dVar.getClass();
                                vVar.d = dVar;
                                break;
                            case 1:
                                dVar.getClass();
                                vVar.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                vVar.d = dVar;
                                break;
                        }
                        return (lf9.w) vVar.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: mg9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DropdownFieldSelectionScreen f205194b;

            {
                this.f205194b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DropdownFieldSelectionScreen dropdownFieldSelectionScreen = this.f205194b;
                switch (i22) {
                    case 0:
                        int i3 = DropdownFieldSelectionScreen.V;
                        lf9.w wVar = (lf9.w) dropdownFieldSelectionScreen.T.getValue();
                        switch (wVar.f194808a) {
                            case 0:
                                return (f) wVar.d.get();
                            case 1:
                                return (f) wVar.d.get();
                            default:
                                return (f) wVar.d.get();
                        }
                    default:
                        int i5 = DropdownFieldSelectionScreen.V;
                        qji.b bVarU2 = dropdownFieldSelectionScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_field.di.DropdownFieldSelectionScreenInjector");
                        v vVar = (v) ((ng9.a) bVarU2).b().mo3808a(dropdownFieldSelectionScreen);
                        d dVar = dropdownFieldSelectionScreen.Q;
                        switch (vVar.f194805a) {
                            case 0:
                                dVar.getClass();
                                vVar.d = dVar;
                                break;
                            case 1:
                                dVar.getClass();
                                vVar.d = dVar;
                                break;
                            default:
                                dVar.getClass();
                                vVar.d = dVar;
                                break;
                        }
                        return (lf9.w) vVar.mo3783build();
                }
            }
        });
        this.U = u.c(rowDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (lf9.w) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new mg9.b(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (f) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
