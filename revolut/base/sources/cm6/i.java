package cm6;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends oki.h implements f {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oe6.a f25153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f25154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f25155r;

    public i(n stateMapper, e inputData, oe6.a externalInstitutionsInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f25153p = externalInstitutionsInteractor;
        this.f25154q = idempotencyKeyHolder;
        this.f25155r = mra.d.b(this, d.f25149a, stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f25154q.a("PROVIDE_EARLY_CREDIT_CONSENT_IDEMPOTENCY_KEY");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f25155r;
    }
}
