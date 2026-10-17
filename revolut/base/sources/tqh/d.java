package tqh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Ltqh/d;", "", "", "toString", "()Ljava/lang/String;", "Lzel/g;", "a", "Lzel/g;", "getMetric", "()Lzel/g;", "metric", "Ltqh/d$a;", "b", "Ltqh/d$a;", "getFilter", "()Ltqh/d$a;", "filter", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("metric")
    @NotNull
    private final zel.g metric;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("filter")
    @NotNull
    private final a filter;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Ltqh/d$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "values", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "min", "max", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("values")
        private final List<String> values = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("min")
        private final BigDecimal min = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("max")
        private final BigDecimal max = null;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getMax() {
            return this.max;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getMin() {
            return this.min;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final List getValues() {
            return this.values;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.values, aVar.values) && Intrinsics.f(this.min, aVar.min) && Intrinsics.f(this.max, aVar.max);
        }

        public final int hashCode() {
            List<String> list = this.values;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            BigDecimal bigDecimal = this.min;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.max;
            return iHashCode2 + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
        }
    }

    public final ScreenerSelectedFilter a() {
        return this.filter.getValues() != null ? new ScreenerSelectedFilter.Options(this.metric, this.filter.getValues()) : new ScreenerSelectedFilter.Range(this.metric, this.filter.getMin(), this.filter.getMax());
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.metric == dVar.metric && Intrinsics.f(this.filter, dVar.filter);
    }

    public final int hashCode() {
        return this.filter.hashCode() + (this.metric.hashCode() * 31);
    }
}
