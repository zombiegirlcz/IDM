package nng;

import com.google.common.collect.ImmutableSet;
import com.revolut.shared.feature.user_declarations.api.flows.tracking.TrackingConsentInputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackingConsentInputData f217671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f217672b;

    public o(p pVar, TrackingConsentInputData.Workflow workflow) {
        this.f217671a = workflow;
        this.f217672b = e4m.b.b(new n(pVar, this, 0));
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
