package t75;

import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f268587a = new d();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LoanDetails it8 = (LoanDetails) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.f70152n.e;
    }
}
