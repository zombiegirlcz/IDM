package v9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019¨\u0006\u001b"}, d2 = {"Lv9g/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "b", "e", "name", "", "Ljava/util/List;", "d", "()Ljava/util/List;", "images", "Lv9g/h;", "Lv9g/h;", "f", "()Lv9g/h;", "startingPrice", "description", "Lv9g/b;", "Lv9g/b;", "()Lv9g/b;", "cancellationPolicy", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

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
    @lg.b("startingPrice")
    @NotNull
    private final h startingPrice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cancellationPolicy")
    @NotNull
    private final b cancellationPolicy;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getCancellationPolicy() {
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
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.id, fVar.id) && Intrinsics.f(this.name, fVar.name) && Intrinsics.f(this.images, fVar.images) && Intrinsics.f(this.startingPrice, fVar.startingPrice) && Intrinsics.f(this.description, fVar.description) && Intrinsics.f(this.cancellationPolicy, fVar.cancellationPolicy);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h getStartingPrice() {
        return this.startingPrice;
    }

    public final int hashCode() {
        return this.cancellationPolicy.hashCode() + p.a.c((this.startingPrice.hashCode() + p.a.d(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.images)) * 31, 31, this.description);
    }
}
