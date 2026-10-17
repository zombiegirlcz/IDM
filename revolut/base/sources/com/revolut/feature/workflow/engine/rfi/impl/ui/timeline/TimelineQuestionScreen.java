package com.revolut.feature.workflow.engine.rfi.impl.ui.timeline;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import suh.d;
import suh.f;
import suh.g;
import suh.h;
import te0.w;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/impl/ui/timeline/TimelineQuestionScreen;", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/base/BaseQuestionScreen;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$Timeline;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$Timeline;", "Lno/m;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimelineQuestionScreen extends BaseQuestionScreen<Question.Timeline, Answer.Timeline> implements m {
    public static final /* synthetic */ int X = 0;
    public final AnalyticsProduct.Shared P;
    public final ListSubheaderDelegate Q;
    public final InputDualTextDelegate R;
    public final InputTextDelegate S;
    public final SmallActionButtonDelegate T;
    public final Object U;
    public final Object V;
    public final List W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimelineQuestionScreen(BaseQuestionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = iuh.a.f168605a;
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.Q = listSubheaderDelegate;
        InputDualTextDelegate inputDualTextDelegate = new InputDualTextDelegate(null, 3);
        this.R = inputDualTextDelegate;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.S = inputTextDelegate;
        SmallActionButtonDelegate smallActionButtonDelegate = new SmallActionButtonDelegate();
        this.T = smallActionButtonDelegate;
        this.U = w.y0(new s86.a(this, inputData, 28));
        this.V = w.y0(new sii.a(this, 8));
        this.W = v.k(listSubheaderDelegate, inputDualTextDelegate, inputTextDelegate, smallActionButtonDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (tuh.a) this.U.getValue();
    }

    @Override // com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        ViewController.P2(this, rd0.e.b(this.Q.f52707c), new suh.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.S.e.f121375b), new d(2, 4, h.class, h3(), "onTextChanged", "onTextChanged(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$TextData;)V"), 3);
        InputDualTextDelegate inputDualTextDelegate = this.R;
        ViewController.P2(this, rd0.e.b(inputDualTextDelegate.f52549c.f52575g.f121375b), new suh.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputDualTextDelegate.d.f52575g.f121375b), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.T.f53336c.f121375b), new g(this, null), 3);
    }

    @Override // com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final List getW() {
        return this.W;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final h e3() {
        return (h) this.V.getValue();
    }
}
