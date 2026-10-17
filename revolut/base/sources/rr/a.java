package rr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f256600a;

    public a(c payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f256600a = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f256600a, ((a) obj2).f256600a);
    }

    public final int hashCode() {
        return this.f256600a.hashCode();
    }
}
