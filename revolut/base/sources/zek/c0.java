package zek;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\t\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000f\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012R\u001c\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010'\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006("}, d2 = {"Lzek/c0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "b", "i", "type", "c", "currency", "", "d", "Ljava/lang/Long;", "h", "()Ljava/lang/Long;", "startDate", "endDate", "Lzek/j;", "f", "Lzek/j;", "()Lzek/j;", "fee", "Lzek/k;", "g", "Lzek/k;", "()Lzek/k;", "limit", "quantityLimit", "j", "usage", "quantityUsage", "", "k", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isRecurring", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("startDate")
    private final Long startDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("endDate")
    private final Long endDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fee")
    private final j fee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("limit")
    private final k limit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantityLimit")
    private final Long quantityLimit;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("usage")
    private final k usage;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantityUsage")
    private final Long quantityUsage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("isRecurring")
    private final Boolean isRecurring;

    public c0(String str, String type, String currency, Long l2, Long l3, j jVar, k kVar, Long l4, k kVar2, Long l5, Boolean bool) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.name = str;
        this.type = type;
        this.currency = currency;
        this.startDate = l2;
        this.endDate = l3;
        this.fee = jVar;
        this.limit = kVar;
        this.quantityLimit = l4;
        this.usage = kVar2;
        this.quantityUsage = l5;
        this.isRecurring = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.name, c0Var.name) && Intrinsics.f(this.type, c0Var.type) && Intrinsics.f(this.currency, c0Var.currency) && Intrinsics.f(this.startDate, c0Var.startDate) && Intrinsics.f(this.endDate, c0Var.endDate) && Intrinsics.f(this.fee, c0Var.fee) && Intrinsics.f(this.limit, c0Var.limit) && Intrinsics.f(this.quantityLimit, c0Var.quantityLimit) && Intrinsics.f(this.usage, c0Var.usage) && Intrinsics.f(this.quantityUsage, c0Var.quantityUsage) && Intrinsics.f(this.isRecurring, c0Var.isRecurring);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getQuantityLimit() {
        return this.quantityLimit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getQuantityUsage() {
        return this.quantityUsage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    public final int hashCode() {
        String str = this.name;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type), 31, this.currency);
        Long l2 = this.startDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        j jVar = this.fee;
        int iHashCode3 = (iHashCode2 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        k kVar = this.limit;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Long l4 = this.quantityLimit;
        int iHashCode5 = (iHashCode4 + (l4 == null ? 0 : l4.hashCode())) * 31;
        k kVar2 = this.usage;
        int iHashCode6 = (iHashCode5 + (kVar2 == null ? 0 : kVar2.hashCode())) * 31;
        Long l5 = this.quantityUsage;
        int iHashCode7 = (iHashCode6 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Boolean bool = this.isRecurring;
        return iHashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final k getUsage() {
        return this.usage;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getIsRecurring() {
        return this.isRecurring;
    }
}
