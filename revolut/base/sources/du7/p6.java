package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class p6 {

    @NotNull
    public static final o6 Companion = new o6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117813c;

    public /* synthetic */ p6(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(n6.f117787a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117811a = str;
        this.f117812b = str2;
        this.f117813c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj2;
        return Intrinsics.f(this.f117811a, p6Var.f117811a) && Intrinsics.f(this.f117812b, p6Var.f117812b) && Intrinsics.f(this.f117813c, p6Var.f117813c);
    }

    public final int hashCode() {
        int iHashCode = this.f117811a.hashCode() * 31;
        String str = this.f117812b;
        return this.f117813c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
