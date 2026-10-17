package com.revolut.feature.onboarding.impl.onboarding.contractual_documentation.screen;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.onboarding.impl.R$string;
import com.revolut.feature.onboarding.impl.onboarding.contractual_documentation.screen.ContractualDocsContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.contractual_documentation.screen.ContractualDocsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kji.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nuh.j;
import oa9.c;
import oa9.e;
import pki.b;
import ta9.g;
import ta9.m;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/contractual_documentation/screen/ContractualDocsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Loa9/c;", "Lkji/f;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ContractualDocsController extends ViewController<q> implements a, f {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(ContractualDocsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ContractualDocsContract$InputData K;
    public final Object L;
    public final Object M;
    public final RowDelegate N;
    public final FullScreenStateDelegate O;
    public final Object P;
    public final int Q;
    public final h R;

    public ContractualDocsController(ContractualDocsContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: oa9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContractualDocsController f223548b;

            {
                this.f223548b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ContractualDocsController contractualDocsController = this.f223548b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ContractualDocsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(contractualDocsController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        ContractualDocsContract$InputData contractualDocsContract$InputData = contractualDocsController.K;
                        contractualDocsContract$InputData.getClass();
                        return new ta9.g(mVar, contractualDocsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ContractualDocsController.S;
                        return (b) ((ta9.g) contractualDocsController.L.getValue()).f269207b.get();
                    default:
                        KProperty[] kPropertyArr3 = ContractualDocsController.S;
                        ContractualDocsController contractualDocsController2 = this.f223548b;
                        return dli.f.a(contractualDocsController2, (b) contractualDocsController2.M.getValue(), v.k(new RowLoadingDelegate(), contractualDocsController2.O, contractualDocsController2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: oa9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContractualDocsController f223548b;

            {
                this.f223548b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ContractualDocsController contractualDocsController = this.f223548b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ContractualDocsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(contractualDocsController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        ContractualDocsContract$InputData contractualDocsContract$InputData = contractualDocsController.K;
                        contractualDocsContract$InputData.getClass();
                        return new ta9.g(mVar, contractualDocsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ContractualDocsController.S;
                        return (b) ((ta9.g) contractualDocsController.L.getValue()).f269207b.get();
                    default:
                        KProperty[] kPropertyArr3 = ContractualDocsController.S;
                        ContractualDocsController contractualDocsController2 = this.f223548b;
                        return dli.f.a(contractualDocsController2, (b) contractualDocsController2.M.getValue(), v.k(new RowLoadingDelegate(), contractualDocsController2.O, contractualDocsController2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = new RowDelegate(null, null, 7);
        this.O = new FullScreenStateDelegate();
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: oa9.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ContractualDocsController f223548b;

            {
                this.f223548b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ContractualDocsController contractualDocsController = this.f223548b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ContractualDocsController.S;
                        phm.a aVar = (phm.a) ue0.e.j(contractualDocsController.m2()).a().get(m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", m.class, " is not found"));
                        }
                        m mVar = ((m) aVar2.b()).O;
                        ContractualDocsContract$InputData contractualDocsContract$InputData = contractualDocsController.K;
                        contractualDocsContract$InputData.getClass();
                        return new ta9.g(mVar, contractualDocsContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ContractualDocsController.S;
                        return (b) ((ta9.g) contractualDocsController.L.getValue()).f269207b.get();
                    default:
                        KProperty[] kPropertyArr3 = ContractualDocsController.S;
                        ContractualDocsController contractualDocsController2 = this.f223548b;
                        return dli.f.a(contractualDocsController2, (b) contractualDocsController2.M.getValue(), v.k(new RowLoadingDelegate(), contractualDocsController2.O, contractualDocsController2.N), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = R$layout.screen_recycler_navbar;
        this.R = s.t(this, e.f);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (oa9.b) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.disclosure_pt_documents_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        this.z = true;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.R.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new j(this, null, 23), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new oa9.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new oa9.g(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
