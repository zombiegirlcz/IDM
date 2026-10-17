package gfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\t\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u000f\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b!\u0010\u001dR\u001c\u0010#\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001c\u0010'\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u001f\u0010&¨\u0006("}, d2 = {"Lgfk/r0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "name", "b", "j", "type", "c", "currency", "", "d", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "startDate", "endDate", "Lgfk/m;", "f", "Lgfk/m;", "()Lgfk/m;", "fee", "Lgfk/o;", "g", "Lgfk/o;", "()Lgfk/o;", "limit", "h", "quantityLimit", "k", "usage", "quantityUsage", "Lgfk/n;", "Lgfk/n;", "()Lgfk/n;", "refreshInfo", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r0 {

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
    private final m fee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("limit")
    private final o limit;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantityLimit")
    private final o quantityLimit;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("usage")
    private final o usage;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantityUsage")
    private final o quantityUsage;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("refreshInfo")
    private final n refreshInfo;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final o getLimit() {
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
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.name, r0Var.name) && Intrinsics.f(this.type, r0Var.type) && Intrinsics.f(this.currency, r0Var.currency) && Intrinsics.f(this.startDate, r0Var.startDate) && Intrinsics.f(this.endDate, r0Var.endDate) && Intrinsics.f(this.fee, r0Var.fee) && Intrinsics.f(this.limit, r0Var.limit) && Intrinsics.f(this.quantityLimit, r0Var.quantityLimit) && Intrinsics.f(this.usage, r0Var.usage) && Intrinsics.f(this.quantityUsage, r0Var.quantityUsage) && Intrinsics.f(this.refreshInfo, r0Var.refreshInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final o getQuantityLimit() {
        return this.quantityLimit;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final o getQuantityUsage() {
        return this.quantityUsage;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final n getRefreshInfo() {
        return this.refreshInfo;
    }

    public final int hashCode() {
        String str = this.name;
        int iC = p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.type), 31, this.currency);
        Long l2 = this.startDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.endDate;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        m mVar = this.fee;
        int iHashCode3 = (iHashCode2 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        o oVar = this.limit;
        int iHashCode4 = (iHashCode3 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        o oVar2 = this.quantityLimit;
        int iHashCode5 = (iHashCode4 + (oVar2 == null ? 0 : oVar2.hashCode())) * 31;
        o oVar3 = this.usage;
        int iHashCode6 = (iHashCode5 + (oVar3 == null ? 0 : oVar3.hashCode())) * 31;
        o oVar4 = this.quantityUsage;
        int iHashCode7 = (iHashCode6 + (oVar4 == null ? 0 : oVar4.hashCode())) * 31;
        n nVar = this.refreshInfo;
        return iHashCode7 + (nVar != null ? nVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final o getUsage() {
        return this.usage;
    }
}
