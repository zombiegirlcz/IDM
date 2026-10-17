package rr1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.amount.TapiTransferAmountScreenContract$Input;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TapiTransferAmountScreenContract$Input f256643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f256644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f256645c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c(a aVar, e eVar, TapiTransferAmountScreenContract$Input tapiTransferAmountScreenContract$Input) {
        this.f256644b = aVar;
        this.f256643a = tapiTransferAmountScreenContract$Input;
        int i = 19;
        this.f256645c = e4m.b.b(new o(aVar, this, 3, i));
        this.d = e4m.b.b(new o(aVar, this, 2, i));
        this.e = e4m.b.b(new o(aVar, this, 1, i));
        this.f = e4m.b.b(new o(aVar, this, 0, i));
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
