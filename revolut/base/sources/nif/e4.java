package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class e4 {

    @NotNull
    public static final d4 Companion = new d4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215783b;

    public /* synthetic */ e4(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(c4.f215739a.getDescriptor(), i, 3);
            throw null;
        }
        this.f215782a = str;
        this.f215783b = str2;
    }

    public final String a() {
        return this.f215783b;
    }

    public final String b() {
        return this.f215782a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e4)) {
            return false;
        }
        e4 e4Var = (e4) obj2;
        return Intrinsics.f(this.f215782a, e4Var.f215782a) && Intrinsics.f(this.f215783b, e4Var.f215783b);
    }

    public final int hashCode() {
        return this.f215783b.hashCode() + (this.f215782a.hashCode() * 31);
    }

    public e4(String code, String amount) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f215782a = code;
        this.f215783b = amount;
    }
}
