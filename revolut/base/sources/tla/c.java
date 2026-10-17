package tla;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f272042c = new c(true, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f272043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272044b;

    public c(boolean z, boolean z3) {
        this.f272043a = z;
        this.f272044b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f272043a == cVar.f272043a && this.f272044b == cVar.f272044b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272044b) + (Boolean.hashCode(this.f272043a) * 31);
    }
}
