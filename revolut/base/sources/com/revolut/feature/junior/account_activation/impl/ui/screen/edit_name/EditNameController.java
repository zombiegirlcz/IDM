package com.revolut.feature.junior.account_activation.impl.ui.screen.edit_name;

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
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_name.EditNameController;
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_name.EditNameControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l68.b;
import l68.c;
import l68.d;
import l68.g;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import z58.i;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/edit_name/EditNameController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll68/g;", "Ldli/a;", "Ll68/h;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditNameController extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EditNameController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EditNameControllerContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final Lazy O;
    public final Lazy P;
    public final Object Q;
    public final Object R;

    public EditNameController(EditNameControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = j.b(new Function0(this) { // from class: l68.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditNameController f192360b;

            {
                this.f192360b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditNameController editNameController = this.f192360b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditNameController.S;
                        phm.a aVar = (phm.a) ue0.e.j(editNameController.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        z58.j jVar = ((z58.j) aVar2.b()).o;
                        EditNameControllerContract$InputData editNameControllerContract$InputData = editNameController.K;
                        editNameControllerContract$InputData.getClass();
                        return new z58.i(jVar, editNameControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditNameController.S;
                        return (i) ((z58.i) editNameController.O.getValue()).f319572c.get();
                    default:
                        KProperty[] kPropertyArr3 = EditNameController.S;
                        EditNameController editNameController2 = this.f192360b;
                        return dli.f.a(editNameController2, (i) editNameController2.P.getValue(), u.c((InputTextDelegate) editNameController2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = j.b(new Function0(this) { // from class: l68.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditNameController f192360b;

            {
                this.f192360b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditNameController editNameController = this.f192360b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditNameController.S;
                        phm.a aVar = (phm.a) ue0.e.j(editNameController.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        z58.j jVar = ((z58.j) aVar2.b()).o;
                        EditNameControllerContract$InputData editNameControllerContract$InputData = editNameController.K;
                        editNameControllerContract$InputData.getClass();
                        return new z58.i(jVar, editNameControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditNameController.S;
                        return (i) ((z58.i) editNameController.O.getValue()).f319572c.get();
                    default:
                        KProperty[] kPropertyArr3 = EditNameController.S;
                        EditNameController editNameController2 = this.f192360b;
                        return dli.f.a(editNameController2, (i) editNameController2.P.getValue(), u.c((InputTextDelegate) editNameController2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
        this.Q = w.y0(new kw4.b(18));
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: l68.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditNameController f192360b;

            {
                this.f192360b = this;
            }

            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditNameController editNameController = this.f192360b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditNameController.S;
                        phm.a aVar = (phm.a) ue0.e.j(editNameController.m2()).a().get(o58.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o58.a.class, " is not found"));
                        }
                        z58.j jVar = ((z58.j) aVar2.b()).o;
                        EditNameControllerContract$InputData editNameControllerContract$InputData = editNameController.K;
                        editNameControllerContract$InputData.getClass();
                        return new z58.i(jVar, editNameControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = EditNameController.S;
                        return (i) ((z58.i) editNameController.O.getValue()).f319572c.get();
                    default:
                        KProperty[] kPropertyArr3 = EditNameController.S;
                        EditNameController editNameController2 = this.f192360b;
                        return dli.f.a(editNameController2, (i) editNameController2.P.getValue(), u.c((InputTextDelegate) editNameController2.Q.getValue()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l68.h uiState = (l68.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        jii.u uVarD3 = d3();
        NavBarWithToolbar navBarWithToolbar = uVarD3.f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f192367b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        NavBarWithToolbar navBarWithToolbar2 = uVarD3.f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar2, "navBarWithToolbar");
        navBarWithToolbar2.setTitle(textLocalisedClause, null);
        navBarWithToolbar2.setDescriptionVisible(false);
        LargeActionButton largeActionButton = uVarD3.f174564b;
        largeActionButton.setText(uiState.d);
        largeActionButton.setEnabled(uiState.f192368c);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (l68.i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setLoadingButtonTag("BUTTON_TAG_UPDATE_PROFILE_NAME");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 1), 3);
        r rVarDistinctUntilChanged = ((InputTextDelegate) this.Q.getValue()).e.f121375b.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
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
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
