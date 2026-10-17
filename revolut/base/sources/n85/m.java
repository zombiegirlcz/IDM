package n85;

import com.google.crypto.tink.shaded.protobuf.t1;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import n33.l0;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m35.h f213223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m35.j f213224b;

    public m(m35.h instalmentItemMapper, m35.j repaymentItemMapper) {
        Intrinsics.checkNotNullParameter(instalmentItemMapper, "instalmentItemMapper");
        Intrinsics.checkNotNullParameter(repaymentItemMapper, "repaymentItemMapper");
        this.f213223a = instalmentItemMapper;
        this.f213224b = repaymentItemMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(t1.u(domainState.f213208a, domainState.f213209b, domainState.f213210c), new n5k.c(18), new l0(29), new m88.c(this, domainState, 21));
    }
}
