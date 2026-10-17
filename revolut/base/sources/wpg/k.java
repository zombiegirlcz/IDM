package wpg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VaultTermsViewerScreenContract$InputData f299274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f299275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f299276c;
    public final e4m.e d;

    public k(l lVar, VaultTermsViewerScreenContract$InputData vaultTermsViewerScreenContract$InputData) {
        this.f299274a = vaultTermsViewerScreenContract$InputData;
        int i = 9;
        this.f299275b = e4m.b.b(new whc.t(lVar, this, 1, i));
        this.f299276c = e4m.b.b(new whc.t(lVar, this, 0, i));
        this.d = e4m.b.b(new whc.t(lVar, this, 2, i));
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
