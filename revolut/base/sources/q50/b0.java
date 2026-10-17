package q50;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes19.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242205c;

    public /* synthetic */ b0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(z.f242287a.getDescriptor(), i, 7);
            throw null;
        }
        this.f242203a = str;
        this.f242204b = str2;
        this.f242205c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f242203a, b0Var.f242203a) && Intrinsics.f(this.f242204b, b0Var.f242204b) && Intrinsics.f(this.f242205c, b0Var.f242205c);
    }

    public final int hashCode() {
        return this.f242205c.hashCode() + p.a.c(this.f242203a.hashCode() * 31, 31, this.f242204b);
    }
}
