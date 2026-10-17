package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter.UpcomingTransactionTroubleshooterScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class z implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment f252195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f252196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252197c;
    public final e4m.e d;

    public z(l lVar, t tVar, UpcomingTransactionTroubleshooterScreenContract$InputData.RecurrentPayment recurrentPayment) {
        this.f252196b = lVar;
        this.f252195a = recurrentPayment;
        this.f252197c = e4m.b.b(new w(lVar, tVar, this, 1, 2));
        this.d = e4m.b.b(new w(lVar, tVar, this, 0, 2));
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
