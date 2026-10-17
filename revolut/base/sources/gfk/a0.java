package gfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u0005\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u0011\u0010\u001d¨\u0006 "}, d2 = {"Lgfk/a0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "code", "g", "type", "", "c", "D", "()D", "fee", "", "d", "Ljava/lang/Long;", "e", "()Ljava/lang/Long;", "limit", "", "Z", "f", "()Z", "recurring", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "absoluteFee", "feeMin", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee.pc")
    private final double fee;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("limit")
    private final Long limit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("recurring")
    private final boolean recurring;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("absoluteFee")
    private final jo3.a absoluteFee;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee.min")
    private final jo3.a feeMin;

    public a0(String code, String type, double d, Long l2, boolean z, jo3.a aVar, jo3.a aVar2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(type, "type");
        this.code = code;
        this.type = type;
        this.fee = d;
        this.limit = l2;
        this.recurring = z;
        this.absoluteFee = aVar;
        this.feeMin = aVar2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAbsoluteFee() {
        return this.absoluteFee;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getFeeMin() {
        return this.feeMin;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getLimit() {
        return this.limit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.code, a0Var.code) && Intrinsics.f(this.type, a0Var.type) && Double.compare(this.fee, a0Var.fee) == 0 && Intrinsics.f(this.limit, a0Var.limit) && this.recurring == a0Var.recurring && Intrinsics.f(this.absoluteFee, a0Var.absoluteFee) && Intrinsics.f(this.feeMin, a0Var.feeMin);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRecurring() {
        return this.recurring;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iC = m72.b.c(p.a.c(this.code.hashCode() * 31, 31, this.type), this.fee, 31);
        Long l2 = this.limit;
        int iC2 = j6.a.c((iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.recurring);
        jo3.a aVar = this.absoluteFee;
        int iHashCode = (iC2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.feeMin;
        return iHashCode + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
