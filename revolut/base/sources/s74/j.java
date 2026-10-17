package s74;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty0.a f260514a;

    public j(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        this.f260514a = clickData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f260514a, ((j) obj2).f260514a);
    }

    public final int hashCode() {
        return this.f260514a.hashCode();
    }
}
