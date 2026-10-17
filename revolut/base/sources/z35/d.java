package z35;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.loan.autopay.api.account_selector.AccountSelectorV2$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountSelectorV2$InputData f319174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f319175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f319176c;

    public d(c cVar, AccountSelectorV2$InputData accountSelectorV2$InputData) {
        this.f319175b = cVar;
        this.f319174a = accountSelectorV2$InputData;
        this.f319176c = e4m.b.b(new yf3.d(cVar, this, 6));
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
