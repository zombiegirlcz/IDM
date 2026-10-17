package ozc;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f231280b;

    public /* synthetic */ h0(l0 l0Var, int i) {
        this.f231279a = i;
        this.f231280b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f231279a) {
            case 0:
                f0d.d question = (f0d.d) obj2;
                Intrinsics.checkNotNullParameter(question, "question");
                t tVar = (t) this.f231280b.f231293a;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(question, "question");
                return new rfm.e(te0.w.f(h.QUESTION), te0.w.A0(((s0) tVar.f231329b).I0(), question), 0);
            case 1:
                List answers = (List) obj2;
                Intrinsics.checkNotNullParameter(answers, "answers");
                d dVar = this.f231280b.f231293a;
                List answers2 = zhm.d0.V0(answers, answers.size() - 1);
                t tVar2 = (t) dVar;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(answers2, "answers");
                return new rfm.e(te0.w.f(zhm.d0.m0(answers)), te0.w.z0(((s0) tVar2.f231329b).y0(), answers2), 0);
            case 2:
                od0.i answer = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(answer, "answer");
                l0 l0Var = this.f231280b;
                efm.d0 d0VarC = te0.w.C(((s0) ((t) l0Var.f231293a).f231329b).y0());
                p pVar = new p(27, new i0(l0Var, answer, 0));
                d0VarC.getClass();
                return new pfm.a(d0VarC, pVar, 4);
            case 3:
                List questions = (List) obj2;
                Intrinsics.checkNotNullParameter(questions, "questions");
                d dVar2 = this.f231280b.f231293a;
                List questions2 = zhm.d0.V(questions, 1);
                t tVar3 = (t) dVar2;
                tVar3.getClass();
                Intrinsics.checkNotNullParameter(questions2, "questions");
                s0 s0Var = (s0) tVar3.f231329b;
                return new rfm.e(te0.w.f(zhm.d0.b0(questions)), te0.w.z0(s0Var.f231324s.getValue(s0Var, s0.z[17]), questions2), 0);
            case 4:
                od0.i question2 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(question2, "question");
                l0 l0Var2 = this.f231280b;
                s0 s0Var2 = (s0) ((t) l0Var2.f231293a).f231329b;
                efm.d0 d0VarC2 = te0.w.C(s0Var2.f231324s.getValue(s0Var2, s0.z[17]));
                p pVar2 = new p(28, new i0(l0Var2, question2, 1));
                d0VarC2.getClass();
                return new pfm.a(d0VarC2, pVar2, 4);
            default:
                f0d.d question3 = (f0d.d) obj2;
                Intrinsics.checkNotNullParameter(question3, "answer");
                t tVar4 = (t) this.f231280b.f231293a;
                tVar4.getClass();
                Intrinsics.checkNotNullParameter(question3, "question");
                return new rfm.e(te0.w.f(h.QUESTION), te0.w.A0(((s0) tVar4.f231329b).I0(), question3), 0);
        }
    }
}
