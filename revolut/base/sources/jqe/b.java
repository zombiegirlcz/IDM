package jqe;

import com.revolut.feature.teen.accounts.api.TeenAccountsApi$Toggles$TeenGuardianHub;
import go.g;
import jp9.l;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import pfe.h;
import rd0.e;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xqe.b f177709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f177710b;

    public b(xqe.b teenProfileInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f177709a = teenProfileInteractor;
        this.f177710b = featureToggleInteractor;
    }

    @Override // pfe.h
    public final Flow a() {
        return !((d) this.f177710b).c(TeenAccountsApi$Toggles$TeenGuardianHub.f90321c) ? new g(f0.f322471a, 2) : yoj.b.e(e.n(this.f177709a.b(w4l.h.f294642c), h0.f322473a), new jb8.b(this, 17), new l(8), new jpl.e(3));
    }
}
