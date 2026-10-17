package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.upcoming.UpcomingTransactionsScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpcomingTransactionsScreenContract$InputData f252088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252090c;

    public a0(l lVar, t tVar, UpcomingTransactionsScreenContract$InputData upcomingTransactionsScreenContract$InputData) {
        this.f252088a = upcomingTransactionsScreenContract$InputData;
        this.f252089b = e4m.b.b(new w(lVar, tVar, this, 1, 3));
        this.f252090c = e4m.b.b(new w(lVar, tVar, this, 0, 3));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
