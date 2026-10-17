package clh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f25000a;

    public e(q headerBuilder, c instrumentSearchItemBuilder, t5d.d swipeAssetTradeActionsMapper) {
        Intrinsics.checkNotNullParameter(headerBuilder, "headerBuilder");
        Intrinsics.checkNotNullParameter(instrumentSearchItemBuilder, "instrumentSearchItemBuilder");
        Intrinsics.checkNotNullParameter(swipeAssetTradeActionsMapper, "swipeAssetTradeActionsMapper");
        this.f25000a = instrumentSearchItemBuilder;
    }
}
