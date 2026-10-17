package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j3 implements m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f54317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButtonDelegate.Model f54318b;

    public j3(List rowItems, LargeActionButtonDelegate.Model model) {
        Intrinsics.checkNotNullParameter(rowItems, "rowItems");
        this.f54317a = rowItems;
        this.f54318b = model;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj2;
        return Intrinsics.f(this.f54317a, j3Var.f54317a) && Intrinsics.f(this.f54318b, j3Var.f54318b);
    }

    public final int hashCode() {
        int iHashCode = this.f54317a.hashCode() * 31;
        LargeActionButtonDelegate.Model model = this.f54318b;
        return iHashCode + (model == null ? 0 : model.hashCode());
    }
}
