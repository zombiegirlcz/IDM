package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class q7 {

    @NotNull
    public static final p7 Companion = new p7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117824b;

    public /* synthetic */ q7(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(o7.f117801a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117823a = str;
        this.f117824b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj2;
        return Intrinsics.f(this.f117823a, q7Var.f117823a) && Intrinsics.f(this.f117824b, q7Var.f117824b);
    }

    public final int hashCode() {
        return this.f117824b.hashCode() + (this.f117823a.hashCode() * 31);
    }
}
