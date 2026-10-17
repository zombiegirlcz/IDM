package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n7 {

    @NotNull
    public static final m7 Companion = new m7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117789b;

    public /* synthetic */ n7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(l7.f117754a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117788a = str;
        this.f117789b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj2;
        return Intrinsics.f(this.f117788a, n7Var.f117788a) && Intrinsics.f(this.f117789b, n7Var.f117789b);
    }

    public final int hashCode() {
        return this.f117789b.hashCode() + (this.f117788a.hashCode() * 31);
    }
}
