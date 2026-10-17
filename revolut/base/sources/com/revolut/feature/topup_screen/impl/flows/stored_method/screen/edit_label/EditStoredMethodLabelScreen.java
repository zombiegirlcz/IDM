package com.revolut.feature.topup_screen.impl.flows.stored_method.screen.edit_label;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.edit_label.EditStoredMethodLabelScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qve.z;
import ste.e;
import te0.w;
import vc.s;
import yxe.b;
import yxe.c;
import yxe.d;
import yxe.g;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/stored_method/screen/edit_label/EditStoredMethodLabelScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lste/e;", "Ldli/a;", "Lyxe/h;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditStoredMethodLabelScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EditStoredMethodLabelScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EditStoredMethodLabelDescriptor$InputData K;
    public final int L;
    public final InputTextDelegate M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public EditStoredMethodLabelScreen(EditStoredMethodLabelDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = new InputTextDelegate(null);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditStoredMethodLabelScreen f317666b;

            {
                this.f317666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditStoredMethodLabelScreen editStoredMethodLabelScreen = this.f317666b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditStoredMethodLabelScreen.R;
                        EditStoredMethodLabelScreen editStoredMethodLabelScreen2 = this.f317666b;
                        return dli.f.a(editStoredMethodLabelScreen2, editStoredMethodLabelScreen2.R2(), u.c(editStoredMethodLabelScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EditStoredMethodLabelScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(editStoredMethodLabelScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (qve.u) ((zxe.a) ((zxe.b) aVar2.b()).b().mo3808a(editStoredMethodLabelScreen)).F(editStoredMethodLabelScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = EditStoredMethodLabelScreen.R;
                        qve.u uVar = (qve.u) editStoredMethodLabelScreen.P.getValue();
                        switch (uVar.f249659a) {
                            case 0:
                                return (g) uVar.d.get();
                            default:
                                return (g) uVar.d.get();
                        }
                }
            }
        });
        this.O = s.t(this, b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: yxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditStoredMethodLabelScreen f317666b;

            {
                this.f317666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditStoredMethodLabelScreen editStoredMethodLabelScreen = this.f317666b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditStoredMethodLabelScreen.R;
                        EditStoredMethodLabelScreen editStoredMethodLabelScreen2 = this.f317666b;
                        return dli.f.a(editStoredMethodLabelScreen2, editStoredMethodLabelScreen2.R2(), u.c(editStoredMethodLabelScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EditStoredMethodLabelScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(editStoredMethodLabelScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (qve.u) ((zxe.a) ((zxe.b) aVar2.b()).b().mo3808a(editStoredMethodLabelScreen)).F(editStoredMethodLabelScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = EditStoredMethodLabelScreen.R;
                        qve.u uVar = (qve.u) editStoredMethodLabelScreen.P.getValue();
                        switch (uVar.f249659a) {
                            case 0:
                                return (g) uVar.d.get();
                            default:
                                return (g) uVar.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: yxe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditStoredMethodLabelScreen f317666b;

            {
                this.f317666b = this;
            }

            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditStoredMethodLabelScreen editStoredMethodLabelScreen = this.f317666b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditStoredMethodLabelScreen.R;
                        EditStoredMethodLabelScreen editStoredMethodLabelScreen2 = this.f317666b;
                        return dli.f.a(editStoredMethodLabelScreen2, editStoredMethodLabelScreen2.R2(), u.c(editStoredMethodLabelScreen2.M), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EditStoredMethodLabelScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(editStoredMethodLabelScreen.m2()).a().get(z.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (qve.u) ((zxe.a) ((zxe.b) aVar2.b()).b().mo3808a(editStoredMethodLabelScreen)).F(editStoredMethodLabelScreen.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", z.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = EditStoredMethodLabelScreen.R;
                        qve.u uVar = (qve.u) editStoredMethodLabelScreen.P.getValue();
                        switch (uVar.f249659a) {
                            case 0:
                                return (g) uVar.d.get();
                            default:
                                return (g) uVar.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        yxe.h uiState = (yxe.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f317671b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (qve.u) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_stored_account_edit_label_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_save, null, null, 14));
        largeActionButton.setTag("BUTTON_TAG_SAVE_LABEL");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        InputTextDelegate inputTextDelegate = this.M;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.i.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new yxe.e(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
