package cni;

import bw4.s;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.oauth.impl.ui.consent.screen.ConsentScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends oki.h implements m {
    public final ConsentScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vmi.d f25447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rqk.m f25448q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f25449r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f25450s;

    public q(ConsentScreenContract$InputData inputData, vmi.d repository, rqk.m userInfoFromAppProvider, com.revolut.oauth.impl.ui.consent.screen.b stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInfoFromAppProvider, "userInfoFromAppProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f25447p = repository;
        this.f25448q = userInfoFromAppProvider;
        this.f25449r = new vii.b();
        this.f25450s = mra.d.b(this, new g(new Data(null, null, false, 7, null), h0.f322473a), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f25449r, new s(continuation, this, 20)), new p(this, continuation, 0), null, new p(this, continuation, 1), 2);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f25450s;
    }
}
