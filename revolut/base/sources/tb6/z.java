package tb6;

import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vb6.c f269505a;

    public z(vb6.c charityDetailsItemMapper) {
        Intrinsics.checkNotNullParameter(charityDetailsItemMapper, "charityDetailsItemMapper");
        this.f269505a = charityDetailsItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(t1.x(domainState.f269480a, domainState.e, domainState.f, domainState.f269483g, domainState.f269484h, domainState.i), new t9b.a(this), new t5e.j(this), new si5.c(this, domainState, 16));
    }
}
