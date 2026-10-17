package com.revolut.feature.card_order_new.impl.newcard;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.c;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FcaDisclaimerDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.NewProductDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_order_new.api.CardOrderContext;
import com.revolut.feature.card_order_new.impl.R$id;
import com.revolut.feature.card_order_new.impl.R$layout;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import fsi.h;
import hqi.i;
import ihm.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import le.u1;
import mx0.x8;
import n33.s;
import n33.s2;
import n33.w;
import n33.y;
import opi.b;
import p33.a;
import pri.e;
import te0.n;
import tx0.j0;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/newcard/OrderNewCardActivity;", "Lcom/revolut/retail/core/ui/activity/BaseDelegatesActivity;", "Ln33/s;", "Ln33/y;", "Lfsi/h;", "<init>", "()V", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderNewCardActivity extends BaseDelegatesActivity implements y, h {
    public static final /* synthetic */ KProperty[] J0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public w f65202r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public b f65203s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public a f65204t0;
    public final j90.a u0 = u1.w(this, R$id.navBarWithToolbar);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final j90.a f65205v0 = u1.w(this, R$id.recyclerView);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final j90.a f65206w0 = u1.w(this, R$id.bottomFooterText);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final f f65207x0 = v0.a.d("create(...)");
    public final Object y0 = te0.w.y0(new x8(this, 17));
    public final NewProductDelegate z0 = new NewProductDelegate();
    public final ProductSelectionDelegate A0 = new ProductSelectionDelegate();
    public final TextDelegate B0 = new TextDelegate();
    public final TabsDelegate C0 = new TabsDelegate();
    public final FixedTabsDelegate D0 = new FixedTabsDelegate();
    public final NotificationCentreItemDelegate E0 = new NotificationCentreItemDelegate();
    public final LargeActionButtonDelegate F0 = new LargeActionButtonDelegate();
    public final RowDelegate G0 = new RowDelegate(null, null, 7);
    public final RowDelegate H0 = new RowDelegate(null, null, 7);
    public final FcaDisclaimerDelegate I0 = new FcaDisclaimerDelegate();

    static {
        h0 h0Var = new h0(OrderNewCardActivity.class, "navBarWithToolbar", "getNavBarWithToolbar()Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar;", 0);
        p0 p0Var = o0.f186429a;
        J0 = new KProperty[]{p0Var.j(h0Var), p.a.y(OrderNewCardActivity.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, p0Var), p.a.y(OrderNewCardActivity.class, "footerTextView", "getFooterTextView()Lcom/revolut/core/ui_kit/views/FooterTextView;", 0, p0Var)};
    }

    @Override // nri.b
    public final e F0() {
        a aVar = this.f65204t0;
        if (aVar != null) {
            return (s) aVar.A.get();
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // nri.b
    /* JADX INFO: renamed from: J0 */
    public final String getF81363s0() {
        return "NEW_CARD_ORDER_FLOW";
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final gsi.a L0() {
        a aVar = this.f65204t0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("activityComponent");
        throw null;
    }

    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity
    public final void O0() {
        this.f65207x0.onNext(Unit.f186387a);
    }

    @Override // nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return ((OrderNewCardContract$Configuration) G0()).o;
    }

    public final FooterTextView Z0() {
        return (FooterTextView) this.f65206w0.getValue(this, J0[2]);
    }

    public final NavBarWithToolbar b1() {
        return (NavBarWithToolbar) this.u0.getValue(this, J0[0]);
    }

    public final w c1() {
        w wVar = this.f65202r0;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("state");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.ui.activity.BaseDelegatesActivity, nri.b, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        OrderNewCardContract$Configuration orderNewCardContract$Configuration = (OrderNewCardContract$Configuration) G0();
        boolean z = orderNewCardContract$Configuration.i;
        p33.b bVar = ((p33.b) c.l(this).b(null, "NEW_CARD_ORDER_FLOW")).J;
        OrderNewCardContract$Configuration orderNewCardContract$Configuration2 = (OrderNewCardContract$Configuration) G0();
        i.Companion.getClass();
        i iVar = i.f154714c;
        iVar.getClass();
        a aVar = new a(bVar, rd0.e.g(this, bundle, null), iVar, orderNewCardContract$Configuration2);
        this.f65204t0 = aVar;
        this.f65202r0 = (w) bVar.M.get();
        this.f65203s0 = (b) aVar.f232568m.get();
        super.onCreate(bundle);
        setContentView(R$layout.activity_order_new_card_navbar);
        if (bundle == null) {
            s2 s2Var = (s2) c1();
            s2Var.f211809c.getValue(s2Var, s2.f211807p[1]).set(orderNewCardContract$Configuration.f65208a);
            Unit unit = Unit.f186387a;
        }
        NaviCommand naviCommand = orderNewCardContract$Configuration.d;
        if (naviCommand != null) {
            ((s2) c1()).C0().set(naviCommand);
        }
        zn3.a aVar2 = orderNewCardContract$Configuration.f65211g;
        if (aVar2 != null) {
            s2 s2Var2 = (s2) c1();
            s2Var2.f211808b.getValue(s2Var2, s2.f211807p[0]).set(aVar2);
        }
        pi3.h hVar = orderNewCardContract$Configuration.f65212h;
        if (hVar != null) {
            te0.e eVarZ0 = ((s2) c1()).z0();
            od0.i.Companion.getClass();
            eVarZ0.set(od0.h.a(hVar));
        }
        s2 s2Var3 = (s2) c1();
        n nVar = s2Var3.e;
        KProperty[] kPropertyArr = s2.f211807p;
        te0.e eVarC = nVar.getValue(s2Var3, kPropertyArr[3]);
        od0.h hVar2 = od0.i.Companion;
        NaviCommand naviCommand2 = orderNewCardContract$Configuration.e;
        hVar2.getClass();
        eVarC.set(od0.h.a(naviCommand2));
        s2 s2Var4 = (s2) c1();
        s2Var4.f.getValue(s2Var4, kPropertyArr[4]).set(od0.h.a(orderNewCardContract$Configuration.f));
        ((s2) c1()).y0().set(orderNewCardContract$Configuration.f65213j);
        ((s2) c1()).w0().set(orderNewCardContract$Configuration.f65210c);
        s2 s2Var5 = (s2) c1();
        s2Var5.i.getValue(s2Var5, kPropertyArr[7]).set(Boolean.valueOf(z));
        ((s2) c1()).A0().set(od0.h.a(orderNewCardContract$Configuration.f65216n));
        ((s2) c1()).x0().set(orderNewCardContract$Configuration.o);
        NavBarWithToolbar navBarWithToolbarB1 = b1();
        navBarWithToolbarB1.setNavigationButtonIcon(z ? Integer.valueOf(((CardOrderContext) ((s2) c1()).y0().get()).getF64940a()) : null);
        navBarWithToolbarB1.setToolbarBackgroundColor(R$attr.uikit_windowBackground);
        navBarWithToolbarB1.setTitleAutoSize(false);
        navBarWithToolbarB1.setHeaderTitleMode(j0.MULTILINE);
        RecyclerView recyclerView = (RecyclerView) this.f65205v0.getValue(this, J0[1]);
        yp0.y.h(recyclerView, (j) this.y0.getValue(), new LinearLayoutManager(recyclerView.getContext()));
        b bVar2 = this.f65203s0;
        if (bVar2 != null) {
            bVar2.Y("ORDER_NEW_CARD_BOTTOM_DIALOG_RECYCLER", v.k(this.F0, this.G0, this.A0));
        } else {
            Intrinsics.r("expandableDialogActivityDelegate");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zqi.a
    public final void setItems(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ((j) this.y0.getValue()).c(items);
    }
}
