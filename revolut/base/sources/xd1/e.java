package xd1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueCategory f304211a;

    public e(CatalogueCategory catalogueCategory) {
        this.f304211a = catalogueCategory;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f304211a, ((e) obj2).f304211a);
    }

    public final int hashCode() {
        CatalogueCategory catalogueCategory = this.f304211a;
        if (catalogueCategory == null) {
            return 0;
        }
        return catalogueCategory.hashCode();
    }
}
