package w66;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.defi.trade.impl.ui.trade.DefiTradeContract$InputData;
import java.util.Set;
import vzc.j;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DefiTradeContract$InputData f295397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f295398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f295399c;

    public d(e eVar, DefiTradeContract$InputData defiTradeContract$InputData) {
        this.f295397a = defiTradeContract$InputData;
        int i = 19;
        this.f295398b = e4m.b.b(new j(eVar, this, 1, i));
        this.f295399c = e4m.b.b(new j(eVar, this, 0, i));
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
