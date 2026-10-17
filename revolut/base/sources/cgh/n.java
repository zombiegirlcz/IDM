package cgh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23980a;

    public n(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f23980a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f23980a, ((n) obj2).f23980a);
    }

    public final int hashCode() {
        return this.f23980a.hashCode();
    }
}
