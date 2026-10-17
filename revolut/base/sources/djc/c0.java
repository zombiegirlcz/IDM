package djc;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gjc.d f115297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final twg.c f115298b;

    public c0(gjc.d headerMapper, twg.c itemsMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        this.f115297a = headerMapper;
        this.f115298b = itemsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (t) iii.c.f(t1.v(domainState.f115300b, domainState.f115301c, domainState.d, domainState.f115302g), new dg3.d(10), new dee.a0(19), new cab.m(domainState, this, 24));
    }
}
