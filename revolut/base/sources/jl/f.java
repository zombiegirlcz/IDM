package jl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f175530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f175531b;

    public /* synthetic */ f(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(d.f175527a.getDescriptor(), i, 3);
            throw null;
        }
        this.f175530a = str;
        this.f175531b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f175530a, fVar.f175530a) && Intrinsics.f(this.f175531b, fVar.f175531b);
    }

    public final int hashCode() {
        return this.f175531b.hashCode() + (this.f175530a.hashCode() * 31);
    }

    public final String toString() {
        return j6.a.s("BiometricTokenStorageTaskInputItem(type=", this.f175530a, ", value=", this.f175531b, ")");
    }
}
