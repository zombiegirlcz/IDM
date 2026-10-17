package com.revolut.core.ui_kit.delegates;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f54293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54294b;

    public ie(int i, ArrayList views) {
        Intrinsics.checkNotNullParameter(views, "views");
        this.f54293a = views;
        this.f54294b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ie)) {
            return false;
        }
        ie ieVar = (ie) obj2;
        return this.f54293a.equals(ieVar.f54293a) && this.f54294b == ieVar.f54294b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54294b) + (this.f54293a.hashCode() * 31);
    }
}
