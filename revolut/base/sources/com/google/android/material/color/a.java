package com.google.android.material.color;

import android.content.res.loader.ResourcesLoader;
import android.util.CloseGuard;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ ResourcesLoader e() {
        return new ResourcesLoader();
    }

    public static /* synthetic */ CloseGuard i() {
        return new CloseGuard();
    }

    public static /* bridge */ /* synthetic */ CloseGuard j(Object obj2) {
        return (CloseGuard) obj2;
    }

    public static /* synthetic */ AccessibilityNodeInfo.RangeInfo n(float f, float f4, float f5, int i) {
        return new AccessibilityNodeInfo.RangeInfo(i, f, f4, f5);
    }

    public static /* synthetic */ void s() {
    }
}
