package jq4;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq4.e f177465a;

    public p(lq4.c actionMapper, lq4.e itemMapper) {
        Intrinsics.checkNotNullParameter(actionMapper, "actionMapper");
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        this.f177465a = itemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f177450a, new jpl.e(this, 1), new jme.f(this, 13), new joa.j(this, domainState, 1));
    }
}
