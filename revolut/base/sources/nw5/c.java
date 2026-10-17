package nw5;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f219774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pair f219775b;

    public c(int i, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        this.f219774a = i;
        this.f219775b = pair;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f219774a == cVar.f219774a && Intrinsics.f(this.f219775b, cVar.f219775b);
    }

    public final int hashCode() {
        return this.f219775b.hashCode() + (Integer.hashCode(this.f219774a) * 31);
    }
}
