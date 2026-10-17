package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219078b;

    public /* synthetic */ j0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(h0.f219072a.getDescriptor(), i, 3);
            throw null;
        }
        this.f219077a = str;
        this.f219078b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f219077a, j0Var.f219077a) && Intrinsics.f(this.f219078b, j0Var.f219078b);
    }

    public final int hashCode() {
        return this.f219078b.hashCode() + (this.f219077a.hashCode() * 31);
    }

    public j0(String type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f219077a = type;
        this.f219078b = value;
    }
}
