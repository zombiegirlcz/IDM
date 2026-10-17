package com.revolut.feature.tab.accounts.impl.ui.remove_account.remove_account_controller;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.api.remove_account.RemoveAccountContract$InputData;
import com.revolut.feature.tab.accounts.impl.ui.remove_account.remove_account_controller.RemoveAccountController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tge.d;
import vc.s;
import vge.t3;
import xfe.e;
import yhe.b;
import yhe.f;
import yhe.l;
import zhe.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/remove_account/remove_account_controller/RemoveAccountController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lxfe/e;", "Ldli/a;", "Lyhe/f;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RemoveAccountController extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(RemoveAccountController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final RemoveAccountContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public RemoveAccountController(RemoveAccountContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_bottom_sheet_base;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: yhe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RemoveAccountController f313912b;

            {
                this.f313912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RemoveAccountController removeAccountController = this.f313912b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RemoveAccountController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(removeAccountController.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.g gVar = (ehe.g) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(TabAccountsMode.Home.f89466a).i().mo3808a(removeAccountController);
                        RemoveAccountContract$InputData removeAccountContract$InputData = removeAccountController.K;
                        switch (gVar.f126038a) {
                            case 0:
                                removeAccountContract$InputData.getClass();
                                gVar.d = removeAccountContract$InputData;
                                break;
                            default:
                                removeAccountContract$InputData.getClass();
                                gVar.d = removeAccountContract$InputData;
                                break;
                        }
                        return (zhe.c) gVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = RemoveAccountController.Q;
                        return ((zhe.c) removeAccountController.N.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = RemoveAccountController.Q;
                        RemoveAccountController removeAccountController2 = this.f313912b;
                        return dli.f.a(removeAccountController2, (e) removeAccountController2.O.getValue(), m72.b.v(null, null, 7), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: yhe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RemoveAccountController f313912b;

            {
                this.f313912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RemoveAccountController removeAccountController = this.f313912b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RemoveAccountController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(removeAccountController.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.g gVar = (ehe.g) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(TabAccountsMode.Home.f89466a).i().mo3808a(removeAccountController);
                        RemoveAccountContract$InputData removeAccountContract$InputData = removeAccountController.K;
                        switch (gVar.f126038a) {
                            case 0:
                                removeAccountContract$InputData.getClass();
                                gVar.d = removeAccountContract$InputData;
                                break;
                            default:
                                removeAccountContract$InputData.getClass();
                                gVar.d = removeAccountContract$InputData;
                                break;
                        }
                        return (zhe.c) gVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = RemoveAccountController.Q;
                        return ((zhe.c) removeAccountController.N.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = RemoveAccountController.Q;
                        RemoveAccountController removeAccountController2 = this.f313912b;
                        return dli.f.a(removeAccountController2, (e) removeAccountController2.O.getValue(), m72.b.v(null, null, 7), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: yhe.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RemoveAccountController f313912b;

            {
                this.f313912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                RemoveAccountController removeAccountController = this.f313912b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RemoveAccountController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(removeAccountController.m2()).a().get(ige.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ige.a.class, " is not found"));
                        }
                        ehe.g gVar = (ehe.g) ((rge.b) ((jge.m) aVar2.b()).f174022n.get()).b(TabAccountsMode.Home.f89466a).i().mo3808a(removeAccountController);
                        RemoveAccountContract$InputData removeAccountContract$InputData = removeAccountController.K;
                        switch (gVar.f126038a) {
                            case 0:
                                removeAccountContract$InputData.getClass();
                                gVar.d = removeAccountContract$InputData;
                                break;
                            default:
                                removeAccountContract$InputData.getClass();
                                gVar.d = removeAccountContract$InputData;
                                break;
                        }
                        return (zhe.c) gVar.mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = RemoveAccountController.Q;
                        return ((zhe.c) removeAccountController.N.getValue()).a();
                    default:
                        KProperty[] kPropertyArr3 = RemoveAccountController.Q;
                        RemoveAccountController removeAccountController2 = this.f313912b;
                        return dli.f.a(removeAccountController2, (e) removeAccountController2.O.getValue(), m72.b.v(null, null, 7), R$id.bottomSheetControllerBase_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        jii.e eVarD3 = d3();
        eVarD3.f174514c.setHeaderModel(uiState.f313916a);
        ActionFooterView bottomSheetControllerBaseFooterView = eVarD3.f174513b;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
        i iVar = uiState.f313917b;
        bottomSheetControllerBaseFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseFooterView, "bottomSheetControllerBaseFooterView");
            bottomSheetControllerBaseFooterView.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (yhe.e) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView bottomSheetControllerBaseRecyclerView = d3().d;
        Intrinsics.checkNotNullExpressionValue(bottomSheetControllerBaseRecyclerView, "bottomSheetControllerBaseRecyclerView");
        bottomSheetControllerBaseRecyclerView.setVisibility(0);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174513b.f58955g), null, new yhe.c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174513b.f), null, new yhe.c(this, null, 1), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final void g1(boolean z) {
        super.g1(z);
        l lVar = (l) ((yhe.e) this.O.getValue());
        if (z) {
            lVar.getClass();
            return;
        }
        ((t3) lVar.f313923r).w(d.a.f271166a);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
