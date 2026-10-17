package yxh;

import aii.m;
import kotlin.jvm.internal.Intrinsics;
import myh.j;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f317702b;

    public h(j newTab) {
        Intrinsics.checkNotNullParameter(newTab, "newTab");
        this.f317702b = newTab;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f317702b == ((h) obj2).f317702b;
    }

    public final int hashCode() {
        return this.f317702b.hashCode();
    }
}
