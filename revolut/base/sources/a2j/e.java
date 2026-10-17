package a2j;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, u.c(new TextDelegate.Model(0, 0, 1020, domainState.f883a, "DISCLAIMER_LIST_ID")), new lw0.a(domainState.f884b, null, null, null, false, 30));
    }
}
