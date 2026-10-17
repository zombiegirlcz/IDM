package wpg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance.DocumentAcceptanceScreenContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DocumentAcceptanceScreenContract$Input f299256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f299257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f299258c;
    public final e4m.e d;

    public f(l lVar, b bVar, DocumentAcceptanceScreenContract$Input documentAcceptanceScreenContract$Input) {
        this.f299256a = documentAcceptanceScreenContract$Input;
        int i = 6;
        this.f299257b = e4m.b.b(new whc.t(lVar, this, 1, i));
        this.f299258c = e4m.b.b(new whc.t(lVar, this, 2, i));
        this.d = e4m.b.b(new whc.t(lVar, this, 0, i));
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
