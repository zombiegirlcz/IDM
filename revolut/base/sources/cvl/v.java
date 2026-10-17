package cvl;

import com.google.crypto.tink.shaded.protobuf.t1;
import cul.n2;
import cul.r1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final evl.c f109505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f109506b;

    public v(evl.c sourcePocketMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(sourcePocketMapper, "sourcePocketMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f109505a = sourcePocketMapper;
        this.f109506b = wealthDisclaimersMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (t) iii.c.f(t1.t(domainState.e, domainState.f), new n2(this, 27), new r1(12), new cab.m(domainState, this, 12));
    }
}
