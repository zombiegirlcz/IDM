package nv7;

import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f219557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv7.e f219558b;

    public m(f01.c uiKitResources, xv7.e coverageMapper, xv7.m legalNoticeSectionMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(coverageMapper, "coverageMapper");
        Intrinsics.checkNotNullParameter(legalNoticeSectionMapper, "legalNoticeSectionMapper");
        this.f219557a = uiKitResources;
        this.f219558b = coverageMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f219543a, new nrd.g(this, 11), new nsl.d(this, 12), new nrd.i(this, 5));
    }
}
