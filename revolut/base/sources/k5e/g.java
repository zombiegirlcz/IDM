package k5e;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4e.c f181482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f181483b;

    public g(q4e.c aggregatedSuggestion, ArrayList assets) {
        Intrinsics.checkNotNullParameter(aggregatedSuggestion, "aggregatedSuggestion");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f181482a = aggregatedSuggestion;
        this.f181483b = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f181482a.equals(gVar.f181482a) && this.f181483b.equals(gVar.f181483b);
    }

    public final int hashCode() {
        return this.f181483b.hashCode() + (this.f181482a.hashCode() * 31);
    }
}
