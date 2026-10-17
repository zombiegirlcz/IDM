package bd;

import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class s extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f14500c;

    public s(int i, j jVar) {
        this.f14499b = i;
        this.f14500c = jVar;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return sVar.f14499b == this.f14499b && sVar.f14500c == this.f14500c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14499b), this.f14500c);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb6.append(this.f14500c);
        sb6.append(", ");
        return j6.a.v(sb6, "-byte key)", this.f14499b);
    }
}
