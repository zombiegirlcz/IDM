package zyh;

import kotlin.jvm.internal.Intrinsics;
import zqc.l;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f326463l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final azh.a f326464m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l f326465n;

    public c(d limitErrorDialogMapper, azh.a cryptoTradeUsageLimitBottomSheetMapper, l onAddMaximumAmountClicked) {
        Intrinsics.checkNotNullParameter(limitErrorDialogMapper, "limitErrorDialogMapper");
        Intrinsics.checkNotNullParameter(cryptoTradeUsageLimitBottomSheetMapper, "cryptoTradeUsageLimitBottomSheetMapper");
        Intrinsics.checkNotNullParameter(onAddMaximumAmountClicked, "onAddMaximumAmountClicked");
        this.f326463l = limitErrorDialogMapper;
        this.f326464m = cryptoTradeUsageLimitBottomSheetMapper;
        this.f326465n = onAddMaximumAmountClicked;
    }
}
