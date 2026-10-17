package com.revolut.feature.add_money.impl.flow;

import com.revolut.feature.add_money.api.navigation.AddMoneyInputData;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import m84.e;
import mh1.k;
import mh1.n;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends h implements mh1.c {
    public final AddMoneyInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f60918p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f60919q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mh1.a f60920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f60921s;

    public c(AddMoneyInputData input, n addMoneyNewCurrenciesInteractor, k navigationProvider, mh1.a balancesFilterInteractor) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(addMoneyNewCurrenciesInteractor, "addMoneyNewCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        this.o = input;
        this.f60918p = addMoneyNewCurrenciesInteractor;
        this.f60919q = navigationProvider;
        this.f60920r = balancesFilterInteractor;
        this.f60921s = d.a(this, new e(this, 16));
    }

    @Override // yki.j
    public final void M0() {
        l2(new mci.e(this, null, 3), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f60921s;
    }
}
