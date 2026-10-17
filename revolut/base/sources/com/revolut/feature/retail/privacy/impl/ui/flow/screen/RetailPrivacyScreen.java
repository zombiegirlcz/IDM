package com.revolut.feature.retail.privacy.impl.ui.flow.screen;

import aii.q;
import android.view.View;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Iterator;
import java.util.List;
import jki.o;
import koi.j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ocb.c;
import ocb.d;
import ocb.f;
import ocb.k;
import ocb.l;
import ocb.x;
import rd0.e;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/privacy/impl/ui/flow/screen/RetailPrivacyScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Locb/l;", "Lcom/revolut/feature/retail/privacy/impl/ui/flow/screen/RetailPrivacyScreenContract$InputData;", "Laii/q;", "feature_retail_privacy_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailPrivacyScreen extends BaseRecyclerViewScreen<l, RetailPrivacyScreenContract$InputData, q> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f82779e0 = {o0.f186429a.j(new h0(RetailPrivacyScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h U;
    public final Object V;
    public final RowDelegate W;
    public boolean X;
    public final int Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f82780a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f82781b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f82782d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetailPrivacyScreen(RetailPrivacyScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, c.f);
        this.V = w.y0(new ocb.b(this, 0));
        this.W = new RowDelegate(null, null, 7);
        this.Y = R$layout.screen_recycler_navbar;
        this.Z = true;
        this.f82780a0 = R$id.recyclerView;
        this.f82781b0 = w.y0(new ocb.b(this, 1));
        this.c0 = w.y0(new ocb.b(this, inputData));
        this.f82782d0 = w.y0(new ocb.b(this, 3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (lcb.c) this.c0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (k) this.f82782d0.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(((NavBarWithToolbar) this.V.getValue()).f59410q), null, new d(this, null, 0), 3);
        RowDelegate rowDelegate = this.W;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53225r), null, new ocb.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) this.V.getValue();
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R.string.disclosure_privacy_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R.string.disclosure_privacy_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF101877e0() {
        return (List) this.f82781b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getF82780a0() {
        return this.f82780a0;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(l uiState, o oVar) {
        jcb.a aVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        if (this.X || (aVar = ((RetailPrivacyScreenContract$InputData) this.G).f82783a) == null) {
            return;
        }
        try {
            b.Companion.getClass();
            Intrinsics.checkNotNullParameter(aVar, "<this>");
            int i = a.f82784a[aVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    throw new IllegalArgumentException("WIDGETS setting is not supported");
                }
                throw new NoWhenBranchMatchedException();
            }
            Iterator it8 = uiState.f224184a.iterator();
            int i2 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i2 = -1;
                    break;
                } else if (Intrinsics.f(((j) it8.next()).getF51938a(), "ID_PAYMENTS_STATUS_DISCOVERABLE")) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                h().scrollToPosition(i2);
                this.X = true;
            }
        } catch (IllegalArgumentException unused) {
            ((x) ((k) this.f82782d0.getValue())).u2();
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Z);
    }
}
