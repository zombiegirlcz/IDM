package ttj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f274393b;

    public /* synthetic */ p0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(n0.f274376a.getDescriptor(), i, 3);
            throw null;
        }
        this.f274392a = str;
        this.f274393b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f274392a, p0Var.f274392a) && Intrinsics.f(this.f274393b, p0Var.f274393b);
    }

    public final int hashCode() {
        return this.f274393b.hashCode() + (this.f274392a.hashCode() * 31);
    }
}
