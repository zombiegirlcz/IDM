package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.top_level.TransactionsTroubleshooterTopLevelScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionsTroubleshooterTopLevelScreenContract$InputData f252192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252194c;

    public y(l lVar, t tVar, TransactionsTroubleshooterTopLevelScreenContract$InputData transactionsTroubleshooterTopLevelScreenContract$InputData) {
        this.f252192a = transactionsTroubleshooterTopLevelScreenContract$InputData;
        this.f252193b = e4m.b.b(new w(lVar, tVar, this, 1, 1));
        this.f252194c = e4m.b.b(new w(lVar, tVar, this, 0, 1));
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
