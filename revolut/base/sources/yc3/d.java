package yc3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;
import xsl.q;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashbackTransactionsScreenContract$InputData f312473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f312474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f312475c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f312476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f312477h;

    public d(a aVar, h hVar, BaseScreen baseScreen, CashbackTransactionsScreenContract$InputData cashbackTransactionsScreenContract$InputData) {
        this.f312474b = aVar;
        this.f312473a = cashbackTransactionsScreenContract$InputData;
        this.f312475c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 17;
        this.d = e4m.b.b(new q(aVar, this, 2, i));
        this.e = e4m.b.b(new q(aVar, this, 1, i));
        this.f = e4m.b.b(new q(aVar, this, 0, i));
        this.f312476g = e4m.b.b(new q(aVar, this, 4, i));
        this.f312477h = e4m.b.b(new q(aVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
