package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g6 {

    @NotNull
    public static final f6 Companion = new f6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117686c;

    public /* synthetic */ g6(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(e6.f117665a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117684a = str;
        this.f117685b = str2;
        this.f117686c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj2;
        return Intrinsics.f(this.f117684a, g6Var.f117684a) && Intrinsics.f(this.f117685b, g6Var.f117685b) && Intrinsics.f(this.f117686c, g6Var.f117686c);
    }

    public final int hashCode() {
        return this.f117686c.hashCode() + p.a.c(this.f117684a.hashCode() * 31, 31, this.f117685b);
    }
}
