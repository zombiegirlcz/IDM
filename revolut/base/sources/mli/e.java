package mli;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import maa.r;
import xjl.o;

/* JADX INFO: loaded from: classes13.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f206964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f206965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zm0.b f206966c;
    public final o d;
    public volatile boolean e;
    public final AtomicBoolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.b f206967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f206968h;

    public e(k logoutCleaner, ang.f userInteractor, zm0.b sessionController, o revolutSsoSignOutInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(logoutCleaner, "logoutCleaner");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        Intrinsics.checkNotNullParameter(revolutSsoSignOutInteractor, "revolutSsoSignOutInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f206964a = logoutCleaner;
        this.f206965b = userInteractor;
        this.f206966c = sessionController;
        this.d = revolutSsoSignOutInteractor;
        this.f = new AtomicBoolean(false);
        this.f206967g = j6.a.h("create(...)");
        this.f206968h = yhm.j.b(new r(this, 10));
    }

    public final efm.b a(boolean z) {
        this.f206967g.onNext(new b(z));
        efm.b bVar = (efm.b) this.f206968h.getValue();
        Intrinsics.checkNotNullExpressionValue(bVar, "<get-_logOutCompletable>(...)");
        return bVar;
    }
}
