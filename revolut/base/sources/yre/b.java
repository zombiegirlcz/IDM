package yre;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.three_ds_verification.impl.ui.add_money.AddMoneyMethodSelectionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddMoneyMethodSelectionScreenContract$InputData f316285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f316286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f316287c;

    public b(e eVar, f fVar, AddMoneyMethodSelectionScreenContract$InputData addMoneyMethodSelectionScreenContract$InputData) {
        this.f316285a = addMoneyMethodSelectionScreenContract$InputData;
        int i = 0;
        this.f316286b = e4m.b.b(new a(eVar, this, 1, i));
        this.f316287c = e4m.b.b(new a(eVar, this, 0, i));
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
