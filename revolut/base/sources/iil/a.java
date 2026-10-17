package iil;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0007\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Liil/a;", "", "", "toString", "()Ljava/lang/String;", "", "Liil/a$a;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "projections", "Ljo3/a;", "c", "steps", "Ljo3/a;", "()Ljo3/a;", "defaultInvestment", "feature_shared_wealth_orders_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("projections")
    @NotNull
    private final List<C0924a> projections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("steps")
    @NotNull
    private final List<jo3.a> steps;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultInvestment")
    @NotNull
    private final jo3.a defaultInvestment;

    /* JADX INFO: renamed from: iil.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Liil/a$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "date", "contributionRatio", "Liil/a$b;", "c", "Liil/a$b;", "()Liil/a$b;", "projectionRatios", "feature_shared_wealth_orders_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class C0924a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("date")
        @NotNull
        private final String date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("contributionRatio")
        @NotNull
        private final String contributionRatio;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("projectionRatios")
        @NotNull
        private final b projectionRatios;

        public C0924a(String date, String contributionRatio, b projectionRatios) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(contributionRatio, "contributionRatio");
            Intrinsics.checkNotNullParameter(projectionRatios, "projectionRatios");
            this.date = date;
            this.contributionRatio = contributionRatio;
            this.projectionRatios = projectionRatios;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getContributionRatio() {
            return this.contributionRatio;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b getProjectionRatios() {
            return this.projectionRatios;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0924a)) {
                return false;
            }
            C0924a c0924a = (C0924a) obj2;
            return Intrinsics.f(this.date, c0924a.date) && Intrinsics.f(this.contributionRatio, c0924a.contributionRatio) && Intrinsics.f(this.projectionRatios, c0924a.projectionRatios);
        }

        public final int hashCode() {
            return this.projectionRatios.hashCode() + p.a.c(this.date.hashCode() * 31, 31, this.contributionRatio);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0010"}, d2 = {"Liil/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "minus2Std", "b", "minus1Std", "mean", "d", "plus1Std", "e", "plus2Std", "feature_shared_wealth_orders_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("minus2Std")
        @NotNull
        private final String minus2Std;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("minus1Std")
        @NotNull
        private final String minus1Std;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("mean")
        @NotNull
        private final String mean;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("plus1Std")
        @NotNull
        private final String plus1Std;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("plus2Std")
        @NotNull
        private final String plus2Std;

        public b(String minus2Std, String minus1Std, String mean, String plus1Std, String plus2Std) {
            Intrinsics.checkNotNullParameter(minus2Std, "minus2Std");
            Intrinsics.checkNotNullParameter(minus1Std, "minus1Std");
            Intrinsics.checkNotNullParameter(mean, "mean");
            Intrinsics.checkNotNullParameter(plus1Std, "plus1Std");
            Intrinsics.checkNotNullParameter(plus2Std, "plus2Std");
            this.minus2Std = minus2Std;
            this.minus1Std = minus1Std;
            this.mean = mean;
            this.plus1Std = plus1Std;
            this.plus2Std = plus2Std;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getMean() {
            return this.mean;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMinus1Std() {
            return this.minus1Std;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMinus2Std() {
            return this.minus2Std;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPlus1Std() {
            return this.plus1Std;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPlus2Std() {
            return this.plus2Std;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.minus2Std, bVar.minus2Std) && Intrinsics.f(this.minus1Std, bVar.minus1Std) && Intrinsics.f(this.mean, bVar.mean) && Intrinsics.f(this.plus1Std, bVar.plus1Std) && Intrinsics.f(this.plus2Std, bVar.plus2Std);
        }

        public final int hashCode() {
            return this.plus2Std.hashCode() + p.a.c(p.a.c(p.a.c(this.minus2Std.hashCode() * 31, 31, this.minus1Std), 31, this.mean), 31, this.plus1Std);
        }
    }

    public a(ArrayList projections, ArrayList steps, jo3.a defaultInvestment) {
        Intrinsics.checkNotNullParameter(projections, "projections");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(defaultInvestment, "defaultInvestment");
        this.projections = projections;
        this.steps = steps;
        this.defaultInvestment = defaultInvestment;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getDefaultInvestment() {
        return this.defaultInvestment;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getProjections() {
        return this.projections;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSteps() {
        return this.steps;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.projections, aVar.projections) && Intrinsics.f(this.steps, aVar.steps) && Intrinsics.f(this.defaultInvestment, aVar.defaultInvestment);
    }

    public final int hashCode() {
        return this.defaultInvestment.hashCode() + p.a.d(this.projections.hashCode() * 31, 31, this.steps);
    }
}
