package x9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ofi.i;
import org.jetbrains.annotations.NotNull;
import rfi.j;
import rfi.l;
import rfi.m;
import rfi.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\t\u0010\u001eR\u001c\u0010#\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\u000e\u0010\"R\u001c\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b$\u0010\u0004¨\u0006&"}, d2 = {"Lx9g/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "name", "", "Lofi/i;", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "images", "Lrfi/v;", "Lrfi/v;", "f", "()Lrfi/v;", "location", "Lrfi/j;", "Lrfi/j;", "()Lrfi/j;", "checkInDetails", "Lrfi/l;", "Lrfi/l;", "()Lrfi/l;", "checkOutDetails", "Lrfi/m;", "Lrfi/m;", "()Lrfi/m;", "contactDetails", "h", "providerId", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

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
    private final List<i> images;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("location")
    @NotNull
    private final v location;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("checkInDetails")
    @NotNull
    private final j checkInDetails;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("checkOutDetails")
    @NotNull
    private final l checkOutDetails;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactDetails")
    private final m contactDetails;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("providerId")
    private final String providerId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j getCheckInDetails() {
        return this.checkInDetails;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getCheckOutDetails() {
        return this.checkOutDetails;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final m getContactDetails() {
        return this.contactDetails;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getImages() {
        return this.images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.images, bVar.images) && Intrinsics.f(this.location, bVar.location) && Intrinsics.f(this.checkInDetails, bVar.checkInDetails) && Intrinsics.f(this.checkOutDetails, bVar.checkOutDetails) && Intrinsics.f(this.contactDetails, bVar.contactDetails) && Intrinsics.f(this.providerId, bVar.providerId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final v getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getProviderId() {
        return this.providerId;
    }

    public final int hashCode() {
        int iHashCode = (this.checkOutDetails.hashCode() + ((this.checkInDetails.hashCode() + ((this.location.hashCode() + p.a.d(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.images)) * 31)) * 31)) * 31;
        m mVar = this.contactDetails;
        int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str = this.providerId;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
