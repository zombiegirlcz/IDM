package ee5;

import aii.r;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pair f125075a;

    public a(Pair currencyPair) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        this.f125075a = currencyPair;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f125075a, ((a) obj2).f125075a);
    }

    public final int hashCode() {
        return this.f125075a.hashCode();
    }
}
