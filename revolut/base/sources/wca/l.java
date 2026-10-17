package wca;

import a82.s;
import cli.y;
import com.revolut.feature.pix.screens.token_verification.TokenVerificationScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends oki.h implements dli.b {
    public final TokenVerificationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s8a.c f296376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f296377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f296378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f296379s;

    public l(TokenVerificationScreenContract$InputData inputData, s8a.c aliasManagementInteractor, n mapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(aliasManagementInteractor, "aliasManagementInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.o = inputData;
        this.f296376p = aliasManagementInteractor;
        m70.a.c(t0.f186434a);
        h.Companion.getClass();
        e eVar = new e(null, "", d.f296364b);
        this.f296377q = eVar;
        this.f296378r = mra.d.b(this, eVar, mapper, null, false, 12);
        this.f296379s = q.b(0, 6, null);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f296379s, new bwb.k(3, 18, continuation)), null, null, new s(this, continuation, 15), 3);
        l2(new k(this, continuation, 1), new yi5.b(26));
        l2(new k(this, continuation, 0), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f296378r;
    }
}
