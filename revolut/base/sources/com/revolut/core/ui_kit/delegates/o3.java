package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatTilesCollectionDelegate.Model f54528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VoucherSmallTileDelegate.Model f54529b;

    public o3(ChatTilesCollectionDelegate.Model model, VoucherSmallTileDelegate.Model item) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f54528a = model;
        this.f54529b = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj2;
        return Intrinsics.f(this.f54528a, o3Var.f54528a) && Intrinsics.f(this.f54529b, o3Var.f54529b);
    }

    public final int hashCode() {
        return this.f54529b.hashCode() + (this.f54528a.hashCode() * 31);
    }
}
