package i9g;

import fag.p0;
import fag.t0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f159841a;

    public u(t0 travelHotelsRepository) {
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        this.f159841a = travelHotelsRepository;
    }

    public final pfm.r a(String propertyId) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        t0 t0Var = this.f159841a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        pfm.a aVarE = t0Var.f133374a.addPropertyToFavorites(propertyId).e(new pfm.h(new p0(t0Var, 0), 2)).e(t0Var.N.g(Unit.f186387a, true));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return te0.w.g0(aVarE);
    }

    public final pfm.r b(String propertyId) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        t0 t0Var = this.f159841a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        pfm.a aVarE = t0Var.f133374a.removePropertyToFavorites(propertyId).e(new pfm.h(new p0(t0Var, 1), 2)).e(t0Var.N.g(Unit.f186387a, true));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return te0.w.g0(aVarE);
    }
}
