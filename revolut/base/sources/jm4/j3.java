package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.instalment.confirmation.InstalmentConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class j3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstalmentConfirmationScreenContract$InputData f176155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176157c;
    public final e4m.e d;

    public j3(a3 a3Var, k3 k3Var, InstalmentConfirmationScreenContract$InputData instalmentConfirmationScreenContract$InputData) {
        this.f176156b = a3Var;
        this.f176155a = instalmentConfirmationScreenContract$InputData;
        int i = 21;
        this.f176157c = e4m.b.b(new f1(a3Var, this, 1, i));
        this.d = e4m.b.b(new f1(a3Var, this, 0, i));
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
