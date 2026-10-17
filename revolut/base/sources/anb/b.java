package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.account_selector.AccountSelectionDialogScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountSelectionDialogScreenContract$InputData f6621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f6622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6623c;

    public b(n nVar, AccountSelectionDialogScreenContract$InputData accountSelectionDialogScreenContract$InputData) {
        this.f6621a = accountSelectionDialogScreenContract$InputData;
        int i = 1;
        this.f6622b = e4m.b.b(new ak5.f(nVar, this, 1, i));
        this.f6623c = e4m.b.b(new ak5.f(nVar, this, 0, i));
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
