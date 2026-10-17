package jr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f177854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f177855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f177856c;
    public final float d;

    public /* synthetic */ v0(int i, float f, float f4, float f5, float f6) {
        if (15 != (i & 15)) {
            qlm.j1.f(t0.f177844a.getDescriptor(), i, 15);
            throw null;
        }
        this.f177854a = f;
        this.f177855b = f4;
        this.f177856c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Float.compare(this.f177854a, v0Var.f177854a) == 0 && Float.compare(this.f177855b, v0Var.f177855b) == 0 && Float.compare(this.f177856c, v0Var.f177856c) == 0 && Float.compare(this.d, v0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f177856c, m72.b.b(this.f177855b, Float.hashCode(this.f177854a) * 31, 31), 31);
    }
}
