package eh1;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f125700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kpj.f f125701b;

    public q(c0 sharedCardsContentDetailedMapper, kpj.f sharedCardsSimplifiedItemMapper) {
        Intrinsics.checkNotNullParameter(sharedCardsContentDetailedMapper, "sharedCardsContentDetailedMapper");
        Intrinsics.checkNotNullParameter(sharedCardsSimplifiedItemMapper, "sharedCardsSimplifiedItemMapper");
        this.f125700a = sharedCardsContentDetailedMapper;
        this.f125701b = sharedCardsSimplifiedItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        l domainState = (l) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new o((Clause) iii.c.f(domainState.f125695a, new efb.i(13), new eed.a(11), new dob.a(21)), (List) iii.c.f(domainState.f125695a, new efb.i(12), new eed.a(10), new ec8.q(this, 2)));
    }
}
