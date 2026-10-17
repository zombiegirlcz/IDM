package com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_embedded.impl.R$id;
import com.revolut.feature.insurance_embedded.impl.R$layout;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents.InsuranceDocumentsLayoutScreen;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.documents.InsuranceDocumentsLayoutScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lu7.o;
import lu7.s;
import rlh.c;
import rv7.b;
import rv7.d;
import rv7.h;
import rv7.i;
import rv7.j;
import te0.w;
import tx0.j0;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/screen/embedded/documents/InsuranceDocumentsLayoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrv7/h;", "Ldli/a;", "Lrv7/i;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceDocumentsLayoutScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(InsuranceDocumentsLayoutScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_embedded/impl/databinding/ScreenEmbeddedInsuranceDocumentsBinding;", 0))};
    public final InsuranceDocumentsLayoutScreenContract$InputData K;
    public final int L;
    public final FullScreenStateDelegate M;
    public final RowDelegate N;
    public final Object O;
    public final ao.h P;
    public final Object Q;
    public final Object R;

    public InsuranceDocumentsLayoutScreen(InsuranceDocumentsLayoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_embedded_insurance_documents;
        this.M = new FullScreenStateDelegate();
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDocumentsLayoutScreen f257720b;

            {
                this.f257720b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsuranceDocumentsLayoutScreen insuranceDocumentsLayoutScreen = this.f257720b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDocumentsLayoutScreen.S;
                        InsuranceDocumentsLayoutScreen insuranceDocumentsLayoutScreen2 = this.f257720b;
                        return dli.f.a(insuranceDocumentsLayoutScreen2, (j) insuranceDocumentsLayoutScreen2.R.getValue(), v.k(insuranceDocumentsLayoutScreen2.M, insuranceDocumentsLayoutScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.embeddedInsuranceDocuments_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDocumentsLayoutScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceDocumentsLayoutScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        InsuranceDocumentsLayoutScreenContract$InputData insuranceDocumentsLayoutScreenContract$InputData = insuranceDocumentsLayoutScreen.K;
                        insuranceDocumentsLayoutScreenContract$InputData.getClass();
                        return new o(sVar, insuranceDocumentsLayoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDocumentsLayoutScreen.S;
                        return (j) ((o) insuranceDocumentsLayoutScreen.Q.getValue()).d.get();
                }
            }
        });
        this.P = vc.s.t(this, b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: rv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDocumentsLayoutScreen f257720b;

            {
                this.f257720b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsuranceDocumentsLayoutScreen insuranceDocumentsLayoutScreen = this.f257720b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDocumentsLayoutScreen.S;
                        InsuranceDocumentsLayoutScreen insuranceDocumentsLayoutScreen2 = this.f257720b;
                        return dli.f.a(insuranceDocumentsLayoutScreen2, (j) insuranceDocumentsLayoutScreen2.R.getValue(), v.k(insuranceDocumentsLayoutScreen2.M, insuranceDocumentsLayoutScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.embeddedInsuranceDocuments_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDocumentsLayoutScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceDocumentsLayoutScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        InsuranceDocumentsLayoutScreenContract$InputData insuranceDocumentsLayoutScreenContract$InputData = insuranceDocumentsLayoutScreen.K;
                        insuranceDocumentsLayoutScreenContract$InputData.getClass();
                        return new o(sVar, insuranceDocumentsLayoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDocumentsLayoutScreen.S;
                        return (j) ((o) insuranceDocumentsLayoutScreen.Q.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: rv7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDocumentsLayoutScreen f257720b;

            {
                this.f257720b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsuranceDocumentsLayoutScreen insuranceDocumentsLayoutScreen = this.f257720b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDocumentsLayoutScreen.S;
                        InsuranceDocumentsLayoutScreen insuranceDocumentsLayoutScreen2 = this.f257720b;
                        return dli.f.a(insuranceDocumentsLayoutScreen2, (j) insuranceDocumentsLayoutScreen2.R.getValue(), v.k(insuranceDocumentsLayoutScreen2.M, insuranceDocumentsLayoutScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.embeddedInsuranceDocuments_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDocumentsLayoutScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceDocumentsLayoutScreen.m2()).a().get(s.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", s.class, " is not found"));
                        }
                        s sVar = ((s) aVar2.b()).o;
                        InsuranceDocumentsLayoutScreenContract$InputData insuranceDocumentsLayoutScreenContract$InputData = insuranceDocumentsLayoutScreen.K;
                        insuranceDocumentsLayoutScreenContract$InputData.getClass();
                        return new o(sVar, insuranceDocumentsLayoutScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDocumentsLayoutScreen.S;
                        return (j) ((o) insuranceDocumentsLayoutScreen.Q.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        FixedTabs fixedTabs = d3().f168532c;
        List list = uiState.d;
        TextClause textClause = uiState.f257727b;
        fixedTabs.setItems(list, uiState.e);
        FixedTabs embeddedInsuranceDocumentsTabs = d3().f168532c;
        Intrinsics.checkNotNullExpressionValue(embeddedInsuranceDocumentsTabs, "embeddedInsuranceDocumentsTabs");
        embeddedInsuranceDocumentsTabs.setVisibility(uiState.f ? 0 : 8);
        d3().f168531b.setLoadingVisible(uiState.f257728c);
        NavBarWithToolbar navBarWithToolbar = d3().f168531b;
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (j) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f168531b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f168531b.f59410q), null, new c(this, null, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f168532c.f), null, new rt4.o(this, null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new r7b.e(rd0.e.b(this.M.f52371h.f121375b), 21), null, new rv7.e(this, null), 3);
    }

    public final iu7.c d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (iu7.c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
