package klf;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1 f185578a = new t1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (savingsAccountDetails == null) {
            return error;
        }
        return null;
    }
}
