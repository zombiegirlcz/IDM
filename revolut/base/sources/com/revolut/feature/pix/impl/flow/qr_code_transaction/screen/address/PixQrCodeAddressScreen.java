package com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.PixQrCodeAddressScreen;
import com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.PixQrCodeAddressScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import ob1.e;
import oba.b;
import oba.d;
import oba.g;
import p8a.k1;
import p8a.l1;
import te0.w;
import vc.s;
import yhm.j;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/qr_code_transaction/screen/address/PixQrCodeAddressScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loba/d;", "Ldli/a;", "Loba/e;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixQrCodeAddressScreen extends ViewController<d> implements a, d1 {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PixQrCodeAddressScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final PixQrCodeAddressScreenContract$InputData K;
    public final Object L;
    public final Lazy M;
    public final int N;
    public final Object O;
    public final Object P;
    public final h Q;
    public final Object R;

    public PixQrCodeAddressScreen(PixQrCodeAddressScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new e(2));
        this.M = j.b(new e(3));
        this.N = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: oba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeAddressScreen f223904b;

            {
                this.f223904b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixQrCodeAddressScreen pixQrCodeAddressScreen = this.f223904b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeAddressScreen.S;
                        l1 l1Var = (l1) pixQrCodeAddressScreen.R.getValue();
                        switch (l1Var.f234018a) {
                            case 0:
                                return (g) l1Var.d.get();
                            default:
                                return (g) l1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeAddressScreen.S;
                        PixQrCodeAddressScreen pixQrCodeAddressScreen2 = this.f223904b;
                        return dli.f.a(pixQrCodeAddressScreen2, (g) pixQrCodeAddressScreen2.O.getValue(), v.k((CellDetailsNoteDelegate) pixQrCodeAddressScreen2.L.getValue(), (LargeActionButtonDelegate) pixQrCodeAddressScreen2.M.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrCodeAddressScreen.S;
                        qji.b bVarU2 = pixQrCodeAddressScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.di.PixQrCodeAddressScreenInjector");
                        k1 k1Var = (k1) ((pba.a) bVarU2).b().mo3808a(pixQrCodeAddressScreen);
                        PixQrCodeAddressScreenContract$InputData pixQrCodeAddressScreenContract$InputData = pixQrCodeAddressScreen.K;
                        switch (k1Var.f234007a) {
                            case 0:
                                pixQrCodeAddressScreenContract$InputData.getClass();
                                k1Var.d = pixQrCodeAddressScreenContract$InputData;
                                break;
                            default:
                                pixQrCodeAddressScreenContract$InputData.getClass();
                                k1Var.d = pixQrCodeAddressScreenContract$InputData;
                                break;
                        }
                        return (l1) k1Var.mo3783build();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: oba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeAddressScreen f223904b;

            {
                this.f223904b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixQrCodeAddressScreen pixQrCodeAddressScreen = this.f223904b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeAddressScreen.S;
                        l1 l1Var = (l1) pixQrCodeAddressScreen.R.getValue();
                        switch (l1Var.f234018a) {
                            case 0:
                                return (g) l1Var.d.get();
                            default:
                                return (g) l1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeAddressScreen.S;
                        PixQrCodeAddressScreen pixQrCodeAddressScreen2 = this.f223904b;
                        return dli.f.a(pixQrCodeAddressScreen2, (g) pixQrCodeAddressScreen2.O.getValue(), v.k((CellDetailsNoteDelegate) pixQrCodeAddressScreen2.L.getValue(), (LargeActionButtonDelegate) pixQrCodeAddressScreen2.M.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrCodeAddressScreen.S;
                        qji.b bVarU2 = pixQrCodeAddressScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.di.PixQrCodeAddressScreenInjector");
                        k1 k1Var = (k1) ((pba.a) bVarU2).b().mo3808a(pixQrCodeAddressScreen);
                        PixQrCodeAddressScreenContract$InputData pixQrCodeAddressScreenContract$InputData = pixQrCodeAddressScreen.K;
                        switch (k1Var.f234007a) {
                            case 0:
                                pixQrCodeAddressScreenContract$InputData.getClass();
                                k1Var.d = pixQrCodeAddressScreenContract$InputData;
                                break;
                            default:
                                pixQrCodeAddressScreenContract$InputData.getClass();
                                k1Var.d = pixQrCodeAddressScreenContract$InputData;
                                break;
                        }
                        return (l1) k1Var.mo3783build();
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: oba.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixQrCodeAddressScreen f223904b;

            {
                this.f223904b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixQrCodeAddressScreen pixQrCodeAddressScreen = this.f223904b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixQrCodeAddressScreen.S;
                        l1 l1Var = (l1) pixQrCodeAddressScreen.R.getValue();
                        switch (l1Var.f234018a) {
                            case 0:
                                return (g) l1Var.d.get();
                            default:
                                return (g) l1Var.d.get();
                        }
                    case 1:
                        KProperty[] kPropertyArr2 = PixQrCodeAddressScreen.S;
                        PixQrCodeAddressScreen pixQrCodeAddressScreen2 = this.f223904b;
                        return dli.f.a(pixQrCodeAddressScreen2, (g) pixQrCodeAddressScreen2.O.getValue(), v.k((CellDetailsNoteDelegate) pixQrCodeAddressScreen2.L.getValue(), (LargeActionButtonDelegate) pixQrCodeAddressScreen2.M.getValue()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixQrCodeAddressScreen.S;
                        qji.b bVarU2 = pixQrCodeAddressScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.qr_code_transaction.screen.address.di.PixQrCodeAddressScreenInjector");
                        k1 k1Var = (k1) ((pba.a) bVarU2).b().mo3808a(pixQrCodeAddressScreen);
                        PixQrCodeAddressScreenContract$InputData pixQrCodeAddressScreenContract$InputData = pixQrCodeAddressScreen.K;
                        switch (k1Var.f234007a) {
                            case 0:
                                pixQrCodeAddressScreenContract$InputData.getClass();
                                k1Var.d = pixQrCodeAddressScreenContract$InputData;
                                break;
                            default:
                                pixQrCodeAddressScreenContract$InputData.getClass();
                                k1Var.d = pixQrCodeAddressScreenContract$InputData;
                                break;
                        }
                        return (l1) k1Var.mo3783build();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((oba.e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l1) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.pix_transaction_review_beneficiary_address_title, null, null, 14), null, null, null, false, 30));
        d3().f174545b.setText(new TextLocalisedClause(R$string.pix_transaction_review_cta_button_got_it, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174545b.o), null, new nuh.j(this, null, 26), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
