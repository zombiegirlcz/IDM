package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.ProgressionCountDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class uc extends ProgressionCountDelegate.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54829a;

    public uc(int i) {
        this.f54829a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof uc) && this.f54829a == ((uc) obj2).f54829a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54829a);
    }
}
