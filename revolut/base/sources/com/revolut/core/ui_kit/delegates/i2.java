package com.revolut.core.ui_kit.delegates;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f54271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f54272b;

    public i2(ArrayList avatars, h2 position) {
        Intrinsics.checkNotNullParameter(avatars, "avatars");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f54271a = avatars;
        this.f54272b = position;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj2;
        return this.f54271a.equals(i2Var.f54271a) && this.f54272b == i2Var.f54272b;
    }

    public final int hashCode() {
        return this.f54272b.hashCode() + (this.f54271a.hashCode() * 31);
    }
}
