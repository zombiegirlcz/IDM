package nzf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\t\u0010\u0018¨\u0006\u001c"}, d2 = {"Lnzf/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "destinationId", "b", "g", "type", "e", "name", "d", "image", "Lnzf/e;", "Lnzf/e;", "f", "()Lnzf/e;", "stats", "", "Lnzf/d;", "Ljava/util/List;", "()Ljava/util/List;", "attractions", "Lnzf/b;", "categories", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("destinationId")
    @NotNull
    private final String destinationId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("image")
    @NotNull
    private final String image;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("stats")
    @NotNull
    private final e stats;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("attractions")
    @NotNull
    private final List<d> attractions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("categories")
    @NotNull
    private final List<b> categories;

    public c(String destinationId, String type, String name, String image, e stats, ArrayList attractions, ArrayList categories) {
        Intrinsics.checkNotNullParameter(destinationId, "destinationId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(attractions, "attractions");
        Intrinsics.checkNotNullParameter(categories, "categories");
        this.destinationId = destinationId;
        this.type = type;
        this.name = name;
        this.image = image;
        this.stats = stats;
        this.attractions = attractions;
        this.categories = categories;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAttractions() {
        return this.attractions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDestinationId() {
        return this.destinationId;
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
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.destinationId, cVar.destinationId) && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.name, cVar.name) && Intrinsics.f(this.image, cVar.image) && Intrinsics.f(this.stats, cVar.stats) && Intrinsics.f(this.attractions, cVar.attractions) && Intrinsics.f(this.categories, cVar.categories);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final e getStats() {
        return this.stats;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.categories.hashCode() + p.a.d((this.stats.hashCode() + p.a.c(p.a.c(p.a.c(this.destinationId.hashCode() * 31, 31, this.type), 31, this.name), 31, this.image)) * 31, 31, this.attractions);
    }
}
