package igh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f161216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ufl.b f161217b;

    public q(kpj.f wealthAccountHeaderUiMapper, ufl.b wealthHoldingsClauseFactory) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(wealthHoldingsClauseFactory, "wealthHoldingsClauseFactory");
        this.f161216a = wealthAccountHeaderUiMapper;
        this.f161217b = wealthHoldingsClauseFactory;
    }
}
