package ob0;

import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountrySelectionItem f223815a;

    public c(CountrySelectionItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f223815a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f223815a, ((c) obj2).f223815a);
    }

    public final int hashCode() {
        return this.f223815a.hashCode();
    }
}
