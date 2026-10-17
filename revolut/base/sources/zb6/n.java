package zb6;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bc6.a f320815a;

    public n(bc6.a amountEditMapper) {
        Intrinsics.checkNotNullParameter(amountEditMapper, "amountEditMapper");
        this.f320815a = amountEditMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(t1.u(domainState.f320805a, domainState.f320807c, domainState.d), new z8g.q(this, domainState, 18), new z8d.h(5), new y66.q(this, domainState, 26));
    }
}
