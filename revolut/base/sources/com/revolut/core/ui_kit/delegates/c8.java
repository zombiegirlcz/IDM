package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.LinearProgressWithAmountDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final class c8 extends LinearProgressWithAmountDelegate.Model.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f53746a;

    public c8(int i) {
        this.f53746a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c8) && this.f53746a == ((c8) obj2).f53746a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f53746a);
    }
}
