package vg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 implements o0 {

    @NotNull
    public static final h0 Companion = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f288696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f288697b;

    public i0(Throwable throwable, String str) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f288696a = throwable;
        this.f288697b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f288696a, i0Var.f288696a) && Intrinsics.f(this.f288697b, i0Var.f288697b);
    }

    public final int hashCode() {
        int iHashCode = this.f288696a.hashCode() * 31;
        String str = this.f288697b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
