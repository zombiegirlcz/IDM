package ld1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.CatalogueScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class z implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueScreenContract$InputData f194014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f194015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194016c;

    public z(l lVar, CatalogueScreenContract$InputData catalogueScreenContract$InputData) {
        this.f194015b = lVar;
        this.f194014a = catalogueScreenContract$InputData;
        this.f194016c = e4m.b.b(new g(lVar, this, 6));
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
