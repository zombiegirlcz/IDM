package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.card.impl.ui.settings.due_date.CreditCardSelectDueDateScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardSelectDueDateScreenContract$InputData f176118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f176119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176120c;

    public i2(a3 a3Var, h2 h2Var, CreditCardSelectDueDateScreenContract$InputData creditCardSelectDueDateScreenContract$InputData) {
        this.f176118a = creditCardSelectDueDateScreenContract$InputData;
        this.f176119b = e4m.b.b(new f1(a3Var, this, 1, 6));
        this.f176120c = e4m.b.b(new f1(a3Var, this, 0, 6));
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
