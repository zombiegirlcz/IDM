package c3k;

import b1c.p;
import c2f.m;
import cli.j;
import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f20961a;

    public h(f01.a uiKitResources, w2k.a subtitleMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(subtitleMapper, "subtitleMapper");
        this.f20961a = uiKitResources;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f20955a, new c2d.n(29), new m(4), new p(domainState, this, 25));
        List list2 = (List) domainState.f20955a.getContent();
        return new f(list, (list2 != null ? list2.size() : 0) >= 9);
    }
}
