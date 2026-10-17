package yfg;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0013"}, d2 = {"Lyfg/g;", "", "", "toString", "()Ljava/lang/String;", "Lyfg/c;", "a", "Lyfg/c;", "c", "()Lyfg/c;", "suggestedDates", "", "Lyfg/q;", "b", "Ljava/util/List;", "()Ljava/util/List;", "alternativeDestinations", "Lyfg/g$a;", "recommendedAirlines", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("suggestedDates")
    @NotNull
    private final c suggestedDates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("alternativeDestinations")
    @NotNull
    private final List<q> alternativeDestinations;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("recommendedAirlines")
    @NotNull
    private final List<a> recommendedAirlines;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000e"}, d2 = {"Lyfg/g$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "d", "providerDescription", "iconUrl", "deeplink", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("providerDescription")
        @NotNull
        private final String providerDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("iconUrl")
        @NotNull
        private final String iconUrl;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("deeplink")
        @NotNull
        private final String deeplink;

        public a(String name, String providerDescription, String iconUrl, String deeplink) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(providerDescription, "providerDescription");
            Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.name = name;
            this.providerDescription = providerDescription;
            this.iconUrl = iconUrl;
            this.deeplink = deeplink;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getProviderDescription() {
            return this.providerDescription;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.providerDescription, aVar.providerDescription) && Intrinsics.f(this.iconUrl, aVar.iconUrl) && Intrinsics.f(this.deeplink, aVar.deeplink);
        }

        public final int hashCode() {
            return this.deeplink.hashCode() + p.a.c(p.a.c(this.name.hashCode() * 31, 31, this.providerDescription), 31, this.iconUrl);
        }
    }

    public g(c suggestedDates, ArrayList alternativeDestinations, ArrayList recommendedAirlines) {
        Intrinsics.checkNotNullParameter(suggestedDates, "suggestedDates");
        Intrinsics.checkNotNullParameter(alternativeDestinations, "alternativeDestinations");
        Intrinsics.checkNotNullParameter(recommendedAirlines, "recommendedAirlines");
        this.suggestedDates = suggestedDates;
        this.alternativeDestinations = alternativeDestinations;
        this.recommendedAirlines = recommendedAirlines;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAlternativeDestinations() {
        return this.alternativeDestinations;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getRecommendedAirlines() {
        return this.recommendedAirlines;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c getSuggestedDates() {
        return this.suggestedDates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.suggestedDates, gVar.suggestedDates) && Intrinsics.f(this.alternativeDestinations, gVar.alternativeDestinations) && Intrinsics.f(this.recommendedAirlines, gVar.recommendedAirlines);
    }

    public final int hashCode() {
        return this.recommendedAirlines.hashCode() + p.a.d(this.suggestedDates.hashCode() * 31, 31, this.alternativeDestinations);
    }
}
