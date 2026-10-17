package ku0;

import com.revolut.core.ui_kit.internal.views.quiz.QuizCardView;
import com.revolut.core.ui_kit.internal.views.quiz.QuizView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ QuizView f189588b;

    public /* synthetic */ f(QuizView quizView, int i) {
        this.f189587a = i;
        this.f189588b = quizView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f189587a;
        QuizView quizView = this.f189588b;
        switch (i) {
            case 0:
                QuizCardView quizCardView = quizView.f;
                d dVar = (d) obj2;
                int i2 = QuizView.k;
                int i3 = dVar == null ? -1 : h.f189589a[dVar.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        quizCardView.b();
                    } else if (i3 == 2) {
                        quizCardView.a();
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        quizCardView.d();
                        quizCardView.c();
                    }
                }
                return Unit.f186387a;
            default:
                int i5 = QuizView.k;
                if (((Boolean) obj2).booleanValue()) {
                    quizView.f.c();
                } else {
                    quizView.f.a();
                }
                return Unit.f186387a;
        }
    }
}
