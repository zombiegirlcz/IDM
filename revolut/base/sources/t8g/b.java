package t8g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\f\u0010\u0018¨\u0006\u001a"}, d2 = {"Lt8g/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "checkIn", "b", "checkOut", "c", "deeplink", "d", "g", "name", "e", "f", "image", "", "I", "()I", "guestReviews", "", "D", "()D", "guestReviewScore10Scale", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkIn")
    @NotNull
    private final String checkIn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("checkOut")
    @NotNull
    private final String checkOut;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("deeplink")
    @NotNull
    private final String deeplink;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("image")
    @NotNull
    private final String image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("guestReviews")
    private final int guestReviews;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("guestReviewScore10Scale")
    private final double guestReviewScore10Scale;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCheckIn() {
        return this.checkIn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCheckOut() {
        return this.checkOut;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getGuestReviewScore10Scale() {
        return this.guestReviewScore10Scale;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getGuestReviews() {
        return this.guestReviews;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.checkIn, bVar.checkIn) && Intrinsics.f(this.checkOut, bVar.checkOut) && Intrinsics.f(this.deeplink, bVar.deeplink) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.image, bVar.image) && this.guestReviews == bVar.guestReviews && Double.compare(this.guestReviewScore10Scale, bVar.guestReviewScore10Scale) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return Double.hashCode(this.guestReviewScore10Scale) + j6.a.b(this.guestReviews, p.a.c(p.a.c(p.a.c(p.a.c(this.checkIn.hashCode() * 31, 31, this.checkOut), 31, this.deeplink), 31, this.name), 31, this.image), 31);
    }
}
