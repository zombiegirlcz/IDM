package du7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class s4 {

    @NotNull
    public static final r4 Companion = new r4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4 f117839b;

    public /* synthetic */ s4(int i, String str, o4 o4Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(q4.f117821a.getDescriptor(), i, 3);
            throw null;
        }
        this.f117838a = str;
        this.f117839b = o4Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj2;
        return Intrinsics.f(this.f117838a, s4Var.f117838a) && Intrinsics.f(this.f117839b, s4Var.f117839b);
    }

    public final int hashCode() {
        return this.f117839b.hashCode() + (this.f117838a.hashCode() * 31);
    }
}
