package com.revolut.feature.shared.help_centre.impl.faq.screens.feedback;

import aii.q;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.faq.screens.feedback.SharedEditFaqFeedbackScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import i8d.b;
import i8d.i;
import i8d.j;
import i8d.k;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r7d.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/feedback/SharedEditFaqFeedbackScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Li8d/b;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/feedback/EditFaqFeedbackScreenContract$InputData;", "Laii/q;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SharedEditFaqFeedbackScreen extends BaseRecyclerViewScreen<b, EditFaqFeedbackScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(SharedEditFaqFeedbackScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final SuggestionsBarDelegate U;
    public final InputTextDelegate V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f86252a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f86253b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedEditFaqFeedbackScreen(EditFaqFeedbackScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = new SuggestionsBarDelegate();
        this.V = new InputTextDelegate(null);
        this.W = s.t(this, i8d.h.f);
        this.X = true;
        this.Y = w.y0(new i1d.b(this, inputData, 6));
        this.Z = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.f86252a0 = w.y0(new Function0(this) { // from class: i8d.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedEditFaqFeedbackScreen f159514b;

            {
                this.f159514b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SharedEditFaqFeedbackScreen sharedEditFaqFeedbackScreen = this.f159514b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SharedEditFaqFeedbackScreen.c0;
                        return (e) ((r7d.e) sharedEditFaqFeedbackScreen.Y.getValue()).f252109c.get();
                    default:
                        return v.k(sharedEditFaqFeedbackScreen.U, sharedEditFaqFeedbackScreen.V);
                }
            }
        });
        final int i2 = 1;
        this.f86253b0 = w.y0(new Function0(this) { // from class: i8d.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SharedEditFaqFeedbackScreen f159514b;

            {
                this.f159514b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SharedEditFaqFeedbackScreen sharedEditFaqFeedbackScreen = this.f159514b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SharedEditFaqFeedbackScreen.c0;
                        return (e) ((r7d.e) sharedEditFaqFeedbackScreen.Y.getValue()).f252109c.get();
                    default:
                        return v.k(sharedEditFaqFeedbackScreen.U, sharedEditFaqFeedbackScreen.V);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (e) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (i8d.e) this.f86252a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new i(this, continuation, 0), 3);
        a.g2(this, rd0.e.b(this.U.p().d), null, new j(this, null), 3);
        a.g2(this, rd0.e.b(this.V.e.f121375b), null, new k(this, null), 3);
        r rVarThrottleFirst = h3().f174564b.o.throttleFirst(ViewConfiguration.getDoubleTapTimeout(), TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleFirst, "throttleFirst(...)");
        a.g2(this, rd0.e.b(rVarThrottleFirst), null, new i(this, continuation, 1), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF84473b0() {
        return (List) this.f86253b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(b uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f159501a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        LargeActionButton largeActionButton = h3().f174564b;
        largeActionButton.setText(uiState.f159502b);
        largeActionButton.setEnabled(uiState.f159503c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Z;
    }

    public final u h3() {
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
