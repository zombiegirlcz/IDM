package ecd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class r3 {

    @NotNull
    public static final q3 Companion = new q3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124657b;

    public /* synthetic */ r3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(p3.f124646a.getDescriptor(), i, 3);
            throw null;
        }
        this.f124656a = str;
        this.f124657b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj2;
        return Intrinsics.f(this.f124656a, r3Var.f124656a) && Intrinsics.f(this.f124657b, r3Var.f124657b);
    }

    public final int hashCode() {
        return this.f124657b.hashCode() + (this.f124656a.hashCode() * 31);
    }

    public r3(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f124656a = title;
        this.f124657b = description;
    }
}
