package dn8;

import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import dmb.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dcd.b f116249a;

    public l(dcd.b savingsInterestRateFormatter) {
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        this.f116249a = savingsInterestRateFormatter;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (d) iii.c.f(t1.v(domainState.f116233b, domainState.f116234c, domainState.d, domainState.e), new dmj.a(this, 6), new m(this, 5), new k(this, domainState, 0));
    }
}
