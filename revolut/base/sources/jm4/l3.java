package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class l3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstalmentTermScreenContract$InputData f176187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176189c;
    public final e4m.e d;

    public l3(a3 a3Var, k3 k3Var, InstalmentTermScreenContract$InputData instalmentTermScreenContract$InputData) {
        this.f176188b = a3Var;
        this.f176187a = instalmentTermScreenContract$InputData;
        this.f176189c = e4m.b.b(new f1(a3Var, this, 1, 22));
        this.d = e4m.b.b(new f1(a3Var, this, 0, 22));
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
