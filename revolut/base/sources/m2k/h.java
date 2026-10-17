package m2k;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lm2k/h;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "total", "", "b", "Z", "()Z", "intermediaryFees", "", "Lm2k/f;", "Ljava/util/List;", "()Ljava/util/List;", "breakdown", "d", "totalInBaseCurrency", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.a total;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("intermediaryFees")
    private final boolean intermediaryFees;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("breakdown")
    @NotNull
    private final List<f> breakdown;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalInBaseCurrency")
    private final jo3.a totalInBaseCurrency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBreakdown() {
        return this.breakdown;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIntermediaryFees() {
        return this.intermediaryFees;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getTotalInBaseCurrency() {
        return this.totalInBaseCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.total, hVar.total) && this.intermediaryFees == hVar.intermediaryFees && Intrinsics.f(this.breakdown, hVar.breakdown) && Intrinsics.f(this.totalInBaseCurrency, hVar.totalInBaseCurrency);
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(this.total.hashCode() * 31, 31, this.intermediaryFees), 31, this.breakdown);
        jo3.a aVar = this.totalInBaseCurrency;
        return iD + (aVar == null ? 0 : aVar.hashCode());
    }
}
