package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i2 {

    @NotNull
    public static final h2 Companion = new h2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294875b;

    public /* synthetic */ i2(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(g2.f294843a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294874a = str;
        this.f294875b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj2;
        return Intrinsics.f(this.f294874a, i2Var.f294874a) && Intrinsics.f(this.f294875b, i2Var.f294875b);
    }

    public final int hashCode() {
        return this.f294875b.hashCode() + (this.f294874a.hashCode() * 31);
    }

    public i2(String title, String icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f294874a = title;
        this.f294875b = icon;
    }
}
