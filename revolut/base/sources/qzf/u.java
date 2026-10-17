package qzf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0012\u0010\tR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lqzf/u;", "", "", "toString", "()Ljava/lang/String;", "", "Lqzf/m;", "a", "Ljava/util/List;", "()Ljava/util/List;", "categories", "Lqzf/i0;", "b", "Lqzf/i0;", "d", "()Lqzf/i0;", "pricing", "Lqzf/h0;", "c", "popular", "Lqzf/q;", "durations", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("categories")
    @NotNull
    private final List<m> categories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricing")
    @NotNull
    private final i0 pricing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("popular")
    @NotNull
    private final List<h0> popular;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("durations")
    private final List<q> durations;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getCategories() {
        return this.categories;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDurations() {
        return this.durations;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getPopular() {
        return this.popular;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i0 getPricing() {
        return this.pricing;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.categories, uVar.categories) && Intrinsics.f(this.pricing, uVar.pricing) && Intrinsics.f(this.popular, uVar.popular) && Intrinsics.f(this.durations, uVar.durations);
    }

    public final int hashCode() {
        int iD = p.a.d((this.pricing.hashCode() + (this.categories.hashCode() * 31)) * 31, 31, this.popular);
        List<q> list = this.durations;
        return iD + (list == null ? 0 : list.hashCode());
    }
}
