package pgf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transaction_list.impl.ui.recurring_transfers.RecurringTransfersScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringTransfersScreenContract$InputData f235881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f235882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f235883c;
    public final e4m.e d;
    public final e4m.e e;

    public b(e eVar, RecurringTransfersScreenContract$InputData recurringTransfersScreenContract$InputData) {
        this.f235882b = eVar;
        this.f235881a = recurringTransfersScreenContract$InputData;
        int i = 11;
        this.f235883c = e4m.b.b(new pa6.f(eVar, this, 2, i));
        this.d = e4m.b.b(new pa6.f(eVar, this, 1, i));
        this.e = e4m.b.b(new pa6.f(eVar, this, 0, i));
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
