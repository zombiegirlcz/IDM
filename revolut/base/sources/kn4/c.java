package kn4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0015"}, d2 = {"Lkn4/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "cardholderId", "e", "firstName", "c", "f", "lastName", "", "d", "J", "()J", "currentMonthlyLimit", "cappedMonthlyLimit", "currency", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardholderId")
    @NotNull
    private final String cardholderId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("firstName")
    @NotNull
    private final String firstName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastName")
    @NotNull
    private final String lastName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currentMonthlyLimit")
    private final long currentMonthlyLimit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cappedMonthlyLimit")
    private final long cappedMonthlyLimit;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCappedMonthlyLimit() {
        return this.cappedMonthlyLimit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardholderId() {
        return this.cardholderId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCurrentMonthlyLimit() {
        return this.currentMonthlyLimit;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.cardholderId, cVar.cardholderId) && Intrinsics.f(this.firstName, cVar.firstName) && Intrinsics.f(this.lastName, cVar.lastName) && this.currentMonthlyLimit == cVar.currentMonthlyLimit && this.cappedMonthlyLimit == cVar.cappedMonthlyLimit && Intrinsics.f(this.currency, cVar.currency);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    public final int hashCode() {
        return this.currency.hashCode() + a0.d.c(a0.d.c(p.a.c(p.a.c(this.cardholderId.hashCode() * 31, 31, this.firstName), 31, this.lastName), 31, this.currentMonthlyLimit), 31, this.cappedMonthlyLimit);
    }
}
