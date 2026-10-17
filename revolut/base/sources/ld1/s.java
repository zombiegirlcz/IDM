package ld1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.ProductDetailsScreenContract$InputData;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductDetailsScreenContract$InputData f193993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f193994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f193995c;
    public final e4m.e d;

    public s(l lVar, c cVar, ProductDetailsScreenContract$InputData productDetailsScreenContract$InputData) {
        this.f193994b = lVar;
        this.f193995c = cVar;
        this.f193993a = productDetailsScreenContract$InputData;
        this.d = e4m.b.b(new g(lVar, this, 4));
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
