package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219110b;

    public /* synthetic */ p0(int i, String str, String str2) {
        if (1 != (i & 1)) {
            qlm.j1.f(n0.f219104a.getDescriptor(), i, 1);
            throw null;
        }
        this.f219109a = str;
        if ((i & 2) == 0) {
            this.f219110b = null;
        } else {
            this.f219110b = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f219109a, p0Var.f219109a) && Intrinsics.f(this.f219110b, p0Var.f219110b);
    }

    public final int hashCode() {
        int iHashCode = this.f219109a.hashCode() * 31;
        String str = this.f219110b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public p0(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f219109a = type;
        this.f219110b = str;
    }
}
