package com.revolut.feature.apm.core.ui.impl.ui.recipients.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c0d.e;
import c12.z;
import c42.c;
import c42.d;
import c42.f;
import c42.g;
import c42.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import com.revolut.feature.apm.core.ui.impl.R$id;
import com.revolut.feature.apm.core.ui.impl.R$layout;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.list.ApmRecipientListScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import m12.b;
import p12.d0;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/recipients/list/ApmRecipientListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lc42/c;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ApmRecipientListScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(ApmRecipientListScreen.class, "binding", "getBinding()Lcom/revolut/feature/apm/core/ui/impl/databinding/ScreenApmRecipientListBinding;", 0))};
    public final ApmRecipientListInputData K;
    public final z L;
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public ApmRecipientListScreen(ApmRecipientListInputData inputData, z extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.K = inputData;
        this.L = extension;
        this.M = R$layout.screen_apm_recipient_list;
        this.N = true;
        this.O = s.t(this, f.f);
        this.P = w.y0(new e(8));
        this.Q = w.y0(new e(9));
        this.R = w.y0(new e(10));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: c42.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientListScreen f20984b;

            {
                this.f20984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ApmRecipientListScreen apmRecipientListScreen = this.f20984b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRecipientListScreen.V;
                        ApmRecipientListScreen apmRecipientListScreen2 = this.f20984b;
                        return dli.f.a(apmRecipientListScreen2, apmRecipientListScreen2.d(), v.k((ActionWidgetDelegate) apmRecipientListScreen2.R.getValue(), (FullScreenStateDelegate) apmRecipientListScreen2.Q.getValue(), (RowDelegate) apmRecipientListScreen2.P.getValue(), new RowLoadingDelegate()), R$id.apmRecipientList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRecipientListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRecipientListInputData apmRecipientListInputData = apmRecipientListScreen.K;
                        apmRecipientListInputData.getClass();
                        z zVar = apmRecipientListScreen.L;
                        zVar.getClass();
                        return new d0(vVar, apmRecipientListInputData, zVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmRecipientListScreen.V;
                        return (d) ((d0) apmRecipientListScreen.T.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: c42.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientListScreen f20984b;

            {
                this.f20984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ApmRecipientListScreen apmRecipientListScreen = this.f20984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRecipientListScreen.V;
                        ApmRecipientListScreen apmRecipientListScreen2 = this.f20984b;
                        return dli.f.a(apmRecipientListScreen2, apmRecipientListScreen2.d(), v.k((ActionWidgetDelegate) apmRecipientListScreen2.R.getValue(), (FullScreenStateDelegate) apmRecipientListScreen2.Q.getValue(), (RowDelegate) apmRecipientListScreen2.P.getValue(), new RowLoadingDelegate()), R$id.apmRecipientList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRecipientListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRecipientListInputData apmRecipientListInputData = apmRecipientListScreen.K;
                        apmRecipientListInputData.getClass();
                        z zVar = apmRecipientListScreen.L;
                        zVar.getClass();
                        return new d0(vVar, apmRecipientListInputData, zVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmRecipientListScreen.V;
                        return (d) ((d0) apmRecipientListScreen.T.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: c42.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ApmRecipientListScreen f20984b;

            {
                this.f20984b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ApmRecipientListScreen apmRecipientListScreen = this.f20984b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ApmRecipientListScreen.V;
                        ApmRecipientListScreen apmRecipientListScreen2 = this.f20984b;
                        return dli.f.a(apmRecipientListScreen2, apmRecipientListScreen2.d(), v.k((ActionWidgetDelegate) apmRecipientListScreen2.R.getValue(), (FullScreenStateDelegate) apmRecipientListScreen2.Q.getValue(), (RowDelegate) apmRecipientListScreen2.P.getValue(), new RowLoadingDelegate()), R$id.apmRecipientList_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ApmRecipientListScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(apmRecipientListScreen.m2()).a().get(p12.v.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", p12.v.class, " is not found"));
                        }
                        p12.v vVar = ((p12.v) aVar2.b()).K;
                        ApmRecipientListInputData apmRecipientListInputData = apmRecipientListScreen.K;
                        apmRecipientListInputData.getClass();
                        z zVar = apmRecipientListScreen.L;
                        zVar.getClass();
                        return new d0(vVar, apmRecipientListInputData, zVar);
                    default:
                        KProperty[] kPropertyArr3 = ApmRecipientListScreen.V;
                        return (d) ((d0) apmRecipientListScreen.T.getValue()).e.get();
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
    public final xki.e R1() {
        return (d0) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f201194b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        ApmRecipientListInputData apmRecipientListInputData = this.K;
        navBarWithToolbar.setToolbarTitle(apmRecipientListInputData.f62263b);
        navBarWithToolbar.setTitle(apmRecipientListInputData.f62263b, null);
        navBarWithToolbar.setSearchButtonActive(true);
        navBarWithToolbar.setHint(apmRecipientListInputData.d);
        navBarWithToolbar.setMenuItems(apmRecipientListInputData.f62267j);
        navBarWithToolbar.setSearchFieldActionButtons(apmRecipientListInputData.k);
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201194b.f59410q), null, new brc.h(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201194b.f59409p.f57337m), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201194b.o.f57403b), null, new g(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f201194b.w0()), null, new g(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new c42.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.Q.getValue()).f52371h.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionWidgetDelegate) this.R.getValue()).f51589c.f121375b), null, new g(this, continuation, 3), 3);
    }

    public final b d3() {
        ViewBinding value = this.O.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
