package j4c;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4c.l f171370a;

    public x(l4c.c infoMapper, l4c.l shipmentsMapper, l4c.m summaryMapper, l4c.i revolutPayAccountMapper, l4c.o totalsMapper, l4c.b buttonMapper) {
        Intrinsics.checkNotNullParameter(infoMapper, "infoMapper");
        Intrinsics.checkNotNullParameter(shipmentsMapper, "shipmentsMapper");
        Intrinsics.checkNotNullParameter(summaryMapper, "summaryMapper");
        Intrinsics.checkNotNullParameter(revolutPayAccountMapper, "revolutPayAccountMapper");
        Intrinsics.checkNotNullParameter(totalsMapper, "totalsMapper");
        Intrinsics.checkNotNullParameter(buttonMapper, "buttonMapper");
        this.f171370a = shipmentsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (n) iii.c.f(t1.v(domainState.f171337b, domainState.f171336a, domainState.f171338c, domainState.d), new j3f.d(5), new j0g.b(20), new igh.o(this, 29));
    }
}
