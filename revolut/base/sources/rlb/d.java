package rlb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.creation.navigation.SavingsAccountCreationStepDestination;
import java.util.Set;
import r7d.o;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountCreationStepDestination f254966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfe.e f254967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f254968c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f254969g;

    public d(e eVar, SavingsAccountCreationStepDestination savingsAccountCreationStepDestination, zfe.e eVar2) {
        this.f254966a = savingsAccountCreationStepDestination;
        this.f254967b = eVar2;
        int i = 13;
        this.f254968c = e4m.b.b(new o(eVar, this, 1, i));
        this.d = e4m.b.b(new o(eVar, this, 0, i));
        this.e = e4m.b.b(new o(eVar, this, 2, i));
        this.f = e4m.b.b(new o(eVar, this, 3, i));
        this.f254969g = e4m.b.b(new o(eVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.d.get(), (n) this.e.get(), (n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
