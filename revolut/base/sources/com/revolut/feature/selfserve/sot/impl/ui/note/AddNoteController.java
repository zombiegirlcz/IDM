package com.revolut.feature.selfserve.sot.impl.ui.note;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import azc.f;
import azc.g;
import azc.l;
import azc.m;
import azc.n;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.selfserve.core.R$string;
import com.revolut.feature.selfserve.sot.impl.ui.note.AddNoteController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import java.util.List;
import jyc.b;
import jyc.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/note/AddNoteController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lazc/l;", "Ldli/a;", "Lazc/m;", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddNoteController extends ViewController<l> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AddNoteController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final String K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AddNoteController(String currentNote) {
        Intrinsics.checkNotNullParameter(currentNote, "currentNote");
        this.K = currentNote;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, f.f);
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: azc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNoteController f11431b;

            {
                this.f11431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddNoteController addNoteController = this.f11431b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddNoteController.R;
                        phm.a aVar = (phm.a) ue0.e.j(addNoteController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.d dVarD = ((r) aVar2.b()).d();
                        String str = addNoteController.K;
                        str.getClass();
                        dVarD.f250819b = str;
                        dVarD.f250818a = addNoteController;
                        return (jyc.b) dVarD.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AddNoteController.R;
                        return new n(((jyc.b) addNoteController.O.getValue()).f179363a, new at.r(new o()));
                    default:
                        KProperty[] kPropertyArr3 = AddNoteController.R;
                        AddNoteController addNoteController2 = this.f11431b;
                        return dli.f.a(addNoteController2, (n) addNoteController2.P.getValue(), u.c(addNoteController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: azc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNoteController f11431b;

            {
                this.f11431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddNoteController addNoteController = this.f11431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddNoteController.R;
                        phm.a aVar = (phm.a) ue0.e.j(addNoteController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.d dVarD = ((r) aVar2.b()).d();
                        String str = addNoteController.K;
                        str.getClass();
                        dVarD.f250819b = str;
                        dVarD.f250818a = addNoteController;
                        return (jyc.b) dVarD.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AddNoteController.R;
                        return new n(((jyc.b) addNoteController.O.getValue()).f179363a, new at.r(new o()));
                    default:
                        KProperty[] kPropertyArr3 = AddNoteController.R;
                        AddNoteController addNoteController2 = this.f11431b;
                        return dli.f.a(addNoteController2, (n) addNoteController2.P.getValue(), u.c(addNoteController2.N), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: azc.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNoteController f11431b;

            {
                this.f11431b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddNoteController addNoteController = this.f11431b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddNoteController.R;
                        phm.a aVar = (phm.a) ue0.e.j(addNoteController.m2()).a().get(gyc.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", gyc.a.class, " is not found"));
                        }
                        r10.d dVarD = ((r) aVar2.b()).d();
                        String str = addNoteController.K;
                        str.getClass();
                        dVarD.f250819b = str;
                        dVarD.f250818a = addNoteController;
                        return (jyc.b) dVarD.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AddNoteController.R;
                        return new n(((jyc.b) addNoteController.O.getValue()).f179363a, new at.r(new o()));
                    default:
                        KProperty[] kPropertyArr3 = AddNoteController.R;
                        AddNoteController addNoteController2 = this.f11431b;
                        return dli.f.a(addNoteController2, (n) addNoteController2.P.getValue(), u.c(addNoteController2.N), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f11437b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.sot_note_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.sot_note_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        d3().f174564b.setText(new TextLocalisedClause(R$string.sot_note_add_note, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.e.f121375b), new azc.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new g(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
