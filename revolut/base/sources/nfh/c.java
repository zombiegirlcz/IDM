package nfh;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214907a;

    public c(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f214907a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f214907a, ((c) obj2).f214907a);
    }

    public final int hashCode() {
        return this.f214907a.hashCode();
    }
}
