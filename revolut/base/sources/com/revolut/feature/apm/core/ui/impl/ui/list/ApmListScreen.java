package com.revolut.feature.apm.core.ui.impl.ui.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.impl.ui.list.ApmListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import e12.b;
import e12.c;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m22.d;
import m22.f;
import m22.g;
import p12.x;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/list/ApmListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lm22/b;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmListScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ApmListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final c K;
    public final b L;
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public ApmListScreen(c inputData, b extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.K = inputData;
        this.L = extension;
        this.M = R$layout.screen_recycler_navbar;
        this.N = true;
        this.O = s.t(this, d.f);
        this.P = w.y0(new m05.d(19));
        this.Q = w.y0(new m05.d(20));
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: m22.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmListScreen f201682b;

            {
                this.f201682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmListScreen apmListScreen = this.f201682b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmListScreen.U;
                        ApmListScreen apmListScreen2 = this.f201682b;
                        return dli.f.a(apmListScreen2, (g) apmListScreen2.T.getValue(), v.k((RowDelegate) apmListScreen2.P.getValue(), (FullScreenStateDelegate) apmListScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmListScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(apmListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        apmListScreen.K.getClass();
                        e12.b bVar = apmListScreen.L;
                        bVar.getClass();
                        return new x(vVar, bVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmListScreen.U;
                        return (g) ((x) apmListScreen.S.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: m22.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmListScreen f201682b;

            {
                this.f201682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmListScreen apmListScreen = this.f201682b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmListScreen.U;
                        ApmListScreen apmListScreen2 = this.f201682b;
                        return dli.f.a(apmListScreen2, (g) apmListScreen2.T.getValue(), v.k((RowDelegate) apmListScreen2.P.getValue(), (FullScreenStateDelegate) apmListScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmListScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(apmListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        apmListScreen.K.getClass();
                        e12.b bVar = apmListScreen.L;
                        bVar.getClass();
                        return new x(vVar, bVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmListScreen.U;
                        return (g) ((x) apmListScreen.S.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: m22.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmListScreen f201682b;

            {
                this.f201682b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmListScreen apmListScreen = this.f201682b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmListScreen.U;
                        ApmListScreen apmListScreen2 = this.f201682b;
                        return dli.f.a(apmListScreen2, (g) apmListScreen2.T.getValue(), v.k((RowDelegate) apmListScreen2.P.getValue(), (FullScreenStateDelegate) apmListScreen2.Q.getValue(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmListScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(apmListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        apmListScreen.K.getClass();
                        e12.b bVar = apmListScreen.L;
                        bVar.getClass();
                        return new x(vVar, bVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmListScreen.U;
                        return (g) ((x) apmListScreen.S.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((m22.b) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        c cVar = this.K;
        navBarWithToolbar.setTitle(cVar.f121849a, null);
        navBarWithToolbar.setToolbarTitle(cVar.f121849a);
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new lpl.c(this, null, 14), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), null, new m22.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new f(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
