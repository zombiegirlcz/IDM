package fy6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f138955a = new w();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Pair pair = (Pair) obj2;
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        return new g((FreelancerInvoice) pair.f186385a, (FreelancerInvoiceSettings) pair.f186386b);
    }
}
