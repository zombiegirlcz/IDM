package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable;

import afj.i3;
import afj.j3;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.a;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.EsimNonRefundableBottomSheetScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.EsimNonRefundableBottomSheetScreenContract$InputData;
import java.util.List;
import jnj.b;
import jnj.c;
import jnj.d;
import jnj.e;
import jnj.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vkm.q;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/bottom_sheets/non_refundable/EsimNonRefundableBottomSheetScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ljnj/e;", "Ljnj/d;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimNonRefundableBottomSheetScreen extends BaseBottomSheetRecyclerController<e, d> {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(EsimNonRefundableBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final EsimNonRefundableBottomSheetScreenContract$InputData Q;
    public final h R;
    public final CellDetailsStandaloneNoteDelegate S;
    public final Object T;
    public final Object U;
    public final List V;

    public EsimNonRefundableBottomSheetScreen(EsimNonRefundableBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        this.R = s.t(this, b.f);
        CellDetailsStandaloneNoteDelegate cellDetailsStandaloneNoteDelegate = new CellDetailsStandaloneNoteDelegate();
        this.S = cellDetailsStandaloneNoteDelegate;
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: jnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimNonRefundableBottomSheetScreen f176812b;

            {
                this.f176812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimNonRefundableBottomSheetScreen esimNonRefundableBottomSheetScreen = this.f176812b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimNonRefundableBottomSheetScreen.W;
                        qji.b bVarU2 = esimNonRefundableBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.di.EsimNonRefundableBottomSheetScreenInjector");
                        i3 i3Var = (i3) ((knj.a) bVarU2).j().mo3808a(esimNonRefundableBottomSheetScreen);
                        EsimNonRefundableBottomSheetScreenContract$InputData esimNonRefundableBottomSheetScreenContract$InputData = esimNonRefundableBottomSheetScreen.Q;
                        switch (i3Var.f4290a) {
                            case 0:
                                esimNonRefundableBottomSheetScreenContract$InputData.getClass();
                                i3Var.d = esimNonRefundableBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimNonRefundableBottomSheetScreenContract$InputData.getClass();
                                i3Var.d = esimNonRefundableBottomSheetScreenContract$InputData;
                                break;
                            case 2:
                                esimNonRefundableBottomSheetScreenContract$InputData.getClass();
                                i3Var.d = esimNonRefundableBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimNonRefundableBottomSheetScreenContract$InputData.getClass();
                                i3Var.d = esimNonRefundableBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (j3) i3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimNonRefundableBottomSheetScreen.W;
                        j3 j3Var = (j3) esimNonRefundableBottomSheetScreen.T.getValue();
                        switch (j3Var.f4305a) {
                            case 0:
                                return (f) j3Var.d.get();
                            case 1:
                                return (f) j3Var.d.get();
                            case 2:
                                return (f) j3Var.d.get();
                            default:
                                return (f) j3Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: jnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimNonRefundableBottomSheetScreen f176812b;

            {
                this.f176812b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimNonRefundableBottomSheetScreen esimNonRefundableBottomSheetScreen = this.f176812b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimNonRefundableBottomSheetScreen.W;
                        qji.b bVarU2 = esimNonRefundableBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.bottom_sheets.non_refundable.di.EsimNonRefundableBottomSheetScreenInjector");
                        i3 i3Var = (i3) ((knj.a) bVarU2).j().mo3808a(esimNonRefundableBottomSheetScreen);
                        EsimNonRefundableBottomSheetScreenContract$InputData esimNonRefundableBottomSheetScreenContract$InputData = esimNonRefundableBottomSheetScreen.Q;
                        switch (i3Var.f4290a) {
                            case 0:
                                esimNonRefundableBottomSheetScreenContract$InputData.getClass();
                                i3Var.d = esimNonRefundableBottomSheetScreenContract$InputData;
                                break;
                            case 1:
                                esimNonRefundableBottomSheetScreenContract$InputData.getClass();
                                i3Var.d = esimNonRefundableBottomSheetScreenContract$InputData;
                                break;
                            case 2:
                                esimNonRefundableBottomSheetScreenContract$InputData.getClass();
                                i3Var.d = esimNonRefundableBottomSheetScreenContract$InputData;
                                break;
                            default:
                                esimNonRefundableBottomSheetScreenContract$InputData.getClass();
                                i3Var.d = esimNonRefundableBottomSheetScreenContract$InputData;
                                break;
                        }
                        return (j3) i3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr2 = EsimNonRefundableBottomSheetScreen.W;
                        j3 j3Var = (j3) esimNonRefundableBottomSheetScreen.T.getValue();
                        switch (j3Var.f4305a) {
                            case 0:
                                return (f) j3Var.d.get();
                            case 1:
                                return (f) j3Var.d.get();
                            case 2:
                                return (f) j3Var.d.get();
                            default:
                                return (f) j3Var.d.get();
                        }
                }
            }
        });
        this.V = u.c(cellDetailsStandaloneNoteDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j3) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        KProperty[] kPropertyArr = W;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.R;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        a.g2(this, rd0.e.b(((jii.e) value).f174513b.f), null, new c(this, null, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        a.g2(this, rd0.e.b(((jii.e) value2).f174513b.f58955g), null, new c(this, null, 1), 3);
        a.g2(this, q.J(rd0.e.b(this.S.f51901c), h3()), null, new jij.h(this, (Continuation) null, 12), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b d() {
        return (f) this.U.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getS() {
        return this.V;
    }
}
