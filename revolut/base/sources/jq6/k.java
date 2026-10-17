package jq6;

import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends oki.h implements c {

    @NotNull
    public static final h Companion = new h();
    public final yud.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final avd.b f177486p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f177487q;

    public k(yud.g stakingInteractor, avd.b flexibleStakingConsentInteractor, m stateMapper) {
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(flexibleStakingConsentInteractor, "flexibleStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = stakingInteractor;
        this.f177486p = flexibleStakingConsentInteractor;
        this.f177487q = mra.d.b(this, new b(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, this.o.e(w4l.h.f294642c), null, new jij.h(this, (Continuation) null, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f177487q;
    }
}
