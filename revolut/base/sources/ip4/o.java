package ip4;

import ip0.qn0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.d f167663a;

    public o(m93.d cardThumbnailImageProvider) {
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        this.f167663a = cardThumbnailImageProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f167650a, new m(this, 0), new qn0(14), new igh.o(this, 11));
    }
}
