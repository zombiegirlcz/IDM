package wp9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 {

    @NotNull
    public static final f0 Companion = new f0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f299182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cp9.a f299183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f299184c;
    public final dj0.d d;

    public g0(String memberId, cp9.a splitType, xi0.b currency, dj0.d maxInputAmount) {
        Intrinsics.checkNotNullParameter(memberId, "memberId");
        Intrinsics.checkNotNullParameter(splitType, "splitType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(maxInputAmount, "maxInputAmount");
        this.f299182a = memberId;
        this.f299183b = splitType;
        this.f299184c = currency;
        this.d = maxInputAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f299182a, g0Var.f299182a) && this.f299183b == g0Var.f299183b && Intrinsics.f(this.f299184c, g0Var.f299184c) && Intrinsics.f(this.d, g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.j(this.f299184c, (this.f299183b.hashCode() + (this.f299182a.hashCode() * 31)) * 31, 31);
    }
}
