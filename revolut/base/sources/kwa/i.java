package kwa;

import cli.y;
import com.revolut.feature.referrals.code.impl.referral_code.screen.ReferralCodeContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends oki.h implements dli.b {

    @NotNull
    public static final f Companion = new f();
    public final ReferralCodeContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yva.a f190320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f190321q;

    public i(j stateMapper, ReferralCodeContract$InputData inputData, yva.a referralCodeInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(referralCodeInteractor, "referralCodeInteractor");
        this.o = inputData;
        this.f190320p = referralCodeInteractor;
        this.f190321q = mra.d.b(this, new a(""), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f190321q;
    }
}
