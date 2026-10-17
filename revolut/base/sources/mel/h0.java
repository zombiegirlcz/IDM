package mel;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f204753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f204754c;

    public h0(String name, q sentiment, double d) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sentiment, "sentiment");
        this.f204752a = name;
        this.f204753b = sentiment;
        this.f204754c = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f204752a, h0Var.f204752a) && this.f204753b == h0Var.f204753b && Double.compare(this.f204754c, h0Var.f204754c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f204754c) + ((this.f204753b.hashCode() + (this.f204752a.hashCode() * 31)) * 31);
    }
}
