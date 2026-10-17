package boh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzg.v f17470a;

    public l(xzg.v asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f17470a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f17470a, ((l) obj2).f17470a);
    }

    public final int hashCode() {
        return this.f17470a.hashCode();
    }
}
