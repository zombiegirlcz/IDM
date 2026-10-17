package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class j5 {

    @NotNull
    public static final i5 Companion = new i5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294892b;

    public /* synthetic */ j5(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(h5.f294867a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294891a = str;
        this.f294892b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj2;
        return Intrinsics.f(this.f294891a, j5Var.f294891a) && Intrinsics.f(this.f294892b, j5Var.f294892b);
    }

    public final int hashCode() {
        return this.f294892b.hashCode() + (this.f294891a.hashCode() * 31);
    }

    public j5(String title, String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f294891a = title;
        this.f294892b = value;
    }
}
