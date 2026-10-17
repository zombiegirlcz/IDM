package aw0;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d0 f10273c = new d0(1, 1);
    public static final d0 d = new d0(2, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10275b;

    public d0(int i, int i2) {
        this.f10274a = i;
        this.f10275b = i2;
    }

    public final int a() {
        return this.f10275b;
    }

    public final int b() {
        return this.f10274a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return this.f10274a == d0Var.f10274a && this.f10275b == d0Var.f10275b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10275b) + (Integer.hashCode(this.f10274a) * 31);
    }
}
