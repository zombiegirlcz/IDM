package com.revolut.sso.impl.ui.identifier_input;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SeparatorDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import dkl.k;
import efm.r;
import ghk.t;
import gnl.b;
import gnl.c;
import gnl.d;
import gnl.f;
import gnl.g;
import gnl.i;
import gnl.m;
import gnl.n;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljl.k1;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lgnl/n;", "Lcom/revolut/sso/impl/ui/identifier_input/IdentifierInputScreenContract$InputData;", "Lgnl/i;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IdentifierInputScreen extends BaseRecyclerViewScreen<n, IdentifierInputScreenContract$InputData, i> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f106559e0 = {o0.f186429a.j(new h0(IdentifierInputScreen.class, "binding", "getBinding()Lcom/revolut/sso/impl/databinding/ScreenIdentifierInputBinding;", 0))};
    public final h U;
    public final InputTextDelegate V;
    public final PlainTextDelegate W;
    public final PhoneEditorDelegate X;
    public final LargeActionButtonDelegate Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int f106560a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f106561b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f106562d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentifierInputScreen(IdentifierInputScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.V = inputTextDelegate;
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.W = plainTextDelegate;
        PhoneEditorDelegate phoneEditorDelegate = new PhoneEditorDelegate();
        this.X = phoneEditorDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.Y = largeActionButtonDelegate;
        LargeActionButtonLoadingDelegate largeActionButtonLoadingDelegate = new LargeActionButtonLoadingDelegate();
        SeparatorDelegate separatorDelegate = new SeparatorDelegate();
        FooterTextDelegate footerTextDelegate = new FooterTextDelegate();
        this.Z = R$layout.screen_identifier_input;
        this.f106560a0 = R$id.identifierInputScreen_recyclerView;
        this.f106561b0 = w.y0(new t(this, inputData, 9));
        this.c0 = w.y0(new g8i.h(this, 18));
        this.f106562d0 = v.k(inputTextDelegate, plainTextDelegate, phoneEditorDelegate, largeActionButtonDelegate, largeActionButtonLoadingDelegate, separatorDelegate, footerTextDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (k1) this.f106561b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f115661b.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f115661b.o.f57403b), null, new d(this, continuation, 0), 3);
        r rVarDebounce = this.V.e.f121375b.debounce(300L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarDebounce, "debounce(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarDebounce), null, new gnl.e(this, null), 3);
        PhoneEditorDelegate phoneEditorDelegate = this.X;
        com.revolut.kompot.navigable.a.g2(this, e.b(phoneEditorDelegate.e.f121375b), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(phoneEditorDelegate.f52894c.f121375b), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(phoneEditorDelegate.d.f121375b), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.d.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.W.d.f121375b), null, new d(this, continuation, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.f106562d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.f106560a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(n uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f115661b;
        navBarWithToolbar.setTitle(uiState.f145041a, null);
        Clause clause = uiState.f145042b;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setMenuItems(uiState.f145043c);
        navBarWithToolbar.setNavigationButtonIcon(uiState.e);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.Z;
    }

    public final k h3() {
        ViewBinding value = this.U.getValue(this, f106559e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final m T2() {
        return (m) this.c0.getValue();
    }
}
