package com.revolut.sso.impl.ui.card_pin.card_pin.enter_card_pin;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.sso.api.R$string;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import gll.a;
import gll.b;
import gll.c;
import gll.g;
import gll.h;
import gll.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ofm.q;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/card_pin/card_pin/enter_card_pin/EnterCardPINScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lgll/h;", "Lcom/revolut/sso/impl/ui/card_pin/card_pin/enter_card_pin/EnterCardPINScreenContract$InputData;", "Lgll/g;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EnterCardPINScreen extends BaseRecyclerViewScreen<h, EnterCardPINScreenContract$InputData, g> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106401b0 = {o0.f186429a.j(new h0(EnterCardPINScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenEnterCardPinBinding;", 0))};
    public final ao.h U;
    public final CodeEditorDelegate V;
    public final int W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f106402a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterCardPINScreen(EnterCardPINScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        CodeEditorDelegate codeEditorDelegate = new CodeEditorDelegate();
        this.V = codeEditorDelegate;
        this.W = R$layout.screen_enter_card_pin;
        this.X = R$id.enterCardPINScreen_recyclerView;
        this.Y = w.y0(new a(this, inputData));
        this.Z = w.y0(new a(this));
        this.f106402a0 = u.c(codeEditorDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (ljl.w) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f115652b.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.V.p()), null, new gii.b(this, null, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f115653c.o), null, new c(this, null, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f115652b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_access_recovery_card_pin_screen_title, u.c(((EnterCardPINScreenContract$InputData) this.G).f106403a), null, 12);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        LargeActionButton largeActionButton = g3().f115653c;
        largeActionButton.o(LargeActionButton.ButtonStyle.o);
        largeActionButton.setText(new TextLocalisedClause(R$string.revolut_sso_access_recovery_card_pin_forgot_card_pin, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF106402a0() {
        return this.f106402a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    public final dkl.h g3() {
        ViewBinding value = this.U.getValue(this, f106401b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (dkl.h) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.W;
    }
}
