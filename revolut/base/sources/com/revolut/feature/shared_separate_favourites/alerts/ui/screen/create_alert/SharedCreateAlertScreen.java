package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared_separate_favourites.R$layout;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.SharedCreateAlertScreenContract$InputData;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ned.l;
import rd0.e;
import rr0.f;
import te0.w;
import vc.s;
import wuk.g;
import y83.d;
import y99.c;
import yed.i;
import yed.j;
import yed.p;
import yed.q;
import yed.r;
import yed.t;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyed/t;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreenContract$InputData;", "Lyed/p;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedCreateAlertScreen extends BaseRecyclerViewScreen<t, SharedCreateAlertScreenContract$InputData, p> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(SharedCreateAlertScreen.class, "binding", "getBinding()Lcom/revolut/feature/shared_separate_favourites/databinding/SharedCreateAlertScreenBinding;", 0))};
    public final boolean U;
    public final int V;
    public final h W;
    public f X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ihm.f f86735a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final AmountEditDelegate f86736b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f86737d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final g f86738e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedCreateAlertScreen(SharedCreateAlertScreenContract$InputData.Create inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = true;
        this.V = R$layout.shared_create_alert_screen;
        this.W = s.t(this, yed.h.f);
        this.Y = w.y0(new y1a.a(this, inputData, 24));
        this.Z = w.y0(new c(this, 5));
        this.f86735a0 = v0.a.d("create(...)");
        AmountEditDelegate amountEditDelegate = new AmountEditDelegate(new y8a.g(this, 20));
        this.f86736b0 = amountEditDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.c0 = textDelegate;
        this.f86737d0 = v.k(amountEditDelegate, textDelegate);
        this.f86738e0 = new g(this, 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (l) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (q) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f183965c.f59410q), null, new i(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f183964b.o), null, new i(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86736b0.e.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f86735a0), null, new d(this, continuation, 18), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f183965c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.shared_alerts_create_alert_header, u.c(((SharedCreateAlertScreenContract$InputData) this.G).getF86739a().f86864b), null, 12), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        h3().f183964b.setText(new TextLocalisedClause(R$string.shared_alerts_create_alert_action_create, null, null, 14));
        this.X = h3().f183964b.A.V();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getC0() {
        return this.f86737d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getF91678d0() {
        return h3().d.getId();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(t uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        if (uiState instanceof r) {
            kgd.f fVarH3 = h3();
            fVarH3.f183965c.setDescriptionVisible(true);
            r rVar = (r) uiState;
            fVarH3.f183965c.setDescriptionText(rVar.f312894b);
            fVarH3.f183964b.setEnabled(rVar.d);
            f fVar = this.X;
            if (fVar != null) {
                fVar.b(rVar.f312895c);
            } else {
                Intrinsics.r("buttonLoadingController");
                throw null;
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    public final kgd.f h3() {
        ViewBinding value = this.W.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kgd.f) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.U);
    }
}
