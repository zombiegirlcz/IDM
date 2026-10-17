package hfg;

import com.revolut.feature.travel.miles.api.model.TravelMilesSearchFlightDetails$SegmentsBreakdown;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f151839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelMilesSearchFlightDetails$SegmentsBreakdown f151841c;
    public final ArrayList d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f151842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f151843h;

    public g0(d0 flight, String provider, TravelMilesSearchFlightDetails$SegmentsBreakdown segmentsBreakdown, ArrayList flightClasses, String ctaText, String flightImageUrl, String departureCity, String arrivalCity) {
        Intrinsics.checkNotNullParameter(flight, "flight");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(segmentsBreakdown, "segmentsBreakdown");
        Intrinsics.checkNotNullParameter(flightClasses, "flightClasses");
        Intrinsics.checkNotNullParameter(ctaText, "ctaText");
        Intrinsics.checkNotNullParameter(flightImageUrl, "flightImageUrl");
        Intrinsics.checkNotNullParameter(departureCity, "departureCity");
        Intrinsics.checkNotNullParameter(arrivalCity, "arrivalCity");
        this.f151839a = flight;
        this.f151840b = provider;
        this.f151841c = segmentsBreakdown;
        this.d = flightClasses;
        this.e = ctaText;
        this.f = flightImageUrl;
        this.f151842g = departureCity;
        this.f151843h = arrivalCity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return this.f151839a.equals(g0Var.f151839a) && Intrinsics.f(this.f151840b, g0Var.f151840b) && this.f151841c.equals(g0Var.f151841c) && this.d.equals(g0Var.d) && Intrinsics.f(this.e, g0Var.e) && Intrinsics.f(this.f, g0Var.f) && Intrinsics.f(this.f151842g, g0Var.f151842g) && Intrinsics.f(this.f151843h, g0Var.f151843h);
    }

    public final int hashCode() {
        return this.f151843h.hashCode() + p.a.c(p.a.c(p.a.c(com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f151841c.hashCode() + p.a.c(this.f151839a.hashCode() * 31, 31, this.f151840b)) * 31, 31), 31, this.e), 31, this.f), 31, this.f151842g);
    }
}
