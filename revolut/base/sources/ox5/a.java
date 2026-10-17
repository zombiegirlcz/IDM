package ox5;

import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SortingType f230566a;

    public a(SortingType selectedSortingType) {
        Intrinsics.checkNotNullParameter(selectedSortingType, "selectedSortingType");
        this.f230566a = selectedSortingType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f230566a, ((a) obj2).f230566a);
    }

    public final int hashCode() {
        return this.f230566a.hashCode();
    }
}
