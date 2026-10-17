package ztg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.negative_balance.NegativeBalancePromptScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NegativeBalancePromptScreenContract$InputData f325142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f325143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325144c;

    public k(n nVar, h hVar, NegativeBalancePromptScreenContract$InputData negativeBalancePromptScreenContract$InputData) {
        this.f325142a = negativeBalancePromptScreenContract$InputData;
        int i = 7;
        this.f325143b = e4m.b.b(new zpc.m(nVar, this, 1, i));
        this.f325144c = e4m.b.b(new zpc.m(nVar, this, 0, i));
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
