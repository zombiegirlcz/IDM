package u6c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f277565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f277566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f277567c;
    public final y d;

    public j0(List paymentMethods, String str, String str2, y savingsAccountProductName) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        Intrinsics.checkNotNullParameter(savingsAccountProductName, "savingsAccountProductName");
        this.f277565a = paymentMethods;
        this.f277566b = str;
        this.f277567c = str2;
        this.d = savingsAccountProductName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f277565a, j0Var.f277565a) && Intrinsics.f(this.f277566b, j0Var.f277566b) && Intrinsics.f(this.f277567c, j0Var.f277567c) && Intrinsics.f(this.d, j0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f277565a.hashCode() * 31;
        String str = this.f277566b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f277567c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
