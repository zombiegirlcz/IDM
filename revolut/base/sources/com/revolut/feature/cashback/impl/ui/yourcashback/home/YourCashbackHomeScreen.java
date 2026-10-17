package com.revolut.feature.cashback.impl.ui.yourcashback.home;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.BannerDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
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
import rd0.e;
import te0.w;
import u7k.f0;
import u9a.b;
import ud3.c;
import ud3.d;
import ud3.f;
import ud3.g;
import ud3.j;
import ud3.k;
import ud3.l;
import vc.s;
import yc3.i;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cashback/impl/ui/yourcashback/home/YourCashbackHomeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lud3/l;", "Lcom/revolut/feature/cashback/impl/ui/yourcashback/home/YourCashbackHomeScreenContract$InputData;", "Lud3/j;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class YourCashbackHomeScreen extends BaseRecyclerViewScreen<l, YourCashbackHomeScreenContract$InputData, j> {
    public static final /* synthetic */ KProperty[] g0 = {o0.f186429a.j(new h0(YourCashbackHomeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object U;
    public final int V;
    public final Integer W;
    public final boolean X;
    public final Object Y;
    public final h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f65727a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f65728b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f65729d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f65730e0;
    public final Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YourCashbackHomeScreen(YourCashbackHomeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: ud3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ YourCashbackHomeScreen f279091b;

            {
                this.f279091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                YourCashbackHomeScreen yourCashbackHomeScreen = this.f279091b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = YourCashbackHomeScreen.g0;
                        qji.b bVarQ2 = yourCashbackHomeScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.home.di.YourCashbackHomeScreenInjector");
                        yc3.h hVar = (yc3.h) bVarQ2;
                        return new yc3.i(hVar.f312486b, hVar.f312487c, yourCashbackHomeScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = YourCashbackHomeScreen.g0;
                        return (k) ((yc3.i) yourCashbackHomeScreen.U.getValue()).f312491g.get();
                    default:
                        KProperty[] kPropertyArr3 = YourCashbackHomeScreen.g0;
                        return zhm.v.k((CounterTextDelegate) yourCashbackHomeScreen.c0.getValue(), (ListSubheaderDelegate) yourCashbackHomeScreen.f65727a0.getValue(), (RowDelegate) yourCashbackHomeScreen.f65728b0.getValue(), (BannerDelegate) yourCashbackHomeScreen.f65729d0.getValue(), (ActionWidgetDelegate) yourCashbackHomeScreen.f65730e0.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate());
                }
            }
        });
        this.V = R$layout.screen_recycler_navbar;
        this.W = inputData.f65731a ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        this.X = true;
        final int i2 = 1;
        this.Y = w.y0(new Function0(this) { // from class: ud3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ YourCashbackHomeScreen f279091b;

            {
                this.f279091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                YourCashbackHomeScreen yourCashbackHomeScreen = this.f279091b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = YourCashbackHomeScreen.g0;
                        qji.b bVarQ2 = yourCashbackHomeScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.home.di.YourCashbackHomeScreenInjector");
                        yc3.h hVar = (yc3.h) bVarQ2;
                        return new yc3.i(hVar.f312486b, hVar.f312487c, yourCashbackHomeScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = YourCashbackHomeScreen.g0;
                        return (k) ((yc3.i) yourCashbackHomeScreen.U.getValue()).f312491g.get();
                    default:
                        KProperty[] kPropertyArr3 = YourCashbackHomeScreen.g0;
                        return zhm.v.k((CounterTextDelegate) yourCashbackHomeScreen.c0.getValue(), (ListSubheaderDelegate) yourCashbackHomeScreen.f65727a0.getValue(), (RowDelegate) yourCashbackHomeScreen.f65728b0.getValue(), (BannerDelegate) yourCashbackHomeScreen.f65729d0.getValue(), (ActionWidgetDelegate) yourCashbackHomeScreen.f65730e0.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate());
                }
            }
        });
        this.Z = s.t(this, c.f);
        this.f65727a0 = w.y0(new b(10));
        this.f65728b0 = w.y0(new b(11));
        this.c0 = w.y0(new b(12));
        this.f65729d0 = w.y0(new b(13));
        this.f65730e0 = w.y0(new b(14));
        final int i3 = 2;
        this.f0 = w.y0(new Function0(this) { // from class: ud3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ YourCashbackHomeScreen f279091b;

            {
                this.f279091b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                YourCashbackHomeScreen yourCashbackHomeScreen = this.f279091b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = YourCashbackHomeScreen.g0;
                        qji.b bVarQ2 = yourCashbackHomeScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.cashback.impl.ui.yourcashback.home.di.YourCashbackHomeScreenInjector");
                        yc3.h hVar = (yc3.h) bVarQ2;
                        return new yc3.i(hVar.f312486b, hVar.f312487c, yourCashbackHomeScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = YourCashbackHomeScreen.g0;
                        return (k) ((yc3.i) yourCashbackHomeScreen.U.getValue()).f312491g.get();
                    default:
                        KProperty[] kPropertyArr3 = YourCashbackHomeScreen.g0;
                        return zhm.v.k((CounterTextDelegate) yourCashbackHomeScreen.c0.getValue(), (ListSubheaderDelegate) yourCashbackHomeScreen.f65727a0.getValue(), (RowDelegate) yourCashbackHomeScreen.f65728b0.getValue(), (BannerDelegate) yourCashbackHomeScreen.f65729d0.getValue(), (ActionWidgetDelegate) yourCashbackHomeScreen.f65730e0.getValue(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getK() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (i) this.U.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.Z.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        a.g2(this, e.b(((m) value).f174539b.f59410q), null, new u07.b(this, continuation, 26), 3);
        a.g2(this, e.b(((RowDelegate) this.f65728b0.getValue()).f53218h), null, new d(this, null), 3);
        a.g2(this, e.b(((ListSubheaderDelegate) this.f65727a0.getValue()).f52707c), null, new ud3.e(this, null), 3);
        ?? r56 = this.f65729d0;
        a.g2(this, e.b(((BannerDelegate) r56.getValue()).f51699c), null, new f(this, null), 3);
        a.g2(this, e.b(((BannerDelegate) r56.getValue()).e), null, new g(this, null), 3);
        a.g2(this, e.b(((CounterTextDelegate) this.c0.getValue()).d), null, new ud3.h(this, null), 3);
        a.g2(this, e.b(((ActionWidgetDelegate) this.f65730e0.getValue()).f51589c.f121375b), null, new f0(this, continuation, 21), 3);
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.Z.getValue(this, g0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.cashback_details_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.cashback_details_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ((j60.a) ((i) this.U.getValue()).d.get()).d(zhm.f0.f322471a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final k T2() {
        return (k) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
