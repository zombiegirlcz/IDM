package up2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk2.w;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp2.c f281833a;

    public t(kp2.a bankInformationStateMapper, kp2.c contentBodyStateMapper) {
        Intrinsics.checkNotNullParameter(bankInformationStateMapper, "bankInformationStateMapper");
        Intrinsics.checkNotNullParameter(contentBodyStateMapper, "contentBodyStateMapper");
        this.f281833a = contentBodyStateMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f281817b, new umc.c(this, 17), new uj8.j(this, 26), new w(this, 11));
    }
}
