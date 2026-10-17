package v7c;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f286584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f286586c;

    public b(String str, String str2, List paymentMethods) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        this.f286584a = paymentMethods;
        this.f286585b = str;
        this.f286586c = str2;
    }

    public static b a(b bVar, ArrayList arrayList, String str, String str2, int i) {
        List paymentMethods = arrayList;
        if ((i & 1) != 0) {
            paymentMethods = bVar.f286584a;
        }
        if ((i & 2) != 0) {
            str = bVar.f286585b;
        }
        if ((i & 4) != 0) {
            str2 = bVar.f286586c;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        return new b(str, str2, paymentMethods);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f286584a, bVar.f286584a) && Intrinsics.f(this.f286585b, bVar.f286585b) && Intrinsics.f(this.f286586c, bVar.f286586c);
    }

    public final int hashCode() {
        int iHashCode = this.f286584a.hashCode() * 31;
        String str = this.f286585b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f286586c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
