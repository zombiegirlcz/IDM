package he1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueCategory f151517a;

    public h(CatalogueCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f151517a = category;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f151517a, ((h) obj2).f151517a);
    }

    public final int hashCode() {
        return this.f151517a.hashCode();
    }
}
