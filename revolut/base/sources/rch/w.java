package rch;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;

/* JADX INFO: loaded from: classes9.dex */
public final class w {

    @NotNull
    private static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f253290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f253291b;

    public w(u mapper, t5d.d swipeTradeActionsMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(swipeTradeActionsMapper, "swipeTradeActionsMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f253290a = mapper;
        this.f253291b = wealthDisclaimersMapper;
    }
}
