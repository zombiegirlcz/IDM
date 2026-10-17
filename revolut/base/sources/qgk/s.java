package qgk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoreForFamilyScreenContract$InputData f246221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f246222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f246223c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public s(i0 i0Var, j jVar, MoreForFamilyScreenContract$InputData moreForFamilyScreenContract$InputData) {
        this.f246222b = i0Var;
        this.f246221a = moreForFamilyScreenContract$InputData;
        this.f246223c = e4m.b.b(new m(i0Var, this, 1, 1));
        this.d = e4m.b.b(new m(i0Var, this, 0, 1));
        this.e = e4m.b.b(new m(i0Var, this, 3, 1));
        this.f = e4m.b.b(new m(i0Var, this, 2, 1));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
