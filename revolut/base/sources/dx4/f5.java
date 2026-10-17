package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f5 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f120599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f120600b;

    public f5(m0 light, m0 dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        this.f120599a = light;
        this.f120600b = dark;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj2;
        return Intrinsics.f(this.f120599a, f5Var.f120599a) && Intrinsics.f(this.f120600b, f5Var.f120600b);
    }

    public final int hashCode() {
        return this.f120600b.hashCode() + (this.f120599a.hashCode() * 31);
    }
}
