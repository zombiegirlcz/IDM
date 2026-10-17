package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b9 extends MapPlainDelegate.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f53716a;

    public b9(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f53716a = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b9) && Intrinsics.f(this.f53716a, ((b9) obj2).f53716a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f53716a.hashCode() * 31);
    }
}
