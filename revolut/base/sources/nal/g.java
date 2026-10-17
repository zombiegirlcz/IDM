package nal;

import com.revolut.shared.feature.suspicious_transaction.api.models.Action;
import com.revolut.shared.feature.suspicious_transaction.api.models.ActionButton;
import com.revolut.shared.feature.suspicious_transaction.api.models.QuestionAndAnswer;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogAnswer;
import com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step;
import d67.s;
import d67.t;
import d67.u;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.v9;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213927a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.shared.feature.suspicious_transaction.impl.flow.a f213928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SuspiciousTransactionFlowContract$Step f213929c;

    public /* synthetic */ g(SuspiciousTransactionFlowContract$Step suspiciousTransactionFlowContract$Step, com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar) {
        this.f213929c = suspiciousTransactionFlowContract$Step;
        this.f213928b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Action action;
        Action action2;
        switch (this.f213927a) {
            case 0:
                u outputData = (u) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean zF = Intrinsics.f(outputData, s.f111464a);
                SuspiciousTransactionFlowContract$Step suspiciousTransactionFlowContract$Step = this.f213929c;
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar = this.f213928b;
                if (zF) {
                    ActionButton actionButton = (ActionButton) d0.e0(0, ((SuspiciousTransactionFlowContract$Step.Screen) suspiciousTransactionFlowContract$Step).a().b());
                    if (actionButton != null && (action2 = actionButton.f104902c) != null) {
                        aVar.T2(action2);
                    }
                } else if (Intrinsics.f(outputData, t.f111465a)) {
                    ActionButton actionButton2 = (ActionButton) d0.e0(1, ((SuspiciousTransactionFlowContract$Step.Screen) suspiciousTransactionFlowContract$Step).a().b());
                    if (actionButton2 != null && (action = actionButton2.f104902c) != null) {
                        aVar.T2(action);
                    }
                } else if (Intrinsics.f(outputData, d67.q.f111462a)) {
                    aVar.q2();
                }
                break;
            default:
                cbl.c outputData2 = (cbl.c) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar2 = this.f213928b;
                ArrayList arrayList = aVar2.D;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((QuestionAndAnswer) it8.next()).f104908a);
                }
                SuspiciousTransactionDialog.Question question = outputData2.f22892a;
                SuspiciousTransactionDialogAnswer suspiciousTransactionDialogAnswer = outputData2.f22893b;
                int iIndexOf = arrayList2.indexOf(question);
                if (iIndexOf == -1) {
                    arrayList.add(new QuestionAndAnswer(outputData2.f22892a, suspiciousTransactionDialogAnswer));
                } else {
                    SuspiciousTransactionDialog dialog = ((QuestionAndAnswer) arrayList.get(iIndexOf)).f104908a;
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    arrayList.set(iIndexOf, new QuestionAndAnswer(dialog, suspiciousTransactionDialogAnswer));
                }
                ((SuspiciousTransactionFlowContract$Step.Question) this.f213929c).f104991b = suspiciousTransactionDialogAnswer;
                SuspiciousTransactionFlowContract$Step suspiciousTransactionFlowContract$StepQ2 = aVar2.Q2();
                if (suspiciousTransactionFlowContract$StepQ2 == null) {
                    aVar2.U2();
                } else if (suspiciousTransactionFlowContract$StepQ2 instanceof SuspiciousTransactionFlowContract$Step.Question) {
                    aVar2.R2(suspiciousTransactionFlowContract$StepQ2);
                } else {
                    aVar2.l2(new n3j.w(aVar2, suspiciousTransactionFlowContract$StepQ2, (Continuation) null, 18), new v9(1, aVar2, com.revolut.shared.feature.suspicious_transaction.impl.flow.a.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 29));
                }
                break;
        }
        return Unit.f186387a;
    }

    public /* synthetic */ g(com.revolut.shared.feature.suspicious_transaction.impl.flow.a aVar, SuspiciousTransactionFlowContract$Step suspiciousTransactionFlowContract$Step) {
        this.f213928b = aVar;
        this.f213929c = suspiciousTransactionFlowContract$Step;
    }
}
