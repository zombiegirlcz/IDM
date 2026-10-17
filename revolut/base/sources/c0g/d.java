package c0g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qzf.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\r\u0010\u0014¨\u0006\u0016"}, d2 = {"Lc0g/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "c", "name", "image", "Ljo3/a;", "d", "Ljo3/a;", "e", "()Ljo3/a;", "startingPrice", "Lqzf/j0;", "Lqzf/j0;", "()Lqzf/j0;", "ratings", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("image")
    @NotNull
    private final String image;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("startingPrice")
    private final jo3.a startingPrice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ratings")
    private final j0 ratings;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j0 getRatings() {
        return this.ratings;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getStartingPrice() {
        return this.startingPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.name, dVar.name) && Intrinsics.f(this.image, dVar.image) && Intrinsics.f(this.startingPrice, dVar.startingPrice) && Intrinsics.f(this.ratings, dVar.ratings);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.image);
        jo3.a aVar = this.startingPrice;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        j0 j0Var = this.ratings;
        return iHashCode + (j0Var != null ? j0Var.hashCode() : 0);
    }
}
