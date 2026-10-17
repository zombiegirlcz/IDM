package jye;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hel.b f179416a;

    public b(hel.b tradingContext) {
        Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
        this.f179416a = tradingContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f179416a == ((b) obj2).f179416a;
    }

    public final int hashCode() {
        return this.f179416a.hashCode();
    }
}
