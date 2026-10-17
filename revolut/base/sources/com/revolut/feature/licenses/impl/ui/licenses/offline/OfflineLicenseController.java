package com.revolut.feature.licenses.impl.ui.licenses.offline;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import com.revolut.core.ui_kit.delegates.WebViewDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.licenses.impl.ui.licenses.offline.OfflineLicenseController;
import com.revolut.feature.licenses.impl.ui.licenses.offline.OfflineLicenseControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.f;
import dze.n;
import e19.b;
import e19.c;
import e19.d;
import java.util.List;
import jii.m;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/licenses/impl/ui/licenses/offline/OfflineLicenseController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le19/c;", "feature_licenses_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OfflineLicenseController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(OfflineLicenseController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final OfflineLicenseControllerContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public OfflineLicenseController(OfflineLicenseControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: e19.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfflineLicenseController f121923b;

            {
                this.f121923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OfflineLicenseController offlineLicenseController = this.f121923b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OfflineLicenseController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(offlineLicenseController.m2()).a().get(z09.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z09.d.class, " is not found"));
                        }
                        smd.s sVarC = ((z09.d) aVar2.b()).c();
                        sVarC.f264432a = offlineLicenseController;
                        OfflineLicenseControllerContract$InputData offlineLicenseControllerContract$InputData = offlineLicenseController.K;
                        offlineLicenseControllerContract$InputData.getClass();
                        sVarC.f264433b = offlineLicenseControllerContract$InputData;
                        return (z09.c) sVarC.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = OfflineLicenseController.Q;
                        return new d(new e(((z09.c) offlineLicenseController.N.getValue()).f318193a));
                    default:
                        KProperty[] kPropertyArr3 = OfflineLicenseController.Q;
                        OfflineLicenseController offlineLicenseController2 = this.f121923b;
                        return f.a(offlineLicenseController2, (d) offlineLicenseController2.O.getValue(), u.c(new WebViewDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: e19.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfflineLicenseController f121923b;

            {
                this.f121923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OfflineLicenseController offlineLicenseController = this.f121923b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfflineLicenseController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(offlineLicenseController.m2()).a().get(z09.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z09.d.class, " is not found"));
                        }
                        smd.s sVarC = ((z09.d) aVar2.b()).c();
                        sVarC.f264432a = offlineLicenseController;
                        OfflineLicenseControllerContract$InputData offlineLicenseControllerContract$InputData = offlineLicenseController.K;
                        offlineLicenseControllerContract$InputData.getClass();
                        sVarC.f264433b = offlineLicenseControllerContract$InputData;
                        return (z09.c) sVarC.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = OfflineLicenseController.Q;
                        return new d(new e(((z09.c) offlineLicenseController.N.getValue()).f318193a));
                    default:
                        KProperty[] kPropertyArr3 = OfflineLicenseController.Q;
                        OfflineLicenseController offlineLicenseController2 = this.f121923b;
                        return f.a(offlineLicenseController2, (d) offlineLicenseController2.O.getValue(), u.c(new WebViewDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: e19.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OfflineLicenseController f121923b;

            {
                this.f121923b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OfflineLicenseController offlineLicenseController = this.f121923b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OfflineLicenseController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(offlineLicenseController.m2()).a().get(z09.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", z09.d.class, " is not found"));
                        }
                        smd.s sVarC = ((z09.d) aVar2.b()).c();
                        sVarC.f264432a = offlineLicenseController;
                        OfflineLicenseControllerContract$InputData offlineLicenseControllerContract$InputData = offlineLicenseController.K;
                        offlineLicenseControllerContract$InputData.getClass();
                        sVarC.f264433b = offlineLicenseControllerContract$InputData;
                        return (z09.c) sVarC.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = OfflineLicenseController.Q;
                        return new d(new e(((z09.c) offlineLicenseController.N.getValue()).f318193a));
                    default:
                        KProperty[] kPropertyArr3 = OfflineLicenseController.Q;
                        OfflineLicenseController offlineLicenseController2 = this.f121923b;
                        return f.a(offlineLicenseController2, (d) offlineLicenseController2.O.getValue(), u.c(new WebViewDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z09.c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextClause textClause = new TextClause(this.K.f78046a.f78044b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new n(this, null, 3), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
