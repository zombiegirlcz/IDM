package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class e7 {

    @NotNull
    public static final d7 Companion = new d7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117668c;

    public /* synthetic */ e7(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(c7.f117625a.getDescriptor(), i, 7);
            throw null;
        }
        this.f117666a = str;
        this.f117667b = str2;
        this.f117668c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e7)) {
            return false;
        }
        e7 e7Var = (e7) obj2;
        return Intrinsics.f(this.f117666a, e7Var.f117666a) && Intrinsics.f(this.f117667b, e7Var.f117667b) && Intrinsics.f(this.f117668c, e7Var.f117668c);
    }

    public final int hashCode() {
        return this.f117668c.hashCode() + p.a.c(this.f117666a.hashCode() * 31, 31, this.f117667b);
    }
}
