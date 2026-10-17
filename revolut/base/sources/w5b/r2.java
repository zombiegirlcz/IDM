package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r2 {

    @NotNull
    public static final q2 Companion = new q2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294997c;

    public /* synthetic */ r2(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(p2.f294974a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294995a = str;
        this.f294996b = str2;
        this.f294997c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.f294995a, r2Var.f294995a) && Intrinsics.f(this.f294996b, r2Var.f294996b) && Intrinsics.f(this.f294997c, r2Var.f294997c);
    }

    public final int hashCode() {
        String str = this.f294995a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f294996b);
        String str2 = this.f294997c;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public r2(String str, String title, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f294995a = str;
        this.f294996b = title;
        this.f294997c = str2;
    }
}
