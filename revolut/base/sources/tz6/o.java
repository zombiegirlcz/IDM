package tz6;

import cli.y;
import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends oki.h implements i {

    @NotNull
    public static final k Companion = new k();
    public final bgc.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FreelancerPerksDetailsScreenContract$InputData f275886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f275887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f275888r;

    public o(bgc.e rewardsInteractor, FreelancerPerksDetailsScreenContract$InputData inputData, q stateMapper) {
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = rewardsInteractor;
        this.f275886p = inputData;
        this.f275887q = new vii.b();
        this.f275888r = mra.d.b(this, new h(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f275887q, new tik.b(continuation, this, 13)), null, null, new e(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f275888r;
    }
}
