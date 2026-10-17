package wnk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f298846a;

    public h(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f298846a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f298846a, ((h) obj2).f298846a);
    }

    public final int hashCode() {
        return this.f298846a.hashCode();
    }
}
