package y88;

import kotlin.jvm.internal.Intrinsics;
import w88.e;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f311634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f311635b;

    public b(dj0.d dVar, e state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f311634a = dVar;
        this.f311635b = state;
    }

    @Override // y88.d
    public final dj0.d a() {
        return this.f311634a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f311634a, bVar.f311634a) && Intrinsics.f(this.f311635b, bVar.f311635b);
    }

    public final int hashCode() {
        dj0.d dVar = this.f311634a;
        return this.f311635b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }
}
