package hkb;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.challenge.presentation.tracking.SavingsChallengeTrackerContract$InputData;
import hba.k;
import hcj.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements dli.b {
    public final SavingsChallengeTrackerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ugc.a f152911p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f80.a f152912q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f152913r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f152914s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f152915t;

    public d(f stateMapper, SavingsChallengeTrackerContract$InputData inputData, ugc.a savingsChallengeInteractor, f80.a uriHelper, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsChallengeInteractor, "savingsChallengeInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f152911p = savingsChallengeInteractor;
        this.f152912q = uriHelper;
        this.f152913r = deeplinkHandler;
        this.f152914s = new vii.b();
        this.f152915t = mra.d.b(this, new a(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f152914s, new o(continuation, this, 6)), null, null, new k(this, continuation, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f152915t;
    }
}
