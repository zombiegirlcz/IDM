package mkh;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.ui.api.currencychanger.CurrencyChangerContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyChangerContract$InputData f206322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f206323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206324c;

    public f(s sVar, CurrencyChangerContract$InputData currencyChangerContract$InputData) {
        this.f206322a = currencyChangerContract$InputData;
        int i = 4;
        this.f206323b = e4m.b.b(new mjl.b(sVar, this, 1, i));
        this.f206324c = e4m.b.b(new mjl.b(sVar, this, 0, i));
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
