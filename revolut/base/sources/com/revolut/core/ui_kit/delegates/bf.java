package com.revolut.core.ui_kit.delegates;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df f53728a;

    public bf(df avatarsGroup) {
        Intrinsics.checkNotNullParameter(avatarsGroup, "avatarsGroup");
        this.f53728a = avatarsGroup;
    }

    public final df a() {
        return this.f53728a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof bf) && this.f53728a.equals(((bf) obj2).f53728a);
    }

    public final int hashCode() {
        return this.f53728a.hashCode() * 31;
    }
}
