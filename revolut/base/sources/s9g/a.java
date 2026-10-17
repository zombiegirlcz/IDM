package s9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Ls9g/a;", "", "", "toString", "()Ljava/lang/String;", "Lpfi/a;", "a", "Lpfi/a;", "c", "()Lpfi/a;", "location", "b", "Ljava/lang/String;", "image", "d", "name", "discount", "", "e", "I", "()I", "rank", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("location")
    @NotNull
    private final pfi.a location;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("image")
    @NotNull
    private final String image;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("discount")
    @NotNull
    private final String discount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @b("rank")
    private final int rank;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final pfi.a getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.location, aVar.location) && Intrinsics.f(this.image, aVar.image) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.discount, aVar.discount) && this.rank == aVar.rank;
    }

    public final int hashCode() {
        return Integer.hashCode(this.rank) + p.a.c(p.a.c(p.a.c(this.location.hashCode() * 31, 31, this.image), 31, this.name), 31, this.discount);
    }
}
