package gr;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f145788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f145789b;

    public o(long j2, Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f145788a = error;
        this.f145789b = j2;
    }

    @Override // gr.q
    public final long a() {
        return this.f145789b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f145788a.equals(oVar.f145788a) && this.f145789b == oVar.f145789b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f145789b) + (this.f145788a.hashCode() * 31);
    }
}
