package wxa;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0010"}, d2 = {"Lwxa/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "description", "b", "darkImage", "c", "e", "lightImage", "acceptButton", "declineButton", "feature_retail_referrals_promo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("darkImage")
    @NotNull
    private final String darkImage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lightImage")
    @NotNull
    private final String lightImage;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("acceptButton")
    @NotNull
    private final String acceptButton;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("declineButton")
    @NotNull
    private final String declineButton;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAcceptButton() {
        return this.acceptButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDarkImage() {
        return this.darkImage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDeclineButton() {
        return this.declineButton;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLightImage() {
        return this.lightImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.description, aVar.description) && Intrinsics.f(this.darkImage, aVar.darkImage) && Intrinsics.f(this.lightImage, aVar.lightImage) && Intrinsics.f(this.acceptButton, aVar.acceptButton) && Intrinsics.f(this.declineButton, aVar.declineButton);
    }

    public final int hashCode() {
        return this.declineButton.hashCode() + p.a.c(p.a.c(p.a.c(this.description.hashCode() * 31, 31, this.darkImage), 31, this.lightImage), 31, this.acceptButton);
    }
}
