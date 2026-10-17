package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.screens.rationales.RationalesScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RationalesScreenContract$InputData f162855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162857c;

    public h(o oVar, l lVar, RationalesScreenContract$InputData rationalesScreenContract$InputData) {
        this.f162855a = rationalesScreenContract$InputData;
        int i = 15;
        this.f162856b = e4m.b.b(new i9e.l(oVar, this, 1, i));
        this.f162857c = e4m.b.b(new i9e.l(oVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
