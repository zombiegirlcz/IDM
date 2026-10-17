package n29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211460c;
    public final String d;

    public /* synthetic */ b0(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            j1.f(z.f211499a.getDescriptor(), i, 15);
            throw null;
        }
        this.f211458a = str;
        this.f211459b = str2;
        this.f211460c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f211458a, b0Var.f211458a) && Intrinsics.f(this.f211459b, b0Var.f211459b) && Intrinsics.f(this.f211460c, b0Var.f211460c) && Intrinsics.f(this.d, b0Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f211458a.hashCode() * 31, 31, this.f211459b);
        String str = this.f211460c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public b0(String title, String subtitle, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f211458a = title;
        this.f211459b = subtitle;
        this.f211460c = str;
        this.d = str2;
    }
}
