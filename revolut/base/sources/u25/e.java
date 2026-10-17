package u25;

import com.revolut.feature.credit.loan.api.models.rev10.Loan;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class e extends q implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Loan p0 = (Loan) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((w25.a) this.receiver).a(p0);
    }
}
