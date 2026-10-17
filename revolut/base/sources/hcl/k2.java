package hcl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lhcl/k2;", "", "", "toString", "()Ljava/lang/String;", "", "Lhcl/k2$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "chart", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "defaultX", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("chart")
    @NotNull
    private final List<a> chart;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultX")
    private final BigDecimal defaultX;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0014"}, d2 = {"Lhcl/k2$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "c", "()Ljava/math/BigDecimal;", "x", "b", "d", "y", "", "Z", "()Z", "inPrevSegment", "Ljava/lang/String;", "nextSegmentType", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("x")
        @NotNull
        private final BigDecimal x;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("y")
        @NotNull
        private final BigDecimal y;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("inPrevSegment")
        private final boolean inPrevSegment;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("nextSegmentType")
        private final String nextSegmentType;

        public a(BigDecimal x3, BigDecimal y2, boolean z, String str) {
            Intrinsics.checkNotNullParameter(x3, "x");
            Intrinsics.checkNotNullParameter(y2, "y");
            this.x = x3;
            this.y = y2;
            this.inPrevSegment = z;
            this.nextSegmentType = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getInPrevSegment() {
            return this.inPrevSegment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getNextSegmentType() {
            return this.nextSegmentType;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getY() {
            return this.y;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.x, aVar.x) && Intrinsics.f(this.y, aVar.y) && this.inPrevSegment == aVar.inPrevSegment && Intrinsics.f(this.nextSegmentType, aVar.nextSegmentType);
        }

        public final int hashCode() {
            int iC = j6.a.c(t61.a.d(this.y, this.x.hashCode() * 31, 31), 31, this.inPrevSegment);
            String str = this.nextSegmentType;
            return iC + (str == null ? 0 : str.hashCode());
        }
    }

    public k2(ArrayList chart, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(chart, "chart");
        this.chart = chart;
        this.defaultX = bigDecimal;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getChart() {
        return this.chart;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getDefaultX() {
        return this.defaultX;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return Intrinsics.f(this.chart, k2Var.chart) && Intrinsics.f(this.defaultX, k2Var.defaultX);
    }

    public final int hashCode() {
        int iHashCode = this.chart.hashCode() * 31;
        BigDecimal bigDecimal = this.defaultX;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}
