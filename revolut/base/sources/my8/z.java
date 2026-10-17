package my8;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f210404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210405b;

    public z(List sequences, int i) {
        Intrinsics.checkNotNullParameter(sequences, "sequences");
        this.f210404a = sequences;
        this.f210405b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f210404a, zVar.f210404a) && this.f210405b == zVar.f210405b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f210405b) + (this.f210404a.hashCode() * 31);
    }
}
