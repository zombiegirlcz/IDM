package yw6;

import cli.y;
import gr6.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.l;
import yk6.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends oki.h implements e {
    public final o o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l61.a f317340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f317341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f317342r;

    public g(o freelancerProcessingFeesInteractor, l61.a userCompanyInteractor, i stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerProcessingFeesInteractor, "freelancerProcessingFeesInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerProcessingFeesInteractor;
        this.f317340p = userCompanyInteractor;
        this.f317341q = new vii.b();
        this.f317342r = mra.d.b(this, new d(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f317341q, new y4f.o(continuation, this, 19)), null, null, new m(this, continuation, 23), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f317342r;
    }
}
