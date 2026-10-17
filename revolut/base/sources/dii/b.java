package dii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f115065a;

    public b(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f115065a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f115065a, ((b) obj2).f115065a);
    }

    public final int hashCode() {
        return this.f115065a.hashCode();
    }
}
