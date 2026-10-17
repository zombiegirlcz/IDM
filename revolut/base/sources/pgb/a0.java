package pgb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pfk.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 implements cli.n {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f235836a;

    public a0(y rewardsSectionMapper) {
        Intrinsics.checkNotNullParameter(rewardsSectionMapper, "rewardsSectionMapper");
        this.f235836a = rewardsSectionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        i domainState = (i) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (s) iii.c.f(domainState.f235841a, new h0(this, 11), new pch.f(this, 19), new ox2.d(this, domainState, 11));
    }
}
