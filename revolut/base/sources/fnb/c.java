package fnb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.documents.presentation.documents.ProductDocumentsContract$InputData;
import fa0.q;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductDocumentsContract$InputData f136601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f136602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f136603c;
    public final e4m.e d;

    public c(e eVar, ProductDocumentsContract$InputData productDocumentsContract$InputData) {
        this.f136601a = productDocumentsContract$InputData;
        int i = 26;
        this.f136602b = e4m.b.b(new q(eVar, this, 1, i));
        this.f136603c = e4m.b.b(new q(eVar, this, 0, i));
        this.d = e4m.b.b(new q(eVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f136603c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
