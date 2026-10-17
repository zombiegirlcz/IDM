package com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance.impl.R$string;
import com.revolut.feature.insurance.impl.ui.cfac.my_claims.claims_list.CFACClaimsListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import vd1.a;
import ve7.i;
import vge.z1;
import vk7.b;
import vk7.c;
import vk7.e;
import vk7.f;
import vk7.g;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/claims_list/CFACClaimsListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lvk7/g;", "Lcom/revolut/feature/insurance/impl/ui/cfac/my_claims/claims_list/CFACClaimsListScreenContract$InputData;", "Lvk7/e;", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CFACClaimsListScreen extends BaseRecyclerViewScreen<g, CFACClaimsListScreenContract$InputData, e> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75134d0 = {o0.f186429a.j(new h0(CFACClaimsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final h V;
    public final boolean W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f75135a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f75136b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CFACClaimsListScreen(CFACClaimsListScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = s.t(this, b.f);
        this.W = true;
        this.X = R$id.recyclerView;
        this.Y = w.y0(new a(this, inputData, 14));
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: vk7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACClaimsListScreen f289874b;

            {
                this.f289874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CFACClaimsListScreen cFACClaimsListScreen = this.f289874b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CFACClaimsListScreen.f75134d0;
                        return (f) ((nk7.h) cFACClaimsListScreen.Y.getValue()).f216684c.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACClaimsListScreen.f75134d0;
                        return v.k((FullScreenStateDelegate) cFACClaimsListScreen.f75136b0.getValue(), (RowDelegate) cFACClaimsListScreen.f75135a0.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate());
                }
            }
        });
        this.f75135a0 = w.y0(new i(19));
        this.f75136b0 = w.y0(new i(20));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: vk7.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CFACClaimsListScreen f289874b;

            {
                this.f289874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CFACClaimsListScreen cFACClaimsListScreen = this.f289874b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CFACClaimsListScreen.f75134d0;
                        return (f) ((nk7.h) cFACClaimsListScreen.Y.getValue()).f216684c.get();
                    default:
                        KProperty[] kPropertyArr2 = CFACClaimsListScreen.f75134d0;
                        return v.k((FullScreenStateDelegate) cFACClaimsListScreen.f75136b0.getValue(), (RowDelegate) cFACClaimsListScreen.f75135a0.getValue(), new RowLoadingDelegate(), new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (nk7.h) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (f) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.V.getValue(this, f75134d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new z1(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.f75135a0.getValue()).f53218h, new vjk.b(2))), null, new vfg.m(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.f75136b0.getValue()).f52371h.f121375b), null, new c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.V.getValue(this, f75134d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cfac_my_claims_claims_list_title_my_claims, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF74047a0() {
        return (List) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
