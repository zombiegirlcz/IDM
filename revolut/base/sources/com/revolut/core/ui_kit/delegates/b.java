package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f53699a = new b();

    private b() {
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        c other = (c) obj2;
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.getClass() == b.class) {
            return 0;
        }
        return equals(f53699a) ? 1 : -1;
    }
}
