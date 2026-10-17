package wp9;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f299200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f299201c;
    public final boolean d;
    public final boolean e;

    public t(String id10, long j2, dj0.d payAmount, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(payAmount, "payAmount");
        this.f299199a = id10;
        this.f299200b = j2;
        this.f299201c = payAmount;
        this.d = z;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f299199a, tVar.f299199a) && this.f299200b == tVar.f299200b && Intrinsics.f(this.f299201c, tVar.f299201c) && this.d == tVar.d && this.e == tVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(v7.c(a0.d.c(this.f299199a.hashCode() * 31, 31, this.f299200b), 31, this.f299201c), 31, this.d);
    }
}
