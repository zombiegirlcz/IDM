package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import ip0.lq;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h7 extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7 f54234a;

    public h7(i7 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f54234a = holder;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(host, event);
        InputChecklistDelegate.Model model = this.f54234a.f;
        boolean z = false;
        if (model != null && model.f52521c) {
            z = true;
        }
        event.setChecked(z);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        InputChecklistDelegate.Model model = this.f54234a.f;
        if (model == null) {
            return;
        }
        boolean z = model.f52521c;
        int i = lq.f165250a[model.f.ordinal()];
        if (i == 1) {
            gq0.g.c(info, z);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            gq0.g.e(info, z, null);
        }
    }
}
