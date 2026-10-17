package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class u implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmConsentNavigation$InputData f231771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f231772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231773c;

    public u(v vVar, ApmConsentNavigation$InputData apmConsentNavigation$InputData) {
        this.f231771a = apmConsentNavigation$InputData;
        int i = 25;
        this.f231772b = e4m.b.b(new ove.w(vVar, this, 1, i));
        this.f231773c = e4m.b.b(new ove.w(vVar, this, 0, i));
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
