package yic;

import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f314299a = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        e domainState = (e) obj2;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (RentAndBillsLinkedPayments) domainState.f314277a.getContent();
    }
}
