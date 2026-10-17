package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.RewardProgressDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class se extends RewardProgressDelegate.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54717b;

    public se(int i, int i2) {
        this.f54716a = i;
        this.f54717b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof se)) {
            return false;
        }
        se seVar = (se) obj2;
        return this.f54716a == seVar.f54716a && this.f54717b == seVar.f54717b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54717b) + (Integer.hashCode(this.f54716a) * 31);
    }
}
