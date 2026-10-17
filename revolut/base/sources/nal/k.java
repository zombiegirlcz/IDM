package nal;

import com.revolut.shared.feature.suspicious_transaction.api.models.QuestionAndAnswer;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogAnswer;
import com.revolut.shared.feature.suspicious_transaction.impl.data.service.SuspiciousTransactionService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.shared.feature.suspicious_transaction.impl.flow.a f213934w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f213934w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f213934w, continuation, 0);
            case 1:
                return new k(this.f213934w, continuation, 1);
            default:
                return new k(this.f213934w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        Continuation continuation = null;
        com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar = this.f213934w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    j jVar = new j(aVar, continuation, 0);
                    this.v = 1;
                    if (aVar.p2(this, jVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    j jVar2 = new j(aVar, continuation, i2);
                    this.v = 1;
                    if (aVar.p2(this, jVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    fal.b bVar = aVar.f105004y;
                    String transactionId = aVar.B.f104999a;
                    ArrayList<QuestionAndAnswer> answers = aVar.D;
                    pal.a aVar5 = (pal.a) bVar;
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    Intrinsics.checkNotNullParameter(answers, "answers");
                    ial.f fVar = (ial.f) aVar5.f234578a;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(transactionId, "transactionId");
                    Intrinsics.checkNotNullParameter(answers, "answers");
                    SuspiciousTransactionService suspiciousTransactionService = fVar.f160059a;
                    Object obj3 = sal.a.f261455a;
                    Intrinsics.checkNotNullParameter(answers, "<this>");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (QuestionAndAnswer questionAndAnswer : answers) {
                        if (!questionAndAnswer.f104908a.getF104967a()) {
                            SuspiciousTransactionDialog suspiciousTransactionDialog = questionAndAnswer.f104908a;
                            SuspiciousTransactionDialog.Question question = suspiciousTransactionDialog instanceof SuspiciousTransactionDialog.Question ? (SuspiciousTransactionDialog.Question) suspiciousTransactionDialog : null;
                            if (question != null && (str = question.e) != null) {
                                SuspiciousTransactionDialogAnswer suspiciousTransactionDialogAnswer = questionAndAnswer.f104909b;
                                if (suspiciousTransactionDialogAnswer == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                linkedHashMap.put(str, suspiciousTransactionDialogAnswer.f104973a);
                            }
                        }
                    }
                    r rVarG0 = w.g0(suspiciousTransactionService.postAnswers(transactionId, new ral.h(linkedHashMap)));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
