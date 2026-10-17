package t36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f267665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f267666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f267667c;

    public g(e amountIn, e amountOut, h hVar) {
        Intrinsics.checkNotNullParameter(amountIn, "amountIn");
        Intrinsics.checkNotNullParameter(amountOut, "amountOut");
        this.f267665a = amountIn;
        this.f267666b = amountOut;
        this.f267667c = hVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f267665a, gVar.f267665a) && Intrinsics.f(this.f267666b, gVar.f267666b) && Intrinsics.f(this.f267667c, gVar.f267667c);
    }

    public final int hashCode() {
        int iHashCode = (this.f267666b.hashCode() + (this.f267665a.hashCode() * 31)) * 31;
        h hVar = this.f267667c;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
