package mg2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jg2.f f205149a;

    public m(jg2.f upiQrImageProvider) {
        Intrinsics.checkNotNullParameter(upiQrImageProvider, "upiQrImageProvider");
        this.f205149a = upiQrImageProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new j((List) iii.c.f(domainState.f205141a, new md0.c(this, 20), new j1(24), new m88.c(this, domainState, 4)));
    }
}
