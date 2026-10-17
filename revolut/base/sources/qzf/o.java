package qzf;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000e¨\u0006\u0010"}, d2 = {"Lqzf/o;", "", "", "toString", "()Ljava/lang/String;", "", "Lqzf/n;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "recommendedCategories", "Lc0g/c;", "Lc0g/c;", "()Lc0g/c;", "destination", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("recommendedCategories")
    @NotNull
    private final List<n> recommendedCategories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("destination")
    @NotNull
    private final c0g.c destination;

    public o(ArrayList recommendedCategories, c0g.c destination) {
        Intrinsics.checkNotNullParameter(recommendedCategories, "recommendedCategories");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.recommendedCategories = recommendedCategories;
        this.destination = destination;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c0g.c getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getRecommendedCategories() {
        return this.recommendedCategories;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.recommendedCategories, oVar.recommendedCategories) && Intrinsics.f(this.destination, oVar.destination);
    }

    public final int hashCode() {
        return this.destination.hashCode() + (this.recommendedCategories.hashCode() * 31);
    }
}
