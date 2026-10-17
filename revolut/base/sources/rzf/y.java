package rzf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0005\u0010\u001e¨\u0006 "}, d2 = {"Lrzf/y;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "name", "", "Ljava/util/List;", "d", "()Ljava/util/List;", "images", "description", "Lrzf/u;", "Lrzf/u;", "f", "()Lrzf/u;", "ratings", "Lyzf/a;", "Lyzf/a;", "g", "()Lyzf/a;", "startingPrice", "Ljzf/c;", "Ljzf/c;", "()Ljzf/c;", "cancellationPolicy", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

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
    private final u ratings;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("startingPrice")
    @NotNull
    private final yzf.a startingPrice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationPolicy")
    @NotNull
    private final jzf.c cancellationPolicy;

    public y(String id10, String name, List images, String description, u uVar, yzf.a startingPrice, jzf.c cancellationPolicy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(startingPrice, "startingPrice");
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        this.id = id10;
        this.name = name;
        this.images = images;
        this.description = description;
        this.ratings = uVar;
        this.startingPrice = startingPrice;
        this.cancellationPolicy = cancellationPolicy;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jzf.c getCancellationPolicy() {
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
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.id, yVar.id) && Intrinsics.f(this.name, yVar.name) && Intrinsics.f(this.images, yVar.images) && Intrinsics.f(this.description, yVar.description) && Intrinsics.f(this.ratings, yVar.ratings) && Intrinsics.f(this.startingPrice, yVar.startingPrice) && Intrinsics.f(this.cancellationPolicy, yVar.cancellationPolicy);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final u getRatings() {
        return this.ratings;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final yzf.a getStartingPrice() {
        return this.startingPrice;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.images), 31, this.description);
        u uVar = this.ratings;
        return this.cancellationPolicy.hashCode() + ((this.startingPrice.hashCode() + ((iC + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31);
    }
}
