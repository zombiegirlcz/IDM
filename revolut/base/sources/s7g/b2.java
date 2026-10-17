package s7g;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class b2 {

    @NotNull
    public static final a2 Companion = new a2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260689c;
    public final String d;
    public final String e;

    public /* synthetic */ b2(int i, String str, String str2, String str3, String str4, String str5) {
        if (1 != (i & 1)) {
            qlm.j1.f(z1.f260823a.getDescriptor(), i, 1);
            throw null;
        }
        this.f260687a = str;
        if ((i & 2) == 0) {
            this.f260688b = null;
        } else {
            this.f260688b = str2;
        }
        if ((i & 4) == 0) {
            this.f260689c = null;
        } else {
            this.f260689c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f260687a, b2Var.f260687a) && Intrinsics.f(this.f260688b, b2Var.f260688b) && Intrinsics.f(this.f260689c, b2Var.f260689c) && Intrinsics.f(this.d, b2Var.d) && Intrinsics.f(this.e, b2Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f260687a.hashCode() * 31;
        String str = this.f260688b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f260689c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public b2(String passportNumber, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(passportNumber, "passportNumber");
        this.f260687a = passportNumber;
        this.f260688b = str;
        this.f260689c = str2;
        this.d = str3;
        this.e = str4;
    }
}
