package bd;

import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class k extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14488c;
    public final int d;
    public final j e;

    public k(int i, int i2, int i3, j jVar) {
        this.f14487b = i;
        this.f14488c = i2;
        this.d = i3;
        this.e = jVar;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return kVar.f14487b == this.f14487b && kVar.f14488c == this.f14488c && kVar.d == this.d && kVar.e == this.e;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14487b), Integer.valueOf(this.f14488c), Integer.valueOf(this.d), this.e);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("AesEax Parameters (variant: ");
        sb6.append(this.e);
        sb6.append(", ");
        sb6.append(this.f14488c);
        sb6.append("-byte IV, ");
        sb6.append(this.d);
        sb6.append("-byte tag, and ");
        return j6.a.v(sb6, "-byte key)", this.f14487b);
    }
}
