package wgb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x implements cli.n {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahb.b f297300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g80.c f297301b;

    public x(ahb.b blocksMapper, g80.c urlHelper, a salaryPromotionActionsMapper) {
        Intrinsics.checkNotNullParameter(blocksMapper, "blocksMapper");
        Intrinsics.checkNotNullParameter(urlHelper, "urlHelper");
        Intrinsics.checkNotNullParameter(salaryPromotionActionsMapper, "salaryPromotionActionsMapper");
        this.f297300a = blocksMapper;
        this.f297301b = urlHelper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f297280a, new wf6.p(this, 27), new wf0.b(this, 7), new vjh.c(this, 21));
    }
}
