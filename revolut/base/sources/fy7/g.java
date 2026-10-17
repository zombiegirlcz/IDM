package fy7;

import efm.r;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f138962a;

    public g(e state, fx7.a petAnalyticsInteractor) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(petAnalyticsInteractor, "petAnalyticsInteractor");
        this.f138962a = state;
    }

    @Override // fy7.d
    public final efm.b A0(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return w.z0(this.f138962a.i0(), date);
    }

    @Override // fy7.d
    public final efm.b s2() {
        m mVar = m.f235744a;
        Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
        return ue0.e.v(mVar);
    }

    @Override // fy7.d
    public final r u0() {
        return this.f138962a.i0().a();
    }
}
