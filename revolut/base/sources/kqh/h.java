package kqh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f188412a;

    public h(g flowType) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f188412a = flowType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f188412a == ((h) obj2).f188412a;
    }

    public final int hashCode() {
        return this.f188412a.hashCode();
    }

    public h() {
        this(g.DEFAULT);
    }
}
