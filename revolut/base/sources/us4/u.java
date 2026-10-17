package us4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk2.w;
import urd.y;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt4.h f282441a;

    public u(vt4.h suggestedBarDelegateMapper, vt4.e creditCardPaymentSourceMapper) {
        Intrinsics.checkNotNullParameter(suggestedBarDelegateMapper, "suggestedBarDelegateMapper");
        Intrinsics.checkNotNullParameter(creditCardPaymentSourceMapper, "creditCardPaymentSourceMapper");
        this.f282441a = suggestedBarDelegateMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f282425a, new y(this, 8), new up5.k(this, 26), new w(this, 13));
    }
}
