package com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsAccountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.PixQrCodeAdditionalInformationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lt.d;
import m3g.c;
import m9d.y0;
import mba.b;
import mba.e;
import mba.f;
import mba.i;
import no.d1;
import p8a.i1;
import p8a.j1;
import te0.w;
import vc.s;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/screen/additional_information/PixQrCodeAdditionalInformationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmba/e;", "Ldli/a;", "Lmba/f;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeAdditionalInformationScreen extends ViewController<e> implements a, d1 {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PixQrCodeAdditionalInformationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final PixQrCodeAdditionalInformationScreenContract$InputData K;
    public final Lazy L;
    public final int M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;

    public PixQrCodeAdditionalInformationScreen(PixQrCodeAdditionalInformationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = j.b(new c(17));
        this.M = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: mba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeAdditionalInformationScreen f204185b;

            {
                this.f204185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixQrCodeAdditionalInformationScreen pixQrCodeAdditionalInformationScreen = this.f204185b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeAdditionalInformationScreen.R;
                        j1 j1Var = (j1) pixQrCodeAdditionalInformationScreen.Q.getValue();
                        switch (j1Var.f233997a) {
                            case 0:
                                return (i) j1Var.d.get();
                            default:
                                return (i) j1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeAdditionalInformationScreen.R;
                        PixQrCodeAdditionalInformationScreen pixQrCodeAdditionalInformationScreen2 = this.f204185b;
                        return dli.f.a(pixQrCodeAdditionalInformationScreen2, (i) pixQrCodeAdditionalInformationScreen2.N.getValue(), u.c((CellDetailsAccountDelegate) pixQrCodeAdditionalInformationScreen2.L.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrCodeAdditionalInformationScreen.R;
                        qji.b bVarU2 = pixQrCodeAdditionalInformationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.di.PixQrCodeAdditionalInformationScreenInjector");
                        i1 i1Var = (i1) ((nba.a) bVarU2).j().mo3808a(pixQrCodeAdditionalInformationScreen);
                        PixQrCodeAdditionalInformationScreenContract$InputData pixQrCodeAdditionalInformationScreenContract$InputData = pixQrCodeAdditionalInformationScreen.K;
                        switch (i1Var.f233988a) {
                            case 0:
                                pixQrCodeAdditionalInformationScreenContract$InputData.getClass();
                                i1Var.d = pixQrCodeAdditionalInformationScreenContract$InputData;
                                break;
                            default:
                                pixQrCodeAdditionalInformationScreenContract$InputData.getClass();
                                i1Var.d = pixQrCodeAdditionalInformationScreenContract$InputData;
                                break;
                        }
                        return (j1) i1Var.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeAdditionalInformationScreen f204185b;

            {
                this.f204185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixQrCodeAdditionalInformationScreen pixQrCodeAdditionalInformationScreen = this.f204185b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeAdditionalInformationScreen.R;
                        j1 j1Var = (j1) pixQrCodeAdditionalInformationScreen.Q.getValue();
                        switch (j1Var.f233997a) {
                            case 0:
                                return (i) j1Var.d.get();
                            default:
                                return (i) j1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeAdditionalInformationScreen.R;
                        PixQrCodeAdditionalInformationScreen pixQrCodeAdditionalInformationScreen2 = this.f204185b;
                        return dli.f.a(pixQrCodeAdditionalInformationScreen2, (i) pixQrCodeAdditionalInformationScreen2.N.getValue(), u.c((CellDetailsAccountDelegate) pixQrCodeAdditionalInformationScreen2.L.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrCodeAdditionalInformationScreen.R;
                        qji.b bVarU2 = pixQrCodeAdditionalInformationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.di.PixQrCodeAdditionalInformationScreenInjector");
                        i1 i1Var = (i1) ((nba.a) bVarU2).j().mo3808a(pixQrCodeAdditionalInformationScreen);
                        PixQrCodeAdditionalInformationScreenContract$InputData pixQrCodeAdditionalInformationScreenContract$InputData = pixQrCodeAdditionalInformationScreen.K;
                        switch (i1Var.f233988a) {
                            case 0:
                                pixQrCodeAdditionalInformationScreenContract$InputData.getClass();
                                i1Var.d = pixQrCodeAdditionalInformationScreenContract$InputData;
                                break;
                            default:
                                pixQrCodeAdditionalInformationScreenContract$InputData.getClass();
                                i1Var.d = pixQrCodeAdditionalInformationScreenContract$InputData;
                                break;
                        }
                        return (j1) i1Var.mo3783build();
                }
            }
        });
        this.P = s.t(this, b.f);
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: mba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeAdditionalInformationScreen f204185b;

            {
                this.f204185b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixQrCodeAdditionalInformationScreen pixQrCodeAdditionalInformationScreen = this.f204185b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeAdditionalInformationScreen.R;
                        j1 j1Var = (j1) pixQrCodeAdditionalInformationScreen.Q.getValue();
                        switch (j1Var.f233997a) {
                            case 0:
                                return (i) j1Var.d.get();
                            default:
                                return (i) j1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeAdditionalInformationScreen.R;
                        PixQrCodeAdditionalInformationScreen pixQrCodeAdditionalInformationScreen2 = this.f204185b;
                        return dli.f.a(pixQrCodeAdditionalInformationScreen2, (i) pixQrCodeAdditionalInformationScreen2.N.getValue(), u.c((CellDetailsAccountDelegate) pixQrCodeAdditionalInformationScreen2.L.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrCodeAdditionalInformationScreen.R;
                        qji.b bVarU2 = pixQrCodeAdditionalInformationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.additional_information.di.PixQrCodeAdditionalInformationScreenInjector");
                        i1 i1Var = (i1) ((nba.a) bVarU2).j().mo3808a(pixQrCodeAdditionalInformationScreen);
                        PixQrCodeAdditionalInformationScreenContract$InputData pixQrCodeAdditionalInformationScreenContract$InputData = pixQrCodeAdditionalInformationScreen.K;
                        switch (i1Var.f233988a) {
                            case 0:
                                pixQrCodeAdditionalInformationScreenContract$InputData.getClass();
                                i1Var.d = pixQrCodeAdditionalInformationScreenContract$InputData;
                                break;
                            default:
                                pixQrCodeAdditionalInformationScreenContract$InputData.getClass();
                                i1Var.d = pixQrCodeAdditionalInformationScreenContract$InputData;
                                break;
                        }
                        return (j1) i1Var.mo3783build();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j1) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.pix_transaction_review_item_title_additional_information, null, null, 14), null, null, null, false, 30));
        d3().f174545b.setText(new TextLocalisedClause(R$string.pix_transaction_review_cta_button_got_it, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174545b.o), null, new y0(this, null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(((CellDetailsAccountDelegate) this.L.getValue()).d), 13), null, new m75.i(this, null, 10), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.P.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
