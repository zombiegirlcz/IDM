package com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation.PhoneRemovalConfirmationController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mn8.o;
import mn8.q;
import ro8.b;
import ro8.c;
import ro8.e;
import ro8.f;
import ro8.g;
import ro8.j;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/phone_removal_confirmation/PhoneRemovalConfirmationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lro8/f;", "Ldli/a;", "Lro8/h;", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PhoneRemovalConfirmationController extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PhoneRemovalConfirmationController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final e K;
    public final int L;
    public final h M;
    public final LargeActionButtonDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public PhoneRemovalConfirmationController(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet;
        this.M = s.t(this, b.f);
        this.N = new LargeActionButtonDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ro8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneRemovalConfirmationController f255932b;

            {
                this.f255932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PhoneRemovalConfirmationController phoneRemovalConfirmationController = this.f255932b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PhoneRemovalConfirmationController.R;
                        return (j) ((q) phoneRemovalConfirmationController.P.getValue()).f207481b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PhoneRemovalConfirmationController.R;
                        phm.a aVar = (phm.a) ue0.e.j(phoneRemovalConfirmationController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        e eVar = phoneRemovalConfirmationController.K;
                        eVar.getClass();
                        return new q(oVar, eVar);
                    default:
                        KProperty[] kPropertyArr3 = PhoneRemovalConfirmationController.R;
                        PhoneRemovalConfirmationController phoneRemovalConfirmationController2 = this.f255932b;
                        return dli.f.a(phoneRemovalConfirmationController2, (j) phoneRemovalConfirmationController2.O.getValue(), u.c(phoneRemovalConfirmationController2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ro8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneRemovalConfirmationController f255932b;

            {
                this.f255932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PhoneRemovalConfirmationController phoneRemovalConfirmationController = this.f255932b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PhoneRemovalConfirmationController.R;
                        return (j) ((q) phoneRemovalConfirmationController.P.getValue()).f207481b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PhoneRemovalConfirmationController.R;
                        phm.a aVar = (phm.a) ue0.e.j(phoneRemovalConfirmationController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        e eVar = phoneRemovalConfirmationController.K;
                        eVar.getClass();
                        return new q(oVar, eVar);
                    default:
                        KProperty[] kPropertyArr3 = PhoneRemovalConfirmationController.R;
                        PhoneRemovalConfirmationController phoneRemovalConfirmationController2 = this.f255932b;
                        return dli.f.a(phoneRemovalConfirmationController2, (j) phoneRemovalConfirmationController2.O.getValue(), u.c(phoneRemovalConfirmationController2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ro8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PhoneRemovalConfirmationController f255932b;

            {
                this.f255932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PhoneRemovalConfirmationController phoneRemovalConfirmationController = this.f255932b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PhoneRemovalConfirmationController.R;
                        return (j) ((q) phoneRemovalConfirmationController.P.getValue()).f207481b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PhoneRemovalConfirmationController.R;
                        phm.a aVar = (phm.a) ue0.e.j(phoneRemovalConfirmationController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        e eVar = phoneRemovalConfirmationController.K;
                        eVar.getClass();
                        return new q(oVar, eVar);
                    default:
                        KProperty[] kPropertyArr3 = PhoneRemovalConfirmationController.R;
                        PhoneRemovalConfirmationController phoneRemovalConfirmationController2 = this.f255932b;
                        return dli.f.a(phoneRemovalConfirmationController2, (j) phoneRemovalConfirmationController2.O.getValue(), u.c(phoneRemovalConfirmationController2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        ro8.h uiState = (ro8.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarBottomSheet navBarBottomSheet = ((n) value).f174542b;
        g gVar = uiState.f255943b;
        navBarBottomSheet.setHeaderModel(new lw0.a(gVar.f255940a, gVar.f255941b, null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.O.getValue();
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
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
