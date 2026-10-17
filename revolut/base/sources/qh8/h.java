package qh8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorDetailsConfirmationScreenContract$InputData f246523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f246524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f246525c;
    public final e4m.e d;

    public h(k kVar, l lVar, JuniorDetailsConfirmationScreenContract$InputData juniorDetailsConfirmationScreenContract$InputData) {
        this.f246524b = kVar;
        this.f246525c = lVar;
        this.f246523a = juniorDetailsConfirmationScreenContract$InputData;
        this.d = e4m.b.b(new qbj.w(kVar, this, 14));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f246525c.d.get());
    }
}
