package ksg;

import jki.m;
import jki.p;
import koe.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z9l.g f189465a;

    public l(z9l.g itemsProvider) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.f189465a = itemsProvider;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((ir2.c) iii.c.f(domainState.f189455a, new kpj.a(this, 29), new x(this), new kcg.j(this, 12)));
    }
}
