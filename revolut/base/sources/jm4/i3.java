package jm4;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.autopay.ui.screen.amount.input.InputAmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class i3 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputAmountScreenContract$InputData f176121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f176122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f176123c;
    public final e4m.e d;

    public i3(a3 a3Var, i0 i0Var, InputAmountScreenContract$InputData inputAmountScreenContract$InputData) {
        this.f176122b = a3Var;
        this.f176121a = inputAmountScreenContract$InputData;
        int i = 20;
        this.f176123c = e4m.b.b(new f1(a3Var, this, 1, i));
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
