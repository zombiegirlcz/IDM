package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class r3 {

    @NotNull
    public static final q3 Companion = new q3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f216027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216028b;

    public /* synthetic */ r3(int i, long j2, String str) {
        if (3 != (i & 3)) {
            qlm.j1.f(p3.f216009a.getDescriptor(), i, 3);
            throw null;
        }
        this.f216027a = j2;
        this.f216028b = str;
    }

    public final long a() {
        return this.f216027a;
    }

    public final String b() {
        return this.f216028b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj2;
        return this.f216027a == r3Var.f216027a && Intrinsics.f(this.f216028b, r3Var.f216028b);
    }

    public final int hashCode() {
        return this.f216028b.hashCode() + (Long.hashCode(this.f216027a) * 31);
    }

    public r3(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f216027a = j2;
        this.f216028b = currency;
    }
}
