package uw2;

import com.revolut.core.ui_kit.models.Clause;
import ia3.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk2.w;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f283541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.g f283542b;

    public p(r cardsContentMapper, m93.g cardsSimplifiedItemMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cardsContentMapper, "cardsContentMapper");
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f283541a = cardsContentMapper;
        this.f283542b = cardsSimplifiedItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new m((Clause) iii.c.f(domainState.f283535a, new uv1.c(13), new utk.b(9), new n(0)), (List) iii.c.f(domainState.f283535a, new uv1.c(12), new utk.b(8), new w(this, 15)));
    }
}
