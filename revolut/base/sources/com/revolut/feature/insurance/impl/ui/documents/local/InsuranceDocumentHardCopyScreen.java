package com.revolut.feature.insurance.impl.ui.documents.local;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bl7.b;
import bl7.c;
import bl7.e;
import bl7.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.documents.local.InsuranceDocumentHardCopyScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/documents/local/InsuranceDocumentHardCopyScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lbl7/c;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceDocumentHardCopyScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(InsuranceDocumentHardCopyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final b K;
    public final Object L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public InsuranceDocumentHardCopyScreen(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = w.y0(new bkd.a(7));
        this.M = s.t(this, e.f);
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: bl7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDocumentHardCopyScreen f16490b;

            {
                this.f16490b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsuranceDocumentHardCopyScreen insuranceDocumentHardCopyScreen = this.f16490b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDocumentHardCopyScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceDocumentHardCopyScreen.m2()).a().get(ej7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ej7.a.class, " is not found"));
                        }
                        ej7.a aVar3 = ((ej7.a) aVar2.b()).f126765g;
                        b bVar = insuranceDocumentHardCopyScreen.K;
                        bVar.getClass();
                        return new ej7.b(aVar3, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDocumentHardCopyScreen.R;
                        return (f) ((ej7.b) insuranceDocumentHardCopyScreen.O.getValue()).f126773b.get();
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDocumentHardCopyScreen.R;
                        InsuranceDocumentHardCopyScreen insuranceDocumentHardCopyScreen2 = this.f16490b;
                        return dli.f.a(insuranceDocumentHardCopyScreen2, (f) insuranceDocumentHardCopyScreen2.P.getValue(), u.c((ListCellDelegate) insuranceDocumentHardCopyScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: bl7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDocumentHardCopyScreen f16490b;

            {
                this.f16490b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsuranceDocumentHardCopyScreen insuranceDocumentHardCopyScreen = this.f16490b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDocumentHardCopyScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceDocumentHardCopyScreen.m2()).a().get(ej7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ej7.a.class, " is not found"));
                        }
                        ej7.a aVar3 = ((ej7.a) aVar2.b()).f126765g;
                        b bVar = insuranceDocumentHardCopyScreen.K;
                        bVar.getClass();
                        return new ej7.b(aVar3, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDocumentHardCopyScreen.R;
                        return (f) ((ej7.b) insuranceDocumentHardCopyScreen.O.getValue()).f126773b.get();
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDocumentHardCopyScreen.R;
                        InsuranceDocumentHardCopyScreen insuranceDocumentHardCopyScreen2 = this.f16490b;
                        return dli.f.a(insuranceDocumentHardCopyScreen2, (f) insuranceDocumentHardCopyScreen2.P.getValue(), u.c((ListCellDelegate) insuranceDocumentHardCopyScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: bl7.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceDocumentHardCopyScreen f16490b;

            {
                this.f16490b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsuranceDocumentHardCopyScreen insuranceDocumentHardCopyScreen = this.f16490b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceDocumentHardCopyScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceDocumentHardCopyScreen.m2()).a().get(ej7.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", ej7.a.class, " is not found"));
                        }
                        ej7.a aVar3 = ((ej7.a) aVar2.b()).f126765g;
                        b bVar = insuranceDocumentHardCopyScreen.K;
                        bVar.getClass();
                        return new ej7.b(aVar3, bVar);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceDocumentHardCopyScreen.R;
                        return (f) ((ej7.b) insuranceDocumentHardCopyScreen.O.getValue()).f126773b.get();
                    default:
                        KProperty[] kPropertyArr3 = InsuranceDocumentHardCopyScreen.R;
                        InsuranceDocumentHardCopyScreen insuranceDocumentHardCopyScreen2 = this.f16490b;
                        return dli.f.a(insuranceDocumentHardCopyScreen2, (f) insuranceDocumentHardCopyScreen2.P.getValue(), u.c((ListCellDelegate) insuranceDocumentHardCopyScreen2.L.getValue()), R$id.recyclerView, null, null, null, 56);
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
        return (ej7.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.insurance_documents_demands_and_needs_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new bf5.a(this, null, 12), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
