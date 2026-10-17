package qo0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f247969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f247970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f247971c;
    public final float d;

    public e(float f, float f4, int i, int i2) {
        this.f247969a = i;
        this.f247970b = i2;
        this.f247971c = f;
        this.d = f4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f247969a == eVar.f247969a && this.f247970b == eVar.f247970b && Float.compare(this.f247971c, eVar.f247971c) == 0 && Float.compare(this.d, eVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f247971c, j6.a.b(this.f247970b, Integer.hashCode(this.f247969a) * 31, 31), 31);
    }
}
