package t1c;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0006\u0010\u0013¨\u0006\u0015"}, d2 = {"Lt1c/c;", "", "", "toString", "()Ljava/lang/String;", "Lt1c/d;", "a", "Lt1c/d;", "b", "()Lt1c/d;", "rate", "Lt1c/a;", "Lt1c/a;", "c", "()Lt1c/a;", "spent", "", "Lt1c/b;", "Ljava/util/List;", "()Ljava/util/List;", "calculations", "feature_rev_points_spare_change_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final d rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("spent")
    @NotNull
    private final a spent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("calculations")
    @NotNull
    private final List<b> calculations;

    public c(d rate, a spent, ArrayList calculations) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        this.rate = rate;
        this.spent = spent;
        this.calculations = calculations;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCalculations() {
        return this.calculations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getSpent() {
        return this.spent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.rate, cVar.rate) && Intrinsics.f(this.spent, cVar.spent) && Intrinsics.f(this.calculations, cVar.calculations);
    }

    public final int hashCode() {
        return this.calculations.hashCode() + ((this.spent.hashCode() + (this.rate.hashCode() * 31)) * 31);
    }
}
