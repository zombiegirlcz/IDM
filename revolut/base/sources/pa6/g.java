package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.donations.impl.ui.kompot.screen.transactions.CharityTransactionsContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharityTransactionsContract$InputData f234367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f234368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234369c;
    public final e4m.e d;

    public g(m mVar, n nVar, CharityTransactionsContract$InputData charityTransactionsContract$InputData) {
        this.f234368b = mVar;
        this.f234367a = charityTransactionsContract$InputData;
        this.f234369c = e4m.b.b(new f(mVar, this, 1, 0));
        this.d = e4m.b.b(new f(mVar, this, 0, 0));
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
