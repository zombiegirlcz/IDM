package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_products.AllProductsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130759a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AllProductsScreenContract$InputData f130760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f130761c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public i0(b0 b0Var, p pVar, AllProductsScreenContract$InputData allProductsScreenContract$InputData) {
        this.f130761c = b0Var;
        this.f130760b = allProductsScreenContract$InputData;
        int i = 9;
        this.d = e4m.b.b(new euh.a(this, 0, i));
        this.e = e4m.b.b(new euh.a(this, 2, i));
        this.f = e4m.b.b(new euh.a(this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f130759a) {
        }
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f130759a) {
        }
        return ImmutableSet.of();
    }

    public i0(b0 b0Var, l lVar, AllProductsScreenContract$InputData allProductsScreenContract$InputData) {
        this.f130761c = b0Var;
        this.f130760b = allProductsScreenContract$InputData;
        int i = 7;
        this.d = e4m.b.b(new euh.a(this, 0, i));
        this.e = e4m.b.b(new euh.a(this, 2, i));
        this.f = e4m.b.b(new euh.a(this, 1, i));
    }
}
