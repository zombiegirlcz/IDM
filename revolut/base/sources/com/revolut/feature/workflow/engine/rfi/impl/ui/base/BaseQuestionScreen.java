package com.revolut.feature.workflow.engine.rfi.impl.ui.base;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import dli.a;
import iug.j;
import iuh.c;
import iuh.d;
import iuh.f;
import iuh.i;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tx0.j0;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/impl/ui/base/BaseQuestionScreen;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question;", "Q", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer;", "A", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liuh/f;", "Ldli/a;", "Liuh/i;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseQuestionScreen<Q extends Question, A extends Answer> extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] O = {o0.f186429a.j(new h0(BaseQuestionScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final h K;
    public final int L;
    public final boolean M;
    public final Object N;

    public BaseQuestionScreen(BaseQuestionScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, c.f);
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = w.y0(new ie7.a(this, 29));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextClause textClause = uiState.f168611a;
        navBarWithToolbar.setTitle(textClause, null);
        navBarWithToolbar.setToolbarTitle(textClause);
        Clause clause = uiState.f168612b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(0);
        largeActionButton.setEnabled(uiState.f168613c);
        largeActionButton.setText(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Continuation continuation = null;
        ViewController.P2(this, e.b(navBarWithToolbar.f59410q), new d(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, e.b(navBarWithToolbar.p0()), new j(this, continuation, i), 3);
        ViewController.P2(this, e.b(d3().f174564b.o), new d(this, continuation, i), 3);
    }

    public final u d3() {
        ViewBinding value = this.K.getValue(this, O[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    public abstract iuh.h e3();

    /* JADX INFO: renamed from: f3 */
    public abstract List getT();

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
