package oqj;

import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f227920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f227921b;

    public /* synthetic */ j(int i, long j2, long j3) {
        if (3 != (i & 3)) {
            j1.f(h.f227919a.getDescriptor(), i, 3);
            throw null;
        }
        this.f227920a = j2;
        this.f227921b = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f227920a == jVar.f227920a && this.f227921b == jVar.f227921b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f227921b) + (Long.hashCode(this.f227920a) * 31);
    }
}
