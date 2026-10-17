package j5h;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lj5h/c;", "", "", "toString", "()Ljava/lang/String;", "Lj5h/e;", "a", "Lj5h/e;", "b", "()Lj5h/e;", "minQty", "", "Lj5h/d;", "Ljava/util/List;", "()Ljava/util/List;", "fees", "Ljava/math/BigDecimal;", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "vatRate", "feature_wealth_commodity_additional_services_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("min_qty")
    @NotNull
    private final e minQty;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    @NotNull
    private final List<d> fees;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("vat_rate")
    @NotNull
    private final BigDecimal vatRate;

    public c(e minQty, ArrayList fees, BigDecimal vatRate) {
        Intrinsics.checkNotNullParameter(minQty, "minQty");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(vatRate, "vatRate");
        this.minQty = minQty;
        this.fees = fees;
        this.vatRate = vatRate;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getMinQty() {
        return this.minQty;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getVatRate() {
        return this.vatRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.minQty, cVar.minQty) && Intrinsics.f(this.fees, cVar.fees) && Intrinsics.f(this.vatRate, cVar.vatRate);
    }

    public final int hashCode() {
        return this.vatRate.hashCode() + p.a.d(this.minQty.hashCode() * 31, 31, this.fees);
    }
}
