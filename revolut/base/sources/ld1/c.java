package ld1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_details.CatalogueDetailsFlowContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements qji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueDetailsFlowContract$InputData f193927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f193928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f193929c = this;
    public final e4m.e d;
    public final e4m.e e;

    public c(l lVar, CatalogueDetailsFlowContract$InputData catalogueDetailsFlowContract$InputData) {
        this.f193928b = lVar;
        this.f193927a = catalogueDetailsFlowContract$InputData;
        int i = 10;
        this.d = e4m.b.b(new l9f.z(lVar, this, 0, i));
        this.e = e4m.b.b(new l9f.z(lVar, this, 1, i));
    }

    @Override // dki.t
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // dki.q
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
