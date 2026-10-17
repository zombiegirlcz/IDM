package vdl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f288054a;

    public w(String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f288054a = symbol;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f288054a, ((w) obj2).f288054a);
    }

    public final int hashCode() {
        return this.f288054a.hashCode();
    }
}
