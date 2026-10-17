package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class n6 {

    @NotNull
    public static final m6 Companion = new m6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294957b;

    public /* synthetic */ n6(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(l6.f294914a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294956a = str;
        this.f294957b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj2;
        return Intrinsics.f(this.f294956a, n6Var.f294956a) && Intrinsics.f(this.f294957b, n6Var.f294957b);
    }

    public final int hashCode() {
        return this.f294957b.hashCode() + (this.f294956a.hashCode() * 31);
    }

    public n6(String title, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f294956a = title;
        this.f294957b = icon;
    }
}
