package e66;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.defi.settings.impl.ui.settings.DeFiSettingsScreenContract$InputData;
import dw3.w3;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeFiSettingsScreenContract$InputData f122932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f122933b;

    public e(d dVar, DeFiSettingsScreenContract$InputData deFiSettingsScreenContract$InputData) {
        this.f122932a = deFiSettingsScreenContract$InputData;
        this.f122933b = e4m.b.b(new w3(dVar, this, 10));
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
