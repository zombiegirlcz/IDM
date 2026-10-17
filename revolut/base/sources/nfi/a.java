package nfi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0017"}, d2 = {"Lnfi/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "d", "image", "g", "startDate", "endDate", "e", "name", "f", "discount", "", "I", "()I", "rank", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("image")
    @NotNull
    private final String image;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("startDate")
    @NotNull
    private final String startDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("endDate")
    @NotNull
    private final String endDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @b("discount")
    @NotNull
    private final String discount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @b("rank")
    private final int rank;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.image, aVar.image) && Intrinsics.f(this.startDate, aVar.startDate) && Intrinsics.f(this.endDate, aVar.endDate) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.discount, aVar.discount) && this.rank == aVar.rank;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStartDate() {
        return this.startDate;
    }

    public final int hashCode() {
        return Integer.hashCode(this.rank) + p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.image), 31, this.startDate), 31, this.endDate), 31, this.name), 31, this.discount);
    }
}
