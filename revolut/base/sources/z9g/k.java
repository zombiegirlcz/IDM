package z9g;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\t\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0011"}, d2 = {"Lz9g/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "queryParamMin", "b", "c", "queryParamMax", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "minValue", "maxValue", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("queryParamMin")
    @NotNull
    private final String queryParamMin;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("queryParamMax")
    @NotNull
    private final String queryParamMax;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minValue")
    @NotNull
    private final jo3.a minValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxValue")
    @NotNull
    private final jo3.a maxValue;

    public k(String queryParamMin, String queryParamMax, jo3.a minValue, jo3.a maxValue) {
        Intrinsics.checkNotNullParameter(queryParamMin, "queryParamMin");
        Intrinsics.checkNotNullParameter(queryParamMax, "queryParamMax");
        Intrinsics.checkNotNullParameter(minValue, "minValue");
        Intrinsics.checkNotNullParameter(maxValue, "maxValue");
        this.queryParamMin = queryParamMin;
        this.queryParamMax = queryParamMax;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getMinValue() {
        return this.minValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getQueryParamMax() {
        return this.queryParamMax;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getQueryParamMin() {
        return this.queryParamMin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.queryParamMin, kVar.queryParamMin) && Intrinsics.f(this.queryParamMax, kVar.queryParamMax) && Intrinsics.f(this.minValue, kVar.minValue) && Intrinsics.f(this.maxValue, kVar.maxValue);
    }

    public final int hashCode() {
        return this.maxValue.hashCode() + v7.j(this.minValue, p.a.c(this.queryParamMin.hashCode() * 31, 31, this.queryParamMax), 31);
    }
}
