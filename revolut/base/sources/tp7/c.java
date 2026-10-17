package tp7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.binary_questions.BinaryQuestionsScreen;
import ip0.y;
import kl7.p1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BinaryQuestionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BinaryQuestionsScreen binaryQuestionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = binaryQuestionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.Z.getValue();
        Object obj3 = yVar.f167227c;
        Object obj4 = yVar.f167226b.f58324n;
        iVar.getClass();
        p1 p1Var = obj3 instanceof p1 ? (p1) obj3 : null;
        Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
        if (p1Var != null && bool != null) {
            iVar.x2(new tkm.d(p1Var, bool, 12));
        }
        return Unit.f186387a;
    }
}
