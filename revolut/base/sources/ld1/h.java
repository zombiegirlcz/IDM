package ld1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_catalogue_product_entry.EditCatalogueProductEntryScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditCatalogueProductEntryScreenContract$InputData f193943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f193944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f193945c;
    public final e4m.e d;

    public h(l lVar, w wVar, EditCatalogueProductEntryScreenContract$InputData editCatalogueProductEntryScreenContract$InputData) {
        this.f193944b = lVar;
        this.f193945c = wVar;
        this.f193943a = editCatalogueProductEntryScreenContract$InputData;
        this.d = e4m.b.b(new g(lVar, this, 0));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
