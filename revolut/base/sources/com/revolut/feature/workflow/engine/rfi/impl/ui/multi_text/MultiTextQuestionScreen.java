package com.revolut.feature.workflow.engine.rfi.impl.ui.multi_text;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import iuh.a;
import iuh.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import ot1.p;
import ouh.c;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/rfi/impl/ui/multi_text/MultiTextQuestionScreen;", "Lcom/revolut/feature/workflow/engine/rfi/impl/ui/base/BaseQuestionScreen;", "Lcom/revolut/shared/feature/workflow/engine/api/models/workflow/Question$MultiText;", "Lcom/revolut/feature/workflow/engine/rfi/api/models/Answer$MultiText;", "Lno/m;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MultiTextQuestionScreen extends BaseQuestionScreen<Question.MultiText, Answer.MultiText> implements m {
    public static final /* synthetic */ int U = 0;
    public final AnalyticsProduct.Shared P;
    public final InputTextDelegate Q;
    public final Object R;
    public final Object S;
    public final List T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTextQuestionScreen(BaseQuestionScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.P = a.f168605a;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.Q = inputTextDelegate;
        this.R = w.y0(new p(this, inputData, 2));
        this.S = w.y0(new os2.a(this, 6));
        this.T = u.c(inputTextDelegate);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (puh.a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (c) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen, com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.b3(view);
        ViewController.P2(this, rd0.e.b(this.Q.e.f121375b), new ouh.b(2, 4, c.class, (c) this.S.getValue(), "onTextChanged", "onTextChanged(Lcom/revolut/core/ui_kit/delegates/InputTextDelegate$TextData;)V"), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen
    public final h e3() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen
    /* JADX INFO: renamed from: f3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
