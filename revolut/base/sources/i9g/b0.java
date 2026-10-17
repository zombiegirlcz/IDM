package i9g;

import fag.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f159780a;

    public b0(t0 travelHotelsRepository, p8g.c travelHotelsFeatureInteractor) {
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        Intrinsics.checkNotNullParameter(travelHotelsFeatureInteractor, "travelHotelsFeatureInteractor");
        this.f159780a = travelHotelsRepository;
    }

    public final efm.r a(yfi.a propertyDetailsParams, boolean z) {
        Intrinsics.checkNotNullParameter(propertyDetailsParams, "propertyDetailsParams");
        t0 t0Var = this.f159780a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(propertyDetailsParams, "propertyDetailsParams");
        return t0Var.E.f(propertyDetailsParams, z);
    }

    public final efm.r b(bgi.a guestsReviewsPageParams) {
        Intrinsics.checkNotNullParameter(guestsReviewsPageParams, "guestsReviewsPageParams");
        t0 t0Var = this.f159780a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(guestsReviewsPageParams, "guestsReviewsPageParams");
        efm.r map = ue0.e.p(mo3.a.n(t0Var.G.f(guestsReviewsPageParams, false)), zhm.h0.f322473a).map(new fag.m0(new f0m.c(guestsReviewsPageParams, 24), 15));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r c(String propertyId) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        t0 t0Var = this.f159780a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        return t0Var.H.f(propertyId, false);
    }

    public final efm.r d(cgi.c propertyRoomDetailsParams) {
        Intrinsics.checkNotNullParameter(propertyRoomDetailsParams, "propertyRoomDetailsParams");
        t0 t0Var = this.f159780a;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(propertyRoomDetailsParams, "propertyRoomDetailsParams");
        return t0Var.J.f(propertyRoomDetailsParams, false);
    }
}
