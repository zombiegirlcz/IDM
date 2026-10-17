package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.create.InstalmentFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k3 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstalmentFlowContract$InputData f176171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k3 f176173c = this;
    public final e4m.e d;

    public k3(a3 a3Var, InstalmentFlowContract$InputData instalmentFlowContract$InputData) {
        this.f176172b = a3Var;
        this.f176171a = instalmentFlowContract$InputData;
        this.d = e4m.b.b(new c3(a3Var, this, 1));
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
