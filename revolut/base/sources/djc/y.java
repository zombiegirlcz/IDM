package djc;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f115322a = new y();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        i domainState = (i) obj2;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (RentAndBillsLinkedPayments) domainState.f115301c.getContent();
    }
}
