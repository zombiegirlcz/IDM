package ar9;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lar9/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "", "b", "J", "()J", "amount", "currencyCode", "", "Lar9/l;", "d", "Ljava/util/List;", "()Ljava/util/List;", "payerIds", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currencyCode")
    @NotNull
    private final String currencyCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("payerIds")
    @NotNull
    private final List<l> payerIds;

    public k(String name, long j2, String currencyCode, ArrayList payerIds) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(payerIds, "payerIds");
        this.name = name;
        this.amount = j2;
        this.currencyCode = currencyCode;
        this.payerIds = payerIds;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getPayerIds() {
        return this.payerIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.name, kVar.name) && this.amount == kVar.amount && Intrinsics.f(this.currencyCode, kVar.currencyCode) && Intrinsics.f(this.payerIds, kVar.payerIds);
    }

    public final int hashCode() {
        return this.payerIds.hashCode() + p.a.c(a0.d.c(this.name.hashCode() * 31, 31, this.amount), 31, this.currencyCode);
    }
}
