package spc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr0.i f264948a;

    public h(qr0.i rebalanceStatusClauseMapper, nmc.g rebalanceStatusResourceMapper) {
        Intrinsics.checkNotNullParameter(rebalanceStatusClauseMapper, "rebalanceStatusClauseMapper");
        Intrinsics.checkNotNullParameter(rebalanceStatusResourceMapper, "rebalanceStatusResourceMapper");
        this.f264948a = rebalanceStatusClauseMapper;
    }
}
