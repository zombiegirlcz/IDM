package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.all_categories.AllCategoriesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130750a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AllCategoriesScreenContract$InputData f130751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f130752c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g0(b0 b0Var, p pVar, AllCategoriesScreenContract$InputData allCategoriesScreenContract$InputData) {
        this.f130752c = b0Var;
        this.f130751b = allCategoriesScreenContract$InputData;
        int i = 8;
        this.d = e4m.b.b(new euh.a(this, 0, i));
        this.e = e4m.b.b(new euh.a(this, 2, i));
        this.f = e4m.b.b(new euh.a(this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f130750a) {
        }
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f130750a) {
        }
        return ImmutableSet.of();
    }

    public g0(b0 b0Var, l lVar, AllCategoriesScreenContract$InputData allCategoriesScreenContract$InputData) {
        this.f130752c = b0Var;
        this.f130751b = allCategoriesScreenContract$InputData;
        int i = 6;
        this.d = e4m.b.b(new euh.a(this, 0, i));
        this.e = e4m.b.b(new euh.a(this, 2, i));
        this.f = e4m.b.b(new euh.a(this, 1, i));
    }
}
