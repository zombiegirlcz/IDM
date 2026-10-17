package yfg;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u000f\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\nR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0015\u0010\n¨\u0006\u001b"}, d2 = {"Lyfg/d;", "", "", "toString", "()Ljava/lang/String;", "", "Lyfg/d$a;", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "numberOfStops", "b", "cabin", "Lyfg/k;", "c", "Lyfg/k;", "f", "()Lyfg/k;", "priceInPoints", "Lyfg/j;", "d", "Lyfg/j;", "()Lyfg/j;", "fees", "airlines", "milesProgrammes", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("numberOfStops")
    @NotNull
    private final List<a> numberOfStops;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("cabin")
    @NotNull
    private final List<a> cabin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("priceInPoints")
    @NotNull
    private final k priceInPoints;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fees")
    @NotNull
    private final j fees;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("airlines")
    @NotNull
    private final List<a> airlines;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("milesProgrammes")
    @NotNull
    private final List<a> milesProgrammes;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lyfg/d$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "code", "b", "c", "label", "d", "subtitle", "iconUrl", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("code")
        @NotNull
        private final String code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("label")
        @NotNull
        private final String label;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("subtitle")
        private final String subtitle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("iconUrl")
        private final String iconUrl;

        public a(String code, String label, String str, String str2) {
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(label, "label");
            this.code = code;
            this.label = label;
            this.subtitle = str;
            this.iconUrl = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getIconUrl() {
            return this.iconUrl;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.code, aVar.code) && Intrinsics.f(this.label, aVar.label) && Intrinsics.f(this.subtitle, aVar.subtitle) && Intrinsics.f(this.iconUrl, aVar.iconUrl);
        }

        public final int hashCode() {
            int iC = p.a.c(this.code.hashCode() * 31, 31, this.label);
            String str = this.subtitle;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.iconUrl;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public d(ArrayList numberOfStops, ArrayList cabin, k priceInPoints, j fees, ArrayList airlines, ArrayList milesProgrammes) {
        Intrinsics.checkNotNullParameter(numberOfStops, "numberOfStops");
        Intrinsics.checkNotNullParameter(cabin, "cabin");
        Intrinsics.checkNotNullParameter(priceInPoints, "priceInPoints");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(milesProgrammes, "milesProgrammes");
        this.numberOfStops = numberOfStops;
        this.cabin = cabin;
        this.priceInPoints = priceInPoints;
        this.fees = fees;
        this.airlines = airlines;
        this.milesProgrammes = milesProgrammes;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAirlines() {
        return this.airlines;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getCabin() {
        return this.cabin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getMilesProgrammes() {
        return this.milesProgrammes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getNumberOfStops() {
        return this.numberOfStops;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.numberOfStops, dVar.numberOfStops) && Intrinsics.f(this.cabin, dVar.cabin) && Intrinsics.f(this.priceInPoints, dVar.priceInPoints) && Intrinsics.f(this.fees, dVar.fees) && Intrinsics.f(this.airlines, dVar.airlines) && Intrinsics.f(this.milesProgrammes, dVar.milesProgrammes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final k getPriceInPoints() {
        return this.priceInPoints;
    }

    public final int hashCode() {
        return this.milesProgrammes.hashCode() + p.a.d((this.fees.hashCode() + ((this.priceInPoints.hashCode() + p.a.d(this.numberOfStops.hashCode() * 31, 31, this.cabin)) * 31)) * 31, 31, this.airlines);
    }
}
