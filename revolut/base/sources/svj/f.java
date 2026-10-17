package svj;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f266029a;

    public f(long j2) {
        this.f266029a = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f266029a == ((f) obj2).f266029a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f266029a) + (Integer.hashCode(0) * 31);
    }
}
