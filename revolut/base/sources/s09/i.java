package s09;

import com.revolut.feature.learn.shared.impl.ui.lesson.LessonScreenContract$QuizStatusViewPayload;
import com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.c {
    public LessonScreenContract$QuizStatusViewPayload u;
    public LearnSubmitQuizNextStep.Lesson v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f258911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f258912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f258913y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, gim.c cVar) {
        super(cVar);
        this.f258912x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f258911w = obj2;
        this.f258913y |= Integer.MIN_VALUE;
        return this.f258912x.f3(null, this);
    }
}
