package qg7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class y implements cli.n {

    @NotNull
    private static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tg7.c f245698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tg7.b f245699b;

    public y(tg7.c lotteryResultsSubtitleMapper, tg7.b lotteryResultsButtonsMapper) {
        Intrinsics.checkNotNullParameter(lotteryResultsSubtitleMapper, "lotteryResultsSubtitleMapper");
        Intrinsics.checkNotNullParameter(lotteryResultsButtonsMapper, "lotteryResultsButtonsMapper");
        this.f245698a = lotteryResultsSubtitleMapper;
        this.f245699b = lotteryResultsButtonsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i) iii.c.f(domainState.f245668a, new v(this, 0), new qc8.a(this, 19), new qbg.j(this, 6));
    }
}
