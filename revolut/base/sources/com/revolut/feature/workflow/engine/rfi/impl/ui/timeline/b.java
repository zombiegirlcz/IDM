package com.revolut.feature.workflow.engine.rfi.impl.ui.timeline;

import aii.r;
import cli.g;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.timeline.TimelineQuestionScreenContract$ModalStep;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import iuh.e;
import iuh.k;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.z;
import mra.d;
import org.jetbrains.annotations.NotNull;
import suh.h;
import suh.j;
import suh.m;
import suh.n;
import vkm.j2;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends k implements h {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f96574q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f96575r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96576s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BaseQuestionScreenContract$InputData inputData, iuh.b answerValidator, m stateMapper, a datePickerDialogModelFactory) {
        super(inputData, stateMapper, answerValidator);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(answerValidator, "answerValidator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(datePickerDialogModelFactory, "datePickerDialogModelFactory");
        this.f96574q = datePickerDialogModelFactory;
        Question question = inputData.f96544b;
        j jVar = Companion;
        String str = ((Question.Timeline) question).f105628a;
        f0 f0Var = f0.f322471a;
        Answer.Timeline timeline = new Answer.Timeline(str, f0Var);
        jVar.getClass();
        this.f96575r = d.b(this, new e(question, Answer.Timeline.b(timeline, d0.F0(new Answer.Timeline.Item("", null, null), f0Var)), inputData.f96543a, false), stateMapper, null, false, 12);
        this.f96576s = new com.revolut.kompot.navigable.vc.modal.a(this, new suf.a(this, 1));
    }

    public static Unit J2(b bVar, TimelineQuestionScreenContract$ModalStep timelineQuestionScreenContract$ModalStep, r result) {
        Intrinsics.checkNotNullParameter(result, "result");
        long jL2 = L2(result);
        j jVar = Companion;
        Answer answer = ((e) ((j2) bVar.f96575r.f22677a).getValue()).f168607b;
        if (answer == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Answer.Timeline timeline = (Answer.Timeline) answer;
        int i = ((TimelineQuestionScreenContract$ModalStep.StartDatePicker) timelineQuestionScreenContract$ModalStep).f96567a;
        jVar.getClass();
        List list = timeline.f96533b;
        if (i < list.size()) {
            ArrayList arrayListF1 = d0.f1(list);
            Answer.Timeline.Item item = (Answer.Timeline.Item) list.get(i);
            Intrinsics.checkNotNullParameter(item, "item");
            arrayListF1.set(i, Answer.Timeline.Item.a(item, null, Long.valueOf(jL2), null, 5));
            Unit unit = Unit.f186387a;
            list = arrayListF1;
        }
        bVar.I2(Answer.Timeline.b(timeline, list));
        return Unit.f186387a;
    }

    public static Unit K2(b bVar, TimelineQuestionScreenContract$ModalStep timelineQuestionScreenContract$ModalStep, r result) {
        Intrinsics.checkNotNullParameter(result, "result");
        long jL2 = L2(result);
        j jVar = Companion;
        Answer answer = ((e) ((j2) bVar.f96575r.f22677a).getValue()).f168607b;
        if (answer == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Answer.Timeline timeline = (Answer.Timeline) answer;
        int i = ((TimelineQuestionScreenContract$ModalStep.EndDatePicker) timelineQuestionScreenContract$ModalStep).f96563a;
        jVar.getClass();
        List list = timeline.f96533b;
        if (i < list.size()) {
            ArrayList arrayListF1 = d0.f1(list);
            Answer.Timeline.Item item = (Answer.Timeline.Item) list.get(i);
            Intrinsics.checkNotNullParameter(item, "item");
            arrayListF1.set(i, Answer.Timeline.Item.a(item, null, null, Long.valueOf(jL2), 3));
            Unit unit = Unit.f186387a;
            list = arrayListF1;
        }
        bVar.I2(Answer.Timeline.b(timeline, list));
        return Unit.f186387a;
    }

    public static long L2(r rVar) {
        if (rVar instanceof hii.a) {
            return ebm.a.P(((hii.a) rVar).f152606a);
        }
        if (rVar instanceof gii.a) {
            LocalDate localDateAtDay = ((gii.a) rVar).f144218a.atDay(1);
            Intrinsics.checkNotNullExpressionValue(localDateAtDay, "atDay(...)");
            return ebm.a.P(localDateAtDay);
        }
        if (rVar instanceof n) {
            LocalDate localDateOf = LocalDate.of(((n) rVar).f265771a, 1, 1);
            Intrinsics.checkNotNullExpressionValue(localDateOf, "of(...)");
            return ebm.a.P(localDateOf);
        }
        throw new IllegalArgumentException("Unexpected result type: " + rVar);
    }

    public final void M2() {
        j jVar = Companion;
        Answer answer = ((e) ((j2) this.f96575r.f22677a).getValue()).f168607b;
        if (answer == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Answer.Timeline timeline = (Answer.Timeline) answer;
        jVar.getClass();
        I2(Answer.Timeline.b(timeline, d0.F0(new Answer.Timeline.Item("", null, null), timeline.f96533b)));
    }

    public final void N2(int i) {
        j jVar = Companion;
        Answer answer = ((e) ((j2) this.f96575r.f22677a).getValue()).f168607b;
        if (answer == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Answer.Timeline timeline = (Answer.Timeline) answer;
        jVar.getClass();
        List list = timeline.f96533b;
        int size = list.size();
        List list2 = list;
        if (i < size) {
            ArrayList arrayListF1 = d0.f1(list);
            arrayListF1.remove(i);
            Unit unit = Unit.f186387a;
            list2 = arrayListF1;
        }
        I2(Answer.Timeline.b(timeline, list2));
    }

    public final void O2(InputTextDelegate.TextData textData) {
        Integer numM;
        Intrinsics.checkNotNullParameter(textData, "textData");
        if (!a0.H(textData.f52597a, "INPUT_TEXT_ID", false) || (numM = z.m(kotlin.text.d0.e0(textData.f52597a, "INPUT_TEXT_ID_"))) == null) {
            return;
        }
        int iIntValue = numM.intValue();
        j jVar = Companion;
        Answer answer = ((e) ((j2) this.f96575r.f22677a).getValue()).f168607b;
        if (answer == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Answer.Timeline timeline = (Answer.Timeline) answer;
        jVar.getClass();
        List list = timeline.f96533b;
        if (iIntValue < list.size()) {
            ArrayList arrayListF1 = d0.f1(list);
            Answer.Timeline.Item item = (Answer.Timeline.Item) list.get(iIntValue);
            Intrinsics.checkNotNullParameter(item, "item");
            arrayListF1.set(iIntValue, Answer.Timeline.Item.a(item, textData.f52598b.toString(), null, null, 6));
            Unit unit = Unit.f186387a;
            list = arrayListF1;
        }
        I2(Answer.Timeline.b(timeline, list));
    }

    @Override // iuh.k, cli.z
    public final g getState() {
        return this.f96575r;
    }
}
