package sn8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\f\u0010\u0016R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000fR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006!"}, d2 = {"Lsn8/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "type", "b", "currency", "", "c", "Ljava/lang/Long;", "g", "()Ljava/lang/Long;", "price", "d", "e", "limit", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "feePc", "", "f", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "free", "i", "usage", "endDate", "limitUnit", "feature_junior_settings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    private final Long price;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("limit")
    private final Long limit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("feePc")
    private final Double feePc;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("free")
    private final Boolean free;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("usage")
    private final Long usage;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final Long endDate;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("limitUnit")
    private final String limitUnit;

    public b(String type, String str, Long l2, Long l3, Double d, Boolean bool, Long l4, Long l5, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.currency = str;
        this.price = l2;
        this.limit = l3;
        this.feePc = d;
        this.free = bool;
        this.usage = l4;
        this.endDate = l5;
        this.limitUnit = str2;
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
    public final Double getFeePc() {
        return this.feePc;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getFree() {
        return this.free;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getLimit() {
        return this.limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.currency, bVar.currency) && Intrinsics.f(this.price, bVar.price) && Intrinsics.f(this.limit, bVar.limit) && Intrinsics.f(this.feePc, bVar.feePc) && Intrinsics.f(this.free, bVar.free) && Intrinsics.f(this.usage, bVar.usage) && Intrinsics.f(this.endDate, bVar.endDate) && Intrinsics.f(this.limitUnit, bVar.limitUnit);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLimitUnit() {
        return this.limitUnit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Long getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.price;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.limit;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Double d = this.feePc;
        int iHashCode5 = (iHashCode4 + (d == null ? 0 : d.hashCode())) * 31;
        Boolean bool = this.free;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l4 = this.usage;
        int iHashCode7 = (iHashCode6 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.endDate;
        int iHashCode8 = (iHashCode7 + (l5 == null ? 0 : l5.hashCode())) * 31;
        String str2 = this.limitUnit;
        return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getUsage() {
        return this.usage;
    }
}
