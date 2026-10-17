package td1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueCategory f269910a;

    public c(CatalogueCategory catalogueCategory) {
        this.f269910a = catalogueCategory;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f269910a, ((c) obj2).f269910a);
    }

    public final int hashCode() {
        CatalogueCategory catalogueCategory = this.f269910a;
        if (catalogueCategory == null) {
            return 0;
        }
        return catalogueCategory.hashCode();
    }
}
