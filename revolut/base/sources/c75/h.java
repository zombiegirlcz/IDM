package c75;

import b88.o;
import c42.j;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import m35.r;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f21883a;

    public h(r loanUiContentMapper) {
        Intrinsics.checkNotNullParameter(loanUiContentMapper, "loanUiContentMapper");
        this.f21883a = loanUiContentMapper;
    }

    @Override // jki.p
    public final m a(i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f((List) iii.c.f(domainState.f21878a, new j(20), new c2f.m(15), new o(this, 28)));
    }
}
