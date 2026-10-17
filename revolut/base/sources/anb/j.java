package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.ui.product_migration.ProductMigrationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductMigrationScreenContract$InputData f6649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f6650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6651c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public j(n nVar, i iVar, ProductMigrationScreenContract$InputData productMigrationScreenContract$InputData) {
        this.f6649a = productMigrationScreenContract$InputData;
        this.f6650b = e4m.b.b(new ak5.f(nVar, this, 1, 7));
        this.f6651c = e4m.b.b(new ak5.f(nVar, this, 0, 7));
        this.d = e4m.b.b(new ak5.f(nVar, this, 3, 7));
        this.e = e4m.b.b(new ak5.f(nVar, this, 4, 7));
        this.f = e4m.b.b(new ak5.f(nVar, this, 2, 7));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f6651c.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
