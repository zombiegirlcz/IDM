package obg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f223939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f223940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f223941c;

    public f(Data campaign, Data campaignLocations, Data sortingOptions) {
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        Intrinsics.checkNotNullParameter(campaignLocations, "campaignLocations");
        Intrinsics.checkNotNullParameter(sortingOptions, "sortingOptions");
        this.f223939a = campaign;
        this.f223940b = campaignLocations;
        this.f223941c = sortingOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f223939a, fVar.f223939a) && Intrinsics.f(this.f223940b, fVar.f223940b) && Intrinsics.f(this.f223941c, fVar.f223941c);
    }

    public final int hashCode() {
        return this.f223941c.hashCode() + kii.e.c(this.f223940b, this.f223939a.hashCode() * 31, 31);
    }
}
