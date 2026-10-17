package bld;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16549a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof o) {
            return this.f16549a == ((o) obj2).f16549a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16549a);
    }

    public final String toString() {
        return j6.a.l(this.f16549a, "FeedbackScore(value=", ")");
    }
}
