package com.revolut.core.ui_kit.delegates;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cj extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dj f54008a;

    public cj(dj djVar) {
        this.f54008a = djVar;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        koi.j jVar = this.f54008a.e;
        VoucherSmallTileDelegate.Model model = jVar instanceof VoucherSmallTileDelegate.Model ? (VoucherSmallTileDelegate.Model) jVar : null;
        if (model == null) {
            return;
        }
        gq0.g.c(info, model.f53616m instanceof VoucherSmallTileDelegate.d.C0430d);
    }
}
