package com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.R$layout;
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
import vkm.q;
import wuk.g;
import xo8.a0;
import y99.c;
import yed.d;
import yed.p;
import yed.t;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertRevampedScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyed/t;", "Lcom/revolut/feature/shared_separate_favourites/alerts/ui/screen/create_alert/SharedCreateAlertScreenContract$InputData;", "Lyed/p;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedCreateAlertRevampedScreen extends BaseRecyclerViewScreen<t, SharedCreateAlertScreenContract$InputData, p> {
    public static final /* synthetic */ KProperty[] f0 = {o0.f186429a.j(new h0(SharedCreateAlertRevampedScreen.class, "binding", "getBinding()Lcom/revolut/feature/shared_separate_favourites/databinding/SharedCreateAlertRevampedScreenBinding;", 0))};
    public final int U;
    public final h V;
    public f W;
    public final Object X;
    public final Object Y;
    public final ihm.f Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CenteredAmountDelegate f86731a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final InputTextDelegate f86732b0;
    public final TextDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f86733d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final g f86734e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedCreateAlertRevampedScreen(SharedCreateAlertScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.shared_create_alert_revamped_screen;
        this.V = s.t(this, yed.a.f);
        this.X = w.y0(new y1a.a(this, inputData, 23));
        this.Y = w.y0(new c(this, 4));
        this.Z = v0.a.d("create(...)");
        CenteredAmountDelegate centeredAmountDelegate = new CenteredAmountDelegate(new y8a.g(this, 19));
        this.f86731a0 = centeredAmountDelegate;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f86732b0 = inputTextDelegate;
        TextDelegate textDelegate = new TextDelegate();
        this.c0 = textDelegate;
        this.f86733d0 = v.k(centeredAmountDelegate, inputTextDelegate, textDelegate);
        this.f86734e0 = new g(this, 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (l) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        int i = 0;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f183962c.f59211b), null, new yed.c(this, continuation, i), 3);
        int i2 = 1;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f183962c.d), null, new yed.c(this, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f183961b.o), null, new yed.c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Z), null, new d(this, continuation, i), 3);
        InputTextDelegate inputTextDelegate = this.f86732b0;
        com.revolut.kompot.navigable.a.g2(this, q.J(e.b(inputTextDelegate.f52575g.f121375b), e.b(inputTextDelegate.i.f121375b)), null, new yed.e(this, null), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.f86731a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(centeredAmountDelegate.f51968m.f121375b), null, new yed.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(centeredAmountDelegate.f51967l.f121375b), null, new d(this, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, new a0(e.b(inputTextDelegate.e.f121375b), 22), null, new yed.g(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        this.W = h3().f183961b.A.V();
        h3().f183962c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        h3().f183961b.setText(new TextLocalisedClause(R$string.shared_alerts_create_alert_action_save, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF106636e0() {
        return this.f86733d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getY() {
        return h3().d.getId();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(t uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        if (uiState instanceof yed.s) {
            BasicNavBar basicNavBar = h3().f183962c;
            yed.s sVar = (yed.s) uiState;
            Image image = sVar.e;
            basicNavBar.setTitle(sVar.f312900b);
            basicNavBar.setTitleEndIcon(image);
            basicNavBar.setTitleClickable(image != null);
            h3().f183961b.setEnabled(sVar.d);
            f fVar = this.W;
            if (fVar != null) {
                fVar.b(sVar.f312901c);
            } else {
                Intrinsics.r("buttonLoadingController");
                throw null;
            }
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    public final kgd.e h3() {
        ViewBinding value = this.V.getValue(this, f0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kgd.e) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final yed.q T2() {
        return (yed.q) this.Y.getValue();
    }
}
