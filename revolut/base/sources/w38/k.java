package w38;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements mf1.a {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r38.b f294184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f294185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rea.g f294186c;

    public k(r38.b jointProductInteractor, ang.f userInteractor, rea.g newPocketAvailabilityChecker) {
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(newPocketAvailabilityChecker, "newPocketAvailabilityChecker");
        this.f294184a = jointProductInteractor;
        this.f294185b = userInteractor;
        this.f294186c = newPocketAvailabilityChecker;
    }

    @Override // mf1.a
    public final Flow a() {
        return new hy9.b(zi0.c.w(zh9.u0.m(boh.f.e(((r38.l) this.f294184a).f(w4l.h.f294642c), new vx9.b(this, 26)), rd0.e.b(this.f294185b.k(false)))), 7);
    }

    @Override // mf1.a
    public final String b() {
        return "ACCOUNT.joint_account";
    }
}
