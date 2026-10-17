package rm0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class u {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f255169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f255170b;

    public u(String value, r cipherVersion) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(cipherVersion, "cipherVersion");
        this.f255169a = value;
        this.f255170b = cipherVersion;
    }

    public final r a() {
        return this.f255170b;
    }

    public final String b() {
        int i = t.f255168a[this.f255170b.ordinal()];
        String str = this.f255169a;
        if (i == 1) {
            return str;
        }
        if (i == 2) {
            return j6.a.q("2:", str);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean c() {
        return this.f255170b == r.V1_PKCS1;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f255169a, uVar.f255169a) && this.f255170b == uVar.f255170b;
    }

    public final int hashCode() {
        return this.f255170b.hashCode() + (this.f255169a.hashCode() * 31);
    }

    public final String toString() {
        return "encrypted(" + this.f255170b + ")";
    }
}
