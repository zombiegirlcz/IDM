package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.balance_summary.BalanceSummaryDialogScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BalanceSummaryDialogScreenContract$InputData f6624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f6625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6626c;
    public final e4m.e d;

    public c(n nVar, BalanceSummaryDialogScreenContract$InputData balanceSummaryDialogScreenContract$InputData) {
        this.f6625b = nVar;
        this.f6624a = balanceSummaryDialogScreenContract$InputData;
        int i = 2;
        this.f6626c = e4m.b.b(new ak5.f(nVar, this, 1, i));
        this.d = e4m.b.b(new ak5.f(nVar, this, 0, i));
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
