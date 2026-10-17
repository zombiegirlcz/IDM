package rr1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.bills.tapi.impl.screen.transfer.transfer_breakdown.TapiTransferBreakdownScreenContract$InputData;
import java.util.Set;
import r7d.o;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TapiTransferBreakdownScreenContract$InputData f256646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f256647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f256648c;

    public d(a aVar, e eVar, TapiTransferBreakdownScreenContract$InputData tapiTransferBreakdownScreenContract$InputData) {
        this.f256646a = tapiTransferBreakdownScreenContract$InputData;
        int i = 20;
        this.f256647b = e4m.b.b(new o(eVar, this, 1, i));
        this.f256648c = e4m.b.b(new o(eVar, this, 0, i));
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
