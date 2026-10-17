package u07;

import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f276091a;

    public n(gr6.e freelancerAvailabilityInteractor, l07.a settingsItemFactory, t07.b taxTypeClauseFactory) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(settingsItemFactory, "settingsItemFactory");
        Intrinsics.checkNotNullParameter(taxTypeClauseFactory, "taxTypeClauseFactory");
        this.f276091a = freelancerAvailabilityInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new k((List) iii.c.f(domainState.f276078a, new tyg.g(16), new tw8.g(14), new tch.c(this, 13)));
    }
}
