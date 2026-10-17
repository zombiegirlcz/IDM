package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class b4 {

    @NotNull
    public static final a4 Companion = new a4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124498b;

    public /* synthetic */ b4(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(z3.f124722a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124497a = str;
        this.f124498b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Intrinsics.f(this.f124497a, b4Var.f124497a) && Intrinsics.f(this.f124498b, b4Var.f124498b);
    }

    public final int hashCode() {
        return this.f124498b.hashCode() + (this.f124497a.hashCode() * 31);
    }

    public b4(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f124497a = title;
        this.f124498b = description;
    }
}
