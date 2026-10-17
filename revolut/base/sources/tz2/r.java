package tz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.ui.limit.transaction_limit.TransactionLimitControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionLimitControllerContract$InputData f275822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f275823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f275824c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public r(e eVar, ViewController viewController, TransactionLimitControllerContract$InputData transactionLimitControllerContract$InputData) {
        this.f275822a = transactionLimitControllerContract$InputData;
        int i = 24;
        this.f275823b = e4m.b.b(new tg5.h(eVar, this, 2, i));
        this.f275824c = e4m.b.b(new tg5.h(eVar, this, 1, i));
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i2 = 24;
        this.e = e4m.b.b(new tg5.h(eVar, this, 3, i2));
        this.f = e4m.b.b(new tg5.h(eVar, this, 0, i2));
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
