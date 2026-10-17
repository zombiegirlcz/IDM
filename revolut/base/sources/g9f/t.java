package g9f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class t {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141576c;
    public final String d;

    public /* synthetic */ t(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(r.f141573a.getDescriptor(), i, 15);
            throw null;
        }
        this.f141574a = str;
        this.f141575b = str2;
        this.f141576c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f141574a, tVar.f141574a) && Intrinsics.f(this.f141575b, tVar.f141575b) && Intrinsics.f(this.f141576c, tVar.f141576c) && Intrinsics.f(this.d, tVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f141574a.hashCode() * 31, 31, this.f141575b);
        String str = this.f141576c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public t(String name, String accountNumber, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f141574a = name;
        this.f141575b = accountNumber;
        this.f141576c = str;
        this.d = str2;
    }
}
