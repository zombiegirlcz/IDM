package com.revolut.feature.insurance_credit.impl.ui.screen.documents;

import aii.q;
import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance_credit.impl.R$id;
import com.revolut.feature.insurance_credit.impl.R$layout;
import com.revolut.feature.insurance_credit.impl.ui.screen.documents.DocumentsScreen;
import com.revolut.feature.insurance_credit.impl.ui.screen.documents.DocumentsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import wt7.b;
import wt7.d;
import wt7.g;
import wt7.i;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_credit/impl/ui/screen/documents/DocumentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwt7/g;", "Lno/m;", "feature_insurance_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentsScreen extends ViewController<q> implements a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DocumentsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_credit/impl/databinding/ScreenInsuranceDocumentsLayoutBinding;", 0))};
    public final DocumentsScreenContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final int M;
    public final FullScreenStateDelegate N;
    public final RowDelegate O;
    public final Object P;
    public final h Q;
    public final Object R;
    public final Object S;

    public DocumentsScreen(DocumentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.M = R$layout.screen_insurance_documents_layout;
        this.N = new FullScreenStateDelegate();
        this.O = new RowDelegate(null, null, 7);
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: wt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsScreen f299825b;

            {
                this.f299825b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DocumentsScreen documentsScreen = this.f299825b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsScreen.T;
                        DocumentsScreen documentsScreen2 = this.f299825b;
                        return dli.f.a(documentsScreen2, (i) documentsScreen2.S.getValue(), v.k(documentsScreen2.N, documentsScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.creditInsuranceDocuments_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsScreen.T;
                        qji.b bVarU2 = documentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.documents.di.DocumentsScreenInjector");
                        bt7.j jVar = (bt7.j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        bt7.j jVar2 = jVar.f18443c;
                        DocumentsScreenContract$InputData documentsScreenContract$InputData = documentsScreen.K;
                        documentsScreenContract$InputData.getClass();
                        return new bt7.g(iVar, jVar2, documentsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DocumentsScreen.T;
                        return (i) ((bt7.g) documentsScreen.R.getValue()).d.get();
                }
            }
        });
        this.Q = s.t(this, b.f);
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: wt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsScreen f299825b;

            {
                this.f299825b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DocumentsScreen documentsScreen = this.f299825b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsScreen.T;
                        DocumentsScreen documentsScreen2 = this.f299825b;
                        return dli.f.a(documentsScreen2, (i) documentsScreen2.S.getValue(), v.k(documentsScreen2.N, documentsScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.creditInsuranceDocuments_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsScreen.T;
                        qji.b bVarU2 = documentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.documents.di.DocumentsScreenInjector");
                        bt7.j jVar = (bt7.j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        bt7.j jVar2 = jVar.f18443c;
                        DocumentsScreenContract$InputData documentsScreenContract$InputData = documentsScreen.K;
                        documentsScreenContract$InputData.getClass();
                        return new bt7.g(iVar, jVar2, documentsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DocumentsScreen.T;
                        return (i) ((bt7.g) documentsScreen.R.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: wt7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DocumentsScreen f299825b;

            {
                this.f299825b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DocumentsScreen documentsScreen = this.f299825b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DocumentsScreen.T;
                        DocumentsScreen documentsScreen2 = this.f299825b;
                        return dli.f.a(documentsScreen2, (i) documentsScreen2.S.getValue(), v.k(documentsScreen2.N, documentsScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate()), R$id.creditInsuranceDocuments_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DocumentsScreen.T;
                        qji.b bVarU2 = documentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.insurance_credit.impl.ui.screen.documents.di.DocumentsScreenInjector");
                        bt7.j jVar = (bt7.j) bVarU2;
                        bt7.i iVar = jVar.f18442b;
                        bt7.j jVar2 = jVar.f18443c;
                        DocumentsScreenContract$InputData documentsScreenContract$InputData = documentsScreen.K;
                        documentsScreenContract$InputData.getClass();
                        return new bt7.g(iVar, jVar2, documentsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = DocumentsScreen.T;
                        return (i) ((bt7.g) documentsScreen.R.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        FixedTabs fixedTabs = d3().f324823c;
        List list = uiState.d;
        TextClause textClause = uiState.f299830b;
        fixedTabs.setItems(list, uiState.e);
        fixedTabs.setVisibility(uiState.f ? 0 : 8);
        NavBarWithToolbar navBarWithToolbar = d3().f324822b;
        navBarWithToolbar.setLoadingVisible(uiState.f299831c);
        navBarWithToolbar.setToolbarTitle(textClause);
        navBarWithToolbar.setTitle(textClause, null);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (bt7.g) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f324822b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f324822b.f59410q), new wkg.e(this, continuation, 13), 3);
        ViewController.P2(this, rd0.e.b(d3().f324823c.f), new wka.e(this, continuation, 25), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new d(this, null), 3);
        ViewController.P2(this, new wa3.d(rd0.e.b(this.N.f52371h.f121375b), 25), new wt7.e(this, null), 3);
    }

    public final zs7.b d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (zs7.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
