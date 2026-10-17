package com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import j68.a;
import java.util.List;
import jii.u;
import jk7.b;
import jk7.c;
import jk7.d;
import jk7.f;
import jk7.h;
import jk7.i;
import jk7.j;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nk7.y;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/claim/supporting_documents/CFACInsuranceSupportingDocumentsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljk7/j;", "Lcom/revolut/feature/insurance/impl/ui/cfac/claim/supporting_documents/CFACInsuranceSupportingDocumentsScreenContract$InputData;", "Ljk7/h;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACInsuranceSupportingDocumentsScreen extends BaseRecyclerViewScreen<j, CFACInsuranceSupportingDocumentsScreenContract$InputData, h> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75113d0 = {o0.f186429a.j(new h0(CFACInsuranceSupportingDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final boolean V;
    public final ao.h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75114a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f75115b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACInsuranceSupportingDocumentsScreen(CFACInsuranceSupportingDocumentsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = true;
        this.W = s.t(this, b.f);
        this.X = w.y0(new a(this, inputData, 25));
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: jk7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceSupportingDocumentsScreen f175111b;

            {
                this.f175111b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACInsuranceSupportingDocumentsScreen cFACInsuranceSupportingDocumentsScreen = this.f175111b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                        y yVar = (y) cFACInsuranceSupportingDocumentsScreen.X.getValue();
                        switch (yVar.f216742a) {
                            case 0:
                                return (i) yVar.f216753r.get();
                            default:
                                return (i) yVar.f216753r.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                        return v.k((RowDelegate) cFACInsuranceSupportingDocumentsScreen.Z.getValue(), new ListSubheaderDelegate());
                }
            }
        });
        this.Z = w.y0(new jj9.b(6));
        this.f75114a0 = w.y0(new jj9.b(7));
        this.f75115b0 = w.y0(new jj9.b(8));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: jk7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACInsuranceSupportingDocumentsScreen f175111b;

            {
                this.f175111b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACInsuranceSupportingDocumentsScreen cFACInsuranceSupportingDocumentsScreen = this.f175111b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                        y yVar = (y) cFACInsuranceSupportingDocumentsScreen.X.getValue();
                        switch (yVar.f216742a) {
                            case 0:
                                return (i) yVar.f216753r.get();
                            default:
                                return (i) yVar.f216753r.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                        return v.k((RowDelegate) cFACInsuranceSupportingDocumentsScreen.Z.getValue(), new ListSubheaderDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (y) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174565c.f59410q), null, new jk7.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174565c.o.f57403b), null, new jk7.e(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f174564b.o), null, new jk7.e(this, continuation, 3), 3);
        ?? r72 = this.Z;
        r rVarFilter = ((RowDelegate) r72.getValue()).f53218h.filter(new jeg.h(new jj3.a(14), 18));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarFilter), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((RowDelegate) r72.getValue()).f53218h, new jj3.a(15))), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(((RowDelegate) r72.getValue()).k, new jj3.a(16))), null, new c(this, continuation, 2), 3);
        ?? r710 = this.f75114a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(((TwinHorizontalButtonDelegate) r710.getValue()).d.f121375b), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) this.f75115b0.getValue()).d.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TwinHorizontalButtonDelegate) r710.getValue()).f53572c.f121375b), null, new jk7.e(this, continuation, 0), 3);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cfac_claim_supporting_documents_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_claim_supporting_documents_title, null, null, 14), null);
        CFACInsuranceSupportingDocumentsScreenContract$InputData cFACInsuranceSupportingDocumentsScreenContract$InputData = (CFACInsuranceSupportingDocumentsScreenContract$InputData) this.G;
        if (!cFACInsuranceSupportingDocumentsScreenContract$InputData.f75118c) {
            navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.cfac_claim_supporting_documents_description, null, null, 14));
            navBarWithToolbar.setDescriptionVisible(true);
        }
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setMenuItems(ik7.f.b());
        g3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
        LargeActionButton goToButton = g3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(cFACInsuranceSupportingDocumentsScreenContract$InputData.f75117b ? 0 : 8);
        y yVar = (y) this.X.getValue();
        switch (yVar.f216742a) {
            case 0:
                aVar = (j60.a) yVar.f216745g.get();
                break;
            default:
                aVar = (j60.a) yVar.f216745g.get();
                break;
        }
        aVar.d(v.k((TwinHorizontalButtonDelegate) this.f75114a0.getValue(), (LargeActionButtonDelegate) this.f75115b0.getValue()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF86320b0() {
        return (List) this.c0.getValue();
    }

    public final u g3() {
        ViewBinding value = this.W.getValue(this, f75113d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
