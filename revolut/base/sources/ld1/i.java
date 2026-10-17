package ld1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditCustomProductScreenContract$InputData f193946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f193947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f193948c;
    public final e4m.e d;

    public i(l lVar, w wVar, EditCustomProductScreenContract$InputData editCustomProductScreenContract$InputData) {
        this.f193947b = lVar;
        this.f193948c = wVar;
        this.f193946a = editCustomProductScreenContract$InputData;
        this.d = e4m.b.b(new g(lVar, this, 1));
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
