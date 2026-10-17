package c55;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes13.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij0.a f21456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f21458c;
    public final Object d;
    public final Object e;

    public s(ij0.a networkConfiguration) {
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f21456a = networkConfiguration;
        this.f21457b = r0.k(new Pair("PERSONAL_LOAN", q35.w.PersonalLoan), new Pair("SECURED_LOAN", q35.w.SecuredLoan), new Pair("CONSUMER_LOAN", q35.w.ConsumerLoan), new Pair("LEASING", q35.w.Leasing), new Pair("REFURBISHMENT_LOAN", q35.w.RefurbishmentLoan), new Pair("CAR_LOAN", q35.w.CarLoan), new Pair("MORTGAGE", q35.w.Mortgage), new Pair("CREDIT_CARD", q35.w.CreditCard), new Pair("CREDIT_LINE", q35.w.CreditLine), new Pair("OVERDRAFT", q35.w.Overdraft));
        this.f21458c = r0.k(new Pair("NPO", q35.u.Npo), new Pair("NPO_CASH", q35.u.NpoCash), new Pair("CPO", q35.u.Cpo), new Pair("INTERNAL", q35.u.Internal));
        this.d = r0.k(new Pair("PENDING", q35.v.Pending), new Pair("COMPLETED", q35.v.Completed), new Pair("FALLBACK", q35.v.Fallback), new Pair("FAILED", q35.v.Failed));
        this.e = r0.k(new Pair("IN_PROGRESS", q35.y.InProgress), new Pair("COMPLETED", q35.y.Completed));
    }
}
