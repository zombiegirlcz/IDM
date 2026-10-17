package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class n4 {

    @NotNull
    public static final m4 Companion = new m4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294937b;

    public /* synthetic */ n4(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(l4.f294913a.getDescriptor(), i, 3);
            throw null;
        }
        this.f294936a = str;
        this.f294937b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f294936a, n4Var.f294936a) && Intrinsics.f(this.f294937b, n4Var.f294937b);
    }

    public final int hashCode() {
        return this.f294937b.hashCode() + (this.f294936a.hashCode() * 31);
    }

    public n4(String title, String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f294936a = title;
        this.f294937b = value;
    }
}
