package o45;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class b2 {

    @NotNull
    public static final a2 Companion = new a2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222017b;

    public /* synthetic */ b2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(z1.f222162a.getDescriptor(), i, 3);
            throw null;
        }
        this.f222016a = str;
        this.f222017b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f222016a, b2Var.f222016a) && Intrinsics.f(this.f222017b, b2Var.f222017b);
    }

    public final int hashCode() {
        int iHashCode = this.f222016a.hashCode() * 31;
        String str = this.f222017b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public b2(String accountNumber, String str) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f222016a = accountNumber;
        this.f222017b = str;
    }
}
