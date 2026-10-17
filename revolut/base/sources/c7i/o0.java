package c7i;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 implements cli.n {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.b f22018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f7i.d f22019b;

    public o0(o7.b navbarDescriptionMapper, f7i.d conditionalAmountItemProvider, g7i.a buttonStateProvider, qy5.a itemsProvider) {
        Intrinsics.checkNotNullParameter(navbarDescriptionMapper, "navbarDescriptionMapper");
        Intrinsics.checkNotNullParameter(conditionalAmountItemProvider, "conditionalAmountItemProvider");
        Intrinsics.checkNotNullParameter(buttonStateProvider, "buttonStateProvider");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        this.f22018a = navbarDescriptionMapper;
        this.f22019b = conditionalAmountItemProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        r domainState = (r) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (v) iii.c.f(domainState.f22022a, new c42.j(this, 28), new c2f.m(this, 18), new b1c.p(this, domainState, 29));
    }
}
