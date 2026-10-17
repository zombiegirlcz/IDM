package ga6;

import efm.d0;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import zi0.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a31.a f142061a;

    public a(a31.a donationsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(donationsAvailabilityInteractor, "donationsAvailabilityInteractor");
        this.f142061a = donationsAvailabilityInteractor;
    }

    public final d0 a() {
        d0 d0VarFirstOrError = c.q(e.c(this.f142061a.j(), g.f186406a), Boolean.FALSE).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }
}
