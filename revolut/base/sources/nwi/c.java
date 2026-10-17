package nwi;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f219892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pair f219893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f219894c;

    public c(int i, Pair pair, boolean z) {
        this.f219892a = i;
        this.f219893b = pair;
        this.f219894c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f219892a == cVar.f219892a && Intrinsics.f(this.f219893b, cVar.f219893b) && this.f219894c == cVar.f219894c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f219892a) * 31;
        Pair pair = this.f219893b;
        return Boolean.hashCode(this.f219894c) + ((iHashCode + (pair == null ? 0 : pair.hashCode())) * 31);
    }
}
