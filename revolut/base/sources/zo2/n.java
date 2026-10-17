package zo2;

import cli.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import znd.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp2.c f323872a;

    public n(kp2.a bankInformationStateMapper, kp2.c contentBodyStateMapper) {
        Intrinsics.checkNotNullParameter(bankInformationStateMapper, "bankInformationStateMapper");
        Intrinsics.checkNotNullParameter(contentBodyStateMapper, "contentBodyStateMapper");
        this.f323872a = contentBodyStateMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f, new u0(this), new znc.j(this), new zhl.l(this, domainState, 5));
    }
}
