package mcg;

import aw0.d0;
import cli.n;
import cli.o;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import m9d.j1;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f204357b = new d0(168, 136);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p8g.c f204358a;

    public m(p8g.c featureInteractor) {
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        this.f204358a = featureInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new i(zhm.d0.E0(v.l(domainState.f204352b.getContent()), (Collection) iii.c.f(domainState.f204351a, new m9l.d(this, 28), new j1(17), new lk7.n(this, 25))));
    }
}
