package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class b2 {

    @NotNull
    public static final a2 Companion = new a2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f124495b;

    public /* synthetic */ b2(int i, String str, i0 i0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(z1.f124721a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124494a = str;
        this.f124495b = i0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f124494a, b2Var.f124494a) && Intrinsics.f(this.f124495b, b2Var.f124495b);
    }

    public final int hashCode() {
        int iHashCode = this.f124494a.hashCode() * 31;
        i0 i0Var = this.f124495b;
        return iHashCode + (i0Var == null ? 0 : i0Var.hashCode());
    }

    public b2(String text, i0 i0Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f124494a = text;
        this.f124495b = i0Var;
    }
}
