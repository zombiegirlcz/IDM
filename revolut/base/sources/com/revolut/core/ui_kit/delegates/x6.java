package com.revolut.core.ui_kit.delegates;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55595a;

    public x6(List badgesList) {
        Intrinsics.checkNotNullParameter(badgesList, "badgesList");
        this.f55595a = badgesList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x6) && Intrinsics.f(this.f55595a, ((x6) obj2).f55595a);
    }

    public final int hashCode() {
        return this.f55595a.hashCode();
    }
}
