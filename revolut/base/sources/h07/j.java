package h07;

import a82.s;
import cli.n;
import cli.y;
import com.revolut.feature.freelancer.impl.ui.profile.email_flow.check_email.FreelancerCheckEmailScreenContract$InputData;
import et6.k3;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements f {

    @NotNull
    public static final h Companion = new h();
    public final k3 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f148200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f148201q;

    public j(k3 freelancerSettingsInteractor, l inboxIntentProvider, n stateMapper, FreelancerCheckEmailScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(freelancerSettingsInteractor, "freelancerSettingsInteractor");
        Intrinsics.checkNotNullParameter(inboxIntentProvider, "inboxIntentProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = freelancerSettingsInteractor;
        this.f148200p = inboxIntentProvider;
        this.f148201q = mra.d.b(this, new e(inputData.f74045a, 0L), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ta6.a.H(60L, 1L, TimeUnit.SECONDS), null, null, new s(this, (Continuation) null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f148201q;
    }
}
