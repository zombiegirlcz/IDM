package ep2;

import cli.o;
import ec8.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp2.c f128074a;

    public n(kp2.a bankInformationStateMapper, kp2.c contentBodyStateMapper) {
        Intrinsics.checkNotNullParameter(bankInformationStateMapper, "bankInformationStateMapper");
        Intrinsics.checkNotNullParameter(contentBodyStateMapper, "contentBodyStateMapper");
        this.f128074a = contentBodyStateMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (h) iii.c.f(domainState.f128068b, new l(this, 0), new en6.a(this), new q(this, 9));
    }
}
