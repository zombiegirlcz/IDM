package ow1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class s implements cli.n {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sv1.a f230274a;

    public s(sv1.a aliasUiMapper) {
        Intrinsics.checkNotNullParameter(aliasUiMapper, "aliasUiMapper");
        this.f230274a = aliasUiMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new n((List) iii.c.f(domainState.f230260b, new ou6.o(14), new oq3.e(26), new c1(this, domainState, 28)));
    }
}
