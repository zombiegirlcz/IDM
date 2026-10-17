package npe;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f218193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f218194b;

    public b(ArrayList suggestedCountries, Map countryRules) {
        Intrinsics.checkNotNullParameter(suggestedCountries, "suggestedCountries");
        Intrinsics.checkNotNullParameter(countryRules, "countryRules");
        this.f218193a = suggestedCountries;
        this.f218194b = countryRules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f218193a.equals(bVar.f218193a) && this.f218194b.equals(bVar.f218194b);
    }

    public final int hashCode() {
        return this.f218194b.hashCode() + (this.f218193a.hashCode() * 31);
    }
}
