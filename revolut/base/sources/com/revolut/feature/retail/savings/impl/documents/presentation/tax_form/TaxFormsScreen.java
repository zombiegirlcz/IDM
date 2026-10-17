package com.revolut.feature.retail.savings.impl.documents.presentation.tax_form;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.impl.documents.presentation.tax_form.TaxFormsScreen;
import com.revolut.feature.vaults.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import efm.r;
import fnb.g;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import pnb.d;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/documents/presentation/tax_form/TaxFormsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpnb/d;", "<init>", "()V", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxFormsScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TaxFormsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public TaxFormsScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: pnb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxFormsScreen f237680b;

            {
                this.f237680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxFormsScreen taxFormsScreen = this.f237680b;
                switch (i2) {
                    case 0:
                        ViewBinding value = taxFormsScreen.L.getValue(taxFormsScreen, TaxFormsScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((m) value).f174539b;
                    case 1:
                        KProperty[] kPropertyArr = TaxFormsScreen.S;
                        TaxFormsScreen taxFormsScreen2 = this.f237680b;
                        return dli.f.a(taxFormsScreen2, (h) taxFormsScreen2.R.getValue(), v.k(taxFormsScreen2.O, taxFormsScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr2 = TaxFormsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(taxFormsScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        fnb.g gVar = new fnb.g();
                        gVar.f136611a = e4m.b.b(new eyd.v(eVar, 26));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = TaxFormsScreen.S;
                        return (h) ((fnb.g) taxFormsScreen.Q.getValue()).f136611a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: pnb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxFormsScreen f237680b;

            {
                this.f237680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxFormsScreen taxFormsScreen = this.f237680b;
                switch (i22) {
                    case 0:
                        ViewBinding value = taxFormsScreen.L.getValue(taxFormsScreen, TaxFormsScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((m) value).f174539b;
                    case 1:
                        KProperty[] kPropertyArr = TaxFormsScreen.S;
                        TaxFormsScreen taxFormsScreen2 = this.f237680b;
                        return dli.f.a(taxFormsScreen2, (h) taxFormsScreen2.R.getValue(), v.k(taxFormsScreen2.O, taxFormsScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr2 = TaxFormsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(taxFormsScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        fnb.g gVar = new fnb.g();
                        gVar.f136611a = e4m.b.b(new eyd.v(eVar, 26));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = TaxFormsScreen.S;
                        return (h) ((fnb.g) taxFormsScreen.Q.getValue()).f136611a.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: pnb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxFormsScreen f237680b;

            {
                this.f237680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxFormsScreen taxFormsScreen = this.f237680b;
                switch (i22) {
                    case 0:
                        ViewBinding value = taxFormsScreen.L.getValue(taxFormsScreen, TaxFormsScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((m) value).f174539b;
                    case 1:
                        KProperty[] kPropertyArr = TaxFormsScreen.S;
                        TaxFormsScreen taxFormsScreen2 = this.f237680b;
                        return dli.f.a(taxFormsScreen2, (h) taxFormsScreen2.R.getValue(), v.k(taxFormsScreen2.O, taxFormsScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr2 = TaxFormsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(taxFormsScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        fnb.g gVar = new fnb.g();
                        gVar.f136611a = e4m.b.b(new eyd.v(eVar, 26));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = TaxFormsScreen.S;
                        return (h) ((fnb.g) taxFormsScreen.Q.getValue()).f136611a.get();
                }
            }
        });
        final int i5 = 3;
        this.R = w.y0(new Function0(this) { // from class: pnb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxFormsScreen f237680b;

            {
                this.f237680b = this;
            }

            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                TaxFormsScreen taxFormsScreen = this.f237680b;
                switch (i22) {
                    case 0:
                        ViewBinding value = taxFormsScreen.L.getValue(taxFormsScreen, TaxFormsScreen.S[0]);
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return ((m) value).f174539b;
                    case 1:
                        KProperty[] kPropertyArr = TaxFormsScreen.S;
                        TaxFormsScreen taxFormsScreen2 = this.f237680b;
                        return dli.f.a(taxFormsScreen2, (h) taxFormsScreen2.R.getValue(), v.k(taxFormsScreen2.O, taxFormsScreen2.N, new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 2:
                        KProperty[] kPropertyArr2 = TaxFormsScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(taxFormsScreen.m2()).a().get(fnb.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fnb.e.class, " is not found"));
                        }
                        fnb.e eVar = ((fnb.e) aVar2.b()).e;
                        fnb.g gVar = new fnb.g();
                        gVar.f136611a = e4m.b.b(new eyd.v(eVar, 26));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = TaxFormsScreen.S;
                        return (h) ((fnb.g) taxFormsScreen.Q.getValue()).f136611a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (pnb.h) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.M.getValue();
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.vaults_details_edit_documents_tax_documents, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((NavBarWithToolbar) this.M.getValue()).f59410q), null, new pnb.b(this, null, 0), 3);
        r rVarMergeArray = r.mergeArray(this.N.f53218h, this.O.f52371h.f121375b);
        Intrinsics.checkNotNullExpressionValue(rVarMergeArray, "mergeArray(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeArray), null, new pfk.o0(this, (Continuation) null, 21), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
