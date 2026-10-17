package zk1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ymk.y;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f322900a;

    public r(c codeImageFactory) {
        Intrinsics.checkNotNullParameter(codeImageFactory, "codeImageFactory");
        this.f322900a = codeImageFactory;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new o((List) iii.c.f(domainState.f322894a, new zii.c(24), new p(this, 1), new y(this, 14)));
    }
}
