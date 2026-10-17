package hfg;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f151889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f151890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f151891c;

    public t(h suggestedDates, ArrayList alternativeDestinations, ArrayList recommendedAirlines) {
        Intrinsics.checkNotNullParameter(suggestedDates, "suggestedDates");
        Intrinsics.checkNotNullParameter(alternativeDestinations, "alternativeDestinations");
        Intrinsics.checkNotNullParameter(recommendedAirlines, "recommendedAirlines");
        this.f151889a = suggestedDates;
        this.f151890b = alternativeDestinations;
        this.f151891c = recommendedAirlines;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f151889a.equals(tVar.f151889a) && this.f151890b.equals(tVar.f151890b) && this.f151891c.equals(tVar.f151891c);
    }

    public final int hashCode() {
        return this.f151891c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f151890b, this.f151889a.f151844a.hashCode() * 31, 31);
    }
}
