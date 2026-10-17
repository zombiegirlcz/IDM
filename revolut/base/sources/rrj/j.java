package rrj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f256861b;

    public j(List items, i toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f256860a = items;
        this.f256861b = toolbarState;
    }

    @Override // jki.n
    public final List c() {
        return this.f256860a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f256860a, jVar.f256860a) && Intrinsics.f(this.f256861b, jVar.f256861b);
    }

    public final int hashCode() {
        return this.f256861b.hashCode() + (this.f256860a.hashCode() * 31);
    }
}
