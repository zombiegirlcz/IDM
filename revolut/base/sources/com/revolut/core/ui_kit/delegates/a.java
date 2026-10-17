package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements c {
    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        c other = (c) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.getClass() == a.class) {
            return 0;
        }
        return equals(b.f53699a) ? 1 : -1;
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false);
    }
}
