package kf1;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f183270a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof d) {
            return this.f183270a == ((d) obj2).f183270a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183270a);
    }

    public final String toString() {
        return "CardReaderUsageToggles(hasCardReader=" + this.f183270a + ")";
    }
}
