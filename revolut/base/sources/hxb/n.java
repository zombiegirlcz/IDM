package hxb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhxb/n;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "c", "()Z", "isEarning", "Lhxb/o;", "b", "Lhxb/o;", "()Lhxb/o;", "currentRate", "", "Ljava/util/List;", "()Ljava/util/List;", "rates", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("isEarning")
    private final boolean isEarning;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentRate")
    @NotNull
    private final o currentRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("rates")
    @NotNull
    private final List<o> rates;

    public n(boolean z, o currentRate, ArrayList rates) {
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.isEarning = z;
        this.currentRate = currentRate;
        this.rates = rates;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final o getCurrentRate() {
        return this.currentRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getRates() {
        return this.rates;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEarning() {
        return this.isEarning;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.isEarning == nVar.isEarning && Intrinsics.f(this.currentRate, nVar.currentRate) && Intrinsics.f(this.rates, nVar.rates);
    }

    public final int hashCode() {
        return this.rates.hashCode() + ((this.currentRate.hashCode() + (Boolean.hashCode(this.isEarning) * 31)) * 31);
    }
}
