package p6a;

import cli.n;
import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p5a.m;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6a.a f233244a;

    public k(e6a.a providerBlockListItemMapper, e6a.b providerErrorListItemMapper) {
        Intrinsics.checkNotNullParameter(providerBlockListItemMapper, "providerBlockListItemMapper");
        Intrinsics.checkNotNullParameter(providerErrorListItemMapper, "providerErrorListItemMapper");
        this.f233244a = providerBlockListItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i((List) iii.c.f(domainState.f233236a, new m(this, 5), new p4a.g(this, 13), new ox2.d(this, domainState, 6)), domainState.f233237b);
    }
}
