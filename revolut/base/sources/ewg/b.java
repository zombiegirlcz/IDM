package ewg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.analytics.ui.widgetised.dashboard.account_picker.AccountPickerContract$InputData;
import dw3.w3;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountPickerContract$InputData f130172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f130173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f130174c;
    public final e4m.e d;

    public b(h hVar, k kVar, AccountPickerContract$InputData accountPickerContract$InputData) {
        this.f130173b = hVar;
        this.f130174c = kVar;
        this.f130172a = accountPickerContract$InputData;
        this.d = e4m.b.b(new w3(hVar, this, 24));
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
