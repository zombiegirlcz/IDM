package hi9;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class f extends c {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152545b;

    public /* synthetic */ f(int i, long j2) {
        if (1 == (i & 1)) {
            this.f152545b = j2;
        } else {
            j1.f(d.f152544a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f152545b == ((f) obj2).f152545b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f152545b);
    }

    public f(long j2) {
        this.f152545b = j2;
    }
}
