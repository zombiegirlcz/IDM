package rxf;

import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\n\u0010\rR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u0011\u0010\u001d¨\u0006\u001f"}, d2 = {"Lrxf/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "Ljava/time/LocalDate;", "b", "Ljava/time/LocalDate;", "e", "()Ljava/time/LocalDate;", "startDate", "endDate", "", "d", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "travellers", "", "Lrxf/a;", "Ljava/util/List;", "()Ljava/util/List;", "destinations", "Lrxf/c;", "Lrxf/c;", "()Lrxf/c;", "recommendations", "feature_travel_common_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("startDate")
    @NotNull
    private final LocalDate startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final LocalDate endDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("travellers")
    private final Integer travellers;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("destinations")
    @NotNull
    private final List<a> destinations;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("recommendations")
    @NotNull
    private final c recommendations;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getDestinations() {
        return this.destinations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getRecommendations() {
        return this.recommendations;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.startDate, bVar.startDate) && Intrinsics.f(this.endDate, bVar.endDate) && Intrinsics.f(this.travellers, bVar.travellers) && Intrinsics.f(this.destinations, bVar.destinations) && Intrinsics.f(this.recommendations, bVar.recommendations);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getTravellers() {
        return this.travellers;
    }

    public final int hashCode() {
        int iA = y.a(this.id.hashCode() * 31, 31, this.startDate);
        LocalDate localDate = this.endDate;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.travellers;
        return this.recommendations.hashCode() + p.a.d((iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.destinations);
    }
}
