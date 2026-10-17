package kr;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f188565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f188566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f188567c;
    public final float d;

    public r(float f, float f4, float f5, float f6) {
        this.f188565a = f;
        this.f188566b = f4;
        this.f188567c = f5;
        this.d = f6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Float.compare(this.f188565a, rVar.f188565a) == 0 && Float.compare(this.f188566b, rVar.f188566b) == 0 && Float.compare(this.f188567c, rVar.f188567c) == 0 && Float.compare(this.d, rVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + m72.b.b(this.f188567c, m72.b.b(this.f188566b, Float.hashCode(this.f188565a) * 31, 31), 31);
    }

    public /* synthetic */ r(int i, float f, float f4, float f5, float f6) {
        if (15 != (i & 15)) {
            qlm.j1.f(p.f188554a.getDescriptor(), i, 15);
            throw null;
        }
        this.f188565a = f;
        this.f188566b = f4;
        this.f188567c = f5;
        this.d = f6;
    }
}
