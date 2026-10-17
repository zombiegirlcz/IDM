package b73;

import b1c.p;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia3.f f12883a;

    public k(ia3.f cardSimpleListItemMapper) {
        Intrinsics.checkNotNullParameter(cardSimpleListItemMapper, "cardSimpleListItemMapper");
        this.f12883a = cardSimpleListItemMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (f) iii.c.f(t1.t(domainState.f12870a, domainState.f12872c), new h(this, 4), new b6d.a(5), new p(this, domainState, 1));
    }
}
