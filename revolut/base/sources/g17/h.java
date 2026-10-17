package g17;

import cli.n;
import cli.y;
import com.revolut.feature.freelancer.impl.ui.prompt.post_activation.ProPostActivationScreenContract$InputData;
import g06.k;
import hr6.l;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends oki.h implements dli.b {
    public final l93.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gr6.h f139553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f139554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ProPostActivationScreenContract$InputData f139555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0j.d f139556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vii.b f139557t;
    public final y u;

    public h(l93.b cardsInteractor, gr6.h freelancerCashbackInteractor, l freelancerCommandFactory, ProPostActivationScreenContract$InputData inputData, r0j.d virtualCardPromptProvider, n stateMapper) {
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCashbackInteractor, "freelancerCashbackInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(virtualCardPromptProvider, "virtualCardPromptProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = cardsInteractor;
        this.f139553p = freelancerCashbackInteractor;
        this.f139554q = freelancerCommandFactory;
        this.f139555r = inputData;
        this.f139556s = virtualCardPromptProvider;
        this.f139557t = new vii.b();
        this.u = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f139557t, new f5h.b(continuation, this, 19)), null, null, new k(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
