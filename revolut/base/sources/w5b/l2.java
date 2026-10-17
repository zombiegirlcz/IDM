package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class l2 {

    @NotNull
    public static final k2 Companion = new k2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294912c;
    public final String d;

    public /* synthetic */ l2(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(j2.f294884a.getDescriptor(), i, 15);
            throw null;
        }
        this.f294910a = str;
        this.f294911b = str2;
        this.f294912c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj2;
        return Intrinsics.f(this.f294910a, l2Var.f294910a) && Intrinsics.f(this.f294911b, l2Var.f294911b) && Intrinsics.f(this.f294912c, l2Var.f294912c) && Intrinsics.f(this.d, l2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f294910a.hashCode() * 31;
        String str = this.f294911b;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f294912c);
        String str2 = this.d;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public l2(String title, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter("URL", "type");
        this.f294910a = title;
        this.f294911b = str;
        this.f294912c = "URL";
        this.d = str2;
    }
}
