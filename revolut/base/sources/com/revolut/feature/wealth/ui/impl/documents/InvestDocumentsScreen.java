package com.revolut.feature.wealth.ui.impl.documents;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth.ui.impl.R$string;
import com.revolut.feature.wealth.ui.impl.documents.InvestDocumentsScreen;
import com.revolut.feature.wealth.ui.impl.documents.InvestDocumentsScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import d1h.j;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mkh.u;
import rd0.e;
import sji.b;
import te0.w;
import ukh.k;
import vc.s;
import vkm.q0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/documents/InvestDocumentsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lukh/k;", "Lcom/revolut/feature/wealth/ui/impl/documents/InvestDocumentsScreenContract$InputData;", "", "Ld1h/j;", "<init>", "()V", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InvestDocumentsScreen extends BaseRecyclerViewScreen<k, InvestDocumentsScreenContract$InputData, Object> implements j {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(InvestDocumentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final Object W;
    public final Object X;
    public final RowDelegate Y;
    public final FooterTextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final FullScreenStateDelegate f95988a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f95989b0;

    public static final /* synthetic */ class a extends q implements Function1 {
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

    public InvestDocumentsScreen() {
        super(InvestDocumentsScreenContract$InputData.f95990a);
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, a.f);
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: ukh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestDocumentsScreen f280749b;

            {
                this.f280749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InvestDocumentsScreen investDocumentsScreen = this.f280749b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InvestDocumentsScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(investDocumentsScreen.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                        }
                        mkh.s sVar = ((mkh.s) ((u) aVar2.b())).l0;
                        ((InvestDocumentsScreenContract$InputData) investDocumentsScreen.G).getClass();
                        return new mkh.j(sVar, investDocumentsScreen);
                    default:
                        KProperty[] kPropertyArr2 = InvestDocumentsScreen.c0;
                        return (j) ((mkh.j) investDocumentsScreen.W.getValue()).f206339g.get();
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: ukh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InvestDocumentsScreen f280749b;

            {
                this.f280749b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InvestDocumentsScreen investDocumentsScreen = this.f280749b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InvestDocumentsScreen.c0;
                        phm.a aVar = (phm.a) ue0.e.j(investDocumentsScreen.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                        }
                        mkh.s sVar = ((mkh.s) ((u) aVar2.b())).l0;
                        ((InvestDocumentsScreenContract$InputData) investDocumentsScreen.G).getClass();
                        return new mkh.j(sVar, investDocumentsScreen);
                    default:
                        KProperty[] kPropertyArr2 = InvestDocumentsScreen.c0;
                        return (j) ((mkh.j) investDocumentsScreen.W.getValue()).f206339g.get();
                }
            }
        });
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.Y = rowDelegate;
        TextDelegate textDelegate = new TextDelegate();
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.Z = footerTextDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.f95988a0 = fullScreenStateDelegate;
        this.f95989b0 = v.k(rowDelegate, textDelegate, fullScreenStateDelegate, footerTextDelegate, new RowLoadingDelegate(), new FooterTextLoadingDelegate());
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: H0, reason: from getter */
    public final FooterTextDelegate getZ() {
        return this.Z;
    }

    @Override // d1h.j
    /* JADX INFO: renamed from: Q, reason: from getter */
    public final FullScreenStateDelegate getF95988a0() {
        return this.f95988a0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (mkh.j) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (ukh.j) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new uea.e(this, null, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, new q0(e.b(this.Y.f53218h), new ukh.b(2, 4, ukh.j.class, (ukh.j) this.X.getValue(), "onRowDelegateClick", "onRowDelegateClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 1), null, null, 7);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_invest_documents_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.wealth_invest_documents_subtitle, null, null, 14);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause2);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.f95989b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.TRUE;
    }
}
