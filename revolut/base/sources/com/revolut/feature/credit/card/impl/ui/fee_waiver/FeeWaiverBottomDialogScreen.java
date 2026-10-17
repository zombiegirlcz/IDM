package com.revolut.feature.credit.card.impl.ui.fee_waiver;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.credit.card.impl.ui.fee_waiver.FeeWaiverBottomDialogScreen;
import com.revolut.feature.credit.card.impl.ui.fee_waiver.FeeWaiverBottomDialogScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ep4.b;
import jm4.a3;
import jm4.h3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import qr4.d;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/fee_waiver/FeeWaiverBottomDialogScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqr4/d;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FeeWaiverBottomDialogScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(FeeWaiverBottomDialogScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final FeeWaiverBottomDialogScreenContract$InputData L;
    public final Object M;
    public final Object N;
    public final h O;
    public final int P;
    public final Object Q;

    public FeeWaiverBottomDialogScreen(FeeWaiverBottomDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: qr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FeeWaiverBottomDialogScreen f248646b;

            {
                this.f248646b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FeeWaiverBottomDialogScreen feeWaiverBottomDialogScreen = this.f248646b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FeeWaiverBottomDialogScreen.R;
                        FeeWaiverBottomDialogScreen feeWaiverBottomDialogScreen2 = this.f248646b;
                        return dli.f.a(feeWaiverBottomDialogScreen2, (e) feeWaiverBottomDialogScreen2.Q.getValue(), m72.b.v(null, null, 7), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FeeWaiverBottomDialogScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(feeWaiverBottomDialogScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        FeeWaiverBottomDialogScreenContract$InputData feeWaiverBottomDialogScreenContract$InputData = feeWaiverBottomDialogScreen.L;
                        feeWaiverBottomDialogScreenContract$InputData.getClass();
                        return new h3(a3Var, feeWaiverBottomDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FeeWaiverBottomDialogScreen.R;
                        return (e) ((h3) feeWaiverBottomDialogScreen.N.getValue()).f176109c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: qr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FeeWaiverBottomDialogScreen f248646b;

            {
                this.f248646b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FeeWaiverBottomDialogScreen feeWaiverBottomDialogScreen = this.f248646b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FeeWaiverBottomDialogScreen.R;
                        FeeWaiverBottomDialogScreen feeWaiverBottomDialogScreen2 = this.f248646b;
                        return dli.f.a(feeWaiverBottomDialogScreen2, (e) feeWaiverBottomDialogScreen2.Q.getValue(), m72.b.v(null, null, 7), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FeeWaiverBottomDialogScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(feeWaiverBottomDialogScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        FeeWaiverBottomDialogScreenContract$InputData feeWaiverBottomDialogScreenContract$InputData = feeWaiverBottomDialogScreen.L;
                        feeWaiverBottomDialogScreenContract$InputData.getClass();
                        return new h3(a3Var, feeWaiverBottomDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FeeWaiverBottomDialogScreen.R;
                        return (e) ((h3) feeWaiverBottomDialogScreen.N.getValue()).f176109c.get();
                }
            }
        });
        this.O = s.t(this, qr4.b.f);
        this.P = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qr4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FeeWaiverBottomDialogScreen f248646b;

            {
                this.f248646b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FeeWaiverBottomDialogScreen feeWaiverBottomDialogScreen = this.f248646b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FeeWaiverBottomDialogScreen.R;
                        FeeWaiverBottomDialogScreen feeWaiverBottomDialogScreen2 = this.f248646b;
                        return dli.f.a(feeWaiverBottomDialogScreen2, (e) feeWaiverBottomDialogScreen2.Q.getValue(), m72.b.v(null, null, 7), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = FeeWaiverBottomDialogScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(feeWaiverBottomDialogScreen.m2()).a().get(a3.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", a3.class, " is not found"));
                        }
                        a3 a3Var = ((a3) aVar2.b()).Y;
                        FeeWaiverBottomDialogScreenContract$InputData feeWaiverBottomDialogScreenContract$InputData = feeWaiverBottomDialogScreen.L;
                        feeWaiverBottomDialogScreenContract$InputData.getClass();
                        return new h3(a3Var, feeWaiverBottomDialogScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = FeeWaiverBottomDialogScreen.R;
                        return (e) ((h3) feeWaiverBottomDialogScreen.N.getValue()).f176109c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174545b.setText(uiState.f248651b);
        d3().f174546c.setHeaderModel(uiState.f248650a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h3) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (qr4.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new qg4.d(this, null, 20), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
