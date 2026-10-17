package ks6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lks6/o0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "taxRate", "Ljava/lang/String;", "taxName", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("tax_rate")
    private final Double taxRate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tax_name")
    private final String taxName;

    public o0(String str, Double d) {
        this.taxRate = d;
        this.taxName = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTaxName() {
        return this.taxName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getTaxRate() {
        return this.taxRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.taxRate, o0Var.taxRate) && Intrinsics.f(this.taxName, o0Var.taxName);
    }

    public final int hashCode() {
        Double d = this.taxRate;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        String str = this.taxName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
