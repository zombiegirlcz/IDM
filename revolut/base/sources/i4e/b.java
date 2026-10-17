package i4e;

import com.revolut.feature.security_hub.api.SecurityHubApi$Toggles;
import jte.d;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j4e.a f158418l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f158419m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y0 f158420n;

    public b(j4e.a streetModeLocationCollectionEventInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(streetModeLocationCollectionEventInteractor, "streetModeLocationCollectionEventInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f158418l = streetModeLocationCollectionEventInteractor;
        this.f158419m = featureToggleInteractor;
    }

    @Override // yji.n
    public final void D2() {
        if (((d) this.f158419m).c(SecurityHubApi$Toggles.StreetModeLocationLoader.f85370c)) {
            n.j2(this, this.f158418l.f171371a, null, new i13.d(this, (Continuation) null, 13), 3);
        }
    }

    @Override // yji.n
    public final void E2() {
        y0 y0Var = this.f158420n;
        if (y0Var != null) {
            q2().b(y0Var);
        }
        this.f158420n = null;
    }
}
