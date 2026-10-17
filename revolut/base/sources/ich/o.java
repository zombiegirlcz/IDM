package ich;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionSortOption;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsCollectionSortOption f160279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentsCollectionSortOption f160280b;

    public o(InstrumentsCollectionSortOption current, InstrumentsCollectionSortOption selected) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f160279a = current;
        this.f160280b = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f160279a, oVar.f160279a) && Intrinsics.f(this.f160280b, oVar.f160280b);
    }

    public final int hashCode() {
        return this.f160280b.hashCode() + (this.f160279a.hashCode() * 31);
    }
}
