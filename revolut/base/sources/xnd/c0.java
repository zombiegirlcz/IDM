package xnd;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();
    public static final c0 d = new c0(false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f307381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f307382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f307383c;

    public c0(boolean z, boolean z3, boolean z4) {
        this.f307381a = z;
        this.f307382b = z3;
        this.f307383c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f307381a == c0Var.f307381a && this.f307382b == c0Var.f307382b && this.f307383c == c0Var.f307383c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f307383c) + j6.a.c(Boolean.hashCode(this.f307381a) * 31, 31, this.f307382b);
    }
}
