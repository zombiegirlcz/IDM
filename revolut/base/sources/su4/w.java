package su4;

import kotlin.jvm.internal.Intrinsics;
import mx4.x;
import org.jetbrains.annotations.NotNull;
import ss4.a0;
import ss4.z;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements cli.n {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f265670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f265671b;

    public w(x contentListItemMapper, u80.o moneyPrefixFormatter, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(contentListItemMapper, "contentListItemMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f265670a = contentListItemMapper;
        this.f265671b = amountFormatter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (l) iii.c.f(domainState.f265649a, new z(this, 8), new a0(3), new sa5.b(this, 13));
    }
}
