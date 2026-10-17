package i2l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p0 implements cli.n {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f158035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f158036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f158037c;
    public final nd7.d d;

    public p0(f01.c uiKitResources, q0 statusCardMapper, h rewardsSectionMapper, t0 transactionsSectionMapper, c availableUntilSectionMapper, nd7.d termsClauseMapper) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(statusCardMapper, "statusCardMapper");
        Intrinsics.checkNotNullParameter(rewardsSectionMapper, "rewardsSectionMapper");
        Intrinsics.checkNotNullParameter(transactionsSectionMapper, "transactionsSectionMapper");
        Intrinsics.checkNotNullParameter(availableUntilSectionMapper, "availableUntilSectionMapper");
        Intrinsics.checkNotNullParameter(termsClauseMapper, "termsClauseMapper");
        this.f158035a = rewardsSectionMapper;
        this.f158036b = transactionsSectionMapper;
        this.f158037c = availableUntilSectionMapper;
        this.d = termsClauseMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        q domainState = (q) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (z) iii.c.f(domainState.f158038a, new i2i.o(this, 12), new n0(0), new hb4.n(this, domainState, 21));
    }
}
