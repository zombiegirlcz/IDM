package rcb;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f253244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f253245b;

    public c(boolean z, boolean z3) {
        this.f253244a = z;
        this.f253245b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f253244a == cVar.f253244a && this.f253245b == cVar.f253245b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f253245b) + (Boolean.hashCode(this.f253244a) * 31);
    }
}
