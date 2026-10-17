package s09;

import a09.e0;
import com.revolut.feature.learn.shared.impl.data.network.LearnService;
import efm.d0;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import u09.o0;
import ufm.n;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f258914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f258915x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, ArrayList arrayList, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f258914w = kVar;
        this.f258915x = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f258914w, this.f258915x, continuation, 0);
            default:
                return new j(this.f258914w, this.f258915x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArrayList<o0> answers = this.f258915x;
        k kVar = this.f258914w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g09.i iVar = kVar.f258916l;
                String lessonId = kVar.f258918n.f78016a;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(lessonId, "lessonId");
                Intrinsics.checkNotNullParameter(answers, "answers");
                e0 e0Var = iVar.f139376a;
                e0Var.getClass();
                Intrinsics.checkNotNullParameter(lessonId, "lessonId");
                Intrinsics.checkNotNullParameter(answers, "answers");
                LearnService learnService = e0Var.f254a;
                Intrinsics.checkNotNullParameter(answers, "<this>");
                ArrayList arrayList = new ArrayList(w.t(answers, 10));
                for (o0 o0Var : answers) {
                    arrayList.add(new xz8.d(o0Var.f276140b, o0Var.f276139a));
                }
                d0<xz8.o> d0VarSubmitQuizAnswers = learnService.submitQuizAnswers(lessonId, arrayList);
                a09.d0 d0Var = a09.d0.f;
                a0.b bVar = new a0.b(4);
                d0VarSubmitQuizAnswers.getClass();
                ufm.i iVar2 = new ufm.i(d0VarSubmitQuizAnswers, bVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                n nVarI0 = te0.w.i0(iVar2);
                this.v = 1;
                Object objB = nim.a.b(nVarI0, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar = new j(kVar, answers, null, 0);
                this.v = 1;
                Object objB2 = pu7.a.B(kVar.e, "quiz_submit", jVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
