package pqg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f238759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f238760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f238761c;

    public q(long j2, String str, xi0.b pocketCurrency) {
        Intrinsics.checkNotNullParameter(pocketCurrency, "pocketCurrency");
        this.f238759a = str;
        this.f238760b = j2;
        this.f238761c = pocketCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f238759a, qVar.f238759a) && this.f238760b == qVar.f238760b && Intrinsics.f(this.f238761c, qVar.f238761c);
    }

    public final int hashCode() {
        String str = this.f238759a;
        return this.f238761c.hashCode() + a0.d.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f238760b);
    }
}
