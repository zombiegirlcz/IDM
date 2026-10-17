package com.revolut.feature.credit.core.ui.picker;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetController;
import com.revolut.feature.credit.core.ui.picker.PickerBottomSheetControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import dli.a;
import gul.n;
import gy4.b;
import gy4.c;
import gy4.h;
import gy4.i;
import gy4.k;
import in0.g;
import java.util.List;
import jii.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/core/ui/picker/PickerBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lgy4/h;", "Ldli/a;", "Lgy4/i;", "Lin0/g;", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PickerBottomSheetController extends SimpleViewController<h> implements a, g {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PickerBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final PickerBottomSheetControllerContract$InputData N;
    public final int O;
    public final ao.h P;
    public final PickerDelegate Q;
    public final LargeActionButtonDelegate R;
    public final Object S;
    public final Object T;

    public PickerBottomSheetController(PickerBottomSheetControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_bottom_sheet_list;
        this.P = s.t(this, b.f);
        this.Q = new PickerDelegate();
        this.R = new LargeActionButtonDelegate();
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: gy4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerBottomSheetController f147820b;

            {
                this.f147820b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PickerBottomSheetController.U;
                        PickerBottomSheetController pickerBottomSheetController = this.f147820b;
                        k kVar = (k) pickerBottomSheetController.T.getValue();
                        List listK = v.k(pickerBottomSheetController.Q, pickerBottomSheetController.R);
                        ViewBinding value = pickerBottomSheetController.P.getValue(pickerBottomSheetController, PickerBottomSheetController.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(pickerBottomSheetController, kVar, listK, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                    default:
                        PickerBottomSheetControllerContract$InputData pickerBottomSheetControllerContract$InputData = this.f147820b.N;
                        return new k(pickerBottomSheetControllerContract$InputData, new l(pickerBottomSheetControllerContract$InputData));
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: gy4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PickerBottomSheetController f147820b;

            {
                this.f147820b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PickerBottomSheetController.U;
                        PickerBottomSheetController pickerBottomSheetController = this.f147820b;
                        k kVar = (k) pickerBottomSheetController.T.getValue();
                        List listK = v.k(pickerBottomSheetController.Q, pickerBottomSheetController.R);
                        ViewBinding value = pickerBottomSheetController.P.getValue(pickerBottomSheetController, PickerBottomSheetController.U[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(pickerBottomSheetController, kVar, listK, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                    default:
                        PickerBottomSheetControllerContract$InputData pickerBottomSheetControllerContract$InputData = this.f147820b.N;
                        return new k(pickerBottomSheetControllerContract$InputData, new l(pickerBottomSheetControllerContract$InputData));
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((f) value).f174519b.setHeaderModel(uiState.f147825a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (k) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Q.f52922c), null, new n(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.R.d.f121375b), null, new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }
}
