package szf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qzf.j0;
import qzf.r;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0005\u0010\u001e¨\u0006 "}, d2 = {"Lszf/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "name", "", "Ljava/util/List;", "d", "()Ljava/util/List;", "images", "description", "Lqzf/j0;", "Lqzf/j0;", "f", "()Lqzf/j0;", "ratings", "Lxzf/a;", "Lxzf/a;", "g", "()Lxzf/a;", "startingPrice", "Lqzf/r;", "Lqzf/r;", "()Lqzf/r;", "cancellationPolicy", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final List<String> images;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ratings")
    private final j0 ratings;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("startingPrice")
    @NotNull
    private final xzf.a startingPrice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationPolicy")
    @NotNull
    private final r cancellationPolicy;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r getCancellationPolicy() {
        return this.cancellationPolicy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getImages() {
        return this.images;
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
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.images, aVar.images) && Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.ratings, aVar.ratings) && Intrinsics.f(this.startingPrice, aVar.startingPrice) && Intrinsics.f(this.cancellationPolicy, aVar.cancellationPolicy);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final j0 getRatings() {
        return this.ratings;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final xzf.a getStartingPrice() {
        return this.startingPrice;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.images), 31, this.description);
        j0 j0Var = this.ratings;
        return this.cancellationPolicy.hashCode() + ((this.startingPrice.hashCode() + ((iC + (j0Var == null ? 0 : j0Var.hashCode())) * 31)) * 31);
    }
}
