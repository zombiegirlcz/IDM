package hi9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f152570b;

    public n(String id10, long j2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f152569a = id10;
        this.f152570b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f152569a, nVar.f152569a) && this.f152570b == nVar.f152570b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f152570b) + (this.f152569a.hashCode() * 31);
    }
}
