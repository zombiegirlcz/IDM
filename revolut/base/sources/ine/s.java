package ine;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.tax_residency.impl.v2.ui.tin_input.TinInputScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TinInputScreenContract$InputData f162901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f162902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f162903c;

    public s(o oVar, p pVar, TinInputScreenContract$InputData tinInputScreenContract$InputData) {
        this.f162901a = tinInputScreenContract$InputData;
        this.f162902b = e4m.b.b(new i9e.l(pVar, this, 1, 21));
        this.f162903c = e4m.b.b(new i9e.l(pVar, this, 0, 21));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
