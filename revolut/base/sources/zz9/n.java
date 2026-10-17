package zz9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final n e = new n(vz9.a.f293422b, false, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vz9.e f326616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f326617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f326618c;
    public final boolean d;

    public n(vz9.e moneyActionBarState, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(moneyActionBarState, "moneyActionBarState");
        this.f326616a = moneyActionBarState;
        this.f326617b = z;
        this.f326618c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f326616a, nVar.f326616a) && this.f326617b == nVar.f326617b && this.f326618c == nVar.f326618c && this.d == nVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f326616a.hashCode() * 31, 31, this.f326617b), 31, this.f326618c);
    }
}
