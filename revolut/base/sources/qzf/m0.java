package qzf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015¨\u0006\u0017"}, d2 = {"Lqzf/m0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "d", "()I", "minCount", "b", "c", "maxCount", "", "Lqzf/d;", "Ljava/util/List;", "()Ljava/util/List;", "ageBands", "", "Z", "()Z", "adultRequired", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minCount")
    private final int minCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxCount")
    private final int maxCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("ageBands")
    @NotNull
    private final List<d> ageBands;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("adultRequired")
    private final boolean adultRequired;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAdultRequired() {
        return this.adultRequired;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAgeBands() {
        return this.ageBands;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinCount() {
        return this.minCount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return this.minCount == m0Var.minCount && this.maxCount == m0Var.maxCount && Intrinsics.f(this.ageBands, m0Var.ageBands) && this.adultRequired == m0Var.adultRequired;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.adultRequired) + p.a.d(j6.a.b(this.maxCount, Integer.hashCode(this.minCount) * 31, 31), 31, this.ageBands);
    }
}
