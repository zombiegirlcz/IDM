package com.revolut.feature.insurance.impl.ui.cfac.documents;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$layout;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.documents.CFACInsuranceDocumentsScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseScreen;
import efm.r;
import java.util.List;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nk7.n;
import oa2.b;
import oid.y;
import ok7.c;
import ok7.d;
import ok7.e;
import ok7.f;
import ok7.i;
import ok7.j;
import ok7.l;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/documents/CFACInsuranceDocumentsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lok7/j;", "Lcom/revolut/feature/insurance/impl/ui/cfac/documents/CFACInsuranceDocumentsScreenContract$InputData;", "Laii/q;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceDocumentsScreen extends BaseScreen<j, CFACInsuranceDocumentsScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CFACInsuranceDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance/impl/databinding/ScreenCfacInsuranceDocumentsBinding;", 0))};
    public final int M;
    public final boolean N;
    public final h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final e T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACInsuranceDocumentsScreen(CFACInsuranceDocumentsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_cfac_insurance_documents;
        this.N = true;
        this.O = s.t(this, d.f);
        this.P = w.y0(new b(this, inputData, 18));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ok7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceDocumentsScreen f225910b;

            {
                this.f225910b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceDocumentsScreen cFACInsuranceDocumentsScreen = this.f225910b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceDocumentsScreen.U;
                        return (l) ((n) cFACInsuranceDocumentsScreen.P.getValue()).f216701c.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceDocumentsScreen.U;
                        return new z4l.j(7, u.c(new ContainerDelegate(u.c((RowDelegate) cFACInsuranceDocumentsScreen.R.getValue()), null, 6)), false);
                }
            }
        });
        this.R = w.y0(new ok7.b(i));
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ok7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceDocumentsScreen f225910b;

            {
                this.f225910b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceDocumentsScreen cFACInsuranceDocumentsScreen = this.f225910b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceDocumentsScreen.U;
                        return (l) ((n) cFACInsuranceDocumentsScreen.P.getValue()).f216701c.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceDocumentsScreen.U;
                        return new z4l.j(7, u.c(new ContainerDelegate(u.c((RowDelegate) cFACInsuranceDocumentsScreen.R.getValue()), null, 6)), false);
                }
            }
        });
        this.T = new e(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        j uiState = (j) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        z4l.j jVar = (z4l.j) this.S.getValue();
        List list = uiState.d;
        String str = uiState.f225925b;
        int i = uiState.f225924a;
        jVar.c(list);
        FixedTabs fixedTabs = Z2().f24627c;
        fixedTabs.setVisibility(uiState.f225926c ? 0 : 8);
        FixedTabs.setItems$default(fixedTabs, uiState.e, null, 2, null);
        if (oVar == null || !(oVar instanceof i)) {
            Z2().f24627c.i0(str);
            Z2().d.setCurrentItem(i);
            return;
        }
        i iVar = (i) oVar;
        if (iVar.f225923b) {
            Z2().d.setCurrentItem(i);
        }
        if (iVar.f225922a) {
            Z2().f24627c.i0(str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (n) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        a.g2(this, rd0.e.b(Z2().f24626b.f59410q), null, new ocb.d(this, continuation, 12), 3);
        Z2().d.registerOnPageChangeCallback(this.T);
        r rVarFilter = Z2().f24627c.f.filter(new y(new c(this, 0), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        a.g2(this, rd0.e.b(rVarFilter), null, new f(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.R.getValue()).f53218h, new ojk.a(7))), null, new f(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = Z2().f24626b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_policy_details_action_all_documents, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ViewPager2 viewPager2 = Z2().d;
        viewPager2.setAdapter((z4l.j) this.S.getValue());
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        Z2().d.unregisterOnPageChangeCallback(this.T);
    }

    public final cj7.b Z2() {
        ViewBinding value = this.O.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (cj7.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
