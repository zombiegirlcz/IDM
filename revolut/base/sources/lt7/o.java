package lt7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt7.b f199838a;

    public o(nt7.b contactsSectionMapper) {
        Intrinsics.checkNotNullParameter(contactsSectionMapper, "contactsSectionMapper");
        this.f199838a = contactsSectionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f199830a, new lsl.b(this, 3), new lnk.o(this, 13), new lk7.n(this, 6));
    }
}
