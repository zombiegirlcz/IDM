package vg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p implements u {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f288711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288712b;

    public p(Throwable throwable, String str) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f288711a = throwable;
        this.f288712b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f288711a, pVar.f288711a) && Intrinsics.f(this.f288712b, pVar.f288712b);
    }

    public final int hashCode() {
        int iHashCode = this.f288711a.hashCode() * 31;
        String str = this.f288712b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
