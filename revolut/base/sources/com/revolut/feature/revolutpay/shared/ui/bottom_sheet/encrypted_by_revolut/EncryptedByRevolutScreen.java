package com.revolut.feature.revolutpay.shared.ui.bottom_sheet.encrypted_by_revolut;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.shared.ui.bottom_sheet.encrypted_by_revolut.EncryptedByRevolutScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.f;
import idc.c;
import jdc.b;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/bottom_sheet/encrypted_by_revolut/EncryptedByRevolutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lidc/a;", "<init>", "()V", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EncryptedByRevolutScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(EncryptedByRevolutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final Object M;
    public final Object O;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final h L = s.t(this, a.f);
    public final LargeActionButtonDelegate N = new LargeActionButtonDelegate();

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, n.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return n.a(p0);
        }
    }

    public EncryptedByRevolutScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: idc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EncryptedByRevolutScreen f160468b;

            {
                this.f160468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EncryptedByRevolutScreen encryptedByRevolutScreen = this.f160468b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EncryptedByRevolutScreen.Q;
                        qji.b bVarU2 = encryptedByRevolutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.bottom_sheet.encrypted_by_revolut.di.EncryptedByRevolutScreenInjector");
                        return (jdc.b) ((jdc.a) ((jdc.c) bVarU2).q().mo3808a(encryptedByRevolutScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EncryptedByRevolutScreen.Q;
                        return ((jdc.b) encryptedByRevolutScreen.M.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = EncryptedByRevolutScreen.Q;
                        EncryptedByRevolutScreen encryptedByRevolutScreen2 = this.f160468b;
                        return f.a(encryptedByRevolutScreen2, (e) encryptedByRevolutScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), encryptedByRevolutScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: idc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EncryptedByRevolutScreen f160468b;

            {
                this.f160468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EncryptedByRevolutScreen encryptedByRevolutScreen = this.f160468b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EncryptedByRevolutScreen.Q;
                        qji.b bVarU2 = encryptedByRevolutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.bottom_sheet.encrypted_by_revolut.di.EncryptedByRevolutScreenInjector");
                        return (jdc.b) ((jdc.a) ((jdc.c) bVarU2).q().mo3808a(encryptedByRevolutScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EncryptedByRevolutScreen.Q;
                        return ((jdc.b) encryptedByRevolutScreen.M.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = EncryptedByRevolutScreen.Q;
                        EncryptedByRevolutScreen encryptedByRevolutScreen2 = this.f160468b;
                        return f.a(encryptedByRevolutScreen2, (e) encryptedByRevolutScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), encryptedByRevolutScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: idc.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EncryptedByRevolutScreen f160468b;

            {
                this.f160468b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EncryptedByRevolutScreen encryptedByRevolutScreen = this.f160468b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EncryptedByRevolutScreen.Q;
                        qji.b bVarU2 = encryptedByRevolutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.shared.ui.bottom_sheet.encrypted_by_revolut.di.EncryptedByRevolutScreenInjector");
                        return (jdc.b) ((jdc.a) ((jdc.c) bVarU2).q().mo3808a(encryptedByRevolutScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = EncryptedByRevolutScreen.Q;
                        return ((jdc.b) encryptedByRevolutScreen.M.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = EncryptedByRevolutScreen.Q;
                        EncryptedByRevolutScreen encryptedByRevolutScreen2 = this.f160468b;
                        return f.a(encryptedByRevolutScreen2, (e) encryptedByRevolutScreen2.O.getValue(), v.k(new RowDelegate(null, null, 7), encryptedByRevolutScreen2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        idc.a uiState = (idc.a) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(uiState.f160466b, null, null, null, false, 30));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (idc.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
