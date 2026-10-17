package xal;

import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f303909w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f303909w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f303909w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            h hVar = this.v;
            SuspiciousTransactionDialog.Screen.Cancel.Survey survey = hVar.f303912q.f303904a.f104950g;
            if (survey == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String questionType = survey.f104951a;
            fal.b bVar = hVar.f303911p;
            String transactionId = hVar.f303913r;
            pal.a aVar2 = (pal.a) bVar;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(questionType, "questionType");
            String answerId = this.f303909w;
            Intrinsics.checkNotNullParameter(answerId, "answerId");
            ial.f fVar = (ial.f) aVar2.f234578a;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(questionType, "questionType");
            Intrinsics.checkNotNullParameter(answerId, "answerId");
            r rVarG0 = w.g0(fVar.f160059a.postAnswers(transactionId, new ral.h(a0.d.x(questionType, answerId))));
            this.u = 1;
            if (nim.a.a(rVarG0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
