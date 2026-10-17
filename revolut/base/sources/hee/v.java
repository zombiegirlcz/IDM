package hee;

import android.text.InputFilter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements cli.n {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputFilter f151707a;

    public v(InputFilter inputFilter) {
        Intrinsics.checkNotNullParameter(inputFilter, "inputFilter");
        this.f151707a = inputFilter;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (p) iii.c.f(domainState.f151689a, new he4.r(9), new hb6.g(18), new hb4.n(this, domainState, 6));
    }
}
