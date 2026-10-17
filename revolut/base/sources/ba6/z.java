package ba6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f13962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f13963c;

    public z(String quoteToken, double d, dj0.d fiatAmount) {
        Intrinsics.checkNotNullParameter(quoteToken, "quoteToken");
        Intrinsics.checkNotNullParameter(fiatAmount, "fiatAmount");
        this.f13961a = quoteToken;
        this.f13962b = d;
        this.f13963c = fiatAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f13961a, zVar.f13961a) && Double.compare(this.f13962b, zVar.f13962b) == 0 && Intrinsics.f(this.f13963c, zVar.f13963c);
    }

    public final int hashCode() {
        return this.f13963c.hashCode() + m72.b.c(this.f13961a.hashCode() * 31, this.f13962b, 31);
    }
}
