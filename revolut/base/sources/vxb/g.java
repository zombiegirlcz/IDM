package vxb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\f"}, d2 = {"Lvxb/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "experiences", "b", "c", "stays", "shops", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("experiences")
    @NotNull
    private final String experiences;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("stays")
    @NotNull
    private final String stays;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("shops")
    @NotNull
    private final String shops;

    public g(String experiences, String stays, String shops) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        Intrinsics.checkNotNullParameter(stays, "stays");
        Intrinsics.checkNotNullParameter(shops, "shops");
        this.experiences = experiences;
        this.stays = stays;
        this.shops = shops;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExperiences() {
        return this.experiences;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getShops() {
        return this.shops;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStays() {
        return this.stays;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.experiences, gVar.experiences) && Intrinsics.f(this.stays, gVar.stays) && Intrinsics.f(this.shops, gVar.shops);
    }

    public final int hashCode() {
        return this.shops.hashCode() + p.a.c(this.experiences.hashCode() * 31, 31, this.stays);
    }
}
