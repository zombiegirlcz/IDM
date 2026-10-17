package xkf;

import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter;
import com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f306717b;

    public /* synthetic */ i1(q1 q1Var, int i) {
        this.f306716a = i;
        this.f306717b = q1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f306716a;
        Continuation continuation = null;
        q1 q1Var = this.f306717b;
        switch (i) {
            case 0:
                dii.g output = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof dii.e) {
                    q1Var.T2(new p1(q1Var, continuation, 1), new yi5.b(27));
                }
                break;
            case 1:
                eii.k output2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                if (output2 instanceof eii.i) {
                    Object obj3 = ((eii.i) output2).f126655a;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transaction.troubleshooter.api.domain.models.Troubleshooter");
                    Troubleshooter troubleshooter = (Troubleshooter) obj3;
                    String str = troubleshooter.f91845j;
                    if (str != null) {
                        q1Var.T2(new xec.c0(q1Var, str, continuation, 24), new yi5.b(27));
                    } else {
                        q1Var.A2(new TransactionTroubleshooterDestination(new TransactionTroubleshooterDestination.Details(q1Var.f306753l.f185494j, troubleshooter, mff.a.TRANSACTION)));
                    }
                }
                break;
            default:
                dii.g output3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (output3 instanceof dii.e) {
                    q1Var.A2(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
                } else if (output3 instanceof dii.f) {
                    q1Var.T2(new p1(q1Var, continuation, 0), new yi5.b(27));
                } else {
                    Unit unit = Unit.f186387a;
                }
                break;
        }
        return Unit.f186387a;
    }
}
