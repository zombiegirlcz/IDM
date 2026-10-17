package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f222018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f222019b;

    public /* synthetic */ c(int i, long j2, Long l2) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f222005a.getDescriptor(), i, 3);
            throw null;
        }
        this.f222018a = j2;
        this.f222019b = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f222018a == cVar.f222018a && Intrinsics.f(this.f222019b, cVar.f222019b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f222018a) * 31;
        Long l2 = this.f222019b;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    public c(Long l2, long j2) {
        this.f222018a = j2;
        this.f222019b = l2;
    }
}
