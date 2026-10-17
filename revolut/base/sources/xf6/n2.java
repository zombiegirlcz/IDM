package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.inactive_consents_list.InactiveConsentsListScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class n2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InactiveConsentsListScreenContract$InputData f304966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f304967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304968c;

    public n2(w2 w2Var, x2 x2Var, InactiveConsentsListScreenContract$InputData inactiveConsentsListScreenContract$InputData) {
        this.f304966a = inactiveConsentsListScreenContract$InputData;
        int i = 9;
        this.f304967b = e4m.b.b(new t1(w2Var, this, 1, i));
        this.f304968c = e4m.b.b(new t1(w2Var, this, 0, i));
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
