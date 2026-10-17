package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class r7 {

    @NotNull
    public static final q7 Companion = new q7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f295001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f295002c;

    public /* synthetic */ r7(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(p7.f294980a.getDescriptor(), i, 7);
            throw null;
        }
        this.f295000a = str;
        this.f295001b = str2;
        this.f295002c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r7)) {
            return false;
        }
        r7 r7Var = (r7) obj2;
        return Intrinsics.f(this.f295000a, r7Var.f295000a) && Intrinsics.f(this.f295001b, r7Var.f295001b) && Intrinsics.f(this.f295002c, r7Var.f295002c);
    }

    public final int hashCode() {
        return this.f295002c.hashCode() + p.a.c(this.f295000a.hashCode() * 31, 31, this.f295001b);
    }

    public r7(String icon, String title, String subtitle) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f295000a = icon;
        this.f295001b = title;
        this.f295002c = subtitle;
    }
}
