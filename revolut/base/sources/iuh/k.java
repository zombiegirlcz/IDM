package iuh;

import cli.y;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import is6.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class k extends oki.h implements h {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f168616p;

    public k(BaseQuestionScreenContract$InputData inputData, j stateMapper, b answerValidator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(answerValidator, "answerValidator");
        this.o = answerValidator;
        this.f168616p = mra.d.b(this, new e(inputData.f96544b, null, inputData.f96543a, false), stateMapper, null, false, 12);
    }

    public final void I2(Answer answer) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        H2(getState(), new t(answer, this, 14));
    }

    public cli.g getState() {
        return this.f168616p;
    }
}
