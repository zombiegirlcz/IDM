package tk9;

import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vi9.l f271924a;

    public l(vi9.l payLaterInstalmentItemMapper) {
        Intrinsics.checkNotNullParameter(payLaterInstalmentItemMapper, "payLaterInstalmentItemMapper");
        this.f271924a = payLaterInstalmentItemMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(domainState.f271915a, new tif.g(18), new tj9.d(10), new tch.c(this, 3));
    }
}
