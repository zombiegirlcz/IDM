package pb2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class z implements cli.n {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f234624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb2.b f234625b;

    public z(c commonMapper, sb2.b paymentAuthorisationFrequencyMapper) {
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(paymentAuthorisationFrequencyMapper, "paymentAuthorisationFrequencyMapper");
        this.f234624a = commonMapper;
        this.f234625b = paymentAuthorisationFrequencyMapper;
    }

    public static bx1.a a(Object obj2) {
        if (obj2 != null) {
            return new bx1.a(obj2, null, false);
        }
        return null;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f234606a, new v(this, 1), new p5f.c(this, 9), new ox2.d(this, domainState, 7));
    }
}
