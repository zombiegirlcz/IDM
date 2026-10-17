package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.settings.screen.CreditCardSettingsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class k2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardSettingsScreenContract$InputData f176168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f176169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176170c;

    public k2(a3 a3Var, j2 j2Var, CreditCardSettingsScreenContract$InputData creditCardSettingsScreenContract$InputData) {
        this.f176168a = creditCardSettingsScreenContract$InputData;
        this.f176169b = e4m.b.b(new f1(a3Var, this, 1, 7));
        this.f176170c = e4m.b.b(new f1(a3Var, this, 0, 7));
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
