package h43;

import com.revolut.data.model.Data;
import h93.f0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements cli.n {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia3.r f149310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.g f149311b;

    public u(ia3.r cardsContentMapper, m93.g cardsSimplifiedItemMapper) {
        Intrinsics.checkNotNullParameter(cardsContentMapper, "cardsContentMapper");
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        this.f149310a = cardsContentMapper;
        this.f149311b = cardsSimplifiedItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        n domainState = (n) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f0 f0Var = domainState.f149295b;
        Data data = domainState.f149294a;
        return new p((List) iii.c.f(data, new h3d.a(8), new q(1), new fyg.b(this, domainState, 27)), f0Var != null, data.getContent() != null);
    }
}
