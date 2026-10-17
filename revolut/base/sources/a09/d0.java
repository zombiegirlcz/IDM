package a09;

import com.revolut.feature.learn.shared.models.domain.LearnReward;
import com.revolut.feature.learn.shared.models.domain.LearnShareReward;
import com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizAction;
import com.revolut.feature.learn.shared.models.domain.LearnSubmitQuizNextStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u09.l0;
import u09.m0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0 extends kotlin.jvm.internal.q implements Function1 {
    public static final d0 f = new d0();

    public d0() {
        super(1, nz8.k.class, "toDomain", "toDomain(Lcom/revolut/feature/learn/shared/impl/data/network/dto/quiz/submit/QuizSubmitResponseDto;)Lcom/revolut/feature/learn/shared/models/domain/LearnSubmitQuizModel;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LearnShareReward learnShareReward;
        LearnSubmitQuizNextStep lesson;
        xz8.o p0 = (xz8.o) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        LearnShareReward learnShareReward2 = null;
        ArrayList arrayList = null;
        if (!(p0 instanceof xz8.a)) {
            if (!(p0 instanceof xz8.p)) {
                throw new NoWhenBranchMatchedException();
            }
            xz8.p pVar = (xz8.p) p0;
            xz8.g gVar = pVar.f309906b;
            u09.k0 k0Var = new u09.k0(gVar.f309896a, gVar.f309897b);
            xz8.j jVar = pVar.d;
            if (jVar != null) {
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                learnShareReward2 = new LearnShareReward(cj9.c.P(jVar.e), jVar.f, jVar.f309901c, jVar.f309899a, jVar.f309900b, jVar.d);
            }
            return new m0(k0Var, learnShareReward2);
        }
        xz8.a aVar = (xz8.a) p0;
        xz8.g gVar2 = aVar.f309888c;
        u09.k0 k0Var2 = new u09.k0(gVar2.f309896a, gVar2.f309897b);
        xz8.j jVar2 = aVar.f309889g;
        if (jVar2 != null) {
            Intrinsics.checkNotNullParameter(jVar2, "<this>");
            learnShareReward = new LearnShareReward(cj9.c.P(jVar2.e), jVar2.f, jVar2.f309901c, jVar2.f309899a, jVar2.f309900b, jVar2.d);
        } else {
            learnShareReward = null;
        }
        LearnReward learnRewardB = nz8.j.b(aVar.f);
        yz8.c cVar = aVar.e;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        if (cVar instanceof yz8.a) {
            lesson = new LearnSubmitQuizNextStep.Course(((yz8.a) cVar).f318046b);
        } else if (cVar instanceof yz8.d) {
            lesson = new LearnSubmitQuizNextStep.Lesson(((yz8.d) cVar).f318049b);
        } else {
            if (!Intrinsics.f(cVar, yz8.e.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            lesson = LearnSubmitQuizNextStep.None.f78038a;
        }
        List list = aVar.f309887b;
        if (list != null) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            List<xz8.m> list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (xz8.m mVar : list2) {
                arrayList.add(new LearnSubmitQuizAction(mVar.f309904b, mVar.f309903a));
            }
        }
        return new l0(k0Var2, learnShareReward, learnRewardB, lesson, arrayList);
    }
}
