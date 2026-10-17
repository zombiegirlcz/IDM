package k77;

import com.revolut.feature.global_markets.domain.Market;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Market f181841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f181842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f181843c;
    public final ArrayList d;

    public n(Market market, List mainIndexes, ArrayList mainIndexesInfo, ArrayList regionDetails) {
        Intrinsics.checkNotNullParameter(market, "market");
        Intrinsics.checkNotNullParameter(mainIndexes, "mainIndexes");
        Intrinsics.checkNotNullParameter(mainIndexesInfo, "mainIndexesInfo");
        Intrinsics.checkNotNullParameter(regionDetails, "regionDetails");
        this.f181841a = market;
        this.f181842b = mainIndexes;
        this.f181843c = mainIndexesInfo;
        this.d = regionDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f181841a == nVar.f181841a && Intrinsics.f(this.f181842b, nVar.f181842b) && this.f181843c.equals(nVar.f181843c) && this.d.equals(nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f181843c, p.a.d(this.f181841a.hashCode() * 31, 31, this.f181842b), 31);
    }
}
