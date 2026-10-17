package com.revolut.feature.crypto.remittance.impl.ui.commonfields;

import ak5.c;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogContract$InputData;
import com.revolut.feature.crypto.remittance.impl.ui.commonfields.CommonRemittanceFieldDialogController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jj9.b;
import jk5.a;
import jk5.d;
import jk5.f;
import jk5.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/remittance/impl/ui/commonfields/CommonRemittanceFieldDialogController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljk5/a;", "Ldli/a;", "Ljk5/d;", "feature_crypto_remittance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommonRemittanceFieldDialogController extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CommonRemittanceFieldDialogController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final CommonRemittanceFieldDialogContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public CommonRemittanceFieldDialogController(CommonRemittanceFieldDialogContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_list;
        this.M = w.y0(new b(5));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: jk5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommonRemittanceFieldDialogController f175094b;

            {
                this.f175094b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CommonRemittanceFieldDialogController commonRemittanceFieldDialogController = this.f175094b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CommonRemittanceFieldDialogController.R;
                        CommonRemittanceFieldDialogController commonRemittanceFieldDialogController2 = this.f175094b;
                        c cVar = (c) commonRemittanceFieldDialogController2.Q.getValue();
                        List listC = u.c((RowDelegate) commonRemittanceFieldDialogController2.M.getValue());
                        ViewBinding value = commonRemittanceFieldDialogController2.O.getValue(commonRemittanceFieldDialogController2, CommonRemittanceFieldDialogController.R[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(commonRemittanceFieldDialogController2, cVar, listC, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CommonRemittanceFieldDialogController.R;
                        qji.b bVarU2 = commonRemittanceFieldDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.remittance.impl.ui.commonfields.di.CommonRemittanceFieldDialogControllerInjector");
                        ak5.d dVar = (ak5.d) bVarU2;
                        ak5.i iVar = dVar.f5676b;
                        ak5.d dVar2 = dVar.f5677c;
                        CommonRemittanceFieldDialogContract$InputData commonRemittanceFieldDialogContract$InputData = commonRemittanceFieldDialogController.K;
                        commonRemittanceFieldDialogContract$InputData.getClass();
                        return new ak5.c(iVar, dVar2, commonRemittanceFieldDialogContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CommonRemittanceFieldDialogController.R;
                        return (c) ((ak5.c) commonRemittanceFieldDialogController.P.getValue()).f5674c.get();
                }
            }
        });
        this.O = s.t(this, f.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: jk5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommonRemittanceFieldDialogController f175094b;

            {
                this.f175094b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CommonRemittanceFieldDialogController commonRemittanceFieldDialogController = this.f175094b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommonRemittanceFieldDialogController.R;
                        CommonRemittanceFieldDialogController commonRemittanceFieldDialogController2 = this.f175094b;
                        c cVar = (c) commonRemittanceFieldDialogController2.Q.getValue();
                        List listC = u.c((RowDelegate) commonRemittanceFieldDialogController2.M.getValue());
                        ViewBinding value = commonRemittanceFieldDialogController2.O.getValue(commonRemittanceFieldDialogController2, CommonRemittanceFieldDialogController.R[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(commonRemittanceFieldDialogController2, cVar, listC, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CommonRemittanceFieldDialogController.R;
                        qji.b bVarU2 = commonRemittanceFieldDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.remittance.impl.ui.commonfields.di.CommonRemittanceFieldDialogControllerInjector");
                        ak5.d dVar = (ak5.d) bVarU2;
                        ak5.i iVar = dVar.f5676b;
                        ak5.d dVar2 = dVar.f5677c;
                        CommonRemittanceFieldDialogContract$InputData commonRemittanceFieldDialogContract$InputData = commonRemittanceFieldDialogController.K;
                        commonRemittanceFieldDialogContract$InputData.getClass();
                        return new ak5.c(iVar, dVar2, commonRemittanceFieldDialogContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CommonRemittanceFieldDialogController.R;
                        return (c) ((ak5.c) commonRemittanceFieldDialogController.P.getValue()).f5674c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: jk5.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommonRemittanceFieldDialogController f175094b;

            {
                this.f175094b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CommonRemittanceFieldDialogController commonRemittanceFieldDialogController = this.f175094b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommonRemittanceFieldDialogController.R;
                        CommonRemittanceFieldDialogController commonRemittanceFieldDialogController2 = this.f175094b;
                        c cVar = (c) commonRemittanceFieldDialogController2.Q.getValue();
                        List listC = u.c((RowDelegate) commonRemittanceFieldDialogController2.M.getValue());
                        ViewBinding value = commonRemittanceFieldDialogController2.O.getValue(commonRemittanceFieldDialogController2, CommonRemittanceFieldDialogController.R[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return dli.f.a(commonRemittanceFieldDialogController2, cVar, listC, ((jii.f) value).f174520c.getId(), null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CommonRemittanceFieldDialogController.R;
                        qji.b bVarU2 = commonRemittanceFieldDialogController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.crypto.remittance.impl.ui.commonfields.di.CommonRemittanceFieldDialogControllerInjector");
                        ak5.d dVar = (ak5.d) bVarU2;
                        ak5.i iVar = dVar.f5676b;
                        ak5.d dVar2 = dVar.f5677c;
                        CommonRemittanceFieldDialogContract$InputData commonRemittanceFieldDialogContract$InputData = commonRemittanceFieldDialogController.K;
                        commonRemittanceFieldDialogContract$InputData.getClass();
                        return new ak5.c(iVar, dVar2, commonRemittanceFieldDialogContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = CommonRemittanceFieldDialogController.R;
                        return (c) ((ak5.c) commonRemittanceFieldDialogController.P.getValue()).f5674c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.f) value).f174519b.setHeaderModel(uiState.f175092b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jk5.c) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), new g(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
