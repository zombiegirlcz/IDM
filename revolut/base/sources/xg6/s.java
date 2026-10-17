package xg6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements oe6.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final loi.b f305601a;

    public s(loi.b tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f305601a = tracker;
    }

    public final void a(String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        ((com.revolut.retail.analytics.tracking.impl.b) this.f305601a).e2(new ho.o(frl.c.TopUp, "VrpAuthentication", frl.b.succeeded, a0.d.x("BankName", institutionId)));
    }
}
