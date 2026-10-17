package com.revolut.feature.selfserve.sot.impl.ui.description;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.impl.ui.description.AddDescriptionController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import java.util.List;
import jyc.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import qyc.f;
import qyc.g;
import qyc.l;
import qyc.m;
import qyc.n;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/description/AddDescriptionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lqyc/l;", "Ldli/a;", "Lqyc/m;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddDescriptionController extends ViewController<l> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AddDescriptionController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final String K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AddDescriptionController(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.K = description;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, f.f);
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: qyc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddDescriptionController f250274b;

            {
                this.f250274b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddDescriptionController addDescriptionController = this.f250274b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddDescriptionController.R;
                        phm.a aVar = (phm.a) ue0.e.j(addDescriptionController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.a aVarC = ((r) aVar2.b()).c();
                        String str = addDescriptionController.K;
                        str.getClass();
                        aVarC.f250812b = str;
                        aVarC.f250811a = addDescriptionController;
                        return (jyc.a) aVarC.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AddDescriptionController.R;
                        return new n(((jyc.a) addDescriptionController.O.getValue()).f179362a, new at.r(new o()));
                    default:
                        KProperty[] kPropertyArr3 = AddDescriptionController.R;
                        AddDescriptionController addDescriptionController2 = this.f250274b;
                        return dli.f.a(addDescriptionController2, (n) addDescriptionController2.P.getValue(), u.c(addDescriptionController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qyc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddDescriptionController f250274b;

            {
                this.f250274b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddDescriptionController addDescriptionController = this.f250274b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddDescriptionController.R;
                        phm.a aVar = (phm.a) ue0.e.j(addDescriptionController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.a aVarC = ((r) aVar2.b()).c();
                        String str = addDescriptionController.K;
                        str.getClass();
                        aVarC.f250812b = str;
                        aVarC.f250811a = addDescriptionController;
                        return (jyc.a) aVarC.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AddDescriptionController.R;
                        return new n(((jyc.a) addDescriptionController.O.getValue()).f179362a, new at.r(new o()));
                    default:
                        KProperty[] kPropertyArr3 = AddDescriptionController.R;
                        AddDescriptionController addDescriptionController2 = this.f250274b;
                        return dli.f.a(addDescriptionController2, (n) addDescriptionController2.P.getValue(), u.c(addDescriptionController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qyc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddDescriptionController f250274b;

            {
                this.f250274b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddDescriptionController addDescriptionController = this.f250274b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddDescriptionController.R;
                        phm.a aVar = (phm.a) ue0.e.j(addDescriptionController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.a aVarC = ((r) aVar2.b()).c();
                        String str = addDescriptionController.K;
                        str.getClass();
                        aVarC.f250812b = str;
                        aVarC.f250811a = addDescriptionController;
                        return (jyc.a) aVarC.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AddDescriptionController.R;
                        return new n(((jyc.a) addDescriptionController.O.getValue()).f179362a, new at.r(new o()));
                    default:
                        KProperty[] kPropertyArr3 = AddDescriptionController.R;
                        AddDescriptionController addDescriptionController2 = this.f250274b;
                        return dli.f.a(addDescriptionController2, (n) addDescriptionController2.P.getValue(), u.c(addDescriptionController2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f250279b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jyc.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (n) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.sot_source_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.sot_source_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174564b.setText(new TextLocalisedClause(R$string.sot_description_add_description, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.e.f121375b), new qyc.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new g(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }

    public AddDescriptionController() {
        this("");
    }
}
