package com.revolut.feature.subscriptions.impl.block_card_subscription.what_will_happen;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.subscriptions.impl.R$id;
import com.revolut.feature.subscriptions.impl.R$layout;
import com.revolut.feature.subscriptionscommon.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import i9e.x;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ot1.p;
import p9e.a;
import p9e.d;
import p9e.e;
import p9e.f;
import sji.b;
import te0.w;
import tx0.j0;
import v9e.c;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subscriptions/impl/block_card_subscription/what_will_happen/WhatWillHappenScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lp9e/f;", "Lcom/revolut/feature/subscriptions/impl/block_card_subscription/what_will_happen/WhatWillHappenScreenContract$InputData;", "Lp9e/d;", "feature_cards_subscriptions_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WhatWillHappenScreen extends BaseRecyclerViewScreen<f, WhatWillHappenScreenContract$InputData, d> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f89169a0 = {o0.f186429a.j(new h0(WhatWillHappenScreen.class, "binding", "getBinding()Lcom/revolut/feature/subscriptions/impl/databinding/ScreenWhatWillHappenBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatWillHappenScreen(WhatWillHappenScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_what_will_happen;
        this.V = R$id.whatWillHappenScreen_recyclerView;
        this.W = s.t(this, a.f);
        this.X = w.y0(new p(this, inputData, 21));
        this.Y = w.y0(new os2.a(this, 19));
        this.Z = v.k(new RowDelegate(null, null, 7), new ListSubheaderDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (x) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f287027c.f59410q), null, new p9e.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f287026b.o), null, new p9e.b(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f287027c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        h3().f287026b.setText(new TextLocalisedClause(R$string.block_future_payments_warning_action, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f287027c;
        TextLocalisedClause textLocalisedClause = uiState.f234308b;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final c h3() {
        ViewBinding value = this.W.getValue(this, f89169a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }
}
