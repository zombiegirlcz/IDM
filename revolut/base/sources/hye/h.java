package hye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e71.a f156862a;

    public h(e71.a crossProfileFee) {
        Intrinsics.checkNotNullParameter(crossProfileFee, "crossProfileFee");
        this.f156862a = crossProfileFee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f156862a, ((h) obj2).f156862a);
    }

    public final int hashCode() {
        return this.f156862a.hashCode();
    }
}
