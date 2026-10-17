package com.revolut.feature.junior_settings.impl.ui_kompot.enter_qr_data;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.enter_qr_data.EnterQrDataController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.n;
import ko8.c;
import ko8.g;
import ko8.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mn8.d;
import mn8.o;
import pki.b;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_settings/impl/ui_kompot/enter_qr_data/EnterQrDataController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lko8/g;", "Ldli/a;", "Lko8/h;", "<init>", "()V", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnterQrDataController extends ViewController<g> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EnterQrDataController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_bottomsheet;
    public final h L = s.t(this, a.f);
    public final InputTextDelegate M = new InputTextDelegate(null);
    public final LargeActionButtonDelegate N = new LargeActionButtonDelegate();
    public final Object O;
    public final Object P;
    public final Object Q;

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public EnterQrDataController() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ko8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterQrDataController f186269b;

            {
                this.f186269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EnterQrDataController enterQrDataController = this.f186269b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EnterQrDataController.R;
                        return (i) ((mn8.d) enterQrDataController.P.getValue()).f207423a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = EnterQrDataController.R;
                        phm.a aVar = (phm.a) ue0.e.j(enterQrDataController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        mn8.d dVar = new mn8.d();
                        dVar.f207423a = e4m.b.b(new m69.a(oVar, 17));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = EnterQrDataController.R;
                        EnterQrDataController enterQrDataController2 = this.f186269b;
                        return dli.f.a(enterQrDataController2, (i) enterQrDataController2.O.getValue(), v.k(enterQrDataController2.M, enterQrDataController2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ko8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterQrDataController f186269b;

            {
                this.f186269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EnterQrDataController enterQrDataController = this.f186269b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnterQrDataController.R;
                        return (i) ((mn8.d) enterQrDataController.P.getValue()).f207423a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = EnterQrDataController.R;
                        phm.a aVar = (phm.a) ue0.e.j(enterQrDataController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        mn8.d dVar = new mn8.d();
                        dVar.f207423a = e4m.b.b(new m69.a(oVar, 17));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = EnterQrDataController.R;
                        EnterQrDataController enterQrDataController2 = this.f186269b;
                        return dli.f.a(enterQrDataController2, (i) enterQrDataController2.O.getValue(), v.k(enterQrDataController2.M, enterQrDataController2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ko8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EnterQrDataController f186269b;

            {
                this.f186269b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EnterQrDataController enterQrDataController = this.f186269b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EnterQrDataController.R;
                        return (i) ((mn8.d) enterQrDataController.P.getValue()).f207423a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = EnterQrDataController.R;
                        phm.a aVar = (phm.a) ue0.e.j(enterQrDataController.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f207476w;
                        mn8.d dVar = new mn8.d();
                        dVar.f207423a = e4m.b.b(new m69.a(oVar, 17));
                        return dVar;
                    default:
                        KProperty[] kPropertyArr3 = EnterQrDataController.R;
                        EnterQrDataController enterQrDataController2 = this.f186269b;
                        return dli.f.a(enterQrDataController2, (i) enterQrDataController2.O.getValue(), v.k(enterQrDataController2.M, enterQrDataController2.N), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, cli.q qVar) {
        ko8.h uiState = (ko8.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((n) value).f174542b.setHeaderModel(new lw0.a(uiState.f186274b, null, null, null, false, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.M.e.f121375b), new ko8.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.d.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
