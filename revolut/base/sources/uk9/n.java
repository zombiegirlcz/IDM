package uk9;

import jki.p;
import kotlin.jvm.internal.Intrinsics;
import uj6.v;
import uk2.w;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gk9.b f280712a;

    public n(gk9.b payLaterPlanItemMapper) {
        Intrinsics.checkNotNullParameter(payLaterPlanItemMapper, "payLaterPlanItemMapper");
        this.f280712a = payLaterPlanItemMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(domainState.f280701a, new v(this, 6), new uj8.j(this, 5), new w(this, 1));
    }
}
