package com.revolut.retail.feature.esim.impl.ui.screens.country_picker;

import afj.d1;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.esim.impl.R$string;
import hba.k;
import hhj.d;
import hhj.e;
import hhj.f;
import java.util.List;
import jii.m;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ofm.q;
import sji.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lhhj/f;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/country_picker/EsimCountryPickerScreenContract$InputData;", "Lhhj/d;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimCountryPickerScreen extends BaseRecyclerViewScreen<f, EsimCountryPickerScreenContract$InputData, d> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f100947b0 = {o0.f186429a.j(new h0(EsimCountryPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f100948a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EsimCountryPickerScreen(EsimCountryPickerScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar;
        this.V = true;
        this.W = s.t(this, hhj.a.f);
        this.X = w.y0(new h1k.a(this, inputData, 28));
        this.Y = w.y0(new h1g.a(this, 17));
        Lazy lazyY0 = w.y0(new hf7.d(5));
        this.Z = lazyY0;
        this.f100948a0 = v.k(new ListSubheaderDelegate(), (RowDelegate) lazyY0.getValue(), new FullScreenStateDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (d1) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59410q), null, new hbg.h(this, continuation, 8), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f174539b.f59409p.f57337m), null, new k(this, continuation, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.Z.getValue()).f53218h), null, new hhj.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(q.k(q2())));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.esim_country_picker_search_hint, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF100948a0() {
        return this.f100948a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174539b;
        Clause clause = uiState.f152416b;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setSearchButtonActive(uiState.f152417c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final m h3() {
        ViewBinding value = this.W.getValue(this, f100947b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
